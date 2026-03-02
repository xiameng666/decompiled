import android.os.PersistableBundle;

public final class ron implements roo, scz {
    public final String a;
    public final String b;

    public ron(String s, String s1) {
        ibuq.f(s, "nodeComponent");
        ibuq.f(s1, "nodeName");
        super();
        this.a = s;
        this.b = s1;
    }

    public ron(roo roo0) {
        this(roo0.fa(), roo0.fb());
    }

    @Override  // scz
    public final PersistableBundle a() {
        return rom.g(this);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ron)) {
            return false;
        }
        return ibuq.m(this.a, ((ron)object0).a) ? ibuq.m(this.b, ((ron)object0).b) : false;
    }

    @Override  // rof
    public final String fa() {
        return this.a;
    }

    @Override  // roo
    public final String fb() {
        return this.b;
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
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
        return this;
    }

    @Override
    public final String toString() {
        return rol.a(this);
    }
}

