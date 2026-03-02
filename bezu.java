import java.util.List;

public final class bezu extends bezw {
    public final List a;
    public final List b;

    public bezu(List list0, List list1) {
        ibuq.f(list0, "importablePasswords");
        super();
        this.a = list0;
        this.b = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bezu)) {
            return false;
        }
        return ibuq.m(this.a, ((bezu)object0).a) ? ibuq.m(this.b, ((bezu)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SomePasswordsImportable(importablePasswords=" + this.a + ", nonImportablePasswords=" + this.b + ")";
    }
}

