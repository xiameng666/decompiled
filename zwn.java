final class zwn implements ibtx {
    final znn a;
    final aadl b;

    public zwn(znn znn0, aadl aadl0) {
        this.a = znn0;
        this.b = aadl0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        zxv zxv0;
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        float f = isn.a(0x7F0701A0, ((goz)object1));  // dimen:as_expressive_card_max_width
        hfc hfc0 = dla.e(dls.A(hfc.e, 0.0f, f, 1), 16.0f, 1.0f);
        znn znn0 = this.a;
        ((goz)object1).M(0x90A02C56);
        int v1 = znn0.f.ordinal();
        switch(v1) {
            case 0: {
                zxv0 = new zxv(20.0f, 4.0f);
                break;
            }
            case 1: {
                zxv0 = new zxv(4.0f, 4.0f);
                break;
            }
            case 2: {
                zxv0 = new zxv(4.0f, 20.0f);
                break;
            }
            default: {
                if(v1 != 3) {
                    throw new ibnq();
                }
                zxv0 = new zxv(20.0f, 20.0f);
                break;
            }
        }
        cmb cmb0 = new cmb(400, 0, null, 6);
        gui gui0 = chg.a(zxv0.a, cmb0, ((goz)object1), 0x30);
        cmb cmb1 = new cmb(400, 0, null, 6);
        gui gui1 = chg.a(zxv0.b, cmb1, ((goz)object1), 0x30);
        float f1 = zwx.a(gui0);
        float f2 = zwx.a(gui0);
        float f3 = zwx.b(gui1);
        hfc hfc1 = hhi.a(hfc0, eah.c(f1, f2, zwx.b(gui1), f3));
        ((goz)object1).A();
        hfc hfc2 = cqx.c(hfc1, this.b.a);
        ((goz)object1).M(0xF271CF3D);
        aacb aacb0 = (aacb)((goz)object1).h(aadh.d);
        if(!znn0.g) {
            ((goz)object1).M(-1633490746);
            int v2 = ((goz)object1).Z(aacb0) | ((goz)object1).Z(znn0);
            Object object3 = ((goz)object1).k();
            if(v2 != 0 || object3 == gop.a) {
                object3 = new zwc(aacb0, znn0);
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            hfc2 = cru.d(hfc2, false, null, null, null, ((ibth)object3), 15);
        }
        ((goz)object1).A();
        hfc hfc3 = dls.w(((dih)object0).a(dla.e(hfc2, 16.0f, 12.0f), hei.e));
        iau iau0 = dhw.a(hei.a, false);
        long v3 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc4 = hew.c(((goz)object1), hfc3);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v4 = (int)(v3 ^ v3 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v4))) {
            Integer integer0 = v4;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc4, iej.c);
        if(jkv.a(((dih)object0).d(), 360.0f) <= 0) {
            ((goz)object1).M(-1891025004);
            zwx.f(znn0, ((goz)object1), 8);
        }
        else {
            ((goz)object1).M(0x8F4A2EFB);
            zwx.e(znn0, ((goz)object1), 8);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

