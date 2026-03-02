import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;

public final class rqz implements sdg, sdv {
    static final rqz a;

    static {
        rqz.a = new rqz();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rqz.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return rqz.g(((rrc)object0));
    }

    public static final rra e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rqz.f(rom.e(persistableBundle0), persistableBundle0.getLong("unr.NODE_ID", -1L));
    }

    @InternalOnboardingApi
    public static final rra f(roo roo0, long v) {
        ibuq.f(roo0, "node");
        return new rrb(roo0.fa(), roo0.fb(), v);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    public static final PersistableBundle g(rrc rrc0) {
        ibuq.f(rrc0, "value");
        PersistableBundle persistableBundle0 = rom.g(rrc0);
        persistableBundle0.putLong("unr.NODE_ID", rrc0.f());
        return persistableBundle0;
    }
}

