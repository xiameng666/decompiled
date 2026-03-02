public final class atkm extends atkd {
    private final ggdy b;
    private long c;
    private boolean d;

    public atkm(arad arad0) {
        super(arad0);
        this.b = new ggdy();
    }

    @Override  // atkd
    public final long a() {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        return this.c;
    }

    @Override  // atkd
    public final atke b() {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        return new atkn(this.b.h());
    }

    @Override
    public final void close() {
        this.d = true;
    }

    @Override  // atkd
    public final void d(atjy atjy0) {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        this.c(atjy0);
        athv athv0 = this.a;
        athu athu0 = atjy0.a;
        if(athv0.c(athu0)) {
            atjy atjy1 = new atjy(athu0, athv0.b(athu0));
            this.b.i(atjy1);
            this.c += (long)atjy1.a();
            return;
        }
        this.b.i(atjy0);
        this.c += (long)atjy0.a();
    }
}

