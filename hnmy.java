import java.util.List;

public final class hnmy {
    public String a;
    public hnmv b;
    public hnmx c;
    public List d;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hnmy)) {
            return false;
        }
        if(this.a.equals(((hnmy)object0).a) && this.b.equals(((hnmy)object0).b)) {
            hnmx hnmx0 = this.c;
            if(hnmx0 != null) {
                return hnmx0.equals(((hnmy)object0).c) ? this.d.equals(((hnmy)object0).d) : false;
            }
            return ((hnmy)object0).c == null ? this.d.equals(((hnmy)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F * 0x1F + this.d.hashCode() : (v * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }
}

