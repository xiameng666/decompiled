public final class dfqp {
    public final dfoh a;
    public final dfoh b;
    public final dfoh c;
    public final dfoh d;
    public final boolean e;
    public final boolean f;

    public dfqp() {
        this(null);
    }

    public dfqp(dfoh dfoh0, dfoh dfoh1, dfoh dfoh2, dfoh dfoh3, boolean z, boolean z1) {
        ibuq.f(dfoh0, "account");
        ibuq.f(dfoh1, "visibility");
        ibuq.f(dfoh2, "preferPersistentEveryone");
        ibuq.f(dfoh3, "needsConsent");
        super();
        this.a = dfoh0;
        this.b = dfoh1;
        this.c = dfoh2;
        this.d = dfoh3;
        this.e = z;
        this.f = z1;
    }

    public dfqp(byte[] arr_b) {
        this(dfof.a, dfof.a, dfof.a, dfof.a, false, false);
    }

    public static dfqp a(dfqp dfqp0, dfoh dfoh0, dfoh dfoh1, dfoh dfoh2, dfoh dfoh3, boolean z, boolean z1, int v) {
        if((v & 1) != 0) {
            dfoh0 = dfqp0.a;
        }
        if((v & 2) != 0) {
            dfoh1 = dfqp0.b;
        }
        if((v & 4) != 0) {
            dfoh2 = dfqp0.c;
        }
        if((v & 8) != 0) {
            dfoh3 = dfqp0.d;
        }
        if((v & 16) != 0) {
            z = dfqp0.e;
        }
        if((v & 0x20) != 0) {
            z1 = dfqp0.f;
        }
        ibuq.f(dfoh0, "account");
        ibuq.f(dfoh1, "visibility");
        ibuq.f(dfoh2, "preferPersistentEveryone");
        ibuq.f(dfoh3, "needsConsent");
        return new dfqp(dfoh0, dfoh1, dfoh2, dfoh3, z, z1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dfqp)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dfqp)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dfqp)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dfqp)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dfqp)object0).d)) {
            return false;
        }
        return this.e == ((dfqp)object0).e ? this.f == ((dfqp)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + dfqo.a(this.e)) * 0x1F + dfqo.a(this.f);
    }

    @Override
    public final String toString() {
        return "VisibilityState(account=" + this.a + ", visibility=" + this.b + ", preferPersistentEveryone=" + this.c + ", needsConsent=" + this.d + ", hasDismissedConsentDialog=" + this.e + ", showConsentForRequestedVisibility=" + this.f + ")";
    }
}

