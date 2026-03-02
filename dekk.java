final class dekk implements ibtx {
    final fyx a;
    final ibth b;

    public dekk(fyx fyx0, ibth ibth0) {
        this.a = fyx0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
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
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new dejr();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        gra gra0 = (gra)had.c(new Object[0], ((ibth)object3), ((goz)object1), 0x30);
        hey hey0 = hfc.e;
        cgf.a(((dim)object0).b(cvf.c(dla.i(hey0, 24.0f, 0.0f, 2), cvq0), 1.0f, false), gzf.e(0x2F63E779, new dejy(gra0), ((goz)object1)), ((goz)object1), 0x30, 0);
        ((goz)object1).M(0xB37B19BE);
        if(cvq0.g()) {
            firy.a(null, 0.0f, 0L, ((goz)object1), 0, 7);
        }
        ((goz)object1).A();
        if(dekk.b(gra0) > 0) {
            ((goz)object1).M(0xBBEA2A98);
            hfc hfc0 = dls.w(dla.f(hey0, 24.0f, 16.0f, 24.0f, 16.0f));
            fyx fyx0 = this.a;
            ibth ibth0 = this.b;
            iau iau0 = dll.b(dho.b, hei.j, ((goz)object1), 6);
            long v1 = gol.c(((goz)object1));
            gzk gzk0 = ((goz)object1).ap();
            hfc hfc1 = hew.c(((goz)object1), hfc0);
            ibth ibth1 = iej.a;
            ((goz)object1).O();
            if(((goz)object1).ab()) {
                ((goz)object1).t(ibth1);
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
            cmig.f(0x403A2, gzf.e(0xFC75093F, new dekc(fyx0, ibth0), ((goz)object1)), ((goz)object1), 54);
            ((goz)object1).z();
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0xBBF2E5DD);
        hfc hfc2 = dls.w(dla.f(hey0, 24.0f, 16.0f, 24.0f, 16.0f));
        gze gze0 = gzf.e(1747270007, new dekj(this.a, this.b, gra0), ((goz)object1));
        djr.e(hfc2, dho.g, null, null, 0, 0, gze0, ((goz)object1), 0x180030, 60);
        ((goz)object1).A();
        return ibom.a;
    }

    public static final int b(gra gra0) {
        return ((Number)gra0.a()).intValue();
    }
}

