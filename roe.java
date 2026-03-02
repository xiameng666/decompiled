import android.os.PersistableBundle;

public final class roe implements rof, scz {
    public final String a;

    public roe(String s) {
        ibuq.f(s, "nodeComponent");
        super();
        this.a = s;
    }

    public roe(rof rof0) {
        this(rof0.fa());
    }

    @Override  // scz
    public final PersistableBundle a() {
        return rod.g(this);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof roe) ? ibuq.m(this.a, ((roe)object0).a) : false;
    }

    @Override  // rof
    public final String fa() {
        return this.a;
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // rof
    public final String l() {
        throw null;
    }

    @Override
    public final String toString() {
        return roc.b(this);
    }
}

