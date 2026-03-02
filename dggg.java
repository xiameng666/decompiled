import java.util.List;

public final class dggg {
    public final String a;
    public final List b;
    public final List c;
    public final dger d;
    public final boolean e;

    public dggg(String s, List list0, List list1, dger dger0, boolean z) {
        ibuq.f(s, "id");
        ibuq.f(list0, "publicKey");
        ibuq.f(list1, "authenticityKey");
        super();
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = dger0;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dggg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dggg)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dggg)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dggg)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((dggg)object0).d) ? this.e == ((dggg)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "SharedCredential(id=" + this.a + ", publicKey=" + this.b + ", authenticityKey=" + this.c + ", certificateMetadata=" + this.d + ", hasSharedAccount=" + this.e + ")";
    }
}

