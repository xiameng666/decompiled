public final class duut {
    public final hkam a;
    public final boolean b;
    public final Throwable c;

    public duut() {
        this(null);
    }

    public duut(hkam hkam0, boolean z, Throwable throwable0) {
        this.a = hkam0;
        this.b = z;
        this.c = throwable0;
    }

    public duut(byte[] arr_b) {
        this(null, false, null);
    }

    public static duut a(duut duut0, hkam hkam0, boolean z, Throwable throwable0, int v) {
        if((v & 1) != 0) {
            hkam0 = duut0.a;
        }
        if((v & 2) != 0) {
            z = duut0.b;
        }
        if((v & 4) != 0) {
            throwable0 = duut0.c;
        }
        return new duut(hkam0, z, throwable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof duut)) {
            return false;
        }
        if(!ibuq.m(this.a, ((duut)object0).a)) {
            return false;
        }
        return this.b == ((duut)object0).b ? ibuq.m(this.c, ((duut)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v1;
        hkam hkam0 = this.a;
        int v = 0;
        if(hkam0 == null) {
            v1 = 0;
        }
        else if(((ProtoLiteMessage)hkam0).isImmutable()) {
            v1 = ((ProtoLiteMessage)hkam0).s();
        }
        else {
            int v2 = hkam0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)hkam0).s();
                hkam0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = this.b ? 0x4CF : 0x4D5;
        Throwable throwable0 = this.c;
        if(throwable0 != null) {
            v = throwable0.hashCode();
        }
        return (v1 * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "IdIssuerSelectorState(supportedIssuersResponse=" + this.a + ", isLoading=" + this.b + ", error=" + this.c + ")";
    }
}

