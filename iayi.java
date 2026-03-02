import j..util.Objects;
import java.util.Set;

final class iayi {
    final int a;
    final long b;
    final Set c;

    public iayi(int v, long v1, Set set0) {
        this.a = v;
        this.b = v1;
        this.c = ggfp.G(set0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((iayi)object0).a && this.b == ((iayi)object0).b && Objects.equals(this.c, ((iayi)object0).c);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((long)this.b), this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.f("maxAttempts", this.a);
        gfsv0.g("hedgingDelayNanos", this.b);
        gfsv0.add("nonFatalStatusCodes", this.c);
        return gfsv0.toString();
    }
}

