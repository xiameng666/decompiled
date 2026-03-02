import android.os.SystemClock;
import j..util.Objects;

final class aavo extends fyxo {
    final aavp a;

    public aavo(aavp aavp0) {
        Objects.requireNonNull(aavp0);
        this.a = aavp0;
        super();
    }

    @Override  // fyxo
    public final void a(fyxp fyxp0, int v) {
        aavp aavp0 = this.a;
        if(aavp0.a != null && aavp0.a.get() == fyxp0) {
            aavp0.a.clear();
            aavp0.b.clear();
        }
    }

    @Override  // fyxo
    public final void b(Object object0, int v) {
        this.a(((fyxp)object0), v);
    }

    @Override  // fyxo
    public final void c(Object object0) {
        fyxp fyxp0 = (fyxp)object0;
        this.d();
    }

    @Override  // fyxo
    public final void d() {
        this.a.c = SystemClock.elapsedRealtime();
    }
}

