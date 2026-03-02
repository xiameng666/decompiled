import j..util.Objects;
import java.util.List;

final class fvku implements Runnable {
    final fvkx a;
    private final fvlx b;

    public fvku(fvkx fvkx0, fvlx fvlx0) {
        Objects.requireNonNull(fvkx0);
        this.a = fvkx0;
        super();
        this.b = fvlx0;
    }

    @Override
    public final void run() {
        synchronized(this.a.a) {
            List list0 = this.a.f;
            fvlx fvlx0 = this.b;
            if(list0.contains(fvlx0)) {
                list0.remove(fvlx0);
                fvlx0.run();
            }
        }
    }
}

