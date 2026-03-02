import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import java.util.concurrent.Future;

final class eqnk extends glyq implements Response.ErrorListener, Response.Listener, Future {
    @Override  // com.android.volley.Response$ErrorListener
    public final void onErrorResponse(VolleyError volleyError0) {
        this.r(volleyError0);
    }

    @Override  // com.android.volley.Response$Listener
    public final void onResponse(Object object0) {
        this.q(object0);
    }
}

