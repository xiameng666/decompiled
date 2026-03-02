import java.util.List;

public final class furw {
    public final List a;
    public final List b;

    public furw(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof furw)) {
            return false;
        }
        return ibuq.m(this.a, ((furw)object0).a) ? ibuq.m(this.b, ((furw)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Node(nodes=" + this.a + ", attributes=" + this.b + ")";
    }
}

