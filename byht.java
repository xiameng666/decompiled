public final class byht {
    public final boolean a;
    public final bzaz b;
    public final byns c;
    public final bzcc d;
    public final byhy e;
    public final bxzz f;
    public final bxzt g;

    public byht() {
        this(null);
    }

    public byht(boolean z, bzaz bzaz0, byns byns0, bzcc bzcc0, byhy byhy0, bxzz bxzz0, bxzt bxzt0) {
        ibuq.f(bxzz0, "providerActivityState");
        ibuq.f(bxzt0, "dialogResult");
        super();
        this.a = z;
        this.b = bzaz0;
        this.c = byns0;
        this.d = bzcc0;
        this.e = byhy0;
        this.f = bxzz0;
        this.g = bxzt0;
    }

    public byht(byte[] arr_b) {
        bxzt bxzt0 = new bxzt(bxzu.a);
        this(true, null, null, null, null, bxzz.a, bxzt0);
    }

    public static byht a(byht byht0, bzaz bzaz0, byns byns0, bzcc bzcc0, byhy byhy0, bxzz bxzz0, bxzt bxzt0, int v) {
        boolean z = (v & 1) == 0 ? false : byht0.a;
        if((v & 2) != 0) {
            bzaz0 = byht0.b;
        }
        if((v & 4) != 0) {
            byns0 = byht0.c;
        }
        if((v & 8) != 0) {
            bzcc0 = byht0.d;
        }
        if((v & 16) != 0) {
            byhy0 = byht0.e;
        }
        if((v & 0x20) != 0) {
            bxzz0 = byht0.f;
        }
        if((v & 0x40) != 0) {
            bxzt0 = byht0.g;
        }
        ibuq.f(bxzz0, "providerActivityState");
        ibuq.f(bxzt0, "dialogResult");
        return new byht(z, bzaz0, byns0, bzcc0, byhy0, bxzz0, bxzt0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byht)) {
            return false;
        }
        if(this.a != ((byht)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((byht)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((byht)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((byht)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((byht)object0).e)) {
            return false;
        }
        return this.f == ((byht)object0).f ? ibuq.m(this.g, ((byht)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.a ? 0x4CF : 0x4D5;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        byhy byhy0 = this.e;
        if(byhy0 != null) {
            v = byhy0.hashCode();
        }
        return (((((v2 * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode();
    }

    @Override
    public final String toString() {
        return "UiState(loadingRequest=" + this.a + ", getCredentialUiState=" + this.b + ", createCredentialUiState=" + this.c + ", importCredentialsUiState=" + this.d + ", selectedEntry=" + this.e + ", providerActivityState=" + this.f + ", dialogResult=" + this.g + ")";
    }
}

