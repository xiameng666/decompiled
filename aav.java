final class aav extends nzb {
    private final aaw c;

    public aav(aaw aaw0) {
        super(aaw0.b);
        this.c = aaw0;
    }

    @Override  // nzb
    protected final void a() {
        this.c.a();
    }

    @Override  // nzb
    protected final void b() {
        this.c.b();
    }

    @Override  // nzb
    protected final void c(nza nza0) {
        zu zu0 = new zu(nza0);
        this.c.c(zu0);
    }

    @Override  // nzb
    protected final void d(nza nza0) {
        zu zu0 = new zu(nza0);
        this.c.d(zu0);
    }
}

