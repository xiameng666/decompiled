public final class eiok implements eioi, AutoCloseable {
    public final eioe a;

    public eiok(eioe eioe0) {
        this.a = eioe0;
    }

    @Override  // eioi
    public final long c() {
        return this.a.c();
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override  // eioi
    public final long d() {
        throw null;
    }

    @Override  // eioi
    public final double e(int v) {
        return this.a.e(v);
    }

    @Override  // eioi
    public final long f(int v) {
        return this.a.f(v);
    }

    @Override  // eioi
    public final String g(int v) {
        return this.a.g(v);
    }

    @Override  // eioi
    public final String h(int v) {
        return this.a.h(v);
    }

    @Override  // eioi
    public final boolean i(int v) {
        return this.a.i(v);
    }

    @Override  // eioi
    public final byte[] j(int v) {
        return this.a.j(v);
    }

    @Override  // eioi
    public final byte[] k(int v) {
        return this.a.k(v);
    }
}

