public final class bpjn {
    public final ggeo a;
    public final long b;

    public bpjn() {
        throw null;
    }

    public bpjn(ggeo ggeo0, long v) {
        this.a = ggeo0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpjn) && ggkm.o(this.a, ((bpjn)object0).a) && this.b == ((bpjn)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "BatchesToSend{batchesPerAccount=" + ggkm.j(this.a) + ", cutTimestampMillis=" + this.b + "}";
    }
}

