public final class ciyl {
    public final cdef a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ciyl() {
        throw null;
    }

    public ciyl(cdef cdef0, Class class0, boolean z, boolean z1, boolean z2) {
        if(cdef0 == null) {
            throw new NullPointerException("Null metricId");
        }
        this.a = cdef0;
        if(class0 == null) {
            throw new NullPointerException("Null getLogType");
        }
        this.b = class0;
        this.c = z;
        this.d = z1;
        this.e = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ciyl) && this.a.equals(((ciyl)object0).a) && this.b.equals(((ciyl)object0).b) && this.c == ((ciyl)object0).c && this.d == ((ciyl)object0).d && this.e == ((ciyl)object0).e;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        int v1 = 0x4D5;
        int v2 = this.c ? 0x4CF : 0x4D5;
        int v3 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v1 = 0x4CF;
        }
        return ((v * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "NccConfig{metricId=" + this.a.toString() + ", getLogType=" + this.b.toString() + ", forceCheckSwaa=" + this.c + ", isStreamzOrCounter=" + this.d + ", forceCheckboxConsent=" + this.e + "}";
    }
}

