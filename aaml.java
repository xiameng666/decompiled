public final class aaml implements fhrs {
    public final aape a;
    public final boolean b;
    public final boolean c;

    public aaml() {
        throw null;
    }

    public aaml(aape aape0, boolean z, boolean z1) {
        this.a = aape0;
        this.b = z;
        this.c = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aaml) && this.a.equals(((aaml)object0).a) && this.b == ((aaml)object0).b && this.c == ((aaml)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(this.c) {
            v1 = 0x4CF;
        }
        return (v * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "ScrollToPosition{targetScrollPosition=" + this.a.toString() + ", smoothScroll=" + this.b + ", navigationToAnchor=" + this.c + "}";
    }
}

