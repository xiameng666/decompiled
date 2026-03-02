import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;

public final class rkd implements sdg, sdv {
    public static final rkd a;
    private final rkm b;

    static {
        rkd.a = new rkd();
    }

    private rkd() {
        this.b = rkn.a;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.e(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rkm.e(persistableBundle0);
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        OnboardingNode onboardingNode0 = (OnboardingNode)object0;
        ibuq.f(onboardingNode0, "value");
        return rkm.f(onboardingNode0);
    }

    public final rkn e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (rkn)sdf.a(this.b, persistableBundle0);
    }

    public static final void f(String s) {
        ibuq.f(s, "name");
        if(s.length() <= 40) {
            return;
        }
        throw new IllegalArgumentException("Node name length (" + s.length() + ") exceeds maximum length of 40 characters");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.e(((PersistableBundle)object0));
    }
}

