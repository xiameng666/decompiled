import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.OnboardingNode;
import com.android.onboarding.pending.PendingContract.ErasedTask;
import com.android.onboarding.pending.PendingTaskContract;
import com.android.onboarding.utils.persistable.PersistableIntent;
import j..time.Duration;
import j..time.Instant;

public abstract class rvp extends rsp {
    public final rna a;
    public final rna b;
    private final ibnn d;
    private final ibnn e;
    private final ibnn f;
    private final ibnn g;
    private final ibnn h;
    private final ibnn i;
    private final rna j;
    private final rna k;

    public rvp() {
        this.d = new ibnz(new rvk(new ibuk(this.getClass())));
        this.e = new ibnz(new rvf(this));
        this.f = new ibnz(new rvl(this.w()));
        this.g = new ibnz(new rvm(this.w()));
        this.h = new ibnz(new rvg(this));
        this.i = new ibnz(new rvh(this));
        this.j = new rvi(this);
        this.a = new rvj(this);
        this.k = new rvo(this);
        this.b = new rvn(this);
    }

    protected abstract PersistableBundle d(Object arg1);

    @Override  // rof
    public final String fa() {
        return (String)this.f.a();
    }

    @Override  // roo
    public final String fb() {
        return (String)this.g.a();
    }

    @Override  // rne
    public final rna g() {
        return this.b;
    }

    protected abstract PersistableBundle gx(Object arg1);

    @Override  // rnf
    public final rna h() {
        return this.k;
    }

    protected abstract Object i(PersistableBundle arg1);

    protected abstract Object j(PersistableBundle arg1);

    @Override  // rnc
    public final rna k() {
        return this.a;
    }

    @Override  // rnd
    public final rna p() {
        return this.j;
    }

    @Override  // rrg
    public final PersistableIntent q() {
        return (PersistableIntent)this.h.a();
    }

    @Override
    public final String toString() {
        return "OnboardingTaskContract(" + rol.a(this) + ")";
    }

    @Override  // rsp
    public final Duration u() {
        return (Duration)this.i.a();
    }

    @Override  // rsp
    public final boolean v(rkc rkc0) {
        ibuq.f(rkc0, "reason");
        return ibpg.V(((rkc[])this.e.a()), rkc0);
    }

    public final OnboardingNode w() {
        return (OnboardingNode)this.d.a();
    }

    public final PendingContract.ErasedTask x(Object object0) {
        PendingContract.ErasedTask pendingContract$ErasedTask0 = new PendingTaskContract(this.gx(object0), this, this.q(), rrf.b(), rrf.a(this));
        long v = pendingContract$ErasedTask0.d.getLong("com.android.onboarding.pending.CREATOR_ID", -1L);
        Instant instant0 = Instant.now();
        ibuq.f(instant0, "timestamp");
        rpt rpt0 = new rpt(this.o(), v, object0, instant0);
        rqa.c.a(rpt0);
        return pendingContract$ErasedTask0;
    }
}

