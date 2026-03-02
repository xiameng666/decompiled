import java.util.Set;

public final class rfp {
    private final Set a;
    private final Set b;

    public rfp(Set set0, Set set1) {
        ibuq.f(set0, "packages");
        ibuq.f(set1, "signatures");
        super();
        this.a = set0;
        this.b = set1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rfp)) {
            return false;
        }
        return ibuq.m(this.a, ((rfp)object0).a) ? ibuq.m(this.b, ((rfp)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AttestationApplicationId(packages=" + this.a + ", signatures=" + this.b + ")";
    }
}

