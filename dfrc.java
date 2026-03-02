final class dfrc implements ibtx {
    final ibth a;
    final ibth b;

    public dfrc(ibth ibth0, ibth ibth1) {
        this.a = ibth0;
        this.b = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ModalBottomSheet");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.c(dla.j(dla.i(hey0, 24.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13), dmk.b(fiqn.b(((goz)object1)), ((goz)object1)));
        ibth ibth0 = this.a;
        ibth ibth1 = this.b;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        int v1 = dfrb.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth2 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth2);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        hpw hpw0 = ism.a(0x7F080EEC, ((goz)object1), 0);  // drawable:sharing_ic_v3_foreground
        hfc hfc2 = dls.k(dim.a.a(hey0, hei.n), 40.0f);
        long v2 = fpu.a(((goz)object1)).a;
        ibtw ibtw3 = iej.c;
        ibts ibts0 = iej.g;
        fnq.a(hpw0, null, hfc2, v2, ((goz)object1), 56, 0);
        String s = isq.c(0x7F152C45, ((goz)object1));  // string:sharing_migration_update_app_header "Nearby Share is now Quick Share"
        jbn jbn0 = fpu.d(((goz)object1)).f;
        long v3 = fpu.a(((goz)object1)).q;
        fiuk.b(s, dla.i(dls.w(hey0), 0.0f, 16.0f, 1), v3, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0x30, 0, 130040);
        String s1 = isq.c(0x7F152C44, ((goz)object1));  // string:sharing_migration_update_app_description "Update to Quick Share to continue 
                                                        // sharing with nearby Android devices, Chromebooks, and Windows PCs"
        jbn jbn1 = fpu.d(((goz)object1)).k;
        long v4 = fpu.a(((goz)object1)).s;
        fiuk.b(s1, dla.j(dls.w(hey0), 0.0f, 0.0f, 0.0f, 36.0f, 7), v4, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn1, ((goz)object1), 0x30, 0, 130040);
        hfc hfc3 = dls.w(hey0);
        iau iau1 = dll.b(dho.g, hei.j, ((goz)object1), 6);
        int v5 = dfrb.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc4 = hew.c(((goz)object1), hfc3);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth2);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v5))) {
            Integer integer1 = v5;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc4, ibtw3);
        fiqv.b(ibth0, null, false, null, null, null, null, dfqv.b, ((goz)object1), 0x30000000, 510);
        fiqv.a(ibth1, null, false, null, null, null, null, null, dfqv.c, ((goz)object1), 0x30000000, 510);
        ((goz)object1).z();
        ((goz)object1).z();
        return ibom.a;
    }
}

