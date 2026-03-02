final class dejn implements ibtx {
    final ibth a;
    final fyx b;
    final ibth c;

    public dejn(ibth ibth0, fyx fyx0, ibth ibth1) {
        this.a = ibth0;
        this.b = fyx0;
        this.c = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        hey hey1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ModalBottomSheet");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dim)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        cvq cvq0 = cvf.d(0, ((goz)object1), 0, 1);
        hey hey0 = hfc.e;
        hfc hfc0 = ((dim)object0).b(cvf.c(dla.i(hey0, 24.0f, 0.0f, 2), cvq0), 1.0f, false);
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        dim dim0 = dim.a;
        String s = isq.c(0x7F152C42, ((goz)object1));  // string:sharing_main_troubleshooting_dialog_title "Try these steps on the other device"
        jbn jbn0 = fpu.d(((goz)object1)).f;
        hfc hfc2 = dla.j(dls.w(hey0), 0.0f, 24.0f, 0.0f, 0.0f, 13);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new dejg();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiuk.b(s, iuc.d(hfc2, ((ibts)object3)), 0L, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FBFC);
        ((goz)object1).M(2068680216);
        if(hvqz.aa()) {
            hey1 = hey0;
            dekm.f(dim0, dla.j(hey0, 0.0f, 24.0f, 0.0f, 0.0f, 13), ((goz)object1), 54);
        }
        else {
            hey1 = hey0;
        }
        ((goz)object1).A();
        dekm.c(((goz)object1), 0);
        ((goz)object1).z();
        ((goz)object1).M(1222023006);
        if(cvq0.g()) {
            firy.a(null, 0.0f, 0L, ((goz)object1), 0, 7);
        }
        ((goz)object1).A();
        hfc hfc3 = dls.w(dla.f(hey1, 24.0f, 16.0f, 24.0f, 16.0f));
        gze gze0 = gzf.e(1115379004, new dejm(this.a, this.b, this.c), ((goz)object1));
        djr.e(hfc3, dho.g, null, null, 0, 0, gze0, ((goz)object1), 0x180030, 60);
        return ibom.a;
    }
}

