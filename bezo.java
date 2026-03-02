import java.util.List;

public final class bezo extends bezw {
    public final List a;

    public bezo(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bezo) ? ibuq.m(this.a, ((bezo)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AllPasswordsNotImportable(nonImportablePasswords=" + this.a + ")";
    }
}

