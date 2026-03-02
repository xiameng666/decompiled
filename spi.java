import com.android.volley.AsyncCache;
import com.android.volley.AsyncRequestQueue;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.Response;
import j..util.Objects;

final class spi extends RequestTask {
    final Response a;
    final AsyncRequestQueue b;

    public spi(AsyncRequestQueue asyncRequestQueue0, Request request0, Response response0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.b = asyncRequestQueue0;
        super(request0);
        this.a = response0;
    }

    @Override
    public final void run() {
        AsyncRequestQueue asyncRequestQueue0 = this.b;
        AsyncCache asyncCache0 = asyncRequestQueue0.a;
        if(asyncCache0 != null) {
            String s = this.d.getCacheKey();
            sph sph0 = new sph(this);
            asyncCache0.put(s, this.a.cacheEntry, sph0);
            return;
        }
        Request request0 = this.d;
        asyncRequestQueue0.getCache().put(request0.getCacheKey(), this.a.cacheEntry);
        asyncRequestQueue0.b(request0, this.a, true);
    }
}

