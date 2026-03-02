import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import j..util.Objects;

public final class spq implements Runnable {
    final Request a;
    final CacheDispatcher b;

    public spq(CacheDispatcher cacheDispatcher0, Request request0) {
        this.a = request0;
        Objects.requireNonNull(cacheDispatcher0);
        this.b = cacheDispatcher0;
        super();
    }

    @Override
    public final void run() {
        try {
            this.b.a.put(this.a);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }
}

