import j..util.Objects;
import java.util.concurrent.ExecutionException;

final class ghmt implements Runnable {
    final gmcu a;
    final ghmx b;

    public ghmt(ghmx ghmx0, gmcu gmcu0) {
        this.a = gmcu0;
        Objects.requireNonNull(ghmx0);
        this.b = ghmx0;
        super();
    }

    @Override
    public final void run() {
        try {
            if(!this.a.isCancelled() && gmbu.r(this.a) == ghmx.b) {
                return;
            }
        }
        catch(ExecutionException unused_ex) {
        }
        this.b.t(this.a);
    }
}

