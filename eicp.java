public final class eicp {
    public final long a;
    public final long b;
    public final long c;
    public final gged_interceptors d;

    public eicp() {
        throw null;
    }

    public eicp(long v, long v1, long v2, gged_interceptors gged0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eicp) && this.a == ((eicp)object0).a && this.b == ((eicp)object0).b && this.c == ((eicp)object0).c && ggia.i(this.d, ((eicp)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((int)(this.c ^ this.c >>> 0x20)) ^ ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AlertConfig{alertDelayStationaryAndWifiMillis=" + this.a + ", alertDelayStationaryOnlyMillis=" + this.b + ", alertDelayMaxNoStationaryNoWifiMillis=" + this.c + ", alertDelayBypassHours=" + this.d + "}";
    }
}

