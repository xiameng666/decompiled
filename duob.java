public final class duob {
    public final duoc a;
    public final hjzq b;
    public final boolean c;

    public duob() {
        this(null);
    }

    public duob(duoc duoc0, hjzq hjzq0, boolean z) {
        ibuq.f(duoc0, "type");
        super();
        this.a = duoc0;
        this.b = hjzq0;
        this.c = z;
    }

    public duob(byte[] arr_b) {
        this(duoc.a, null, true);
    }

    public static duob a(duob duob0, duoc duoc0, hjzq hjzq0, boolean z, int v) {
        if((v & 1) != 0) {
            duoc0 = duob0.a;
        }
        if((v & 2) != 0) {
            hjzq0 = duob0.b;
        }
        if((v & 4) != 0) {
            z = duob0.c;
        }
        ibuq.f(duoc0, "type");
        return new duob(duoc0, hjzq0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof duob)) {
            return false;
        }
        if(this.a != ((duob)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((duob)object0).b) ? this.c == ((duob)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        hjzq hjzq0 = this.b;
        if(hjzq0 == null) {
            return this.c ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
        }
        if(((ProtoLiteMessage)hjzq0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)hjzq0).s();
            return this.c ? (v + v1) * 0x1F + 0x4CF : (v + v1) * 0x1F + 0x4D5;
        }
        int v2 = hjzq0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)hjzq0).s();
            hjzq0.memoizedHashCode = v2;
        }
        return this.c ? (v + v2) * 0x1F + 0x4CF : (v + v2) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "IdProvisioningStatusState(type=" + this.a + ", displayConfig=" + this.b + ", walletInstalled=" + this.c + ")";
    }
}

