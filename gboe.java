import java.util.Map;

public final class gboe {
    public Map a;

    public gboe() {
        this(ibpt.a);
    }

    public gboe(Map map0) {
        ibuq.f(map0, "dataValues");
        super();
        this.a = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gboe) ? ibuq.m(this.a, ((gboe)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Results(dataValues=" + this.a + ")";
    }
}

