import java.util.List;

public final class fueg implements fulf {
    public final List a;
    public final List b;
    public final fryv c;
    public final fryv d;
    public final fucg e;
    public final fudv f;
    public fule g;
    public final ibth h;
    private boolean i;

    public fueg(List list0, List list1, fryv fryv0, fryv fryv1, fucg fucg0, fudv fudv0, fule fule0, ibth ibth0) {
        ibuq.f(fudv0, "actionButtonPosition");
        ibuq.f(fule0, "position");
        super();
        this.a = list0;
        this.b = list1;
        this.c = fryv0;
        this.d = fryv1;
        this.e = fucg0;
        this.f = fudv0;
        this.i = false;
        this.g = fule0;
        this.h = ibth0;
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.g = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.i = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fueg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fueg)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fueg)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fueg)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fueg)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((fueg)object0).e)) {
            return false;
        }
        if(this.f != ((fueg)object0).f) {
            return false;
        }
        if(this.i != ((fueg)object0).i) {
            return false;
        }
        return this.g == ((fueg)object0).g ? ibuq.m(this.h, ((fueg)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        fucg fucg0 = this.e;
        if(fucg0 != null) {
            v1 = fucg0.hashCode();
        }
        int v4 = ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.f.hashCode()) * 0x1F;
        return this.i ? ((v4 + 0x4CF) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode() : ((v4 + 0x4D5) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "TileRouteState(routeLegs=" + this.a + ", routeConnections=" + this.b + ", subtitle=" + this.c + ", secondarySubtitle=" + this.d + ", actionButton=" + this.e + ", actionButtonPosition=" + this.f + ", isContained=" + this.i + ", position=" + this.g + ", onClick=" + this.h + ")";
    }
}

