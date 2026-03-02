public final class eiki {
    public final String a;
    public final int b;
    public final gwhg c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;

    public eiki() {
        throw null;
    }

    public eiki(String s, int v, gwhg gwhg0, long v1, long v2, int v3, int v4) {
        if(s == null) {
            throw new NullPointerException("Null macAddress");
        }
        this.a = s;
        this.b = v;
        if(gwhg0 == null) {
            throw new NullPointerException("Null optionalDeviceData");
        }
        this.c = gwhg0;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        if(v4 == 0) {
            throw new NullPointerException("Null alertStatus");
        }
        this.g = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eiki) && this.a.equals(((eiki)object0).a) && this.b == ((eiki)object0).b && ((ProtoLiteMessage)this.c).equals(((eiki)object0).c) && this.d == ((eiki)object0).d && this.e == ((eiki)object0).e && this.f == ((eiki)object0).f && this.g == ((eiki)object0).g;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        gwhg gwhg0 = this.c;
        if(((ProtoLiteMessage)gwhg0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)gwhg0).s();
            return this.g ^ (((((v * 1000003 ^ this.b) * 1000003 ^ v1) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f) * 1000003;
        }
        int v2 = gwhg0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)gwhg0).s();
            gwhg0.memoizedHashCode = v2;
        }
        return this.g ^ (((((v * 1000003 ^ this.b) * 1000003 ^ v2) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f) * 1000003;
    }

    @Override
    public final String toString() {
        return "DeviceData{macAddress=" + this.a + ", deviceType=" + this.b + ", optionalDeviceData=" + this.c.toString() + ", creationTimestampMillis=" + this.d + ", lastUpdatedTimestampMillis=" + this.e + ", alertLifecycleId=" + this.f + ", alertStatus=" + Integer.toString(this.g - 1) + "}";
    }
}

