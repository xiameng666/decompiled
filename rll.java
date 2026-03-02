import android.os.PersistableBundle;

public final class rll implements sdg, sdv {
    static final rll a;
    private final rlo b;

    static {
        rll.a = new rll();
    }

    private rll() {
        this.b = rlr.a;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rlo.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        rlm rlm0 = (rlm)object0;
        ibuq.f(rlm0, "value");
        return rlo.f(rlm0);
    }

    public final rlq e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rlq)sdf.a(this.b, persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.e(((PersistableBundle)object0));
    }
}

