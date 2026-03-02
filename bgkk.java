public final class bgkk {
    public static final void a(hqf hqf0, String s, String s1, ibth ibth0, hfc hfc0, boolean z, goz goz0, int v) {
        goz goz2;
        ibuq.f(hqf0, "image");
        ibuq.f(s, "title");
        ibuq.f(s1, "subtitle");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x1DC6F02B);
        int v1 = (v & 6) == 0 ? (goz1.X(hqf0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Y(z) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v1 & 0x1C00) == 0x800 || object0 == gop.a) {
                object0 = new bgkg(ibth0);
                goz1.P(object0);
            }
            goz1.x();
            goz2 = goz1;
            gaq.c(hhc.a(cru.d(hfc0, z, null, null, null, ((ibth)object0), 14), (z ? 1.0f : 0.38f)), null, 0L, 0L, 0.0f, 0.0f, null, gzf.e(0xBAA45BC6, new bgkj(hfc0, hqf0, s, s1), goz1), goz2, 0x7E);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgkh(hqf0, s, s1, ibth0, hfc0, z, v);
        }
    }
}

