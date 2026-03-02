final class iaun {
    private final ibfr a;
    private final iazt b;
    private final iazt c;
    private final iazt d;
    private volatile long e;

    public iaun(ibfr ibfr0) {
        this.b = iazu.a();
        this.c = iazu.a();
        this.d = iazu.a();
        this.a = ibfr0;
    }

    public final void a(boolean z) {
        if(z) {
            this.c.a();
            return;
        }
        this.d.a();
    }

    public final void b() {
        this.b.a();
        this.e = this.a.a();
    }
}

