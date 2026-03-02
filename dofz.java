import android.os.Looper;
import j..util.Objects;

final class dofz implements gmbg {
    final doga a;

    public dofz(doga doga0) {
        Objects.requireNonNull(doga0);
        this.a = doga0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        dofx dofx0 = new dofx();
        this.a.j.a("passes_list", dofx0);
        a.ae(doga.a.i(), "Cannot get local passes", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        long v = Math.max(866L - (System.currentTimeMillis() - this.a.p), 0L);
        new clht(Looper.getMainLooper()).postDelayed(new dofy(this, ((dofl)object0)), v);
    }
}

