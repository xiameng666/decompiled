import com.android.volley.AsyncRequestQueue;
import j..util.Objects;

public final class soz implements Runnable {
    final AsyncRequestQueue a;

    public soz(AsyncRequestQueue asyncRequestQueue0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.a = asyncRequestQueue0;
        super();
    }

    @Override
    public final void run() {
        soy soy0 = new soy(this);
        this.a.a.initialize(soy0);
    }
}

