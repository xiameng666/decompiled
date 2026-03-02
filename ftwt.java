public final class ftwt {
    public static final void a(hfc hfc0, float f, float f1, long v, goz goz0, int v1) {
        long v3;
        float f4;
        float f3;
        hfc hfc1;
        long v2;
        float f2;
        goz goz1 = goz0.ao(-312003385);
        if((((v1 & 0xC00) == 0 ? v1 | 0x5B6 : v1 | 438) & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            f2 = f1;
            v2 = v;
            hfc1 = hfc0;
            f3 = f;
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                f4 = f1;
                v3 = v;
            }
            else {
                hfc0 = hfc.e;
                f = 4.0f;
                v3 = fpu.a(goz1).c;
                f4 = 4.0f;
            }
            goz1.w();
            jks jks0 = (jks)goz1.h(ipa.d);
            float f5 = jks0.eg(f) / 2.0f;
            float f6 = f5 + f5 + jks0.eg(f4);
            hkq hkq0 = new hkq();
            hkq0.k(v3);
            hkq0.s(0);
            hfc hfc2 = dls.e(dls.w(hfc0), f);
            goz1.M(0x97EA02AA);
            int v4 = goz1.U(f5) | goz1.U(f6) | goz1.Z(hkq0);
            Object object0 = goz1.j();
            if(v4 != 0 || object0 == gop.a) {
                object0 = new ftwr(f5, f6, hkq0);
                goz1.P(object0);
            }
            goz1.x();
            crn.a(hfc2, ((ibts)object0), goz1, 0);
            v2 = v3;
            f2 = f4;
            f3 = f;
            hfc1 = hfc0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftws(hfc1, f3, f2, v2, v1);
        }
    }
}

