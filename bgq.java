import java.util.List;

final class bgq {
    public final bsc a;
    public final bsc b;
    public final int c;
    public final List d;

    public bgq() {
        throw null;
    }

    public bgq(bsc bsc0, bsc bsc1, int v, List list0) {
        this.a = bsc0;
        this.b = bsc1;
        this.c = v;
        if(list0 == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bgq) && this.a.equals(((bgq)object0).a) && this.b.equals(((bgq)object0).b) && this.c == ((bgq)object0).c && this.d.equals(((bgq)object0).d);
    }

    @Override
    public final int hashCode() {
        return (this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003) * 1000003 ^ this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}

