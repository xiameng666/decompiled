import java.util.List;

public final class bvgc {
    public final cmhx a;
    public final List b;

    public bvgc(cmhx cmhx0, List list0) {
        this.a = cmhx0;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgc)) {
            return false;
        }
        return ibuq.m(this.a, ((bvgc)object0).a) ? ibuq.m(this.b, ((bvgc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "HeaderMenuItemsModel(veConfig=" + this.a + ", items=" + this.b + ")";
    }
}

