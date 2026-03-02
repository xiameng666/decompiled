package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

public abstract class JsonRequest extends Request {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String b;
    private final Object c;
    private Response.Listener d;
    private final String e;

    static {
        JsonRequest.b = String.format("application/json; charset=%s", "utf-8");
    }

    public JsonRequest(int v, String s, String s1, Response.Listener response$Listener0, Response.ErrorListener response$ErrorListener0) {
        super(v, s, response$ErrorListener0);
        this.c = new Object();
        this.d = response$Listener0;
        this.e = s1;
    }

    @Deprecated
    public JsonRequest(String s, String s1, Response.Listener response$Listener0, Response.ErrorListener response$ErrorListener0) {
        this(-1, s, s1, response$Listener0, response$ErrorListener0);
    }

    @Override  // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized(this.c) {
            this.d = null;
        }
    }

    @Override  // com.android.volley.Request
    public void deliverResponse(Object object0) {
        Response.Listener response$Listener0;
        synchronized(this.c) {
            response$Listener0 = this.d;
        }
        if(response$Listener0 != null) {
            response$Listener0.onResponse(object0);
        }
    }

    @Override  // com.android.volley.Request
    public byte[] getBody() {
        try {
            return this.e == null ? null : this.e.getBytes("utf-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[]{this.e, "utf-8"});
            return null;
        }
    }

    @Override  // com.android.volley.Request
    public String getBodyContentType() {
        return JsonRequest.b;
    }

    @Override  // com.android.volley.Request
    @Deprecated
    public byte[] getPostBody() {
        return this.getBody();
    }

    @Override  // com.android.volley.Request
    @Deprecated
    public String getPostBodyContentType() {
        return this.getBodyContentType();
    }

    @Override  // com.android.volley.Request
    public abstract Response parseNetworkResponse(NetworkResponse arg1);
}

