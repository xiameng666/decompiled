public final class aakg implements aawv {
    public final aakt a;

    public aakg(aakt aakt0) {
        this.a = aakt0;
    }

    @Override  // aawv
    public final void a(gruj gruj0) {
        ibuq.f(gruj0, "actionItem");
        aarm aarm0 = this.a.z();
        grxw grxw0 = this.a.fT();
        ibuq.e(grxw0, "getScreenKey(...)");
        ibuq.f(grxw0, "screenKey");
        ibuq.f(gruj0, "actionItem");
        if(zhz.c((gruj0.e == null ? grwp.a : gruj0.e))) {
            grwp grwp0 = gruj0.e == null ? grwp.a : gruj0.e;
            grxw grxw1 = grwp0.c == null ? grxw.a : grwp0.c;
            ibuq.e(grxw1, "getTarget(...)");
            aarm0.b(grxw1);
        }
    }
}

