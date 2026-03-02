final class erxh implements ibtw {
    final hfc a;
    final ibth b;

    public erxh(hfc hfc0, ibth ibth0) {
        this.a = hfc0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = this.a;
        hfc hfc1 = dla.i(hfc0, cltw.e, 0.0f, 2);
        dhg dhg0 = dho.g(cltw.h);
        ibth ibth0 = this.b;
        iau iau0 = dii.a(dhg0, hei.m, ((goz)object0), 0);
        int v = erxg.a(gol.c(((goz)object0)));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc2 = hew.c(((goz)object0), hfc1);
        ibth ibth1 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth1);
        }
        else {
            ((goz)object0).T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object0), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object0), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v))) {
            Integer integer0 = v;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw2);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc2, iej.c);
        hfc hfc3 = dla.j(hfc0, 0.0f, 24.0f, 0.0f, 0.0f, 13);
        String s = isq.c(0x7F152F37, ((goz)object0));  // string:spatula_settings_resources_card_title "Resources and support to protect yourself 
                                                       // online"
        long v1 = fpu.a(((goz)object0)).q;
        jbn jbn0 = fpu.d(((goz)object0)).h;
        ibtw ibtw3 = iej.c;
        ibts ibts0 = iej.g;
        gdh.b(s, hfc3, v1, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object0), 0, 0, 0x1FFF8);
        hfc hfc4 = dla.j(hfc0, 0.0f, 6.0f, 0.0f, 0.0f, 13);
        gdh.b(isq.c(0x7F152F36, ((goz)object0)), hfc4, fpu.a(((goz)object0)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(((goz)object0)).k, ((goz)object0), 0, 0, 0x1FFF8);  // string:spatula_settings_resources_card_desc "Want to make responsible decisions 
                                                                                                                                                                                              // online, but need some support? Here are some resources that can help."
        hfc hfc5 = dls.w(hfc0);
        iau iau1 = dll.b(dho.b, hei.j, ((goz)object0), 6);
        int v2 = erxg.a(gol.c(((goz)object0)));
        gzk gzk1 = ((goz)object0).ap();
        hfc hfc6 = hew.c(((goz)object0), hfc5);
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth1);
        }
        else {
            ((goz)object0).T();
        }
        guo.b(((goz)object0), iau1, ibtw0);
        guo.b(((goz)object0), gzk1, ibtw1);
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object0).R(integer1);
            ((goz)object0).p(integer1, ibtw2);
        }
        guo.a(((goz)object0), ibts0);
        guo.b(((goz)object0), hfc6, ibtw3);
        fcm.d(ibth0, dla.j(iqn.a(hfc0, "visitResourcesButton"), 0.0f, 0.0f, 0.0f, 12.0f, 7), false, null, null, null, erwy.e, ((goz)object0), 0x30000000, 508);
        ((goz)object0).z();
        ((goz)object0).z();
        return ibom.a;
    }
}

