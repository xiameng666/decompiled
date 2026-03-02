final class fuko implements ibtw {
    final dib a;
    final ibth b;

    public fuko(dib dib0, ibth ibth0) {
        this.a = dib0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibth ibth2;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        hey hey0 = hfc.e;
        hel hel0 = hei.c;
        hfc hfc0 = dls.k(this.a.a(hey0, hel0), 48.0f);
        ibth ibth1 = this.b;
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = new dgh();
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ctp ctp0 = fxh.b(false, 0.0f, 0L, 6);
        ((goz)object0).M(-409297260);
        if(ibth1 == null) {
            ibth2 = null;
        }
        else {
            ((goz)object0).M(-1633490746);
            int v = ((goz)object0).X(ibth0) | ((goz)object0).X(ibth1);
            Object object4 = ((goz)object0).k();
            if(v != 0 || object4 == object3) {
                object4 = new fukm(ibth0, ibth1);
                ((goz)object0).R(object4);
            }
            ibth2 = (ibth)object4;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        ((goz)object0).M(-409297595);
        if(ibth2 == null) {
            ((goz)object0).M(0x6E3C21FE);
            Object object5 = ((goz)object0).k();
            if(object5 == object3) {
                object5 = new fukn();
                ((goz)object0).R(object5);
            }
            ibth2 = (ibth)object5;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        hfc hfc1 = iqn.a(cru.c(hfc0, ((dgg)object2), ctp0, ibth1 != null, null, null, ibth2, 24), "DismissButton");
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc2 = hew.c(((goz)object0), hfc1);
        ibth ibth3 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth3);
        }
        else {
            ((goz)object0).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc2, iej.c);
        hfc hfc3 = dls.k(dla.j(dic.a.a(hey0, hel0), 0.0f, 12.0f, 12.0f, 0.0f, 9), 16.0f);
        cth.a(ism.a(0x7F080512, ((goz)object0), 0), isq.c(0x7F15355E, ((goz)object0)), hfc3, null, null, 0.0f, null, ((goz)object0), 8, 120);  // drawable:gs_close_vd_theme_24
        ((goz)object0).z();
        return ibom.a;
    }
}

