import com.android.volley.AsyncRequestQueue;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.Response;
import j..util.Objects;

final class spl extends RequestTask {
    final NetworkResponse a;
    final AsyncRequestQueue b;

    public spl(AsyncRequestQueue asyncRequestQueue0, Request request0, NetworkResponse networkResponse0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.b = asyncRequestQueue0;
        super(request0);
        this.a = networkResponse0;
    }

    @Override
    public final void run() {
        Request request0 = this.d;
        Response response0 = request0.parseNetworkResponse(this.a);
        request0.addMarker("network-parse-complete");
        if(request0.shouldCache() && response0.cacheEntry != null) {
            AsyncRequestQueue asyncRequestQueue0 = this.b;
            if(asyncRequestQueue0.a != null) {
                asyncRequestQueue0.c.execute(new spi(asyncRequestQueue0, request0, response0));
                return;
            }
            asyncRequestQueue0.d.execute(new spi(asyncRequestQueue0, request0, response0));
            return;
        }
        this.b.b(request0, response0, false);
    }
}

