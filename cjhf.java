import java.util.List;

public final class cjhf {
    public final List a;
    private final long b;

    public cjhf(List list0, long v) {
        this.a = list0;
        this.b = v;
    }

    public final long a() {
        return ibzw.i(this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cjhf)) {
            return false;
        }
        return ibuq.m(this.a, ((cjhf)object0).a) ? ibzw.r(this.b, ((cjhf)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + ibzu.a(this.b);
    }

    @Override
    public final String toString() {
        String s = ibzw.p(this.b);
        return "GnssStatus(satellites=" + this.a + ", elapsedRealtime=" + s + ")";
    }
}

