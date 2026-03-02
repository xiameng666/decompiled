package com.google.android.gms.ads.internal.util;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.ads.internal.util.client.g;
import com.google.android.gms.ads.internal.util.future.i;
import java.util.Map;

public final class aa extends Request {
    private final i b;
    private final Map c;

    public aa(String s, Map map0, i i0) {
        super(0, s, new z(i0));
        this.c = map0;
        this.b = i0;
        new g();
    }

    @Override  // com.android.volley.Request
    public final void deliverResponse(Object object0) {
        this.b.a(((NetworkResponse)object0));
    }

    @Override  // com.android.volley.Request
    public final Map getHeaders() {
        return this.c == null ? super.getHeaders() : this.c;
    }

    @Override  // com.android.volley.Request
    public final Response parseNetworkResponse(NetworkResponse networkResponse0) {
        return Response.success(networkResponse0, HttpHeaderParser.parseCacheHeaders(networkResponse0));
    }
}

