import android.os.PersistableBundle;

public final class rrl implements sdg {
    public static final rrl a;

    static {
        rrl.a = new rrl();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("com.android.onboarding.pending.TYPE");
        if(ibuq.m(s, "ACTIVITY")) {
            return rrk.e(persistableBundle0);
        }
        if(ibuq.m(s, "TASK")) {
            return rro.e(persistableBundle0);
        }
        throw new IllegalStateException(a.a(s, "Type ", " is unrecognised"));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

