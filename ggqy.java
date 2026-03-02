public final class ggqy extends ggrc {
    public final ggmb a;
    private final int b;
    private final ggqv c;

    public ggqy(ggmb ggmb0, ggqv ggqv0) {
        this.a = ggmb0;
        this.c = ggqv0;
        this.b = ggmb0.i().size() + 1;
    }

    @Override  // ggrc
    public final int a() {
        return this.b;
    }

    @Override  // ggrc
    public final glww b(Object object0) {
        glwv glwv0 = new glwv(10);
        ggqx ggqx0 = new ggqx(this, glwv0);
        this.c.a(object0, ggqx0);
        return glwv0.a();
    }
}

