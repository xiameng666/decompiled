import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.ErasedActivity;

public final class rrk implements sdg {
    public static final rrk a;
    private final rrm b;

    static {
        rrk.a = new rrk();
    }

    private rrk() {
        this.b = PendingContract.ErasedActivity.d;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rrk.e(persistableBundle0);
    }

    public final PendingContract.ErasedActivity d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (PendingContract.ErasedActivity)sdf.a(this.b, persistableBundle0);
    }

    public static final PendingContract.ErasedActivity e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rrm.d(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

