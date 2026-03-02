import android.os.PersistableBundle;
import android.os.Process;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import j..util.Objects;
import java.util.function.Supplier;

public final class ryh implements rnb, roo, ryv {
    public final Supplier a;
    public final long b;
    public final int d;
    private final long e;
    private final roo f;
    private final rnb g;
    private final String i;

    public ryh(long v, roo roo0, Supplier supplier0, rnb rnb0, long v1, int v2, String s) {
        ibuq.f(roo0, "nodeRef");
        ibuq.f(rnb0, "resultHandler");
        ibuq.f(s, "targetPackageName");
        super();
        this.e = v;
        this.f = roo0;
        this.a = supplier0;
        this.g = rnb0;
        this.b = v1;
        this.d = v2;
        this.i = s;
    }

    public ryh(long v, rrh rrh0, long v1, int v2, String s) {
        String s1 = s;
        ibuq.f(rrh0, "contract");
        ibuq.f(s1, "targetPackageName");
        ryg ryg0 = new ryg(rrh0);
        int v3 = v2 == -1 ? Process.myUserHandle().getIdentifier() : v2;
        if(ibuq.m(s1, "unknown_target_package_name")) {
            s1 = rrh0.l();
        }
        this(v, rrh0, ryg0, rrh0, v1, v3, s1);
    }

    @Override  // ryv
    @InternalOnboardingApi
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        rnx.d(persistableBundle0, this.b);
        persistableBundle0.putString("com.android.onboarding.task.COMPONENT", this.fa());
        persistableBundle0.putString("com.android.onboarding.task.NODE", this.fb());
        persistableBundle0.putLong("com.android.onboarding.task.TASK_MANAGER_ID", this.e);
        persistableBundle0.putInt("com.android.onboarding.task.TARGET_USER", this.d);
        persistableBundle0.putString("com.android.onboarding.task.TARGET_PACKAGE_NAME", this.i);
        return persistableBundle0;
    }

    @Override  // ryv
    public final int d() {
        return this.d;
    }

    @Override  // ryv
    public final long e() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ryh) && ((ryh)object0).e == this.e && rrd.b(((rrc)object0), this) && ((ryh)object0).d == this.d && ibuq.m(((ryh)object0).i, this.i);
    }

    @Override  // ryv
    public final long f() {
        return this.b;
    }

    @Override  // rof
    public final String fa() {
        return this.f.fa();
    }

    @Override  // roo
    public final String fb() {
        return this.f.fb();
    }

    @Override  // rof
    public final roe fi() {
        return this.f.fi();
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    @Override  // ryv
    public final ErasedOnboardingTaskToken fl() {
        return ryu.a(this);
    }

    @Override  // rne
    public final rna g() {
        return this.g.g();
    }

    @Override  // rnf
    public final rna h() {
        throw null;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = rrd.a(this);
        return Objects.hash(new Object[]{((long)this.e), integer0, ((int)this.d), this.i});
    }

    @Override  // ryv
    public final String i() {
        return this.i;
    }

    @Override  // rof
    public final String l() {
        return this.f.l();
    }

    @Override  // roo, rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return this.f.o();
    }

    @Override
    public final String toString() {
        return a.U(this, "OnboardingTaskToken(", ")");
    }
}

