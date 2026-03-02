import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class fwww implements gxdc {
    final fwwy a;

    public fwww(fwwy fwwy0) {
        Objects.requireNonNull(fwwy0);
        this.a = fwwy0;
        super();
    }

    @Override  // gxdc
    public final void a(int v) {
        if(v != 0) {
            this.a.l(5);
            return;
        }
        synchronized(this.a) {
            this.a.b = new fwwv(this);
            Runnable runnable0 = this.a.b;
            long v2 = TimeUnit.SECONDS.toMillis(2L);
            this.a.a.postDelayed(runnable0, v2);
        }
    }
}

