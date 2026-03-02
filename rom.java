import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;

public final class rom implements sdg, sdv {
    static final rom a;

    static {
        rom.a = new rom();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rom.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return rom.g(((roo)object0));
    }

    public static final ron e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        roe roe0 = rod.e(persistableBundle0);
        String s = persistableBundle0.getString("nr.NODE_NAME");
        if(s != null) {
            return rom.f(roe0, s);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @InternalOnboardingApi
    public static final ron f(rof rof0, String s) {
        ibuq.f(rof0, "component");
        ibuq.f(s, "nodeName");
        return new ron(rof0.fa(), s);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    public static final PersistableBundle g(roo roo0) {
        ibuq.f(roo0, "value");
        PersistableBundle persistableBundle0 = rod.g(roo0);
        persistableBundle0.putString("nr.NODE_NAME", roo0.fb());
        return persistableBundle0;
    }
}

