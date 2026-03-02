import android.os.PersistableBundle;

public final class rzk implements sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rzk.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return rzk.f(((rzp)object0));
    }

    public static final rzl e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        seb seb0 = new seb(new rzj());
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("results");
        if(persistableBundle1 != null) {
            return new rzl(seb0.d(persistableBundle1));
        }
        throw new IllegalArgumentException("PersistableBundle is missing value for key: results");
    }

    public static final PersistableBundle f(rzp rzp0) {
        ibuq.f(rzp0, "value");
        return new rzl(rzp0).a();
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

