public final class byiz {
    public static final void a(ibtx ibtx0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        ibtx ibtx1 = ibtx0;
        ibth ibth1 = ibth0;
        ibuq.f(ibtx1, "sheetContent");
        ibuq.f(ibth1, "onDismiss");
        goz goz1 = goz0.ao(560260946);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(ibtx1) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            fyx fyx0 = fsr.e(true, goz1, 6, 2);
            vms vms0 = vmu.a(goz1);
            if(fyx0.d() == fyy.a) {
                goz1.M(491250200);
                byly.b(vms0, goz1, 0);
            }
            else {
                goz1.M(491311704);
                byly.a(vms0, goz1, 0);
            }
            goz1.x();
            long v2 = fpu.a(goz1).D;
            goz2 = goz1;
            fsr.c(ibth0, null, fyx0, 0.0f, false, fbd.b(goz1), v2, 0L, 0.0f, 0L, null, null, null, ibtx1, goz2, v1 >> 3 & 14, v1 << 9 & 0x1C00 | 6, 7066);
            ibth1 = ibth0;
            ibtx1 = ibtx1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new byiv(ibtx1, ibth1, v);
        }
    }

    public static final void b(ibtw ibtw0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        ibuq.f(ibtw0, "sheetContent");
        ibuq.f(ibth0, "onDismiss");
        goz goz1 = goz0.ao(0xB580E897);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(ibtw0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            fyx fyx0 = fsr.e(true, goz1, 6, 2);
            long v2 = fpu.a(goz1).D;
            long v3 = hll.h(fpu.a(goz1).C, 0.32f);
            hfc hfc0 = dla.j(hfc.e, 0.0f, 72.0f, 0.0f, 0.0f, 13);
            gze gze0 = gzf.e(0xCD828EF5, new byiy(ibtw0), goz1);
            goz2 = goz1;
            fsr.c(ibth0, hfc0, fyx0, 0.0f, false, byid.a, v2, 0L, 0.0f, v3, null, byix.a, null, gze0, goz2, v1 >> 3 & 14 | 0x30030, 0xC06, 4504);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new byiw(ibtw0, ibth0, v);
        }
    }
}

