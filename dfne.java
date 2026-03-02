public final class dfne {
    public final dflr a;
    public final dflr b;
    public final dflr c;
    public final boolean d;

    public dfne() {
        this(null);
    }

    public dfne(dflr dflr0, dflr dflr1, dflr dflr2, boolean z) {
        ibuq.f(dflr0, "account");
        ibuq.f(dflr1, "deviceName");
        ibuq.f(dflr2, "deviceVisibility");
        super();
        this.a = dflr0;
        this.b = dflr1;
        this.c = dflr2;
        this.d = z;
    }

    public dfne(byte[] arr_b) {
        this(dflp.a, dflp.a, dflp.a, false);
    }

    public static dfne a(dfne dfne0, dflr dflr0, dflr dflr1, dflr dflr2, boolean z, int v) {
        if((v & 1) != 0) {
            dflr0 = dfne0.a;
        }
        if((v & 2) != 0) {
            dflr1 = dfne0.b;
        }
        if((v & 4) != 0) {
            dflr2 = dfne0.c;
        }
        if((v & 8) != 0) {
            z = dfne0.d;
        }
        ibuq.f(dflr0, "account");
        ibuq.f(dflr1, "deviceName");
        ibuq.f(dflr2, "deviceVisibility");
        return new dfne(dflr0, dflr1, dflr2, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dfne)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dfne)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dfne)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((dfne)object0).c) ? this.d == ((dfne)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        return this.d ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "SettingsReviewState(account=" + this.a + ", deviceName=" + this.b + ", deviceVisibility=" + this.c + ", isOptedIn=" + this.d + ")";
    }
}

