import com.android.volley.AsyncRequestQueue;
import com.android.volley.Cache.Entry;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.Response;
import j..util.Objects;

public final class spg extends RequestTask {
    final Cache.Entry a;
    final long b;
    final AsyncRequestQueue c;

    public spg(AsyncRequestQueue asyncRequestQueue0, Request request0, Cache.Entry cache$Entry0, long v) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.c = asyncRequestQueue0;
        super(request0);
        this.a = cache$Entry0;
        this.b = v;
    }

    @Override
    public final void run() {
        Request request0 = this.d;
        request0.addMarker("cache-hit");
        Cache.Entry cache$Entry0 = this.a;
        Response response0 = request0.parseNetworkResponse(new NetworkResponse(200, cache$Entry0.data, false, 0L, cache$Entry0.allResponseHeaders));
        request0.addMarker("cache-hit-parsed");
        if(!cache$Entry0.b(this.b)) {
            this.c.getResponseDelivery().postResponse(request0, response0);
            return;
        }
        request0.addMarker("cache-hit-refresh-needed");
        request0.setCacheEntry(cache$Entry0);
        response0.intermediate = true;
        AsyncRequestQueue asyncRequestQueue0 = this.c;
        if(!asyncRequestQueue0.e.b(request0)) {
            asyncRequestQueue0.getResponseDelivery().postResponse(request0, response0, new spf(this));
            return;
        }
        asyncRequestQueue0.getResponseDelivery().postResponse(request0, response0);
    }
}

