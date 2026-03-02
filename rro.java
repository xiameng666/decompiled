import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.ErasedTask;

public final class rro implements sdg {
    public static final rro a;
    private final rrn b;

    static {
        rro.a = new rro();
    }

    private rro() {
        this.b = PendingContract.ErasedTask.a;
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return this.d(persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rro.e(persistableBundle0);
    }

    public final PendingContract.ErasedTask d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "input");
        return (PendingContract.ErasedTask)sdf.a(this.b, persistableBundle0);
    }

    public static final PendingContract.ErasedTask e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return rrn.d(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return this.d(((PersistableBundle)object0));
    }
}

