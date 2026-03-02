import com.android.volley.AsyncRequestQueue;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.VolleyError;
import j..util.Objects;

final class spo extends RequestTask {
    final VolleyError a;
    final AsyncRequestQueue b;

    public spo(AsyncRequestQueue asyncRequestQueue0, Request request0, VolleyError volleyError0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.b = asyncRequestQueue0;
        super(request0);
        this.a = volleyError0;
    }

    @Override
    public final void run() {
        Request request0 = this.d;
        this.b.getResponseDelivery().postError(request0, request0.parseNetworkError(this.a));
        request0.b();
    }
}

