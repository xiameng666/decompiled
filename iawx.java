import j..util.Objects;
import java.io.InputStream;

final class iawx implements Runnable {
    final InputStream a;
    final iaxg b;

    public iawx(iaxg iaxg0, InputStream inputStream0) {
        this.a = inputStream0;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.n(this.a);
    }
}

