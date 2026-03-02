import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;

public final class rto implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        Object object0 = sdn.a(persistableBundle0, "ONBOARDING_NODE", OnboardingNode.a);
        if(object0 != null) {
            return new rtp(((rkn)object0), ((rzl)sdn.a(persistableBundle0, "USES_PRECALCULATION_RESULT", rzp.a)), ((rzh)sdn.a(persistableBundle0, "PRECALCULATION", rzh.a)), ((rlr)sdn.a(persistableBundle0, "HAS_TASK_ALTERNATIVE", rlm.a)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

