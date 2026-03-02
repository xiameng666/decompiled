import java.util.Map;

public final class byhz extends byhy {
    public final String a;
    public final int b;
    public final Map c;

    public byhz(String s, int v, Map map0) {
        ibuq.f(s, "setId");
        super();
        this.a = s;
        this.b = v;
        this.c = map0;
    }

    public static byhz a(byhz byhz0, Map map0) {
        ibuq.f(byhz0.a, "setId");
        return new byhz(byhz0.a, byhz0.b, map0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byhz)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byhz)object0).a)) {
            return false;
        }
        return this.b == ((byhz)object0).b ? ibuq.m(this.c, ((byhz)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "EntrySet{setId=" + this.a + ", setLength=" + this.b + ", entriesAtIndices=" + this.c + "}";
    }
}

