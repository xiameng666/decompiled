import java.util.List;

public final class igyk extends igym {
    private final long a;
    private final String d;

    public igyk() {
        this(0L, 3);
    }

    public igyk(long v, int v1) {
        if(1 == (v1 & 1)) {
            v = 0L;
        }
        this(v, "");
    }

    public igyk(long v, String s) {
        ibuq.f(s, "nodeId");
        super();
        this.a = v;
        this.d = s;
    }

    @Override  // igym
    public final List a() {
        return ibpo.b(fssm.c(this.a));
    }

    @Override  // igym
    public final igym c(List list0) {
        ibuq.f(list0, "args");
        fsvb fsvb0 = (fsvb)list0.get(0);
        return fsvb0.b == 3 ? new igyk(((long)(((Long)fsvb0.c))), 2) : new igyk(0L, 2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igyk)) {
            return false;
        }
        return this.a == ((igyk)object0).a ? ibuq.m(this.d, ((igyk)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "WearHomePage(wearAndroidId=" + this.a + ", nodeId=" + this.d + ")";
    }
}

