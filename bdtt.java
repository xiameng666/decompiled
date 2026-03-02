import java.util.List;

public final class bdtt implements bdtu {
    public final List a;
    public final List b;
    public final List c;

    public bdtt(List list0, List list1, List list2) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdtt)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bdtt)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bdtt)object0).b) ? ibuq.m(this.c, ((bdtt)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ResultState(passwords=" + this.a + ", passkeys=" + this.b + ", conflicts=" + this.c + ")";
    }
}

