public final class zyj {
    public static final long a(zhx zhx0, long v) {
        if(zhx0 != null) {
            return cchl.d() ? hln.i(zhx0.b.b, zhx0.b.c, zhx0.b.d, zhx0.b.a, null, 16) : hln.i(zhx0.a.b, zhx0.a.c, zhx0.a.d, zhx0.a.a, null, 16);
        }
        return v;
    }

    public static final void b(znv znv0, hfc hfc0, goz goz0, int v) {
        ibuq.f(znv0, "expansion");
        goz goz1 = goz0.ao(1802774888);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(znv0) : goz1.Z(znv0)) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            long v2 = fpu.a(goz1).G;
            long v3 = fpu.a(goz1).q;
            goz1.M(5004770);
            boolean z = goz1.X(znv0.d);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new gpx(new zyh(znv0, v2), null);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(5004770);
            boolean z1 = goz1.X(znv0.c);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                object1 = new gpx(new zyi(znv0, v3), null);
                goz1.P(object1);
            }
            goz1.x();
            long v4 = ((hll)((gui)object0).a()).j;
            long v5 = ((hll)((gui)object1).a()).j;
            zzm.b(hey0, znv0.a, znv0.b, v4, v5, goz1, (v1 | 0x30) >> 3 & 14, 0);
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyg(znv0, hfc0, v);
        }
    }
}

