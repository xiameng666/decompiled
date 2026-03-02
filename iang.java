import java.util.Map;

public abstract class iang extends iamv {
    public iaoo b(Map map0) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    @Override
    public final boolean equals(Object object0) {
        return this == object0;
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("policy", this.c());
        gfsv0.f("priority", 5);
        gfsv0.addBool("available", true);
        return gfsv0.toString();
    }
}

