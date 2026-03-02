public final class bvgx {
    public final bvgd a;
    public final bvky b;
    public final bvgb c;
    public final cmhx d;
    public final ibth e;
    public final boolean f;

    public bvgx(bvgd bvgd0, bvky bvky0, bvgb bvgb0, cmhx cmhx0, ibth ibth0) {
        ibuq.f(bvgd0, "header");
        ibuq.f(bvky0, "tabs");
        super();
        this.a = bvgd0;
        this.b = bvky0;
        this.c = bvgb0;
        this.d = cmhx0;
        this.e = ibth0;
        this.f = bvky0.e;
    }

    public static bvgx a(bvgx bvgx0, bvgd bvgd0, bvky bvky0, bvgb bvgb0, cmhx cmhx0, int v) {
        if((v & 1) != 0) {
            bvgd0 = bvgx0.a;
        }
        if((v & 2) != 0) {
            bvky0 = bvgx0.b;
        }
        if((v & 4) != 0) {
            bvgb0 = bvgx0.c;
        }
        if((v & 8) != 0) {
            cmhx0 = bvgx0.d;
        }
        ibuq.f(bvgd0, "header");
        ibuq.f(bvky0, "tabs");
        return new bvgx(bvgd0, bvky0, bvgb0, cmhx0, bvgx0.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgx)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvgx)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bvgx)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bvgx)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((bvgx)object0).d) ? ibuq.m(this.e, ((bvgx)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        cmhx cmhx0 = this.d;
        if(cmhx0 != null) {
            v1 = cmhx0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "SettingsUiModel(header=" + this.a + ", tabs=" + this.b + ", googleAccountInfo=" + this.c + ", veConfig=" + this.d + ", reloadData=" + this.e + ")";
    }
}

