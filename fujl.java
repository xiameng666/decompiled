public final class fujl {
    public final fryk a;
    public final fuig b;
    public final fryv c;
    public final frxs d;
    public final boolean e;
    public final boolean f;
    public final ibth g;
    public final boolean h;

    public fujl(fryk fryk0) {
        this(fryk0, null, null, null, false, null, false, 0xFE);
    }

    public fujl(fryk fryk0, fuig fuig0, fryv fryv0, frxs frxs0) {
        this(fryk0, fuig0, fryv0, frxs0, false, null, false, 0xF0);
    }

    public fujl(fryk fryk0, fuig fuig0, fryv fryv0, frxs frxs0, boolean z, ibth ibth0, boolean z1, int v) {
        frxs frxs1 = (v & 8) == 0 ? frxs0 : new frxq(hll.b);
        this(fryk0, ((v & 2) == 0 ? fuig0 : null), ((v & 4) == 0 ? fryv0 : null), frxs1, false, ((boolean)(((v & 0x20) == 0 ? 1 : 0) & ((int)z))), ((v & 0x40) == 0 ? ibth0 : null), ((boolean)(((v & 0x80) == 0 ? 1 : 0) & ((int)z1))));
    }

    public fujl(fryk fryk0, fuig fuig0, fryv fryv0, frxs frxs0, boolean z, boolean z1, ibth ibth0, boolean z2) {
        ibuq.f(fryk0, "cardArt");
        ibuq.f(frxs0, "defaultCardColor");
        super();
        this.a = fryk0;
        this.b = fuig0;
        this.c = fryv0;
        this.d = frxs0;
        this.e = z;
        this.f = z1;
        this.g = ibth0;
        this.h = z2;
    }

    public static fujl a(fujl fujl0, fryk fryk0, fuig fuig0, frxs frxs0, boolean z, boolean z1, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fryk0 = fujl0.a;
        }
        if((v & 2) != 0) {
            fuig0 = fujl0.b;
        }
        fryv fryv0 = (v & 4) == 0 ? null : fujl0.c;
        if((v & 8) != 0) {
            frxs0 = fujl0.d;
        }
        if((v & 16) != 0) {
            z = fujl0.e;
        }
        ibuq.f(fryk0, "cardArt");
        ibuq.f(frxs0, "defaultCardColor");
        return new fujl(fryk0, fuig0, fryv0, frxs0, z, ((v & 0x20) == 0 ? z1 : fujl0.f), ((v & 0x40) == 0 ? ibth0 : fujl0.g), fujl0.h);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fujl)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fujl)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fujl)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fujl)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fujl)object0).d)) {
            return false;
        }
        if(this.e != ((fujl)object0).e) {
            return false;
        }
        if(this.f != ((fujl)object0).f) {
            return false;
        }
        return ibuq.m(this.g, ((fujl)object0).g) ? this.h == ((fujl)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F + fujk.a(this.e)) * 0x1F + fujk.a(this.f)) * 0x1F;
        ibth ibth0 = this.g;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return (v1 + v) * 0x1F + fujk.a(this.h);
    }

    @Override
    public final String toString() {
        return "WalletCardState(cardArt=" + this.a + ", cardContent=" + this.b + ", contentDescription=" + this.c + ", defaultCardColor=" + this.d + ", isElevated=" + this.e + ", isDisabled=" + this.f + ", onClick=" + this.g + ", hasOutline=" + this.h + ")";
    }
}

