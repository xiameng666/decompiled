public final class erxk {
    public static final void a(erxm erxm0, goz goz0, int v) {
        ibuq.f(erxm0, "model");
        goz goz1 = goz0.ao(0x2B1BC9F0);
        if((((v & 6) == 0 ? (goz1.Z(erxm0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goto label_19;
        }
        erxp erxp0 = erxm0.d;
        if((erxp0 instanceof erxn)) {
            goz1.M(0xD351273E);
            clyh.a(((erxn)erxp0).a, goz1, 0);
            goz1.x();
            goto label_19;
        }
        if((erxp0 instanceof erxo)) {
            goz1.M(0xD3513160);
            erxw.a(((erxo)erxp0).a, goz1, 0);
            goz1.x();
            goto label_19;
        }
        if(erxp0 == null) {
            goz1.M(0x96D5E170);
            goz1.x();
        label_19:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new erxb(erxm0, v);
            }
            return;
        }
        goz1.M(0xD35120BD);
        goz1.x();
        throw new ibnq();
    }

    public static final void b(erxm erxm0, goz goz0, int v) {
        goz goz1 = goz0.ao(679299026);
        if((((v & 6) == 0 ? (goz1.Z(erxm0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            erxk.d(0x7F152F33, (hykh.d() ? 0x7F152F3B : 0x7F152F32), erwy.c, goz1, 0x180);  // string:spatula_settings_readonly_pref_1_title "Incoming photos are blurred"
            erxk.d(0x7F152F35, (hykh.d() ? 0x7F152F3C : 0x7F152F34), erwy.d, goz1, 0x180);  // string:spatula_settings_readonly_pref_2_title "Sending a photo requires extra steps"
            erxk.e(null, erxm0.f, goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new erwz(erxm0, v);
        }
    }

    public static final void c(erxm erxm0, goz goz0, int v) {
        ibuq.f(erxm0, "model");
        goz goz1 = goz0.ao(0xEDA3E73);
        if((((v & 6) == 0 ? (goz1.Z(erxm0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = isq.c(0x7F152F39, goz1);  // string:spatula_settings_title "Sensitive content warnings"
            clwm clwm0 = new clwm(isq.c((hykh.d() ? 0x7F152F3A : 0x7F152F30), goz1));  // string:spatula_settings_video_learn_more "Nude photo and video detection happens 
                                                                                       // only on your devices. Your conversations are always private."
            gze gze0 = gzf.e(1195302218, new erxi(erxm0), goz1);
            clwl.c(s, erxm0.b, null, clwm0, erxm0.e, erxm0.c, erwy.a, null, erwy.b, gze0, goz1, 0x30C00000, 6, 292);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new erxa(erxm0, v);
        }
    }

    public static final void d(int v, int v1, ibtw ibtw0, goz goz0, int v2) {
        goz goz1 = goz0.ao(-187816050);
        int v3 = (v2 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (goz1.V(v1) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v3 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = isq.c(v, goz1);
            String s1 = isq.c(v1, goz1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new erxf(s, ibtw0, s1);
                goz1.P(object0);
            }
            goz1.x();
            clyp.a(((erxf)object0), goz1, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new erxc(v, v1, ibtw0, v2);
        }
    }

    public static final void e(hfc hfc0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xE128AD0F);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.Z(ibth0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            clyd.c(dla.i(dla.i(hfc0, 0.0f, 24.0f, 1), 24.0f, 0.0f, 2), null, null, null, 0L, gzf.e(0x63EC09FC, new erxh(hfc0, ibth0), goz1), goz1, 0x30C00, 22);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new erxd(hfc0, ibth0, v);
        }
    }
}

