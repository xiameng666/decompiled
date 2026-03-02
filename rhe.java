public final class rhe {
    public final String a;
    public final gged_interceptors b;
    public final long c;

    public rhe() {
        throw null;
    }

    public rhe(String s, gged_interceptors gged0, long v) {
        if(s == null) {
            throw new NullPointerException("Null token");
        }
        this.a = s;
        if(gged0 == null) {
            throw new NullPointerException("Null cookies");
        }
        this.b = gged0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof rhe) && this.a.equals(((rhe)object0).a) && ggia.i(this.b, ((rhe)object0).b) && this.c == ((rhe)object0).c;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.c ^ this.c >>> 0x20)) ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Ts43AuthToken{token=" + this.a + ", cookies=" + this.b.toString() + ", validity=" + this.c + "}";
    }
}

