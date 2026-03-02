import java.util.List;

public final class bvgq {
    public final buyi a;
    public final String b;
    public final List c;
    public final cmhx d;
    public final ibts e;

    public bvgq(buyi buyi0, String s, List list0, cmhx cmhx0, ibts ibts0) {
        ibuq.f(buyi0, "id");
        ibuq.f(s, "title");
        super();
        this.a = buyi0;
        this.b = s;
        this.c = list0;
        this.d = cmhx0;
        this.e = ibts0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgq)) {
            return false;
        }
        if(this.a != ((bvgq)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((bvgq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bvgq)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((bvgq)object0).d) ? ibuq.m(this.e, ((bvgq)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "ServicesCategoryUiModel(id=" + this.a + ", title=" + this.b + ", entries=" + this.c + ", veConfig=" + this.d + ", getActivityLauncherOrDefault=" + this.e + ")";
    }
}

