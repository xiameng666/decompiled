public final class iaqp {
    public static final iaqp a;
    public final int b;

    static {
        iaqo iaqo0 = new iaqo(0);
        iaqo0.b(1);
        iaqp.a = iaqo0.a();
    }

    public iaqp(int v) {
        this.b = v;
    }

    public final iaqo a() {
        return new iaqo(this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.b == ((iaqp)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "BindServiceFlags{" + Integer.toHexString(this.b) + "}";
    }
}

