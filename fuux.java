final class fuux extends fuuj {
    private boolean a;
    private final fwzt b;

    public fuux(futd futd0) {
        super(futd0);
        this.a = false;
        this.b = ((fxbg)futd0.s).c ? futd0.s : null;
    }

    @Override  // fuvb
    public final String Y() {
        return "SignificantMotionDetectionState";
    }

    @Override  // fuuj
    public final void b(boolean z) {
        futd futd0 = this.d;
        futd0.w(false, true);
        if(z) {
            futd0.r.a();
        }
        if(this.a) {
            return;
        }
        this.A(39L);
    }

    @Override  // fuuj
    public final void u() {
        super.u();
        this.a = false;
        if(this.b != null && this.b.a(this)) {
            this.h.h(0x4F, 0);
            return;
        }
        this.h.h(0x4F, 1);
        this.L(new fuug(this.d));
    }

    @Override  // fuvb
    public final void v() {
        super.v();
        this.a = true;
        fwzt fwzt0 = this.b;
        if(fwzt0 != null) {
            fwzt0.d();
        }
        this.h.g(80);
    }
}

