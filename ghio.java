public final class ghio {
    public static final ghio a;
    public final String b;

    static {
        ghio.a = new ghio("about:invalid#zGuavaz");
    }

    public ghio(String s) {
        s.getClass();
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghio) ? this.b.equals(((ghio)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0x1170EF8;
    }

    @Override
    public final String toString() {
        return "SafeUrl{" + this.b + "}";
    }
}

