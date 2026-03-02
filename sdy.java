import android.os.PersistableBundle;

public final class sdy implements sdg, sdv {
    public static final sdy a;

    static {
        sdy.a = new sdy();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return ibom.a;
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return sdy.e(((ibom)object0));
    }

    public static final PersistableBundle e(ibom ibom0) {
        ibuq.f(ibom0, "value");
        return new PersistableBundle();
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

