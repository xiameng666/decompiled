import java.util.List;

public final class bezz extends bfaa {
    public final List a;
    public final List b;

    public bezz(List list0, List list1) {
        ibuq.f(list0, "imported");
        ibuq.f(list1, "notImported");
        super();
        this.a = list0;
        this.b = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bezz)) {
            return false;
        }
        return ibuq.m(this.a, ((bezz)object0).a) ? ibuq.m(this.b, ((bezz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SomePasswordsImported(imported=" + this.a + ", notImported=" + this.b + ")";
    }
}

