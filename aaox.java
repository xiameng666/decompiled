public final class aaox {
    public final gged_interceptors a;
    public final gged_interceptors b;
    public final ggeo c;
    private final boolean d;

    public aaox() {
        throw null;
    }

    public aaox(gged_interceptors gged0, gged_interceptors gged1, ggeo ggeo0, boolean z) {
        if(gged0 == null) {
            throw new NullPointerException("Null items");
        }
        this.a = gged0;
        if(gged1 == null) {
            throw new NullPointerException("Null pages");
        }
        this.b = gged1;
        this.c = ggeo0;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aaox) && ggia.i(this.a, ((aaox)object0).a) && ggia.i(this.b, ((aaox)object0).b) && ggkm.o(this.c, ((aaox)object0).c) && this.d == ((aaox)object0).d;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
        return this.d ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        String s = ggkm.j(this.c);
        return "LeftNavigation{items=" + this.a + ", pages=" + this.b + ", idToResourceKeyMap=" + s + ", dividerEnabled=" + this.d + "}";
    }
}

