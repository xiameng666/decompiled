import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class bgdq {
    public static final void a(bgds bgds0, ibth ibth0, ibts ibts0, ibth ibth1, ibth ibth2, ibth ibth3, ibtw ibtw0, ibtw ibtw1, ibtw ibtw2, goz goz0, int v) {
        goz goz2;
        ibts ibts1;
        int v1;
        bgds bgds1;
        goz goz1 = goz0.ao(-216673703);
        if((v & 6) == 0) {
            bgds1 = bgds0;
            v1 = (goz1.Z(bgds1) ? 4 : 2) | v;
        }
        else {
            bgds1 = bgds0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            ibts1 = ibts0;
            v1 |= (goz1.Z(ibts1) ? 0x100 : 0x80);
        }
        else {
            ibts1 = ibts0;
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (goz1.Z(ibtw2) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x2492493) == 0x2492492 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(null, null, null, null, null, 0, fpu.a(goz1).F, 0L, null, gzf.e(-361078550, new bgdj(ibtw1, bgds1, ibth1, ibth0, ibtw2, ibts1, ibth2, ibth3, ibtw0), goz1), goz2, 0x30000000, 0x1BF);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgcf(bgds0, ibth0, ibts0, ibth1, ibth2, ibth3, ibtw0, ibtw1, ibtw2, v);
        }
    }

    public static final void b(hfc hfc0, bgbb bgbb0, String s, String s1, boolean z, long v, boolean z1, boolean z2, ibth ibth0, String s2, goz goz0, int v1, int v2) {
        String s6;
        goz goz3;
        hfc hfc6;
        float f1;
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        hfc hfc2;
        String s4;
        goz goz2;
        int v6;
        boolean z3;
        long v5;
        String s3;
        hfc hfc1;
        int v3;
        goz goz1 = goz0.ao(0xAAECB61A);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            hfc1 = hfc0;
        }
        else if((v1 & 6) == 0) {
            hfc1 = hfc0;
            v3 = (goz1.X(hfc1) ? 4 : 2) | v1;
        }
        else {
            hfc1 = hfc0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (((v1 & 0x40) == 0 ? goz1.X(bgbb0) : goz1.Z(bgbb0)) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            s3 = s1;
        }
        else if((v1 & 0xC00) == 0) {
            s3 = s1;
            v3 |= (goz1.X(s3) ? 0x800 : 0x400);
        }
        else {
            s3 = s1;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (goz1.Y(((int)z)) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            int v4 = 0x10000;
            v5 = v;
            if((v2 & 0x20) == 0 && goz1.W(v5)) {
                v4 = 0x20000;
            }
            v3 |= v4;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v3 |= (goz1.Y(((int)z1)) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
            z3 = z2;
            v6 = v2 & 0x80;
        }
        else if((0xC00000 & v1) == 0) {
            z3 = z2;
            v6 = v2 & 0x80;
            v3 |= (goz1.Y(z3) ? 0x800000 : 0x400000);
        }
        else {
            z3 = z2;
            v6 = v2 & 0x80;
        }
        if((0x6000000 & v1) == 0) {
            v3 |= (goz1.Z(ibth0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v1) == 0) {
            v3 |= (goz1.X(s2) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v3) == 306783378 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            s4 = s3;
            hfc2 = hfc1;
            z4 = z3;
            z5 = (int)z;
            z6 = (int)z1;
            goto label_221;
        }
        goz1.I();
        tzl tzl0 = null;
        if((v1 & 1) != 0 && !goz1.aa()) {
            goz1.G();
            if((v2 & 0x20) != 0) {
                v3 &= 0xFFF8FFFF;
            }
            z7 = (int)z;
            z8 = (int)z1;
            z9 = z3;
        }
        else {
            if((v2 & 1) != 0) {
                hfc1 = hfc.e;
            }
            if((v2 & 8) != 0) {
                s3 = null;
            }
            z7 = ((v2 & 16) == 0 ? 1 : 0) & ((int)z);
            if((v2 & 0x20) != 0) {
                v3 &= 0xFFF8FFFF;
                v5 = fpu.a(goz1).q;
            }
            z8 = ((v2 & 0x40) == 0 ? 1 : 0) & ((int)z1);
            z9 = v6 == 0 ? z3 : false;
        }
        goz1.w();
        hfc hfc3 = dla.i(hfc1, 16.0f, 0.0f, 2);
        float f = hsam.e() ? 20.0f : 12.0f;
        if(z9) {
            z10 = z9;
            f1 = f;
        }
        else {
            z10 = z9;
            f1 = 4.0f;
        }
        if(!z8) {
            f = 4.0f;
        }
        hfc hfc4 = iqn.a(hhi.a(hfc3, eah.c(f, f, f1, f1)), s2);
        hel hel0 = hei.a;
        iau iau0 = dhw.a(hel0, false);
        int v7 = bgbx.a(gol.c(goz1));
        gzk gzk0 = goz1.ak();
        hfc hfc5 = hew.c(goz1, hfc4);
        ibth ibth1 = iej.a;
        goz1.O();
        if(goz1.x) {
            goz1.t(ibth1);
        }
        else {
            goz1.T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(goz1, iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(goz1, gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(goz1.x) {
            hfc6 = hfc1;
        label_126:
            Integer integer0 = v7;
            goz1.P(integer0);
            goz1.p(integer0, ibtw2);
        }
        else {
            hfc6 = hfc1;
            if(!ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                goto label_126;
            }
        }
        ibts ibts0 = iej.g;
        guo.a(goz1, ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(goz1, hfc5, ibtw3);
        hey hey0 = hfc.e;
        hfc hfc7 = dla.e(cru.d(cqx.c(dls.w(dls.e(hey0, 72.0f)), fpu.a(goz1).D), false, null, null, null, ibth0, 15), 16.0f, 8.0f);
        iau iau1 = dll.b(dho.a, hei.k, goz1, 0x30);
        gzk gzk1 = goz1.ak();
        hfc hfc8 = hew.c(goz1, hfc7);
        goz1.O();
        int v8 = bgbx.a(gol.c(goz1));
        if(goz1.x) {
            goz1.t(ibth1);
        }
        else {
            goz1.T();
        }
        guo.b(goz1, iau1, ibtw0);
        guo.b(goz1, gzk1, ibtw1);
        if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
            Integer integer1 = v8;
            goz1.P(integer1);
            goz1.p(integer1, ibtw2);
        }
        guo.a(goz1, ibts0);
        guo.b(goz1, hfc8, ibtw3);
        dlq dlq0 = dlq.a;
        if((bgbb0 instanceof bgaz)) {
            goz1.M(0xB442A871);
            hfc hfc9 = dls.k(hey0, 40.0f);
            bgaz bgaz0 = (bgaz)bgbb0;
            cth.a(ism.a(0x7F080CD1, goz1, 0), null, hfc9, null, null, 0.0f, null, goz1, 440, 120);  // drawable:quantum_ic_chrome_product_vd_theme_24
            goz3 = goz1;
            goz3.x();
            goto label_202;
        }
        goz3 = goz1;
        if((bgbb0 instanceof bgba)) {
            goz3.M(0x3F9F34C2);
            hfc hfc10 = hhi.a(hey0, eah.b(8.0f));
            iau iau2 = dhw.a(hel0, false);
            int v9 = bgbx.a(gol.c(goz3));
            gzk gzk2 = goz3.ak();
            hfc hfc11 = hew.c(goz3, hfc10);
            goz3.O();
            if(goz3.x) {
                goz3.t(ibth1);
            }
            else {
                goz3.T();
            }
            guo.b(goz3, iau2, ibtw0);
            guo.b(goz3, gzk2, ibtw1);
            if(goz3.x || !ibuq.m(goz3.j(), Integer.valueOf(v9))) {
                Integer integer2 = v9;
                goz3.P(integer2);
                goz3.p(integer2, ibtw2);
            }
            guo.a(goz3, ibts0);
            guo.b(goz3, hfc11, ibtw3);
            hfc hfc12 = dls.k(hey0, 40.0f);
            String s5 = ((bgba)bgbb0).a;
            tzl tzl1 = hsam.i() ? tzc.a(bgat.g) : null;
            if(hsam.i()) {
                tzl0 = tzc.a(bgat.h);
            }
            goz3.M(5004770);
            boolean z11 = (v3 & 0x70) == 0x20 || (v3 & 0x40) != 0 && goz3.Z(bgbb0);
            Object object0 = goz3.j();
            if(z11 || object0 == gop.a) {
                object0 = new bgch(bgbb0);
                goz3.P(object0);
            }
            goz3.x();
            tzc.b(s5, null, hfc12, null, null, 0.0f, null, tzl1, tzl0, ((ibts)object0), goz3, 0x1B0, 120);
            goz3.z();
            goz3.x();
            goto label_202;
        }
        if((bgbb0 instanceof bgay)) {
            goz3.M(0x3F9FB210);
            ((bgay)bgbb0).a.a(goz3, Integer.valueOf(0));
            goz3.x();
        label_202:
            dlv.a(dls.o(hey0, 16.0f), goz3);
            fiuk.b(s, dlo.a(dlq0, hey0, 1.0f), v5, 0L, null, 0L, null, 0L, (z7 ? 4 : 2), false, 1, 0, null, fpu.d(goz3).j, goz3, v3 >> 6 & 14 | v3 >> 9 & 0x380, 0x6000, 0x1AFF8);
            v5 = v5;
            goz3.M(0x3F9FE954);
            if(s3 == null) {
                s6 = null;
            }
            else {
                dlv.a(dls.o(hey0, 16.0f), goz3);
                s6 = s3;
                fiuk.b(s6, null, fpu.a(goz3).s, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, fpu.d(goz3).o, goz3, v3 >> 9 & 14, 0x6000, 0x1BFFA);
            }
            goz3.x();
            goz3.z();
            goz3.z();
            z6 = z8;
            z5 = z7;
            goz2 = goz3;
            s4 = s6;
            z4 = z10;
            hfc2 = hfc6;
        label_221:
            gsb gsb0 = goz2.af();
            if(gsb0 != null) {
                gsb0.d = new bgci(hfc2, bgbb0, s, s4, z5, v5, z6, z4, ibth0, s2, v1, v2);
            }
            return;
        }
        goz3.M(0x3F9F071C);
        goz3.x();
        throw new ibnq();
    }

    public static final void c(lnm lnm0, int v, goz goz0, int v1) {
        goz goz1 = goz0.ao(0x9933726A);
        int v2 = (v1 & 6) == 0 ? (goz1.Z(lnm0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.V(v) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = cqx.c(hhi.a(dla.d(dls.k(hey0, 40.0f), 3.0f), fpt.a(lnm0, goz1)), fpu.a(goz1).h);
            iau iau0 = dhw.a(hei.e, false);
            int v3 = bgbx.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
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
            guo.b(goz1, hfc1, iej.c);
            hfc hfc2 = dls.k(hey0, 24.0f);
            fiso.a(ism.a(v, goz1, v2 >> 3 & 14), null, hfc2, fpu.a(goz1).f, goz1, 440, 0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgcq(lnm0, v, v1);
        }
    }

    public static final void d(bgdv bgdv0, ibth ibth0, ibts ibts0, ibth ibth1, ibth ibth2, ibth ibth3, ibtw ibtw0, ibtw ibtw1, ibtw ibtw2, goz goz0, int v) {
        ibtw ibtw3;
        ibuq.f(bgdv0, "state");
        ibuq.f(ibth0, "onSearch");
        ibuq.f(ibts0, "onSetCredentialFilter");
        ibuq.f(ibth1, "onRefresh");
        ibuq.f(ibth2, "onAddPasswords");
        ibuq.f(ibth3, "onSavePasswordsInYourAccount");
        ibuq.f(ibtw0, "onCredentialClicked");
        goz goz1 = goz0.ao(0xF93EC1F3);
        int v1 = (v & 6) == 0 ? (goz1.Z(bgdv0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            ibtw3 = ibtw2;
            v1 |= (goz1.Z(ibtw3) ? 0x4000000 : 0x2000000);
        }
        else {
            ibtw3 = ibtw2;
        }
        if((0x2492493 & v1) == 0x2492492 && goz1.ac()) {
            goz1.G();
            goto label_45;
        }
        if((bgdv0 instanceof bgdt)) {
            goz1.M(0xA4964CF3);
            bgdq.g(ibtw1, goz1, v1 >> 21 & 14);
            goz1.x();
            goto label_45;
        }
        if((bgdv0 instanceof bgdu)) {
            goz1.M(-1533650502);
            bgdq.j(((bgdu)bgdv0), ibth1, ibtw1, goz1, v1 >> 15 & 0x380 | v1 >> 6 & 0x70);
            goz1.x();
            goto label_45;
        }
        if((bgdv0 instanceof bgds)) {
            goz1.M(0xA49671E8);
            bgdq.a(((bgds)bgdv0), ibth0, ibts0, ibth1, ibth2, ibth3, ibtw0, ibtw1, ibtw3, goz1, 0xFFFFFF0 & v1);
            goz1.x();
        label_45:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new bgcm(bgdv0, ibth0, ibts0, ibth1, ibth2, ibth3, ibtw0, ibtw1, ibtw2, v);
            }
            return;
        }
        goz1.M(-1533654290);
        goz1.x();
        throw new ibnq();
    }

    public static final void e(ibtw ibtw0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0x54CC0763);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                ibtw0 = bgat.i;
            }
            hfc hfc0 = cqx.c(hhi.a(dls.k(hfc.e, 40.0f), eah.b(8.0f)), fpu.a(goz1).F);
            iau iau0 = dhw.a(hei.e, false);
            int v3 = bgbx.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
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
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            ibtw0.a(goz1, Integer.valueOf(v2 & 14));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgcj(ibtw0, v, v1);
        }
    }

    public static final void f(goz goz0, int v) {
        goz goz1 = goz0.ao(393209990);
        int v1 = 0;
        if(v != 0) {
            bgdq.e(bgat.j, goz1, 6, 0);
            v1 = v;
        }
        else if(!goz1.ac()) {
            bgdq.e(bgat.j, goz1, 6, 0);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgcp(v1);
        }
    }

    public static final void g(ibtw ibtw0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x5201BD6);
        if((((v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(null, null, null, null, null, 0, fpu.a(goz1).F, 0L, null, gzf.e(95930791, new bgdm(ibtw0), goz1), goz2, 0x30000000, 0x1BF);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgcg(ibtw0, v);
        }
    }

    public static final void h(goz goz0, int v) {
        goz goz1 = goz0.ao(0x46AA13F0);
        int v1 = 0;
        if(v != 0) {
            bgdq.e(bgat.k, goz1, 6, 0);
            v1 = v;
        }
        else if(!goz1.ac()) {
            bgdq.e(bgat.k, goz1, 6, 0);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgcd(v1);
        }
    }

    public static final void i(int v, String s, goz goz0, int v1) {
        goz goz2;
        goz goz1 = goz0.ao(-113091446);
        int v2 = (v1 & 6) == 0 ? v1 | (goz1.V(v) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            iau iau0 = dll.b(dho.g(16.0f), hei.k, goz1, 54);
            int v3 = bgbx.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hfc.e);
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
            guo.b(goz1, hfc0, iej.c);
            fiso.a(ism.a(v, goz1, v2 & 14), null, null, fpu.a(goz1).a, goz1, 56, 4);
            goz2 = goz1;
            fiuk.b(s, null, fpu.a(goz2).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(goz2).m, goz2, v2 >> 3 & 14, 0, 0x1FFFA);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgce(v, s, v1);
        }
    }

    public static final void j(bgdu bgdu0, ibth ibth0, ibtw ibtw0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x641B217D);
        int v1 = (v & 6) == 0 ? (goz1.Z(bgdu0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(null, null, null, null, null, 0, fpu.a(goz1).F, 0L, null, gzf.e(-606686900, new bgdp(bgdu0, ibth0, ibtw0), goz1), goz2, 0x30000000, 0x1BF);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgck(bgdu0, ibth0, ibtw0, v);
        }
    }

    public static final void k(hfc hfc0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x7EB7F63F);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc1 = iqn.a(dla.i(cru.d(cqx.c(hhi.a(dls.u(hfc0), new eag(eac.a(50), eac.a(50), eac.a(50), eac.a(50))), fpu.a(goz1).D), false, isq.c(0x7F1526A6, goz1), new its(0), null, ibth0, 9), 20.0f, 0.0f, 2), "ClickableSearchBar");  // string:pwm_credentials_screen_search_bar_content_description "Search your accounts"
            iau iau0 = dhw.a(hei.e, false);
            int v2 = bgbx.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
            ibth ibth1 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth1);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            String s = isq.c(0x7F1526A7, goz1);  // string:pwm_credentials_screen_search_bar_placeholder "Search"
            long v3 = fpu.a(goz1).s;
            goz2 = goz1;
            fiuk.b(s, hfc.e, v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, goz2, 0x30, 0, 0x3FFF8);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgcl(hfc0, ibth0, v);
        }
    }

    public static final void l(String s, boolean z, ibth ibth0, ibth ibth1, String s1, String s2, String s3, goz goz0, int v) {
        hfc hfc1;
        ibth ibth3;
        ibth ibth2;
        goz goz1 = goz0.ao(-1454307509);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Y(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            ibth2 = ibth0;
            v1 |= (goz1.Z(ibth2) ? 0x100 : 0x80);
        }
        else {
            ibth2 = ibth0;
        }
        if((v & 0xC00) == 0) {
            ibth3 = ibth1;
            v1 |= (goz1.Z(ibth3) ? 0x800 : 0x400);
        }
        else {
            ibth3 = ibth1;
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(s1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.X(s2) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.X(s3) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v1) == 0x92492 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x992C8167);
            if(hsam.e()) {
                hfc hfc0 = iqn.a(hfc.e, s1);
                goz1.M(0x97EA02AA);
                Object object0 = goz1.j();
                if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((0x70000 & v1) == 0x20000 ? 1 : 0) | ((0x380000 & v1) == 0x100000 ? 1 : 0)) != 0 || object0 == gop.a) {
                    object0 = new bgcn(z, s2, s3);
                    goz1.P(object0);
                }
                goz1.x();
                hfc1 = iuc.b(hfc0, ((ibts)object0));
            }
            else {
                hfc1 = iqn.a(hfc.e, s1);
            }
            goz1.x();
            fej.d(z, (z ? ibth3 : ibth2), gzf.e(0x9EBCAFFE, new bgdk(s), goz1), hfc1, false, (z ? bgat.f : null), null, null, null, null, goz1, v1 >> 3 & 14 | 0x180, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgco(s, z, ibth0, ibth1, s1, s2, s3, v);
        }
    }

    public static final void m(hfc hfc0, bgaw bgaw0, ibts ibts0, goz goz0, int v) {
        String s6;
        String s5;
        String s3;
        String s2;
        goz goz2;
        goz goz1 = goz0.ao(-1703103392);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(bgaw0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc1 = dla.i(cvf.b(hfc0, cvf.d(0, goz1, 0, 1), false, null, true, false), 16.0f, 0.0f, 2);
            iau iau0 = dll.b(dho.g(8.0f), hei.j, goz1, 6);
            int v2 = bgbx.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            String s = isq.c(0x7F152696, goz1);  // string:pwm_credentials_screen_filters_all "All"
            bgez bgez0 = bgaw0.a;
            boolean z = bgez0 == bgez.a;
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v1 & 0x380) == 0x100 || object0 == gop.a) {
                object0 = new bgcr(ibts0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                object1 = new bgcs();
                goz1.P(object1);
            }
            goz1.x();
            bgdq.l(s, z, ((ibth)object0), ((ibth)object1), "AllFilterButton", isq.c(0x7F152698, goz1), isq.c(0x7F152697, goz1), goz1, 0x6C00);  // string:pwm_credentials_screen_filters_all_selected_content_description "Selected. 
                                                                                                                                                // All accounts."
            goz goz3 = goz1;
            goz3.M(0x518BE803);
            if(bgaw0.b) {
                String s1 = isq.c(0x7F1508B3, goz3);  // string:common_passwords "Passwords"
                boolean z1 = bgez0 == bgez.b;
                goz3.M(5004770);
                Object object3 = goz3.j();
                if((v1 & 0x380) == 0x100 || object3 == object2) {
                    object3 = new bgct(ibts0);
                    goz3.P(object3);
                }
                goz3.x();
                goz3.M(5004770);
                Object object4 = goz3.j();
                if((v1 & 0x380) == 0x100 || object4 == object2) {
                    object4 = new bgcu(ibts0);
                    goz3.P(object4);
                }
                goz3.x();
                if(hsam.e()) {
                    goz3.M(0xDFF7C295);
                    s2 = isq.c(0x7F1526A3, goz3);  // string:pwm_credentials_screen_filters_passwords_selected_a11y_description "Selected. 
                                                   // Passwords. Double tap to change the filter."
                }
                else {
                    goz3.M(0xDFFA0C12);
                    s2 = isq.c(0x7F1526A4, goz3);  // string:pwm_credentials_screen_filters_passwords_selected_content_description "Selected. 
                                                   // Accounts with passwords. Double tap to change the filter."
                }
                goz3.x();
                if(hsam.e()) {
                    goz3.M(0xDFFDC191);
                    s3 = isq.c(0x7F1526A1, goz3);  // string:pwm_credentials_screen_filters_passwords_not_selected_a11y_description "Not 
                                                   // selected. Passwords. Double tap to change the filter."
                }
                else {
                    goz3.M(0xE0001A8E);
                    s3 = isq.c(0x7F1526A2, goz3);  // string:pwm_credentials_screen_filters_passwords_not_selected_content_description 
                                                   // "Not selected. Accounts with passwords. Double tap to change the filter."
                }
                goz3.x();
                bgdq.l(s1, z1, ((ibth)object3), ((ibth)object4), "PasswordsFilterButton", s2, s3, goz3, 0x6000);
                goz3 = goz3;
            }
            goz3.x();
            goz3.M(0x518C7DB2);
            if(bgaw0.c) {
                String s4 = isq.c(0x7F15269C, goz3);  // string:pwm_credentials_screen_filters_passkeys "Passkeys"
                boolean z2 = bgez0 == bgez.c;
                goz3.M(5004770);
                Object object5 = goz3.j();
                if((v1 & 0x380) == 0x100 || object5 == object2) {
                    object5 = new bgby(ibts0);
                    goz3.P(object5);
                }
                goz3.x();
                goz3.M(5004770);
                Object object6 = goz3.j();
                if((v1 & 0x380) == 0x100 || object6 == object2) {
                    object6 = new bgbz(ibts0);
                    goz3.P(object6);
                }
                goz3.x();
                if(hsam.e()) {
                    goz3.M(0xE00A2A76);
                    s5 = isq.c(0x7F15269F, goz3);  // string:pwm_credentials_screen_filters_passkeys_selected_a11y_description "Selected. 
                                                   // Passkeys. Double tap to change the filter."
                }
                else {
                    goz3.M(0xE00C7013);
                    s5 = isq.c(0x7F1526A0, goz3);  // string:pwm_credentials_screen_filters_passkeys_selected_content_description "Selected. 
                                                   // Accounts with passkeys. Double tap to change the filter."
                }
                goz3.x();
                if(hsam.e()) {
                    goz3.M(0xE01021B2);
                    s6 = isq.c(0x7F15269D, goz3);  // string:pwm_credentials_screen_filters_passkeys_not_selected_a11y_description "Not 
                                                   // selected. Passkeys. Double tap to change the filter."
                }
                else {
                    goz3.M(0xE01276CF);
                    s6 = isq.c(0x7F15269E, goz3);  // string:pwm_credentials_screen_filters_passkeys_not_selected_content_description 
                                                   // "Not selected. Accounts with passkeys. Double tap to change the filter."
                }
                goz3.x();
                bgdq.l(s4, z2, ((ibth)object5), ((ibth)object6), "PasskeysFilterButton", s5, s6, goz3, 0x6000);
                goz3 = goz3;
            }
            goz3.x();
            goz3.M(1368200085);
            if(bgaw0.d) {
                String s7 = isq.c(0x7F152699, goz3);  // string:pwm_credentials_screen_filters_network_devices "Network devices"
                boolean z3 = bgez0 == bgez.d;
                goz3.M(5004770);
                Object object7 = goz3.j();
                if((v1 & 0x380) == 0x100 || object7 == object2) {
                    object7 = new bgca(ibts0);
                    goz3.P(object7);
                }
                goz3.x();
                goz3.M(5004770);
                Object object8 = goz3.j();
                if((v1 & 0x380) == 0x100 || object8 == object2) {
                    object8 = new bgcb(ibts0);
                    goz3.P(object8);
                }
                goz3.x();
                goz2 = goz3;
                bgdq.l(s7, z3, ((ibth)object7), ((ibth)object8), "NetworkDevicesFilterButton", isq.c(0x7F15269B, goz3), isq.c(0x7F15269A, goz3), goz2, 0x6000);  // string:pwm_credentials_screen_filters_network_devices_selected_content_description 
                                                                                                                                                                 // "Selected. Network devices. Double tap to change the filter."
            }
            else {
                goz2 = goz3;
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bgcc(hfc0, bgaw0, ibts0, v);
        }
    }

    public static final void n(lnm lnm0, int v, goz goz0) {
        bgdq.c(lnm0, v, goz0, 0);
    }

    public static final void o(int v, String s, goz goz0) {
        bgdq.i(v, s, goz0, 0);
    }

    public static final float p(dld dld0, goz goz0) {
        goz0.M(191073642);
        float f = ((Configuration)goz0.h(AndroidCompositionLocals_androidKt.a)).orientation == 2 ? dld0.a() : 0.0f;
        goz0.A();
        return f;
    }
}

