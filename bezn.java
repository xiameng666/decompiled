import java.util.List;

public final class bezn extends bezw {
    public final List a;

    public bezn(List list0) {
        ibuq.f(list0, "importablePasswords");
        super();
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bezn) ? ibuq.m(this.a, ((bezn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AllPasswordsImportable(importablePasswords=" + this.a + ")";
    }
}

