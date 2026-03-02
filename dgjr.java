final class dgjr {
    public final long a;
    public final iced b;
    public final dgop c;

    public dgjr(long v, dgop dgop0, iced iced0) {
        this.a = v;
        this.c = dgop0;
        this.b = iced0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgjr)) {
            return false;
        }
        if(this.a != ((dgjr)object0).a) {
            return false;
        }
        return ibuq.m(this.c, ((dgjr)object0).c) ? ibuq.m(this.b, ((dgjr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.c.hashCode()) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SenderInfo(senderId=" + this.a + ", payloadTracker=" + this.c + ", job=" + this.b + ")";
    }
}

