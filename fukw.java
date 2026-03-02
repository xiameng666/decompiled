final class fukw implements ibtw {
    final ibth a;

    public fukw(ibth ibth0) {
        this.a = ibth0;
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
        hfc hfc0 = dls.k(dla.j(hfc.e, 0.0f, 20.0f, 0.0f, 0.0f, 13), 16.0f);
        ibth ibth1 = this.a;
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = new dgh();
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ctp ctp0 = fxh.b(false, 24.0f, 0L, 4);
        ((goz)object0).M(-2024220365);
        if(ibth1 == null) {
            ibth2 = null;
        }
        else {
            ((goz)object0).M(-1633490746);
            int v = ((goz)object0).X(ibth0) | ((goz)object0).X(ibth1);
            Object object4 = ((goz)object0).k();
            if(v != 0 || object4 == object3) {
                object4 = new fuku(ibth0, ibth1);
                ((goz)object0).R(object4);
            }
            ibth2 = (ibth)object4;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        ((goz)object0).M(-2024220700);
        if(ibth2 == null) {
            ((goz)object0).M(0x6E3C21FE);
            Object object5 = ((goz)object0).k();
            if(object5 == object3) {
                object5 = new fukv();
                ((goz)object0).R(object5);
            }
            ibth2 = (ibth)object5;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        hfc hfc1 = iqn.a(cru.c(hfc0, ((dgg)object2), ctp0, ibth1 != null, null, null, ibth2, 24), "DismissButton");
        cth.a(ism.a(0x7F080512, ((goz)object0), 0), isq.c(0x7F15355E, ((goz)object0)), hfc1, null, null, 0.0f, null, ((goz)object0), 8, 120);  // drawable:gs_close_vd_theme_24
        return ibom.a;
    }
}

