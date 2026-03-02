import android.os.SystemClock;
import com.android.volley.AsyncRequestQueue;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import j..util.Objects;

public final class spn extends RequestTask {
    final AsyncRequestQueue a;

    public spn(AsyncRequestQueue asyncRequestQueue0, Request request0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.a = asyncRequestQueue0;
        super(request0);
    }

    @Override
    public final void run() {
        Request request0 = this.d;
        if(request0.isCanceled()) {
            request0.a("network-discard-cancelled");
            request0.b();
            return;
        }
        long v = SystemClock.elapsedRealtime();
        request0.addMarker("network-queue-take");
        spm spm0 = new spm(this, v);
        this.a.b.performRequest(request0, spm0);
    }
}

