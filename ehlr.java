import java.util.List;

public final class ehlr extends ehlt {
    public final List a;

    public ehlr(List list0) {
        ibuq.f(list0, "services");
        super();
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ehlr) ? ibuq.m(this.a, ((ehlr)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Collected(services=" + this.a + ")";
    }
}

