import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;

public abstract class rxv implements ryt {
    @Override  // ryt
    @InternalOnboardingApi
    public PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        rnx.d(persistableBundle0, this.f());
        persistableBundle0.putString("com.android.onboarding.task.COMPONENT", this.fa());
        persistableBundle0.putString("com.android.onboarding.task.NODE", this.fb());
        persistableBundle0.putString("com.android.onboarding.task.TYPE", this.s());
        return persistableBundle0;
    }

    protected abstract rna e();

    @Override  // rof
    public final String fa() {
        return this.q().fa();
    }

    @Override  // roo
    public final String fb() {
        return this.q().fb();
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    @Override  // ryt
    public final ErasedOnboardingTaskState i() {
        return rys.a(this);
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    protected abstract roo q();

    protected abstract String s();
}

