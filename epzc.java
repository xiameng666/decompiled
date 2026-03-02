public final class epzc {
    public long a;
    public long b;

    public epzc() {
        this(0L, 0L);
    }

    public epzc(long v, long v1) {
        this.a = v;
        if(v1 > 0L) {
            this.b = v1;
            return;
        }
        this.b = v;
    }

    static long a(int v) {
        return 1L << ((int)(((long)(v - 1))));
    }

    public final boolean b(int v) {
        return (epzc.a(v) & this.a) > 0L;
    }

    public final void c(int v, boolean z) {
        long v1 = epzc.a(v);
        this.a = z ? this.a | v1 : this.a & ~v1;
        this.b |= v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((epzc)object0).a && this.b == ((epzc)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public final String toString() {
        return "OptionFlags[flagValues=" + this.a + " (" + Long.toBinaryString(this.a) + "), setIndicator=" + this.b + "]";
    }
}

