import android.graphics.drawable.Drawable;

public final class bdsa {
    public static final void a(int v, Integer integer0, Integer integer1, ibth ibth0, goz goz0, int v1, int v2) {
        Integer integer6;
        Integer integer5;
        goz goz2;
        Integer integer3;
        Integer integer2;
        int v3;
        goz goz1 = goz0.ao(0x6BA3950A);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            integer2 = integer0;
        }
        else if((v1 & 0x30) == 0) {
            integer2 = integer0;
            v3 |= (goz1.X(integer2) ? 0x20 : 16);
        }
        else {
            integer2 = integer0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            integer3 = integer1;
        }
        else if((v1 & 0x180) == 0) {
            integer3 = integer1;
            v3 |= (goz1.X(integer3) ? 0x100 : 0x80);
        }
        else {
            integer3 = integer1;
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        Integer integer4 = null;
        if((v3 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            integer5 = integer2;
            integer6 = integer3;
        }
        else {
            Integer integer7 = (v2 & 2) == 0 ? integer2 : null;
            if((v2 & 4) == 0) {
                integer4 = integer3;
            }
            gze gze0 = gzf.e(0x21AF708F, new bdqy(ibth0), goz1);
            gze gze1 = gzf.e(0x9FBEA2D9, new bdqz(v, integer7, integer4), goz1);
            goz2 = goz1;
            fits.a(null, bdpj.m, gze0, null, null, 0, 0L, 0L, null, gze1, goz2, 0x300001B0, 505);
            integer5 = integer7;
            integer6 = integer4;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqp(v, integer5, integer6, ibth0, v1, v2);
        }
    }

    public static final void b(ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        ibuq.f(ibth0, "navigateBack");
        goz goz1 = goz0.ao(0xBAE547D9);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
        }
        else {
            ibth1 = ibth0;
            bdsa.a(0x7F080A9C, Integer.valueOf(0x7F1526D3), Integer.valueOf(0x7F1526D4), ibth1, goz1, v1 << 9 & 0x1C00, 0);  // drawable:pwm_blocked_importer
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdqw(ibth1, v);
        }
    }

    public static final void c(ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        ibuq.f(ibth0, "navigateBack");
        goz goz1 = goz0.ao(0xF8B43075);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
        }
        else {
            ibth1 = ibth0;
            bdsa.a(0x7F080ABA, Integer.valueOf(0x7F1526D5), null, ibth1, goz1, v1 << 9 & 0x1C00, 4);  // drawable:pwm_generic_error
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdqv(ibth1, v);
        }
    }

    public static final void d(bdsd bdsd0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdsd0, "state");
        ibuq.f(ibth0, "navigateBack");
        goz goz1 = goz0.ao(0xDC5D0906);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdsd0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gze gze0 = gzf.e(0x8464F00B, new bdrb(ibth0), goz1);
            gze gze1 = gzf.e(-383903403, new bdrd(bdsd0), goz1);
            goz2 = goz1;
            fits.a(null, bdpj.b, gze0, null, null, 0, 0L, 0L, null, gze1, goz2, 0x300001B0, 505);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqx(bdsd0, ibth0, v);
        }
    }

    public static final void e(bdse bdse0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdse0, "state");
        ibuq.f(ibth0, "navigateBack");
        goz goz1 = goz0.ao(1896736200);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdse0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gze gze0 = gzf.e(704802125, new bdre(ibth0), goz1);
            gze gze1 = gzf.e(0x2F25F797, new bdrf(bdse0), goz1);
            goz2 = goz1;
            fits.a(null, bdpj.f, gze0, null, null, 0, 0L, 0L, null, gze1, goz2, 0x300001B0, 505);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqq(bdse0, ibth0, v);
        }
    }

    public static final void f(bdsf bdsf0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdsf0, "state");
        ibuq.f(ibth0, "navigateBack");
        ibuq.f(ibth1, "exportClicked");
        goz goz1 = goz0.ao(0x9D5CDBBA);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdsf0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gze gze0 = gzf.e(0x6E67807F, new bdrh(ibth0, ibth1, bdsf0), goz1);
            gze gze1 = gzf.e(0xAA9D1549, new bdrz(bdsf0), goz1);
            goz2 = goz1;
            fits.a(null, bdpj.i, gze0, null, null, 0, 0L, 0L, null, gze1, goz2, 0x300001B0, 505);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqr(bdsf0, ibth0, ibth1, v);
        }
    }

    public static final void g(bdsg bdsg0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibuq.f(bdsg0, "state");
        ibuq.f(ibth0, "navigateBack");
        ibuq.f(ibth1, "exportClicked");
        goz goz1 = goz0.ao(0x44081F42);
        int v1 = (v & 6) == 0 ? (goz1.Z(bdsg0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goto label_36;
        }
        if((bdsg0 instanceof bdsb)) {
            goz1.M(0xED30BC16);
            bdsa.c(ibth0, goz1, v1 >> 3 & 14);
            goz1.x();
            goto label_36;
        }
        if((bdsg0 instanceof bdsc)) {
            goz1.M(0xED3433B4);
            bdsa.b(ibth0, goz1, v1 >> 3 & 14);
            goz1.x();
            goto label_36;
        }
        if((bdsg0 instanceof bdsd)) {
            goz1.M(0xED372108);
            bdsa.d(((bdsd)bdsg0), ibth0, goz1, v1 & 0x70);
            goz1.x();
            goto label_36;
        }
        if((bdsg0 instanceof bdse)) {
            goz1.M(0xED38F6FF);
            bdsa.e(((bdse)bdsg0), ibth0, goz1, v1 & 0x70);
            goz1.x();
            goto label_36;
        }
        if((bdsg0 instanceof bdsf)) {
            goz1.M(0x627DD10C);
            bdsa.f(((bdsf)bdsg0), ibth0, ibth1, goz1, v1 & 0x3F0);
            goz1.x();
        label_36:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new bdqt(bdsg0, ibth0, ibth1, v);
            }
            return;
        }
        goz1.M(0x627D6C6F);
        goz1.x();
        throw new ibnq();
    }

    public static final void h(hfc hfc0, Drawable drawable0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0x9DE4D267);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(drawable0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            hfc hfc1 = dls.C(hfc0, null, 3);
            iau iau0 = dhw.a(hei.a, false);
            int v3 = bdqo.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            cth.a(ism.a(0x7F080AD2, goz1, 0), null, null, null, null, 0.0f, null, goz1, 56, 0x7C);  // drawable:pwm_switch_accounts_export
            goz1.M(0xD5F3E192);
            if(drawable0 != null) {
                hfc hfc3 = hhi.a(dku.b(dls.k(hfc.e, 40.0f), 148.0f, 36.0f), eah.b(8.0f));
                cth.a(vmp.c(drawable0, goz1), null, hfc3, null, null, 0.0f, null, goz1, 56, 120);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdqu(hfc0, drawable0, v, v1);
        }
    }

    public static final void i(hfc hfc0, float f, ibtw ibtw0, goz goz0, int v, int v1) {
        float f2;
        hfc hfc2;
        float f1;
        hfc hfc1;
        int v2;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0xED1D6055);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.U(0.0f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            f1 = f;
        }
        else if((v & 0x180) == 0) {
            f1 = f;
            v2 |= (goz1.U(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
        }
        else {
            hfc hfc3 = (v1 & 1) == 0 ? hfc1 : hfc.e;
            if((v1 & 4) != 0) {
                f1 = 0.0f;
            }
            hel hel0 = hei.a;
            iau iau0 = dhw.a(hel0, false);
            int v3 = bdqo.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw1 = iej.e;
            guo.b(goz1, iau0, ibtw1);
            ibtw ibtw2 = iej.d;
            guo.b(goz1, gzk0, ibtw2);
            ibtw ibtw3 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw3);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw4 = iej.c;
            guo.b(goz1, hfc4, ibtw4);
            hfc hfc5 = dla.f(cqx.c(dls.w(hfc.e), fpu.a(goz1).F), 8.0f, 0.0f, 8.0f, f1);
            iau iau1 = dhw.a(hel0, false);
            int v4 = bdqo.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
            hfc2 = hfc3;
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw1);
            guo.b(goz1, gzk1, ibtw2);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer1 = v4;
                goz1.P(integer1);
                goz1.p(integer1, ibtw3);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw4);
            ibtw0.a(goz1, Integer.valueOf(v2 >> 9 & 14));
            goz1.z();
            goz1.z();
        }
        f2 = f1;
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdqs(hfc2, f2, ibtw0, v, v1);
        }
    }
}

