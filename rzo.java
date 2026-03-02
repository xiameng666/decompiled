import android.os.PersistableBundle;

public final class rzo implements sdg, sdv {
    static final rzo a;
    private final rzk b;

    static {
        rzo.a = new rzo();
    }

    private rzo() {
        this.b = rzl.a;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rzk.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        rzp rzp0 = (rzp)object0;
        ibuq.f(rzp0, "value");
        return rzk.f(rzp0);
    }

    public final rzl e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rzl)sdf.a(this.b, persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.e(((PersistableBundle)object0));
    }
}

