final class ace extends aaw {
    public icck a;
    public ibtw d;
    public acd e;
    public boolean f;

    public ace(boolean z, icck icck0, ibtw ibtw0) {
        super(z);
        this.a = icck0;
        this.d = ibtw0;
    }

    @Override  // aaw
    public final void a() {
        acd acd0 = this.e;
        if(acd0 != null) {
            acd0.a();
        }
        acd acd1 = this.e;
        if(acd1 != null) {
            acd1.b();
        }
        this.f = false;
    }

    @Override  // aaw
    public final void b() {
        acd acd0 = this.e;
        if(acd0 != null && !acd0.a) {
            acd0.a();
            this.e = null;
        }
        if(this.e == null) {
            this.e = new acd(this.a, false, this.d, this);
        }
        acd acd1 = this.e;
        if(acd1 != null) {
            ichp.a(acd1.b);
        }
        acd acd2 = this.e;
        if(acd2 != null) {
            acd2.b();
        }
        this.f = false;
    }

    @Override  // aaw
    public final void c(zu zu0) {
        acd acd0 = this.e;
        if(acd0 != null) {
            acd0.b.b(zu0);
        }
    }

    @Override  // aaw
    public final void d(zu zu0) {
        acd acd0 = this.e;
        if(acd0 != null) {
            acd0.a();
        }
        if(this.b) {
            this.e = new acd(this.a, true, this.d, this);
        }
        this.f = true;
    }
}

