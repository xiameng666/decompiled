package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import spq;
import spx;

public class CacheDispatcher extends Thread {
    public final BlockingQueue a;
    private static final boolean b;
    private final BlockingQueue c;
    private final Cache d;
    private final ResponseDelivery e;
    private volatile boolean f;
    private final spx g;

    static {
        CacheDispatcher.b = VolleyLog.DEBUG;
    }

    public CacheDispatcher(BlockingQueue blockingQueue0, BlockingQueue blockingQueue1, Cache cache0, ResponseDelivery responseDelivery0) {
        this.f = false;
        this.c = blockingQueue0;
        this.a = blockingQueue1;
        this.d = cache0;
        this.e = responseDelivery0;
        this.g = new spx(this, blockingQueue1, responseDelivery0);
    }

    private void a() {
        this.processRequest(((Request)this.c.take()));
    }

    public void processRequest(Request request0) {
        request0.addMarker("cache-queue-take");
        request0.d(1);
        try {
            if(request0.isCanceled()) {
                request0.a("cache-discard-canceled");
            }
            else {
                Cache cache0 = this.d;
                Cache.Entry cache$Entry0 = cache0.get(request0.getCacheKey());
                if(cache$Entry0 == null) {
                    request0.addMarker("cache-miss");
                    if(!this.g.b(request0)) {
                        this.a.put(request0);
                    }
                }
                else {
                    long v1 = System.currentTimeMillis();
                    if(cache$Entry0.a(v1)) {
                        request0.addMarker("cache-hit-expired");
                        request0.setCacheEntry(cache$Entry0);
                        if(!this.g.b(request0)) {
                            this.a.put(request0);
                        }
                    }
                    else {
                        request0.addMarker("cache-hit");
                        Response response0 = request0.parseNetworkResponse(new NetworkResponse(cache$Entry0.data, cache$Entry0.responseHeaders));
                        request0.addMarker("cache-hit-parsed");
                        if(!response0.isSuccess()) {
                            request0.addMarker("cache-parsing-failed");
                            cache0.invalidate(request0.getCacheKey(), true);
                            request0.setCacheEntry(null);
                            if(!this.g.b(request0)) {
                                this.a.put(request0);
                            }
                        }
                        else if(cache$Entry0.b(v1)) {
                            request0.addMarker("cache-hit-refresh-needed");
                            request0.setCacheEntry(cache$Entry0);
                            response0.intermediate = true;
                            if(this.g.b(request0)) {
                                this.e.postResponse(request0, response0);
                            }
                            else {
                                spq spq0 = new spq(this, request0);
                                this.e.postResponse(request0, response0, spq0);
                            }
                        }
                        else {
                            this.e.postResponse(request0, response0);
                        }
                    }
                }
            }
        }
        finally {
            request0.d(2);
        }
    }

    public void quit() {
        this.f = true;
        this.interrupt();
    }

    @Override
    public void run() {
        if(CacheDispatcher.b) {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.initialize();
        while(true) {
            try {
            label_4:
                this.a();
                goto label_4;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.f) {
                break;
            }
            VolleyLog.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }
}

