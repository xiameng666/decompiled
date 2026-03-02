public final class ehje {
    public static final ehje a;
    public final boolean b;
    public final int c;

    static {
        ehje.a = new ehje(false, -1);
    }

    public ehje(boolean z, int v) {
        this.b = z;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ehje) ? this.b == ((ehje)object0).b && this.c == ((ehje)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return this.b | this.c + this.c;
    }
}

