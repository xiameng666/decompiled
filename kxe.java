import java.util.Collection;
import java.util.List;

public final class kxe {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    private final Collection e;
    private final int f;

    public kxe(List list0, List list1, Collection collection0, int v, boolean z, boolean z1) {
        ibuq.f(collection0, "publicKeys");
        super();
        this.a = list0;
        this.b = list1;
        this.e = collection0;
        this.f = v;
        this.c = z;
        this.d = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kxe) ? ibuq.m(this.a, ((kxe)object0).a) && ibuq.m(this.b, ((kxe)object0).b) && ibuq.m(this.e, ((kxe)object0).e) && this.f == ((kxe)object0).f && this.c == ((kxe)object0).c && this.d == ((kxe)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f) * 0x1F + kxd.a(this.c)) * 0x1F + kxd.a(this.d);
    }
}

