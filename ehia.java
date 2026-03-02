public final class ehia {
    public final gged_interceptors a;
    public final String b;
    public final boolean c;

    public ehia() {
        throw null;
    }

    public ehia(gged_interceptors gged0, String s, boolean z) {
        if(gged0 == null) {
            throw new NullPointerException("Null dataItems");
        }
        this.a = gged0;
        if(s == null) {
            throw new NullPointerException("Null token");
        }
        this.b = s;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehia) && ggia.i(this.a, ((ehia)object0).a) && this.b.equals(((ehia)object0).b) && this.c == ((ehia)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        return this.c ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "Page{dataItems=" + this.a + ", token=" + this.b + ", isLastPage=" + this.c + "}";
    }
}

