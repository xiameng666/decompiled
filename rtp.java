import android.os.PersistableBundle;

public final class rtp implements roo, scz {
    public static final rto a;
    private final rkn b;
    private final rzl d;
    private final rzh e;
    private final rlr f;
    private final String g;
    private final String h;

    static {
        rtp.a = new rto();
    }

    public rtp(rkn rkn0, rzl rzl0, rzh rzh0, rlr rlr0) {
        this.b = rkn0;
        this.d = rzl0;
        this.e = rzh0;
        this.f = rlr0;
        this.g = rkn0.b;
        this.h = rkn0.c;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sdn.b(persistableBundle0, "ONBOARDING_NODE", this.b);
        sdn.b(persistableBundle0, "USES_PRECALCULATION_RESULT", this.d);
        sdn.b(persistableBundle0, "PRECALCULATION", this.e);
        sdn.b(persistableBundle0, "HAS_TASK_ALTERNATIVE", this.f);
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rtp)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rtp)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.d, ((rtp)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((rtp)object0).e) ? ibuq.m(this.f, ((rtp)object0).f) : false;
    }

    @Override  // rof
    public final String fa() {
        return this.g;
    }

    @Override  // roo
    public final String fb() {
        return this.h;
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        rlr rlr0 = this.f;
        if(rlr0 != null) {
            v1 = rlr0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // roo
    public final String m() {
        return rol.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    @Override
    public final String toString() {
        return "ContractMetadata(onboardingNode=" + this.b + ", usesPrecalculatedResult=" + this.d + ", precalculation=" + this.e + ", hasTaskAlternative=" + this.f + ")";
    }
}

