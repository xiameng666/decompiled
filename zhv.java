import java.util.Map;

public final class zhv {
    public final int a;
    public final Map b;

    public zhv(int v, Map map0) {
        ibuq.f(map0, "resourceParams");
        super();
        this.a = v;
        this.b = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zhv)) {
            return false;
        }
        return this.a == ((zhv)object0).a ? ibuq.m(this.b, ((zhv)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ASResourceKey(resourceId=" + this.a + ", resourceParams=" + this.b + ")";
    }
}

