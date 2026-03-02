import j..util.Objects;

final class esrr implements essh {
    final esrs a;

    public esrr(esrs esrs0) {
        Objects.requireNonNull(esrs0);
        this.a = esrs0;
        super();
    }

    @Override  // essh
    public final int a() {
        return this.a.c;
    }

    @Override  // essh
    public final String b() {
        return Integer.toString(this.a.a, 16);
    }

    @Override  // essh
    public final boolean d() {
        return this.a.b;
    }

    @Override  // essh
    public final byte[] e(byte[] arr_b) {
        return new byte[0];
    }
}

