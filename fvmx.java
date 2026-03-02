import android.os.SystemClock;
import j..util.Objects;

final class fvmx extends jye {
    final fvmy a;

    public fvmx(fvmy fvmy0) {
        Objects.requireNonNull(fvmy0);
        this.a = fvmy0;
        super();
    }

    @Override  // jye
    public final void a(int v) {
    }

    @Override  // jye
    public final void b(jyf jyf0) {
        fvmy fvmy0 = this.a;
        fvmy0.l.a();
        if(fvmy0.g && !fvmy0.k()) {
            long v = SystemClock.elapsedRealtime();
            fvmy0.m.a.l(jyf0, v);
            fvmy0.i(fvns.h, v, null);
        }
    }

    @Override  // jye
    public final void c() {
    }

    @Override  // jye
    public final void d() {
    }
}

