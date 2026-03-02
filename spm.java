import android.os.SystemClock;
import com.android.volley.AsyncNetwork.OnRequestComplete;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import j..util.Objects;

final class spm implements AsyncNetwork.OnRequestComplete {
    final long a;
    final spn b;

    public spm(spn spn0, long v) {
        this.a = v;
        Objects.requireNonNull(spn0);
        this.b = spn0;
        super();
    }

    @Override  // com.android.volley.AsyncNetwork$OnRequestComplete
    public final void onError(VolleyError volleyError0) {
        volleyError0.a = SystemClock.elapsedRealtime() - this.a;
        this.b.a.d.execute(new spo(this.b.a, this.b.d, volleyError0));
    }

    @Override  // com.android.volley.AsyncNetwork$OnRequestComplete
    public final void onSuccess(NetworkResponse networkResponse0) {
        spn spn0 = this.b;
        Request request0 = spn0.d;
        request0.addMarker("network-http-complete");
        if(networkResponse0.notModified && request0.hasHadResponseDelivered()) {
            request0.a("not-modified");
            request0.b();
            return;
        }
        spn0.a.d.execute(new spl(spn0.a, request0, networkResponse0));
    }
}

