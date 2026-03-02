public final class byjo {
    public static final void a(String s, ibth ibth0, goz goz0, int v) {
        ibuq.f(s, "text");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x545DD38);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc0 = dla.i(hfc.e, 0.0f, 4.0f, 1);
            long v2 = fpu.a(goz1).a;
            long v3 = fpu.a(goz1).b;
            fcm.e(ibth0, hfc0, false, null, fbz.b(fpu.a(goz1)).a(v2, v3, hll.i, hll.i), null, new dle(24.0f, 10.0f, 24.0f, 10.0f), gzf.e(0xCC54BA8A, new byjn(s), goz1), goz1, v1 >> 3 & 14 | 0x30C00030);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byjm(s, ibth0, v);
        }
    }
}

