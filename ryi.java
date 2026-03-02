import android.os.PersistableBundle;

public final class ryi implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        ron ron0 = rom.e(persistableBundle0);
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("INPUT");
        if(persistableBundle1 != null) {
            return new ryj(ron0, persistableBundle1);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

