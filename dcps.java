public final class dcps {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final gyqv f;
    public final long g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;

    public dcps() {
        throw null;
    }

    public dcps(String s, long v, long v1, long v2, String s1, gyqv gyqv0, long v3, boolean z, long v4, int v5, int v6) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = s1;
        this.f = gyqv0;
        this.g = v3;
        this.h = z;
        this.i = v4;
        this.j = v5;
        this.k = v6;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof dcps) && this.a.equals(((dcps)object0).a) && this.b == ((dcps)object0).b && this.c == ((dcps)object0).c && this.d == ((dcps)object0).d) {
            String s = this.e;
            if(s != null) {
                if(s.equals(((dcps)object0).e)) {
                label_8:
                    if(((ProtoLiteMessage)this.f).equals(((dcps)object0).f) && this.g == ((dcps)object0).g && this.h == ((dcps)object0).h && this.i == ((dcps)object0).i) {
                        int v = this.j;
                        int v1 = ((dcps)object0).j;
                        if(v == 0) {
                            throw null;
                        }
                        if(v == v1) {
                            int v2 = this.k;
                            int v3 = ((dcps)object0).k;
                            if(v2 != 0) {
                                return v2 == v3;
                            }
                            throw null;
                        }
                    }
                }
            }
            else if(((dcps)object0).e == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = (((((this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003;
        gyqv gyqv0 = this.f;
        if(((ProtoLiteMessage)gyqv0).isImmutable()) {
            v1 = ((ProtoLiteMessage)gyqv0).s();
        }
        else {
            int v2 = gyqv0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)gyqv0).s();
                gyqv0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = ((((v ^ v1) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003 ^ (this.h ? 0x4CF : 0x4D5)) * 1000003 ^ ((int)(this.i ^ this.i >>> 0x20))) * 1000003;
        int v4 = this.j;
        if(v4 == 0) {
            throw null;
        }
        int v5 = this.k;
        if(v5 != 0) {
            return v5 ^ (v3 ^ v4) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.f);
        String s1 = "null";
        String s2 = this.j == 0 ? "null" : Integer.toString(this.j - 1);
        int v = this.k;
        if(v != 0) {
            s1 = Integer.toString(v - 1);
        }
        return "ParsingFailedEndpointIdInfo{endpointId=" + this.a + ", sessionId=" + this.b + ", durationMillis=" + this.c + ", flowId=" + this.d + ", referrerPackage=" + this.e + ", metadata=" + s + ", latencyFromActivityStarMillis=" + this.g + ", backgroundScanning=" + this.h + ", lastSyncDurationMillis=" + this.i + ", parsingFailedType=" + s2 + ", discoveryMode=" + s1 + "}";
    }
}

