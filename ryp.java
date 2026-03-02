import com.android.onboarding.utils.persistable.PersistableIntent;
import j..time.Duration;

public abstract class ryp extends rsp {
    private final String a;
    private final String b;
    private final Duration d;
    private final ibnn e;

    public ryp(rof rof0, String s) {
        this.a = ((roe)rof0).a;
        this.b = s;
        Duration duration0 = Duration.ofSeconds(300L);
        ibuq.e(duration0, "ofSeconds(...)");
        this.d = duration0;
        this.e = new ibnz(new ryo(this));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ryp) && rop.b(this, ((roo)object0));
    }

    @Override  // rof
    public final String fa() {
        return this.a;
    }

    @Override  // roo
    public final String fb() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return rop.a(this);
    }

    @Override  // rrg
    public final PersistableIntent q() {
        return (PersistableIntent)this.e.a();
    }

    @Override
    public final String toString() {
        return "ProviderContract(" + rol.a(this);
    }

    @Override  // rsp
    public final Duration u() {
        return this.d;
    }

    @Override  // rsp
    public final boolean v(rkc rkc0) {
        ibuq.f(rkc0, "reason");
        return true;
    }
}

