public final class ftuw {
    public final ftts a;
    public final ftts b;
    public final boolean c;
    public final ftvd d;
    public final ftuz e;
    public final ftvb f;
    public final frxs g;
    public final boolean h;

    public ftuw() {
        this(null, null, false, null, null, null, null, false, 0xFF);
    }

    public ftuw(ftts ftts0, ftts ftts1, boolean z, ftvd ftvd0, ftuz ftuz0, ftvb ftvb0, frxs frxs0, boolean z1) {
        ibuq.f(ftvd0, "buttonWidth");
        ibuq.f(ftuz0, "buttonArrangement");
        ibuq.f(ftvb0, "buttonPlacement");
        super();
        this.a = ftts0;
        this.b = ftts1;
        this.c = z;
        this.d = ftvd0;
        this.e = ftuz0;
        this.f = ftvb0;
        this.g = frxs0;
        this.h = z1;
    }

    public ftuw(ftts ftts0, ftts ftts1, boolean z, ftvd ftvd0, ftuz ftuz0, ftvb ftvb0, frxs frxs0, boolean z1, int v) {
        if((v & 8) != 0) {
            ftvd0 = ftvd.b;
        }
        ftuz ftuz1 = (v & 16) == 0 ? ftuz0 : ftuz.b;
        ftvb ftvb1 = (v & 0x20) == 0 ? ftvb0 : ftvb.c;
        int v1 = 0;
        if((v & 2) != 0) {
            ftts1 = null;
        }
        if((v & 0x80) == 0) {
            v1 = 1;
        }
        this((1 == (v & 1) ? null : ftts0), ftts1, ((boolean)(((int)z) & ((v & 4) == 0 ? 1 : 0))), ftvd0, ftuz1, ftvb1, ((v & 0x40) == 0 ? frxs0 : null), ((boolean)(v1 & ((int)z1))));
    }

    public static ftuw a(ftuw ftuw0, ftts ftts0, ftts ftts1, boolean z, ftvd ftvd0, frxs frxs0, boolean z1, int v) {
        if((v & 1) != 0) {
            ftts0 = ftuw0.a;
        }
        if((v & 2) != 0) {
            ftts1 = ftuw0.b;
        }
        if((v & 4) != 0) {
            z = ftuw0.c;
        }
        ftvd ftvd1 = (v & 8) == 0 ? ftvd0 : ftuw0.d;
        ftvb ftvb0 = null;
        ftuz ftuz0 = (v & 16) == 0 ? null : ftuw0.e;
        if((v & 0x20) != 0) {
            ftvb0 = ftuw0.f;
        }
        ibuq.f(ftvd1, "buttonWidth");
        ibuq.f(ftuz0, "buttonArrangement");
        ibuq.f(ftvb0, "buttonPlacement");
        return new ftuw(ftts0, ftts1, z, ftvd1, ftuz0, ftvb0, ((v & 0x40) == 0 ? frxs0 : ftuw0.g), ((v & 0x80) == 0 ? z1 : ftuw0.h));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftuw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftuw)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftuw)object0).b)) {
            return false;
        }
        if(this.c != ((ftuw)object0).c) {
            return false;
        }
        if(this.d != ((ftuw)object0).d) {
            return false;
        }
        if(this.e != ((ftuw)object0).e) {
            return false;
        }
        if(this.f != ((ftuw)object0).f) {
            return false;
        }
        return ibuq.m(this.g, ((ftuw)object0).g) ? this.h == ((ftuw)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + ftuv.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
        frxs frxs0 = this.g;
        if(frxs0 != null) {
            v = frxs0.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + ftuv.a(this.h);
    }

    @Override
    public final String toString() {
        return "ActionBarState(primaryButton=" + this.a + ", secondaryButton=" + this.b + ", liftActionBar=" + this.c + ", buttonWidth=" + this.d + ", buttonArrangement=" + this.e + ", buttonPlacement=" + this.f + ", backgroundColor=" + this.g + ", handleDefaultInsets=" + this.h + ")";
    }
}

