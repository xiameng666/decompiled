abstract class crbz extends crby {
    private boolean a;

    public crbz(crkt crkt0) {
        super(crkt0);
        this.y.u();
    }

    protected final void a() {
        if(this.o()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void b() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.p()) {
            this.y.t();
            this.a = true;
        }
    }

    public final void c() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.d();
        this.y.t();
        this.a = true;
    }

    protected void d() {
    }

    final boolean o() {
        return this.a;
    }

    protected abstract boolean p();
}

