public final class byom {
    public final bysj a;
    public final byvv b;
    public final bxzv c;
    public final bxzz d;
    public final bxzt e;
    public final boolean f;
    public final byny g;
    public final byar h;

    public byom(bysj bysj0, byvv byvv0, bxzv bxzv0, bxzz bxzz0, bxzt bxzt0, boolean z, byny byny0, int v) {
        if((v & 8) != 0) {
            bxzz0 = bxzz.a;
        }
        if((v & 16) != 0) {
            bxzt0 = new bxzt(bxzu.a, null);
        }
        this(bysj0, byvv0, ((v & 4) == 0 ? bxzv0 : null), bxzz0, bxzt0, ((boolean)(((v & 0x20) == 0 ? 1 : 0) & ((int)z))), byny0, new byar(null));
    }

    public byom(bysj bysj0, byvv byvv0, bxzv bxzv0, bxzz bxzz0, bxzt bxzt0, boolean z, byny byny0, byar byar0) {
        ibuq.f(bxzz0, "providerActivityState");
        ibuq.f(bxzt0, "dialogResult");
        ibuq.f(byar0, "biometricState");
        super();
        this.a = bysj0;
        this.b = byvv0;
        this.c = bxzv0;
        this.d = bxzz0;
        this.e = bxzt0;
        this.f = z;
        this.g = byny0;
        this.h = byar0;
    }

    public static byom a(byom byom0, bysj bysj0, byvv byvv0, bxzv bxzv0, bxzz bxzz0, bxzt bxzt0, byar byar0, int v) {
        if((v & 1) != 0) {
            bysj0 = byom0.a;
        }
        if((v & 2) != 0) {
            byvv0 = byom0.b;
        }
        if((v & 4) != 0) {
            bxzv0 = byom0.c;
        }
        bxzz bxzz1 = (v & 8) == 0 ? bxzz0 : byom0.d;
        bxzt bxzt1 = (v & 16) == 0 ? bxzt0 : byom0.e;
        byar byar1 = (v & 0x80) == 0 ? byar0 : byom0.h;
        ibuq.f(bxzz1, "providerActivityState");
        ibuq.f(bxzt1, "dialogResult");
        ibuq.f(byar1, "biometricState");
        return new byom(bysj0, byvv0, bxzv0, bxzz1, bxzt1, ((v & 0x20) == 0 ? false : byom0.f), ((v & 0x40) == 0 ? null : byom0.g), byar1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byom)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byom)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((byom)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((byom)object0).c)) {
            return false;
        }
        if(this.d != ((byom)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((byom)object0).e)) {
            return false;
        }
        if(this.f != ((byom)object0).f) {
            return false;
        }
        return ibuq.m(this.g, ((byom)object0).g) ? ibuq.m(this.h, ((byom)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F;
        int v2 = this.f ? 0x4CF : 0x4D5;
        byny byny0 = this.g;
        if(byny0 != null) {
            v = byny0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "UiState(createCredentialUiState=" + this.a + ", getCredentialUiState=" + this.b + ", selectedEntry=" + this.c + ", providerActivityState=" + this.d + ", dialogResult=" + this.e + ", isAutoSelectFlow=" + this.f + ", cancelRequestState=" + this.g + ", biometricState=" + this.h + ")";
    }
}

