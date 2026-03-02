public final class dmtc implements evqc {
    public final dmtl a;
    public final eflz b;
    public final String c;
    public final dxev d;

    public dmtc(dmtl dmtl0, eflz eflz0, String s, dxev dxev0) {
        this.a = dmtl0;
        this.b = eflz0;
        this.c = s;
        this.d = dxev0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.b.dismiss();
        ((ggtj)((ggtj)((ggtj)dmtl.a.i()).s(exception0)).ar(9301)).B("Failed to set SE postpaid default for client token id: %s", this.c);
        dmtl dmtl0 = this.a;
        dmtl0.h(6, this.d);
        fm fm0 = dmtl0.b.getFragmentManager();
        if(fm0 != null) {
            dmtl0.c.b(fm0);
        }
    }
}

