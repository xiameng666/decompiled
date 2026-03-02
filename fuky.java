import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuky {
    public static final void a(hfc hfc0, fula fula0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x23ADD1B9);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fula0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            fuky.e(hfc0, fula0.a, fula0.b, fula0.c, fula0.e, fula0.g, fula0.h, fula0.i, fula0.j, fula0.k, fula0.l, fula0.o, fula0.q, fula0.p, goz1, v1 & 14, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fukg(hfc0, fula0, v);
        }
    }

    public static final void b(fulb fulb0, fryk fryk0, int v, long v1, boolean z, ibth ibth0, fryv fryv0, goz goz0, int v2) {
        fulb fulb1;
        goz goz1 = goz0.ao(0x1602A513);
        int v3 = (v2 & 6) == 0 ? (goz1.V(fulb0.ordinal()) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (((v2 & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (goz1.V(v) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (goz1.W(v1) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (goz1.Y(z) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (goz1.Z(ibth0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v3 |= (goz1.Z(fryv0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v3) == 0x92492 && goz1.ac()) {
            goz1.G();
            fulb1 = fulb0;
        }
        else {
            hfc hfc0 = iqn.a(hfc.e, "EndContent");
            iau iau0 = dhw.a(hei.a, false);
            int v4 = fuju.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth1 = iej.a;
            goz1.O();
            hey hey0 = hfc.e;
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            dic dic0 = dic.a;
            hfc hfc2 = dls.u(dla.j(hey0, 0.0f, 0.0f, 24.0f, 0.0f, 11));
            iau iau1 = dii.a(dho.e, hei.m, goz1, 6);
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            int v5 = fuju.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth1);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer1 = v5;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            int v6 = v3 & 0x70 | v3 >> 12 & 0x380;
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw3);
            fulb1 = fulb0;
            if(fulb1 == fulb.c) {
                goz1.M(0xFCCF356E);
                fuky.j(null, fryk0, fryv0, goz1, v6);
            }
            else {
                goz1.M(0xFCD0D392);
                fuky.k(null, fryk0, fryv0, goz1, v6);
            }
            goz1.x();
            goz1.z();
            goz1.M(-982670122);
            if(z) {
                fugo.c(v, 0x39B09, v1, gzf.e(0x342FD826, new fuko(dic0, ibth0), goz1), goz1, v3 >> 6 & 14 | 0xC30 | v3 >> 3 & 0x380);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujx(fulb1, fryk0, v, v1, z, ibth0, fryv0, v2);
        }
    }

    public static final void c(hfc hfc0, fula fula0, goz goz0, int v) {
        fula fula1;
        ibuq.f(fula0, "walletTipState");
        goz goz1 = goz0.ao(-2024801210);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fula0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            fula1 = fula0;
        }
        else if(!hyyd.c() && !hyxx.c()) {
            goz1.M(0x750381A9);
            fuky.g(hfc0, fula0.a, fula0.b, fula0.c, fula0.d, fula0.e, fula0.g, fula0.h, fula0.i, fula0.j, fula0.k, fula0.l, fula0.n, fula0.o, goz1, v1 & 14, 0);
            goz1.x();
            fula1 = fula0;
        }
        else {
            goz1.M(0x7501DACD);
            fula1 = fula0;
            fuky.a(hfc0, fula1, goz1, v1 & 0x7E);
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujw(hfc0, fula1, v);
        }
    }

    public static final void d(hfc hfc0, fryk fryk0, fryv fryv0, goz goz0, int v) {
        fryk fryk1;
        goz goz1 = goz0.ao(-288281011);
        int v1 = (v & 0x30) == 0 ? v | 6 | (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dls.o(dls.u(dls.t(hfc0, 0.0f, 140.0f, 1)), 84.0f);
            iau iau0 = dhw.a(hei.a, false);
            int v2 = fuju.a(gol.c(goz1));
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
            hfc hfc3 = iqn.a(dic.a.b(hfc0), "WalletTipFullBleedImage");
            goz1.M(0x44B7A0CD);
            String s = null;
            CharSequence charSequence0 = fryv0 == null ? null : fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            fryk1 = fryk0;
            ftyy.b(fryk1, s, hfc3, null, hys.a, 0.0f, null, goz1, v1 >> 3 & 14 | 0x6000, 104);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujy(hfc0, fryk1, fryv0, v);
        }
    }

    public static final void e(hfc hfc0, fulb fulb0, fryk fryk0, fryv fryv0, fryv fryv1, boolean z, ibth ibth0, int v, int v1, long v2, ibth ibth1, fryv fryv2, boolean z1, fule fule0, goz goz0, int v3, int v4) {
        goz goz2;
        boolean z3;
        fryv fryv5;
        int v8;
        ibth ibth2;
        boolean z2;
        fryv fryv4;
        fryv fryv3;
        goz goz1 = goz0.ao(0x875D602B);
        int v5 = (v3 & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v5 |= (goz1.V(fulb0.ordinal()) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= (((v3 & 0x200) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            fryv3 = fryv0;
            v5 |= (goz1.Z(fryv3) ? 0x800 : 0x400);
        }
        else {
            fryv3 = fryv0;
        }
        int v6 = 0x2000;
        if((v3 & 0x6000) == 0) {
            fryv4 = fryv1;
            v5 |= (goz1.Z(fryv4) ? 0x4000 : 0x2000);
        }
        else {
            fryv4 = fryv1;
        }
        int v7 = 0x10000;
        if((v3 & 0x30000) == 0) {
            v5 |= (goz1.Z(null) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v3) == 0) {
            z2 = z;
            v5 |= (goz1.Y(z2) ? 0x100000 : 0x80000);
        }
        else {
            z2 = z;
        }
        if((0xC00000 & v3) == 0) {
            ibth2 = ibth0;
            v5 |= (goz1.Z(ibth2) ? 0x800000 : 0x400000);
        }
        else {
            ibth2 = ibth0;
        }
        if((0x6000000 & v3) == 0) {
            v5 |= (goz1.V(v) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v3) == 0) {
            v8 = v1;
            v5 |= (goz1.V(v8) ? 0x20000000 : 0x10000000);
        }
        else {
            v8 = v1;
        }
        int v9 = (v4 & 6) == 0 ? v4 | (goz1.W(v2) ? 4 : 2) : v4;
        if((v4 & 0x30) == 0) {
            v9 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            v9 |= (goz1.Z(null) ? 0x100 : 0x80);
        }
        if((v4 & 0xC00) == 0) {
            fryv5 = fryv2;
            v9 |= (goz1.Z(fryv5) ? 0x800 : 0x400);
        }
        else {
            fryv5 = fryv2;
        }
        if((v4 & 0x6000) == 0) {
            z3 = z1;
            if(goz1.Y(z3)) {
                v6 = 0x4000;
            }
            v9 |= v6;
        }
        else {
            z3 = z1;
        }
        if((v4 & 0x30000) == 0) {
            if(goz1.V((fule0 == null ? -1 : fule0.ordinal()))) {
                v7 = 0x20000;
            }
            v9 |= v7;
        }
        if((v5 & 306783379) == 306783378 && (v9 & 74899) == 74898 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fugo.c(v, 0x39A09, v2, gzf.e(0x4140B139, new fukl(z2, hfc0, z3, fule0, ibth1, fulb0, fryk0, v8, v2, ibth2, fryv5, fryv3, fryv4), goz2), goz2, v5 >> 24 & 14 | 0xC30 | v9 << 6 & 0x380);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fukc(hfc0, fulb0, fryk0, fryv0, fryv1, z, ibth0, v, v1, v2, ibth1, fryv2, z1, fule0, v3, v4);
        }
    }

    public static final void f(hfc hfc0, ibtw ibtw0, fryv fryv0, fryv fryv1, fryv fryv2, boolean z, ibth ibth0, ibth ibth1, int v, long v1, goz goz0, int v2, int v3) {
        ibth ibth3;
        goz goz2;
        int v6;
        int v5;
        ibth ibth2;
        fryv fryv5;
        fryv fryv4;
        fryv fryv3;
        int v4;
        hfc hfc1;
        goz goz1 = goz0.ao(862430107);
        if((v2 & 6) == 0) {
            hfc1 = hfc0;
            v4 = (goz1.X(hfc1) ? 4 : 2) | v2;
        }
        else {
            hfc1 = hfc0;
            v4 = v2;
        }
        if((v2 & 0x30) == 0) {
            v4 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            fryv3 = fryv0;
            v4 |= (goz1.Z(fryv3) ? 0x100 : 0x80);
        }
        else {
            fryv3 = fryv0;
        }
        if((v2 & 0xC00) == 0) {
            fryv4 = fryv1;
            v4 |= (goz1.Z(fryv4) ? 0x800 : 0x400);
        }
        else {
            fryv4 = fryv1;
        }
        if((v2 & 0x6000) == 0) {
            fryv5 = fryv2;
            v4 |= (goz1.Z(fryv5) ? 0x4000 : 0x2000);
        }
        else {
            fryv5 = fryv2;
        }
        if((0x30000 & v2) == 0) {
            v4 |= (goz1.Z(null) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v4 |= (goz1.Y(z) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v2) == 0) {
            ibth2 = ibth0;
            v4 |= (goz1.Z(ibth2) ? 0x800000 : 0x400000);
        }
        else {
            ibth2 = ibth0;
        }
        if((0x6000000 & v2) == 0) {
            v4 |= (goz1.Z(ibth1) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v2) == 0) {
            v4 |= (goz1.Z(null) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 6) == 0) {
            v5 = v;
            v6 = v3 | (goz1.V(v5) ? 4 : 2);
        }
        else {
            v5 = v;
            v6 = v3;
        }
        if((v3 & 0x30) == 0) {
            v6 |= (goz1.W(v1) ? 0x20 : 16);
        }
        if((v4 & 306783379) == 306783378 && (v6 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(0xF80D658E);
            goz1.x();
            hfc hfc2 = iqn.a(dko.a(hfc1), "WalletTip");
            fcp fcp0 = fcq.i(goz1);
            eag eag0 = eah.b(28.0f);
            crk crk0 = crl.a(1.0f, fpu.a(goz1).B);
            goz1.M(0xF80D9AC8);
            if(ibth1 == null) {
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                if(object0 == gop.a) {
                    object0 = new fuka();
                    goz1.P(object0);
                }
                goz1.x();
                ibth3 = (ibth)object0;
            }
            else {
                ibth3 = ibth1;
            }
            goz1.x();
            goz2 = goz1;
            fdb.b(ibth3, hfc2, ibth1 != null, eag0, fcp0, null, crk0, gzf.e(423092870, new fukx(ibtw0, z, v5, v1, fryv3, fryv4, fryv5, ibth2), goz1), goz2, 0x6000000, 0xA0);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fukb(hfc0, ibtw0, fryv0, fryv1, fryv2, z, ibth0, ibth1, v, v1, v2, v3);
        }
    }

    public static final void g(hfc hfc0, fulb fulb0, fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, boolean z, ibth ibth0, int v, int v1, long v2, ibth ibth1, frxs frxs0, fryv fryv3, goz goz0, int v3, int v4) {
        goz goz2;
        ibth ibth3;
        int v9;
        int v8;
        ibth ibth2;
        boolean z1;
        fryv fryv6;
        fryv fryv5;
        fryv fryv4;
        goz goz1 = goz0.ao(0x52FEEDE5);
        int v5 = (v3 & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v5 |= (goz1.V((fulb0 == null ? -1 : fulb0.ordinal())) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= (((v3 & 0x200) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            fryv4 = fryv0;
            v5 |= (goz1.Z(fryv4) ? 0x800 : 0x400);
        }
        else {
            fryv4 = fryv0;
        }
        int v6 = 0x2000;
        if((v3 & 0x6000) == 0) {
            fryv5 = fryv1;
            v5 |= (goz1.Z(fryv5) ? 0x4000 : 0x2000);
        }
        else {
            fryv5 = fryv1;
        }
        int v7 = 0x10000;
        if((v3 & 0x30000) == 0) {
            fryv6 = fryv2;
            v5 |= (goz1.Z(fryv6) ? 0x20000 : 0x10000);
        }
        else {
            fryv6 = fryv2;
        }
        if((0x180000 & v3) == 0) {
            v5 |= (goz1.Z(null) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v3) == 0) {
            z1 = z;
            v5 |= (goz1.Y(z1) ? 0x800000 : 0x400000);
        }
        else {
            z1 = z;
        }
        if((0x6000000 & v3) == 0) {
            ibth2 = ibth0;
            v5 |= (goz1.Z(ibth2) ? 0x4000000 : 0x2000000);
        }
        else {
            ibth2 = ibth0;
        }
        if((0x30000000 & v3) == 0) {
            v5 |= (goz1.V(v) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 6) == 0) {
            v8 = v1;
            v9 = v4 | (goz1.V(v8) ? 4 : 2);
        }
        else {
            v8 = v1;
            v9 = v4;
        }
        if((v4 & 0x30) == 0) {
            v9 |= (goz1.W(v2) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            ibth3 = ibth1;
            v9 |= (goz1.Z(ibth3) ? 0x100 : 0x80);
        }
        else {
            ibth3 = ibth1;
        }
        if((v4 & 0xC00) == 0) {
            v9 |= (goz1.Z(null) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            if(goz1.Z(frxs0)) {
                v6 = 0x4000;
            }
            v9 |= v6;
        }
        if((v4 & 0x30000) == 0) {
            if(goz1.Z(fryv3)) {
                v7 = 0x20000;
            }
            v9 |= v7;
        }
        if((v5 & 306783379) == 306783378 && (v9 & 74899) == 74898 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fugo.c(v, 0x39A09, v2, gzf.e(0xD99707F3, new fukr(hfc0, fryv4, fryv5, fryv6, z1, ibth2, ibth3, v8, v2, fulb0, fryk0, fryv3, frxs0), goz2), goz2, v5 >> 27 & 14 | 0xC30 | v9 << 3 & 0x380);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fukf(hfc0, fulb0, fryk0, fryv0, fryv1, fryv2, z, ibth0, v, v1, v2, ibth1, frxs0, fryv3, v3, v4);
        }
    }

    public static final void h(hfc hfc0, fryk fryk0, fryv fryv0, goz goz0, int v) {
        fryv fryv1;
        fryk fryk1;
        goz goz1 = goz0.ao(-140932236);
        int v1 = (v & 0x30) == 0 ? v | 6 | (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
            fryv1 = fryv0;
        }
        else {
            fryk1 = fryk0;
            fryv1 = fryv0;
            fujj.b(iqn.a(dls.o(dla.j(hfc.e, 20.0f, 20.0f, 0.0f, 0.0f, 12), 64.0f), "WalletTipCardImage"), new fujl(fryk1, null, fryv1, null, false, null, false, 0xFA), goz1, 0x40, 0);
            hfc0 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fukd(hfc0, fryk1, fryv1, v);
        }
    }

    public static final void i(hfc hfc0, fryk fryk0, fryv fryv0, frxs frxs0, goz goz0, int v) {
        long v2;
        hfc hfc1;
        goz goz1 = goz0.ao(0xDDE2338);
        int v1 = (v & 0x30) == 0 ? v | 6 | (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(frxs0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc2 = hhi.a(dls.k(dla.f(hey0, 20.0f, 20.0f, 0.0f, 20.0f), 64.0f), eah.b(64.0f));
            goz1.M(0xEE26777);
            String s = null;
            hll hll0 = frxs0 == null ? null : new hll(frxs0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))));
            goz1.x();
            goz1.M(0xEE26609);
            if(hll0 != null) {
                v2 = hll0.j;
            }
            else if(csd.a(goz1)) {
                v2 = fpu.a(goz1).q;
            }
            else {
                v2 = hll.h;
            }
            goz1.x();
            hfc hfc3 = cqx.c(hfc2, v2);
            iau iau0 = dhw.a(hei.a, false);
            int v3 = fuju.a(gol.c(goz1));
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
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc4, iej.c);
            hfc hfc5 = dls.k(dla.f(hey0, 8.0f, 8.0f, 8.0f, 8.0f), 48.0f);
            hfc hfc6 = iqn.a(dic.a.a(hfc5, hei.e), "WalletTipIconImage");
            goz1.M(760430904);
            CharSequence charSequence0 = fryv0 == null ? null : fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            ftyy.b(fryk0, s, hfc6, null, null, 0.0f, null, goz1, v1 >> 3 & 14 | 0x180000, 56);
            goz1.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuke(hfc1, fryk0, fryv0, frxs0, v);
        }
    }

    public static final void j(hfc hfc0, fryk fryk0, fryv fryv0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(-1553094681);
        int v1 = (v & 0x30) == 0 ? v | 6 | (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            hfc hfc2 = dls.k(hfc1, 96.0f);
            iau iau0 = dhw.a(hei.a, false);
            int v2 = fuju.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
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
            guo.b(goz1, hfc3, iej.c);
            fujj.b(iqn.a(dls.o(dla.j(hfc1, 0.0f, 20.0f, 0.0f, 20.0f, 5), 96.0f), "WalletTipStyledCardImage"), new fujl(fryk0, null, fryv0, null, false, null, false, 0xFA), goz1, 0x40, 0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujv(hfc1, fryk0, fryv0, v);
        }
    }

    public static final void k(hfc hfc0, fryk fryk0, fryv fryv0, goz goz0, int v) {
        fryk fryk1;
        goz goz1 = goz0.ao(0x4CE18437);
        int v1 = (v & 0x30) == 0 ? v | 6 | (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
        }
        else {
            hfc hfc1 = dla.j(hfc.e, 0.0f, 20.0f, 0.0f, 20.0f, 5);
            hey hey0 = hfc.e;
            hfc hfc2 = iqn.a(hhi.a(dls.k(hfc1, 96.0f), eah.b(16.0f)), "WalletTipStyledImage");
            goz1.M(0x9A9185F1);
            String s = null;
            CharSequence charSequence0 = fryv0 == null ? null : fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            fryk1 = fryk0;
            ftyy.b(fryk1, s, hfc2, null, null, 0.0f, null, goz1, v1 >> 3 & 14 | 0x180000, 56);
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujz(hfc0, fryk1, fryv0, v);
        }
    }
}

