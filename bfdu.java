import java.util.List;

public final class bfdu {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public bfdu(List list0, List list1, List list2, List list3, List list4, List list5) {
        ibuq.f(list0, "invalid");
        ibuq.f(list1, "new");
        ibuq.f(list2, "duplicates");
        ibuq.f(list3, "updatesForNoneShared");
        ibuq.f(list4, "updatesForSharedSameSender");
        ibuq.f(list5, "updatesForSharedDifferentSender");
        super();
        this.a = list0;
        this.b = list1;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bfdu)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bfdu)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bfdu)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bfdu)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bfdu)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((bfdu)object0).e) ? ibuq.m(this.f, ((bfdu)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "IncomingPasswordsPartitions(invalid=" + this.a + ", new=" + this.b + ", duplicates=" + this.c + ", updatesForNoneShared=" + this.d + ", updatesForSharedSameSender=" + this.e + ", updatesForSharedDifferentSender=" + this.f + ")";
    }
}

