public final class ggqu extends ggqn {
    public final int c;
    private final int d;
    private final gful_cronetEngineProvider e;
    private ggqn f;

    public ggqu(glww glww0, int v) {
        super(glww0);
        this.e = gfus.a(((gful_cronetEngineProvider)new ggqt(this)));
        this.f = null;
        this.c = v;
        this.d = this.b.c();
    }

    @Override  // ggqn
    public final int a(glww glww0) {
        int v = this.d;
        int v1 = glww0.c();
        int v2 = Math.abs(v - v1);
        if(v2 > 100) {
            return v2;
        }
        ggqn ggqn0 = this.f;
        if(ggqn0 == null) {
            ggrd ggrd0 = new ggrd(this.b);
            this.f = ggrd0;
            return ggrd0.a(glww0);
        }
        return v <= 0x40 || v1 / 10 <= 100 ? ((ggqn)this.e.mr()).a(glww0) : ggqn0.a(glww0);
    }
}

