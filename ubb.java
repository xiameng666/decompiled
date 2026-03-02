public final class ubb {
    public static final uba a;
    public final Object b;
    public final uba c;
    public final String d;
    public volatile byte[] e;

    static {
        ubb.a = new uaz();
    }

    public ubb(String s, Object object0, uba uba0) {
        uqo.c(s);
        this.d = s;
        this.b = object0;
        uqo.f(uba0);
        this.c = uba0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ubb) ? this.d.equals(((ubb)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "Option{key=\'" + this.d + "\'}";
    }
}

