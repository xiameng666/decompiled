import j..util.Objects;

final class doib extends lm {
    final boolean a;
    final boolean b;
    final doic c;

    public doib(doic doic0, boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
        Objects.requireNonNull(doic0);
        this.c = doic0;
        super();
    }

    @Override  // lm
    public final int a() {
        return !this.a || !this.b ? 0 : 1;
    }

    @Override  // lm
    public final int b() {
        return !this.c.a || !this.c.e ? 0 : 1;
    }

    @Override  // lm
    public final boolean d(int v, int v1) {
        return (!this.c.a || !this.c.e ? 0 : 1) == (!this.a || !this.b ? 0 : 1);
    }

    @Override  // lm
    public final boolean e(int v, int v1) {
        return (!this.c.a || !this.c.e ? 0 : 1) == (!this.a || !this.b ? 0 : 1);
    }
}

