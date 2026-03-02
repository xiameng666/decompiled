import java.util.List;

public final class bynt {
    public final List a;

    public bynt(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bynt) ? ibuq.m(this.a, ((bynt)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CreateEntryDisplayInfoHolder(sortedCreationEntryList=" + this.a + ")";
    }
}

