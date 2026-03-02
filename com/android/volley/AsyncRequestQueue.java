package com.android.volley;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import soz;
import spb;
import spc;
import spg;
import spk;
import spn;
import spx;

public class AsyncRequestQueue extends RequestQueue {
    public final AsyncCache a;
    public final AsyncNetwork b;
    public ExecutorService c;
    public ExecutorService d;
    public final spx e;
    private ScheduledExecutorService f;
    private final AsyncRequestQueue.ExecutorFactory g;
    private final List h;
    private volatile boolean i;
    private final Object j;

    public AsyncRequestQueue(Cache cache0, AsyncNetwork asyncNetwork0, AsyncCache asyncCache0, ResponseDelivery responseDelivery0, AsyncRequestQueue.ExecutorFactory asyncRequestQueue$ExecutorFactory0) {
        super(cache0, asyncNetwork0, 0, responseDelivery0);
        this.e = new spx(this);
        this.h = new ArrayList();
        this.i = false;
        this.j = new Object[0];
        this.a = asyncCache0;
        this.b = asyncNetwork0;
        this.g = asyncRequestQueue$ExecutorFactory0;
    }

    @Override  // com.android.volley.RequestQueue
    public final void a(Request request0) {
        if(!this.i) {
            Object object0 = this.j;
            synchronized(object0) {
                if(!this.i) {
                    this.h.add(request0);
                    return;
                }
            }
        }
        if(request0.shouldCache()) {
            if(this.a != null) {
                this.c.execute(new spk(this, request0));
                return;
            }
            this.d.execute(new spk(this, request0));
            return;
        }
        this.e(request0);
    }

    public final void b(Request request0, Response response0, boolean z) {
        if(z) {
            request0.addMarker("network-cache-written");
        }
        request0.markDelivered();
        this.getResponseDelivery().postResponse(request0, response0);
        request0.c(response0);
    }

    public final void c(Cache.Entry cache$Entry0, Request request0) {
        if(cache$Entry0 == null) {
            request0.addMarker("cache-miss");
            if(this.e.b(request0)) {
                return;
            }
            this.e(request0);
            return;
        }
        long v = System.currentTimeMillis();
        if(cache$Entry0.a(v)) {
            request0.addMarker("cache-hit-expired");
            request0.setCacheEntry(cache$Entry0);
            if(!this.e.b(request0)) {
                this.e(request0);
            }
            return;
        }
        this.d.execute(new spg(this, request0, cache$Entry0, v));
    }

    public final void d() {
        ArrayList arrayList0;
        synchronized(this.j) {
            arrayList0 = new ArrayList(this.h);
            this.h.clear();
            this.i = true;
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.a(((Request)arrayList0.get(v2)));
        }
    }

    @Override  // com.android.volley.RequestQueue
    public final void e(Request request0) {
        this.c.execute(new spn(this, request0));
    }

    private static PriorityBlockingQueue f() {
        return new PriorityBlockingQueue(11, new spc());
    }

    @Override  // com.android.volley.RequestQueue
    public void start() {
        this.stop();
        PriorityBlockingQueue priorityBlockingQueue0 = AsyncRequestQueue.f();
        this.c = this.g.createNonBlockingExecutor(priorityBlockingQueue0);
        PriorityBlockingQueue priorityBlockingQueue1 = AsyncRequestQueue.f();
        this.d = this.g.createBlockingExecutor(priorityBlockingQueue1);
        this.f = this.g.createNonBlockingScheduledExecutor();
        this.b.setBlockingExecutor(this.d);
        this.b.setNonBlockingExecutor(this.c);
        this.b.setNonBlockingScheduledExecutor(this.f);
        if(this.a != null) {
            this.c.execute(new soz(this));
            return;
        }
        this.d.execute(new spb(this));
    }

    @Override  // com.android.volley.RequestQueue
    public void stop() {
        ExecutorService executorService0 = this.c;
        if(executorService0 != null) {
            executorService0.shutdownNow();
            this.c = null;
        }
        ExecutorService executorService1 = this.d;
        if(executorService1 != null) {
            executorService1.shutdownNow();
            this.d = null;
        }
        ScheduledExecutorService scheduledExecutorService0 = this.f;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
            this.f = null;
        }
    }
}

