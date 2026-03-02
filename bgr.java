final class bgr {
    public final bgt a;
    public final bcn b;

    public bgr() {
        throw null;
    }

    public bgr(bgt bgt0, bcn bcn0) {
        if(bgt0 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = bgt0;
        this.b = bcn0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bgr) && this.a.equals(((bgr)object0).a) && this.b.equals(((bgr)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}

