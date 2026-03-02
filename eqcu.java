public final class eqcu implements eqsk {
    public final eqcx a;

    public eqcu(eqcx eqcx0) {
        this.a = eqcx0;
    }

    @Override  // eqsk
    public final void a() {
        eqcx eqcx0 = this.a;
        if(!eqcx0.f) {
            return;
        }
        eqcx.a.m("AccountTransfer Imports timed out", new Object[0]);
        if(eqcx.e(eqcx0.i)) {
            eqcx0.b();
            return;
        }
        eqcx0.d.d(15, "Timed out while waiting on AccountTransfer imports");
    }
}

