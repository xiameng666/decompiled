import com.android.volley.AsyncRequestQueue;
import j..util.Objects;

public final class spb implements Runnable {
    final AsyncRequestQueue a;

    public spb(AsyncRequestQueue asyncRequestQueue0) {
        Objects.requireNonNull(asyncRequestQueue0);
        this.a = asyncRequestQueue0;
        super();
    }

    @Override
    public final void run() {
        this.a.getCache().initialize();
        this.a.c.execute(new spa(this));
    }
}

