import j..util.Objects;

public final class ggzn {
    final int a;
    final int b;
    final ggzo c;

    public ggzn(ggzo ggzo0, int v, int v1) {
        this.a = v;
        this.b = v1;
        Objects.requireNonNull(ggzo0);
        this.c = ggzo0;
        super();
    }

    public final int a() {
        return this.c.c.i.a(this.a + this.b);
    }

    public final int b() {
        return this.c.c.h.a(this.a + this.b);
    }

    public final int c() {
        return this.c.c.j.a(this.a + this.b);
    }

    public final ghae d() {
        return (ghae)this.c.c.l.get(this.a + this.b);
    }

    public final ghae e() {
        return (ghae)this.c.c.k.get(this.a + this.b);
    }
}

