public final class eytx {
    public final eytw a;
    public final String b;
    public final String c;
    public final ibth d;
    public final ibth e;
    public final ibth f;
    public final ibth g;
    public final ibth h;
    public final ibth i;

    public eytx(eytw eytw0, String s, String s1, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, ibth ibth4, ibth ibth5, int v) {
        ibuq.f(eytw0, "state");
        super();
        this.a = eytw0;
        if((v & 2) != 0) {
            s = null;
        }
        this.b = s;
        if((v & 4) != 0) {
            s1 = null;
        }
        this.c = s1;
        if((v & 8) != 0) {
            ibth0 = null;
        }
        this.d = ibth0;
        if((v & 16) != 0) {
            ibth1 = null;
        }
        this.e = ibth1;
        if((v & 0x20) != 0) {
            ibth2 = null;
        }
        this.f = ibth2;
        if((v & 0x40) != 0) {
            ibth3 = null;
        }
        this.g = ibth3;
        if((v & 0x80) != 0) {
            ibth4 = null;
        }
        this.h = ibth4;
        if((v & 0x100) != 0) {
            ibth5 = null;
        }
        this.i = ibth5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eytx)) {
            return false;
        }
        if(this.a != ((eytx)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((eytx)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((eytx)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((eytx)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((eytx)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((eytx)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((eytx)object0).g)) {
            return false;
        }
        return ibuq.m(this.h, ((eytx)object0).h) ? ibuq.m(this.i, ((eytx)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        int v8 = this.h == null ? 0 : this.h.hashCode();
        ibth ibth0 = this.i;
        if(ibth0 != null) {
            v1 = ibth0.hashCode();
        }
        return (((((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "EnrollmentDialogUiState(state=" + this.a + ", deviceName=" + this.b + ", companionAppName=" + this.c + ", requestUpgrade=" + this.d + ", requestUpdate=" + this.e + ", requestRetry=" + this.f + ", requestClose=" + this.g + ", onDismissDialog=" + this.h + ", onTurnOnRangingMethodClicked=" + this.i + ")";
    }
}

