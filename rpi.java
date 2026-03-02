import java.util.Map;

public final class rpi {
    public final String a;
    private final Map b;

    public rpi(String s, Map map0) {
        ibuq.f(map0, "extras");
        super();
        this.a = s;
        this.b = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rpi)) {
            return false;
        }
        return ibuq.m(this.a, ((rpi)object0).a) ? ibuq.m(this.b, ((rpi)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "IntentData(action=" + this.a + ", extras=" + this.b + ")";
    }
}

