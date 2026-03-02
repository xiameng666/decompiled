final class fuul extends fuvb {
    public fuul(futd futd0) {
        super(futd0);
    }

    @Override  // fuvb
    protected final void K() {
        fwyt fwyt0 = this.d.u;
        if(fwyt0.h()) {
            fwyt0.d();
        }
    }

    @Override  // fuvb
    protected final void L(fuvb fuvb0) {
        if((fuvb0 instanceof fuul)) {
            throw new IllegalArgumentException("OffState cannot go to itself.");
        }
        super.L(fuvb0);
    }

    @Override  // fuvb
    public final void P() {
        this.o(false, false);
    }

    @Override  // fuvb
    public final void R() {
    }

    @Override  // fuvb
    public final void S() {
        this.o(false, true);
    }

    @Override  // fuvb
    protected final void U() {
        this.o(false, false);
    }

    @Override  // fuvb
    public final String Y() {
        return "OffState";
    }

    private final void o(boolean z, boolean z1) {
        if(this.i.a() && this.e.mT()) {
            futd futd0 = this.d;
            if(futd0.c() != 0x7FFFFFFFFFFFFFFFL) {
                if(!z) {
                    this.L(new fuuv(futd0, (z1 ? 20000L : 0L)));
                    return;
                }
                this.A(39L);
            }
        }
    }

    @Override  // fuvb
    public final void u() {
        super.u();
        futd futd0 = this.d;
        futd0.w(false, true);
        fwyt fwyt0 = futd0.u;
        if(fwyt0.h()) {
            fwyt0.d();
        }
        futd0.r.a();
    }

    @Override  // fuvb
    protected final void x(boolean z) {
        this.o(z, false);
    }
}

