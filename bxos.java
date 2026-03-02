public final class bxos {
    public static final bxoq a;

    static {
        bxos.a = new bxoo(((gful_cronetEngineProvider)new bxor()));
    }

    public final long a(long v) {
        return (v + 11644473600000L) * 1000L;
    }

    public final long b(long v) {
        return v / 1000L - 11644473600000L;
    }

    public final long c() {
        return System.currentTimeMillis() / 1000L;
    }

    public final long d() {
        return this.a(System.currentTimeMillis());
    }
}

