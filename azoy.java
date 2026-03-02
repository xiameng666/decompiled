public final class azoy {
    public final boolean a;
    private final azpg b;

    public azoy(boolean z, boolean z1) {
        azpg azpg0 = z ? azpg.a(z1) : azpg.a;
        ibuq.c(azpg0);
        ibuq.f(azpg0, "firstPartyStatus");
        super();
        this.a = z;
        this.b = azpg0;
    }

    public final boolean a() {
        return this.a && this.b == azpg.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof azoy)) {
            return false;
        }
        return this.a == ((azoy)object0).a ? this.b == ((azoy)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "CertQueryResult(signed=" + this.a + ", firstPartyStatus=" + this.b + ")";
    }
}

