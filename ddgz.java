final class ddgz implements ibtx {
    final ibth a;

    public ddgz(ibth ibth0) {
        this.a = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dhg dhg0 = dho.g(8.0f);
        hey hey0 = hfc.e;
        hfc hfc0 = dla.f(dls.w(hey0), 20.0f, 20.0f, 20.0f, 8.0f);
        ibth ibth0 = this.a;
        iau iau0 = dii.a(dhg0, hei.m, ((goz)object1), 6);
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
        hpw hpw0 = ism.a(0x7F080EEC, ((goz)object1), 0);  // drawable:sharing_ic_v3_foreground
        long v3 = fpu.a(((goz)object1)).a;
        fiso.a(hpw0, null, dls.k(hey0, 28.0f), v3, ((goz)object1), 440, 0);
        String s = isq.c(0x7F152D3D, ((goz)object1));  // string:sharing_settingsreview_title "Update your privacy settings"
        jbn jbn0 = fpu.d(((goz)object1)).j;
        fiuk.b(s, null, fpu.a(((goz)object1)).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        String s1 = isq.c(0x7F152DB7, ((goz)object1));  // string:sharing_update_privacy_settings_subtitle "Select who can share with you and 
                                                        // how you will appear to others"
        jbn jbn1 = fpu.d(((goz)object1)).k;
        fiuk.b(s1, null, fpu.a(((goz)object1)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn1, ((goz)object1), 0, 0, 0x1FFFA);
        cmig.f(0x40317, gzf.e(1382115005, new ddgy(ibth0, dim.a), ((goz)object1)), ((goz)object1), 54);
        ((goz)object1).z();
        return ibom.a;
    }
}

