import java.util.Map;

public final class bmr {
    public final Map a;
    public final Map b;
    public final int c;

    public bmr(Map map0, Map map1, int v) {
        this.a = map0;
        this.b = map1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bmr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bmr)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bmr)object0).b) ? this.c == ((bmr)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.a + ", attachedSurfaceStreamSpecs=" + this.b + ", maxSupportedFrameRate=" + this.c + ')';
    }
}

