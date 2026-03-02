import java.util.List;

public final class deak {
    public final String a;
    public final List b;
    public final List c;
    public final String d;

    public deak(String s, List list0, List list1, String s1) {
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof deak)) {
            return false;
        }
        if(!ibuq.m(this.a, ((deak)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((deak)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((deak)object0).c) ? ibuq.m(this.d, ((deak)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "VcardPreviewInfo(name=" + this.a + ", photo=" + this.b + ", contactInfo=" + this.c + ", company=" + this.d + ")";
    }
}

