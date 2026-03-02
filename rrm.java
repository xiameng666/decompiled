import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingActivityContract;
import com.android.onboarding.pending.PendingContract.ErasedActivity;

public final class rrm implements sdg {
    public static final rrm a;

    static {
        rrm.a = new rrm();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rrm.d(persistableBundle0);
    }

    public static final PendingContract.ErasedActivity d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return new PendingActivityContract(sdm.e(persistableBundle0));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

