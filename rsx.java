import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import j..time.Instant;

public final class rsx implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        int v = persistableBundle0.getInt("contractInputHash");
        Object object0 = sdn.a(persistableBundle0, "token", ErasedOnboardingTaskToken.CREATOR);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Instant instant0 = Instant.ofEpochMilli(persistableBundle0.getLong("executionTime"));
        ibuq.e(instant0, "ofEpochMilli(...)");
        return new rsy(v, ((ErasedOnboardingTaskToken)object0), instant0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

