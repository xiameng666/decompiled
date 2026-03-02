public final class dfrd {
    public static final void a(ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz2;
        ibuq.f(ibth0, "onCancel");
        ibuq.f(ibth1, "onUpdate");
        goz goz1 = goz0.ao(0x1656299);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(ibth0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            dmf dmf0 = dmk.a(0, 14);
            fyx fyx0 = fsr.e(true, goz1, 6, 2);
            gze gze0 = gzf.e(0x42B0B97B, new dfrc(ibth0, ibth1), goz1);
            goz2 = goz1;
            fisz.a(ibth0, null, fyx0, 0.0f, false, null, 0L, 0L, 0.0f, 0L, dfqv.a, dmf0, null, gze0, goz2, v1 & 14, 0xC06, 0x13FA);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dfra(ibth0, ibth1, v);
        }
    }
}

