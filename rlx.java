import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.Erased;
import com.android.onboarding.pending.PendingContract.ErasedActivity;
import com.android.onboarding.utils.persistable.PersistableIntent;
import j..util.Objects;

public final class rlx implements rlv, roo {
    public static final rlw b;
    private final PersistableBundle d;
    private final PendingContract.ErasedActivity e;
    private final rrc f;
    private final PersistableIntent g;
    private final int h;

    static {
        rlx.b = new rlw();
    }

    public rlx(PersistableBundle persistableBundle0, PendingContract.ErasedActivity pendingContract$ErasedActivity0, rrc rrc0, PersistableIntent persistableIntent0, int v) {
        this.d = persistableBundle0;
        this.e = pendingContract$ErasedActivity0;
        this.f = rrc0;
        this.g = persistableIntent0;
        this.h = v;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = rlt.a(this);
        persistableBundle0.putString("cc.SUBTYPE", "ActivityToActivity");
        persistableBundle0.putPersistableBundle("cc.SESSION", this.d);
        sdn.c(persistableBundle0, "cc.KEY_CALLBACK_REF", this.f, rqx.a);
        sdn.b(persistableBundle0, "cc.KEY_CALLBACK_SERVICE_INTENT", this.g);
        persistableBundle0.putInt("cc.KEY_CALLBACK_USER_ID", this.h);
        return persistableBundle0;
    }

    @Override  // rme
    public final PendingContract.Erased d() {
        return this.e;
    }

    @Override  // rme
    public final ibzw e() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof rlx) && sco.c(this.d, ((rlx)object0).d) && ibuq.m(this.e, ((rlx)object0).e) && rrd.b(this.f, ((rlx)object0).f) && ibuq.m(this.g, ((rlx)object0).g) && this.h == ((rlx)object0).h;
    }

    @Override  // rme
    public final boolean f() {
        return true;
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

    @Override
    public final int hashCode() {
        Integer integer0 = sco.d(this.d);
        Integer integer1 = rrd.a(this.f);
        return Objects.hash(new Object[]{integer0, this.e, integer1, this.g, Boolean.valueOf(true), ((int)this.h)});
    }

    @Override  // rof
    public final String l() {
        return this.f.l();
    }

    @Override  // roo
    public final String m() {
        return this.f.m();
    }

    @Override  // roo
    public final ron o() {
        return this.f.o();
    }

    @Override
    public final String toString() {
        return "ChainedContract.ActivityToActivity(target=" + this.e.m() + ",callback=" + this.f.m() + ",handlesFailure=true)";
    }
}

