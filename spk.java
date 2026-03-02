import com.android.volley.AsyncCache;
import com.android.volley.AsyncRequestQueue;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import j..util.Objects;

public final class spk extends RequestTask {
    final AsyncRequestQueue a;

    public spk(AsyncRequestQueue asyncRequestQueue0, Request request0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.a = asyncRequestQueue0;
        super(request0);
    }

    @Override
    public final void run() {
        Request request0 = this.d;
        if(request0.isCanceled()) {
            request0.a("cache-discard-canceled");
            return;
        }
        request0.addMarker("cache-queue-take");
        AsyncRequestQueue asyncRequestQueue0 = this.a;
        AsyncCache asyncCache0 = asyncRequestQueue0.a;
        if(asyncCache0 != null) {
            asyncCache0.get(request0.getCacheKey(), new spj(this));
            return;
        }
        asyncRequestQueue0.c(asyncRequestQueue0.getCache().get(request0.getCacheKey()), request0);
    }
}

