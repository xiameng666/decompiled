final class bgdi implements ibtx {
    final dld a;
    final bgds b;
    final ibts c;
    final ibth d;
    final ibth e;
    final ibtw f;

    public bgdi(dld dld0, bgds bgds0, ibts ibts0, ibth ibth0, ibth ibth1, ibtw ibtw0) {
        this.a = dld0;
        this.b = bgds0;
        this.c = ibts0;
        this.d = ibth0;
        this.e = ibth1;
        this.f = ibtw0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$PullToRefreshBox");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = iqn.a(hfc.e, "CredentialsList");
        dhg dhg0 = dho.g(2.0f);
        dld dld0 = dla.h(0.0f, 0.0f, 0.0f, bgdq.p(this.a, ((goz)object1)) + 8.0f, 7);
        ((goz)object1).M(-1224400529);
        bgds bgds0 = this.b;
        int v1 = ((goz)object1).Z(bgds0);
        ibts ibts0 = this.c;
        int v2 = v1 | ((goz)object1).X(ibts0);
        ibth ibth0 = this.d;
        int v3 = v2 | ((goz)object1).X(ibth0);
        ibth ibth1 = this.e;
        int v4 = v3 | ((goz)object1).X(ibth1);
        ibtw ibtw0 = this.f;
        int v5 = v4 | ((goz)object1).X(ibtw0);
        Object object3 = ((goz)object1).k();
        if(v5 != 0 || object3 == gop.a) {
            bgda bgda0 = new bgda(bgds0, ibts0, ibth0, ibth1, ibtw0);
            ((goz)object1).R(bgda0);
            object3 = bgda0;
        }
        ((goz)object1).A();
        dnh.a(hfc0, null, dld0, false, dhg0, null, null, false, null, ((ibts)object3), ((goz)object1), 0x6006, 490);
        return ibom.a;
    }
}

