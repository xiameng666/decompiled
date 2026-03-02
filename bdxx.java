public final class bdxx {
    public static final void a(ibth ibth0, hfc hfc0, boolean z, goz goz0, int v) {
        String s1;
        boolean z1;
        ibth ibth1;
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(298604033);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        int v2 = (v & 0x180) == 0 ? v1 | 0x30 | (goz1.Y(z) ? 0x100 : 0x80) : v1 | 0x30;
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
            z1 = z;
        }
        else {
            hfc0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            long v3 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth2 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth2);
            }
            else {
                goz1.T();
            }
            int v4 = (int)(v3 ^ v3 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            bgkn.a(hfc0, goz1, v2 >> 3 & 14);
            goz1.M(589008861);
            hfc hfc2 = hsam.f() ? cqx.c(hfc0, fpu.a(goz1).F) : hfc0;
            goz1.x();
            hqf hqf0 = isr.c(0x7F08053B, goz1);  // drawable:gs_delete_vd_theme_24
            String s = isq.c(0x7F1526B5, goz1);  // string:pwm_delete_all_setting_title "Delete all data"
            if(z) {
                goz1.M(0x405D0E5A);
                s1 = isq.c(0x7F1526B3, goz1);  // string:pwm_delete_all_setting_description "From Google Password Manager, including 
                                               // passwords and passkeys"
            }
            else {
                goz1.M(0x405E6072);
                s1 = isq.c(0x7F1526B4, goz1);  // string:pwm_delete_all_setting_description_no_data "No saved passwords or passkeys"
            }
            goz1.x();
            ibth1 = ibth0;
            z1 = z;
            bgkk.a(hqf0, s, s1, ibth1, hfc2, z1, goz1, v2 << 9 & 0x71C00);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdxw(ibth1, hfc0, z1, v);
        }
    }
}

