public final class abb implements AutoCloseable, lpp {
    final abc a;
    final lpg b;
    private final nzb c;

    public abb(aaw aaw0, abc abc0, lpg lpg0) {
        this.a = abc0;
        this.b = lpg0;
        super();
        this.c = aaw0.e();
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_START) {
            nzc.b(this.a.a(), this.c);
            return;
        }
        if(lpe0 == lpe.ON_STOP) {
            this.c.e();
            return;
        }
        if(lpe0 == lpe.ON_DESTROY) {
            this.c.e();
            this.b.d(this);
        }
    }

    @Override
    public final void close() {
        this.b.d(this);
    }
}

