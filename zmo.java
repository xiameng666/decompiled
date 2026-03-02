import java.util.List;

final class zmo {
    public final String a;
    public final List b;

    public zmo(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zmo)) {
            return false;
        }
        return ibuq.m(this.a, ((zmo)object0).a) ? ibuq.m(this.b, ((zmo)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SearchRequestEntry(query=" + this.a + ", allowedPrecheckedResources=" + this.b + ")";
    }
}

