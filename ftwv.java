final class ftwv {
    public final jbn a;
    public final jbn b;
    public final jbn c;
    public final long d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ftwv(jbn jbn0, jbn jbn1, jbn jbn2, long v, float f, float f1, float f2, float f3) {
        ibuq.f(jbn0, "titleTextStyle");
        ibuq.f(jbn1, "subtitleTextStyle");
        ibuq.f(jbn2, "secondarySubtitleTextStyle");
        super();
        this.a = jbn0;
        this.b = jbn1;
        this.c = jbn2;
        this.d = v;
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftwv)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftwv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftwv)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftwv)object0).c)) {
            return false;
        }
        if(!ibog.c(this.d, ((ftwv)object0).d)) {
            return false;
        }
        if(!jkv.c(this.e, ((ftwv)object0).e)) {
            return false;
        }
        if(!jkv.c(this.f, ((ftwv)object0).f)) {
            return false;
        }
        return jkv.c(this.g, ((ftwv)object0).g) ? Float.compare(this.h, ((ftwv)object0).h) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + ibof.a(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g)) * 0x1F + Float.floatToIntBits(this.h);
    }

    @Override
    public final String toString() {
        String s = hll.g(this.d);
        return "ContentAttributes(titleTextStyle=" + this.a + ", subtitleTextStyle=" + this.b + ", secondarySubtitleTextStyle=" + this.c + ", textColor=" + s + ", contentHorizontalSpacing=" + jkv.b(this.e) + ", walletCardHeight=" + jkv.b(this.f) + ", walletCardWidth=" + jkv.b(this.g) + ", cardArtAlpha=" + this.h + ")";
    }
}

