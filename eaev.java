import java.util.List;

public final class eaev extends eafe {
    public final eagy a;
    public final List b;
    public final dzzl c;

    public eaev(eagy eagy0, List list0, dzzl dzzl0) {
        ibuq.f(list0, "cards");
        super();
        this.a = eagy0;
        this.b = list0;
        this.c = dzzl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eaev)) {
            return false;
        }
        if(!ibuq.m(this.a, ((eaev)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((eaev)object0).b) ? ibuq.m(this.c, ((eaev)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ConfirmUiWithCards(viewHeaderInfo=" + this.a + ", cards=" + this.b + ", buttonInfo=" + this.c + ")";
    }
}

