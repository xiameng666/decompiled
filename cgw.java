import java.util.Map;

public final class cgw {
    public final ces a;
    public final cgr b;
    public final cco c;
    public final cez d;
    public final boolean e;
    public final Map f;

    public cgw() {
        this(null, null, null, null, false, null, 0x3F);
    }

    public cgw(ces ces0, cgr cgr0, cco cco0, cez cez0, boolean z, Map map0) {
        this.a = ces0;
        this.b = cgr0;
        this.c = cco0;
        this.d = cez0;
        this.e = z;
        this.f = map0;
    }

    public cgw(ces ces0, cgr cgr0, cco cco0, cez cez0, boolean z, Map map0, int v) {
        if((v & 0x20) != 0) {
            map0 = ibpt.a;
        }
        if((v & 4) != 0) {
            cco0 = null;
        }
        this((1 == (v & 1) ? null : ces0), ((v & 2) == 0 ? cgr0 : null), cco0, ((v & 8) == 0 ? cez0 : null), ((boolean)(((v & 16) == 0 ? 1 : 0) & ((int)z))), map0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cgw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((cgw)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((cgw)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((cgw)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((cgw)object0).d)) {
            return false;
        }
        return this.e == ((cgw)object0).e ? ibuq.m(this.f, ((cgw)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        cez cez0 = this.d;
        if(cez0 != null) {
            v = cez0.hashCode();
        }
        return this.e ? ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + 0x4CF) * 0x1F + this.f.hashCode() : ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + 0x4D5) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }
}

