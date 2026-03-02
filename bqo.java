import java.util.Map;

public final class bqo {
    public final Map a;
    public final int b;

    public bqo() {
        this(ibpt.a, 0x7FFFFFFF);
    }

    public bqo(Map map0, int v) {
        this.a = map0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bqo)) {
            return false;
        }
        return ibuq.m(this.a, ((bqo)object0).a) ? this.b == ((bqo)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.a + ", maxSupportedFrameRate=" + this.b + ')';
    }
}

