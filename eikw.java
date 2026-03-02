public final class eikw {
    public final String a;
    public final long b;
    public final long c;
    public final gwgx d;
    public final gwhf e;
    public final int f;

    public eikw() {
        throw null;
    }

    public eikw(String s, long v, long v1, int v2, gwgx gwgx0, gwhf gwhf0) {
        if(s == null) {
            throw new NullPointerException("Null macAddress");
        }
        this.a = s;
        this.b = v;
        this.c = v1;
        if(v2 == 0) {
            throw new NullPointerException("Null state");
        }
        this.f = v2;
        if(gwgx0 == null) {
            throw new NullPointerException("Null bleScan");
        }
        this.d = gwgx0;
        if(gwhf0 == null) {
            throw new NullPointerException("Null locationScan");
        }
        this.e = gwhf0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eikw) && this.a.equals(((eikw)object0).a) && this.b == ((eikw)object0).b && this.c == ((eikw)object0).c && this.f == ((eikw)object0).f && ((ProtoLiteMessage)this.d).equals(((eikw)object0).d) && ((ProtoLiteMessage)this.e).equals(((eikw)object0).e);
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() ^ 1000003;
        gwgx gwgx0 = this.d;
        if(((ProtoLiteMessage)gwgx0).isImmutable()) {
            v1 = ((ProtoLiteMessage)gwgx0).s();
        }
        else {
            int v2 = gwgx0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)gwgx0).s();
                gwgx0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = ((((v * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ this.f) * 1000003 ^ v1) * 1000003;
        gwhf gwhf0 = this.e;
        if(((ProtoLiteMessage)gwhf0).isImmutable()) {
            return ((ProtoLiteMessage)gwhf0).s() ^ v3;
        }
        int v4 = gwhf0.memoizedHashCode;
        if(v4 == 0) {
            v4 = ((ProtoLiteMessage)gwhf0).s();
            gwhf0.memoizedHashCode = v4;
        }
        return v4 ^ v3;
    }

    @Override
    public final String toString() {
        return "Scan{macAddress=" + this.a + ", creationTimestampMillis=" + this.b + ", lastUpdatedTimestampMillis=" + this.c + ", state=" + Integer.toString(this.f - 1) + ", bleScan=" + this.d.toString() + ", locationScan=" + this.e.toString() + "}";
    }
}

