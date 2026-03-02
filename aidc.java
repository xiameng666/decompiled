import android.os.Bundle;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.Map;

public final class aidc extends Request implements NetworkCallbacks {
    private final Map b;
    private final byte[] c;
    private final Response.Listener d;
    private final int e;

    public aidc(int v, String s, Response.Listener response$Listener0, Response.ErrorListener response$ErrorListener0, Map map0, byte[] arr_b, int v1) {
        super(v, s, response$ErrorListener0);
        this.d = response$Listener0;
        this.b = map0;
        this.c = arr_b;
        this.e = v1;
    }

    @Override  // com.android.volley.Request
    public final void deliverResponse(Object object0) {
        this.d.onResponse(((ProxyResponse)object0));
    }

    @Override  // com.android.volley.Request
    public final byte[] getBody() {
        return this.c;
    }

    @Override  // com.android.volley.Request
    public final Map getHeaders() {
        return this.b;
    }

    @Override  // com.google.android.gms.common.server.NetworkCallbacks
    public final void onPostNetworkDispatch() {
        bbfj.a();
    }

    @Override  // com.google.android.gms.common.server.NetworkCallbacks
    public final void onPreNetworkDispatch() {
        bbfj.c(4100, this.e);
    }

    @Override  // com.android.volley.Request
    public final Response parseNetworkResponse(NetworkResponse networkResponse0) {
        Bundle bundle0 = ProxyResponse.a(networkResponse0.headers);
        return Response.success(new ProxyResponse(1, 0, null, networkResponse0.statusCode, bundle0, networkResponse0.data), HttpHeaderParser.parseCacheHeaders(networkResponse0));
    }
}

