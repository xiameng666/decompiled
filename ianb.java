import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ianb {
    public final List a;
    public final iakk b;
    public final Object c;

    public ianb(List list0, iakk iakk0, Object object0) {
        gftb.z(list0, "addresses");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list0));
        gftb.z(iakk0, "attributes");
        this.b = iakk0;
        this.c = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ianb) ? Objects.equals(this.a, ((ianb)object0).a) && Objects.equals(this.b, ((ianb)object0).b) && Objects.equals(this.c, ((ianb)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("addresses", this.a);
        gfsv0.add("attributes", this.b);
        gfsv0.add("loadBalancingPolicyConfig", this.c);
        return gfsv0.toString();
    }
}

