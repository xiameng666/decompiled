package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j..net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import spt;
import spw;
import spx;

public abstract class Request implements Comparable {
    public final spw a;
    private final int b;
    private final String c;
    private final int d;
    private final Object e;
    private Response.ErrorListener f;
    private Integer g;
    private RequestQueue h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private RetryPolicy n;
    private Cache.Entry o;
    private Object p;
    private spx q;

    public Request(int v, String s, Response.ErrorListener response$ErrorListener0) {
        this.a = spw.a ? new spw() : null;
        this.e = new Object();
        this.i = true;
        int v1 = 0;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.o = null;
        this.b = v;
        this.c = s;
        this.f = response$ErrorListener0;
        this.setRetryPolicy(new DefaultRetryPolicy());
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                String s1 = uri0.getHost();
                if(s1 != null) {
                    v1 = s1.hashCode();
                }
            }
        }
        this.d = v1;
    }

    @Deprecated
    public Request(String s, Response.ErrorListener response$ErrorListener0) {
        this(-1, s, response$ErrorListener0);
    }

    public final void a(String s) {
        RequestQueue requestQueue0 = this.h;
        if(requestQueue0 != null) {
            requestQueue0.finish(this);
        }
        if(spw.a) {
            long v = Thread.currentThread().getId();
            if(Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new spt(this, s, v));
                return;
            }
            this.a.a(s, v);
            this.a.b(this.toString());
        }
    }

    public void addMarker(String s) {
        if(spw.a) {
            this.a.a(s, Thread.currentThread().getId());
        }
    }

    public final void b() {
        spx spx0;
        synchronized(this.e) {
            spx0 = this.q;
        }
        if(spx0 != null) {
            spx0.a(this);
        }
    }

    final void c(Response response0) {
        spx spx0;
        List list0;
        synchronized(this.e) {
            spx0 = this.q;
        }
        if(spx0 != null) {
            if(response0.cacheEntry != null && !response0.cacheEntry.isExpired()) {
                String s = this.getCacheKey();
                synchronized(spx0) {
                    list0 = (List)spx0.a.remove(s);
                }
                if(list0 != null) {
                    if(VolleyLog.DEBUG) {
                        VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", new Object[]{list0.size(), s});
                    }
                    for(Object object0: list0) {
                        spx0.b.postResponse(((Request)object0), response0);
                    }
                }
            }
            else {
                spx0.a(this);
            }
        }
    }

    public void cancel() {
        synchronized(this.e) {
            this.j = true;
            this.f = null;
        }
    }

    public int compareTo(Request request0) {
        Request.Priority request$Priority0 = this.getPriority();
        Request.Priority request$Priority1 = request0.getPriority();
        return request$Priority0 == request$Priority1 ? ((int)this.g) - ((int)request0.g) : request$Priority1.ordinal() - request$Priority0.ordinal();
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((Request)object0));
    }

    final void d(int v) {
        RequestQueue requestQueue0 = this.h;
        if(requestQueue0 != null) {
            requestQueue0.sendRequestEvent(this, v);
        }
    }

    public void deliverError(VolleyError volleyError0) {
        Response.ErrorListener response$ErrorListener0;
        synchronized(this.e) {
            response$ErrorListener0 = this.f;
        }
        if(response$ErrorListener0 != null) {
            response$ErrorListener0.onErrorResponse(volleyError0);
        }
    }

    public abstract void deliverResponse(Object arg1);

    public final void e(spx spx0) {
        synchronized(this.e) {
            this.q = spx0;
        }
    }

    private static final byte[] f(Map map0, String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getKey() == null || map$Entry0.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", map$Entry0.getKey(), map$Entry0.getValue()));
                }
                stringBuilder0.append(URLEncoder.encode(((String)map$Entry0.getKey()), s));
                stringBuilder0.append('=');
                stringBuilder0.append(URLEncoder.encode(((String)map$Entry0.getValue()), s));
                stringBuilder0.append('&');
                continue;
            }
            return stringBuilder0.toString().getBytes(s);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Encoding not supported: " + s, unsupportedEncodingException0);
        }
    }

    public byte[] getBody() {
        return null;
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public Cache.Entry getCacheEntry() {
        return this.o;
    }

    public String getCacheKey() {
        String s = this.getUrl();
        int v = this.getMethod();
        return v == -1 || v == 0 ? s : Integer.toString(v) + "-" + s;
    }

    public Response.ErrorListener getErrorListener() {
        synchronized(this.e) {
        }
        return this.f;
    }

    public Map getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.b;
    }

    protected Map getParams() {
        return null;
    }

    protected String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map map0 = this.getPostParams();
        return map0 == null || map0.size() <= 0 ? null : Request.f(map0, this.getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return this.getBodyContentType();
    }

    @Deprecated
    protected Map getPostParams() {
        return null;
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return "UTF-8";
    }

    public Request.Priority getPriority() {
        return Request.Priority.NORMAL;
    }

    public RetryPolicy getRetryPolicy() {
        return this.n;
    }

    public final int getSequence() {
        Integer integer0 = this.g;
        if(integer0 != null) {
            return (int)integer0;
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.p;
    }

    public final int getTimeoutMs() {
        return this.getRetryPolicy().getCurrentTimeout();
    }

    public int getTrafficStatsTag() {
        return this.d;
    }

    public String getUrl() {
        return this.c;
    }

    public boolean hasHadResponseDelivered() {
        synchronized(this.e) {
        }
        return this.k;
    }

    public boolean isCanceled() {
        synchronized(this.e) {
        }
        return this.j;
    }

    public void markDelivered() {
        synchronized(this.e) {
            this.k = true;
        }
    }

    public VolleyError parseNetworkError(VolleyError volleyError0) {
        return volleyError0;
    }

    public abstract Response parseNetworkResponse(NetworkResponse arg1);

    public Request setCacheEntry(Cache.Entry cache$Entry0) {
        this.o = cache$Entry0;
        return this;
    }

    public Request setRequestQueue(RequestQueue requestQueue0) {
        this.h = requestQueue0;
        return this;
    }

    public Request setRetryPolicy(RetryPolicy retryPolicy0) {
        this.n = retryPolicy0;
        return this;
    }

    public final Request setSequence(int v) {
        this.g = v;
        return this;
    }

    public final Request setShouldCache(boolean z) {
        this.i = z;
        return this;
    }

    public final Request setShouldRetryConnectionErrors(boolean z) {
        this.m = z;
        return this;
    }

    public final Request setShouldRetryServerErrors(boolean z) {
        this.l = z;
        return this;
    }

    public Request setTag(Object object0) {
        this.p = object0;
        return this;
    }

    public final boolean shouldCache() {
        return this.i;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.m;
    }

    public final boolean shouldRetryServerErrors() {
        return this.l;
    }

    @Override
    public String toString() {
        String s = this.isCanceled() ? "[X] " : "[ ] ";
        Integer integer0 = this.g;
        return s + this.getUrl() + " " + ("0x" + Integer.toHexString(this.getTrafficStatsTag())) + " " + this.getPriority() + " " + integer0;
    }
}

