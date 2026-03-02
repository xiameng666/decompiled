public final class dmte implements Runnable {
    public final dmtl a;
    public final dxev b;

    public dmte(dmtl dmtl0, dxev dxev0) {
        this.a = dmtl0;
        this.b = dxev0;
    }

    @Override
    public final void run() {
        this.a.f(this.b);
        this.a.a(hami.S, this.b);
    }
}

