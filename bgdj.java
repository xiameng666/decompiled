final class bgdj implements ibtx {
    final ibtw a;
    final bgds b;
    final ibth c;
    final ibth d;
    final ibtw e;
    final ibts f;
    final ibth g;
    final ibth h;
    final ibtw i;

    public bgdj(ibtw ibtw0, bgds bgds0, ibth ibth0, ibth ibth1, ibtw ibtw1, ibts ibts0, ibth ibth2, ibth ibth3, ibtw ibtw2) {
        this.a = ibtw0;
        this.b = bgds0;
        this.c = ibth0;
        this.d = ibth1;
        this.e = ibtw1;
        this.f = ibts0;
        this.g = ibth2;
        this.h = ibth3;
        this.i = ibtw2;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ibth ibth6;
        ibth ibth5;
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "innerPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = iqn.a(hfc.e, "AccountsAvailableScreen");
        ibtw ibtw0 = this.a;
        bgds bgds0 = this.b;
        ibth ibth0 = this.c;
        ibth ibth1 = this.d;
        ibtw ibtw1 = this.e;
        ibts ibts0 = this.f;
        ibth ibth2 = this.g;
        hey hey0 = hfc.e;
        ibth ibth3 = this.h;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        int v1 = bgcv.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibtw ibtw2 = this.i;
        ibth ibth4 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth4);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw3 = iej.e;
        guo.b(((goz)object1), iau0, ibtw3);
        ibtw ibtw4 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw4);
        ibtw ibtw5 = iej.f;
        if(((goz)object1).ab()) {
            ibth5 = ibth3;
            ibth6 = ibth0;
        label_40:
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw5);
        }
        else {
            ibth5 = ibth3;
            ibth6 = ibth0;
            if(!ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
                goto label_40;
            }
        }
        ibts ibts1 = iej.g;
        guo.a(((goz)object1), ibts1);
        ibtw ibtw6 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw6);
        bfrc.a(gzf.e(-1903744481, new bgcw(dim.a, ibth1), ((goz)object1)), ibtw0, ((goz)object1), 6);
        hfc hfc2 = cci.b(dls.w(hey0));
        iau iau1 = dhw.a(hei.a, false);
        int v2 = bgcv.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc3 = hew.c(((goz)object1), hfc2);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth4);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw3);
        guo.b(((goz)object1), gzk1, ibtw4);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw5);
        }
        guo.a(((goz)object1), ibts1);
        guo.b(((goz)object1), hfc3, ibtw6);
        ibtw1.a(((goz)object1), Integer.valueOf(0));
        ((goz)object1).z();
        gne gne0 = gmv.c(((goz)object1));
        gze gze0 = gzf.e(345303801, new bgcy(gne0, bgds0), ((goz)object1));
        gze gze1 = gzf.e(-2032288070, new bgdi(((dld)object0), bgds0, ibts0, ibth2, ibth5, ibtw2), ((goz)object1));
        gmv.b(bgds0.a, ibth6, null, gne0, null, gze0, gze1, ((goz)object1), 0x1B0000, 20);
        ((goz)object1).z();
        return ibom.a;
    }
}

