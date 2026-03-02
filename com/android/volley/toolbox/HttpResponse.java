package com.android.volley.toolbox;

import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

public final class HttpResponse {
    private final int a;
    private final List b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public HttpResponse(int v, List list0) {
        this(v, list0, -1, null);
    }

    public HttpResponse(int v, List list0, int v1, InputStream inputStream0) {
        this.a = v;
        this.b = list0;
        this.c = v1;
        this.d = inputStream0;
        this.e = null;
    }

    public HttpResponse(int v, List list0, byte[] arr_b) {
        this.a = v;
        this.b = list0;
        this.c = arr_b.length;
        this.e = arr_b;
        this.d = null;
    }

    public final InputStream getContent() {
        InputStream inputStream0 = this.d;
        if(inputStream0 != null) {
            return inputStream0;
        }
        byte[] arr_b = this.e;
        return arr_b != null ? new ByteArrayInputStream(arr_b) : null;
    }

    public final byte[] getContentBytes() {
        return this.e;
    }

    public final int getContentLength() {
        return this.c;
    }

    public final List getHeaders() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public final int getStatusCode() {
        return this.a;
    }
}

