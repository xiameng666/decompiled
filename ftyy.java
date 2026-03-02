import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftyy {
    public static final hlm a(hll hll0) {
        return hll0 == null ? null : new hlb(hll0.j, 5);
    }

    public static final void b(fryk fryk0, String s, hfc hfc0, hel hel0, hyt hyt0, float f, hlm hlm0, goz goz0, int v, int v1) {
        hlm hlm2;
        float f2;
        hyt hyt2;
        hel hel2;
        hfc hfc2;
        fryk fryk1;
        hlm hlm1;
        float f1;
        hyt hyt1;
        hel hel1;
        hfc hfc1;
        String s1;
        int v2;
        ibuq.f(fryk0, "resource");
        goz goz1 = goz0.ao(0x3B690072);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) == 0) {
            s1 = s;
            if((v & 0x30) == 0) {
                v2 |= (goz1.X(s1) ? 0x20 : 16);
            }
        }
        else {
            v2 |= 0x30;
            s1 = s;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v & 0x180) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            hel1 = hel0;
        }
        else if((v & 0xC00) == 0) {
            hel1 = hel0;
            v2 |= (goz1.X(hel1) ? 0x800 : 0x400);
        }
        else {
            hel1 = hel0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            hyt1 = hyt0;
        }
        else if((v & 0x6000) == 0) {
            hyt1 = hyt0;
            v2 |= (goz1.X(hyt1) ? 0x4000 : 0x2000);
        }
        else {
            hyt1 = hyt0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v) == 0) {
            f1 = f;
            v2 |= (goz1.U(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
            hlm1 = hlm0;
        }
        else if((0x180000 & v) == 0) {
            hlm1 = hlm0;
            v2 |= (goz1.X(hlm1) ? 0x100000 : 0x80000);
        }
        else {
            hlm1 = hlm0;
        }
        if((0x92493 & v2) == 0x92492 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
            hfc2 = hfc1;
            hel2 = hel1;
            hyt2 = hyt1;
            f2 = f1;
            hlm2 = hlm1;
            goto label_125;
        }
        if((v1 & 4) != 0) {
            hfc1 = hfc.e;
        }
        hel hel3 = (v1 & 8) == 0 ? hel1 : hei.e;
        hyt hyt3 = (v1 & 16) == 0 ? hyt1 : hys.b;
        if((v1 & 0x20) != 0) {
            f1 = 1.0f;
        }
        hlm hlm3 = (v1 & 0x40) == 0 ? hlm1 : null;
        if(fryl.b(fryk0)) {
            gsb gsb0 = goz1.af();
            if(gsb0 == null) {
                return;
            }
            gsb0.d = new ftyp(fryk0, s1, hfc1, hel3, hyt3, f1, hlm3, v, v1);
            return;
        }
        fryk1 = fryk0;
        if((fryk1 instanceof fryh)) {
            goz1.M(0xA03129F0);
            cth.a(ism.a(((fryh)fryk1).a, goz1, 0), s, hfc1, hel3, hyt3, f1, hlm3, goz1, v2 & 0x70 | 8 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2, 0);
            goz1.x();
            goto label_120;
        }
        if((fryk1 instanceof fryj)) {
            goz1.M(-1607068305);
            String s2 = ftyy.g(((fryj)fryk1), goz1);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            ftys ftys0 = new ftys(((fryj)fryk1).c, ((fryj)fryk1).d, context0);
            frxt frxt0 = ((fryj)fryk1).d;
            tzc.b(s2, s, hfc1, hel3, hyt3, f1, hlm3, null, null, ftys0, goz1, v2 & 0x3FFFF0, 0x180);
            goz1 = goz1;
            fryd fryd0 = frxt0 == null ? null : frxt0.b;
            if(fryd0 != null) {
                ftyy.d(fryd0, goz1, 0);
            }
            goz1.x();
            goto label_120;
        }
        if((fryk1 instanceof frxu)) {
            goz1.M(-1606504074);
            cth.c(new hkn(((frxu)fryk1).a), s, hfc1, hel3, hyt3, f1, hlm3, goz1, 0x3FFFF0 & v2, 0x80);
            goz1.x();
            goto label_120;
        }
        if((fryk1 instanceof fryi)) {
            goz1.M(0xA043AD2F);
            uhb uhb0 = ftyy.f(((fryi)fryk1), goz1);
            Context context1 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            ftys ftys1 = new ftys(((fryi)fryk1).e, ((fryi)fryk1).f, context1);
            frxt frxt1 = ((fryi)fryk1).f;
            tzc.b(uhb0, s, hfc1, hel3, hyt3, f1, hlm3, null, null, ftys1, goz1, v2 & 0x3FFFF0, 0x180);
            goz1 = goz1;
            fryd fryd1 = frxt1 == null ? null : frxt1.b;
            if(fryd1 != null) {
                ftyy.d(fryd1, goz1, 0);
            }
            goz1.x();
            goto label_120;
        }
        if((fryk1 instanceof frxv)) {
            goz1.M(0xA04C2F2D);
            ftyy.e(hfc1, ((frxv)fryk1), goz1, v2 >> 6 & 14 | 0x40);
            goz1.x();
        label_120:
            hfc2 = hfc1;
            hel2 = hel3;
            hyt2 = hyt3;
            f2 = f1;
            hlm2 = hlm3;
        label_125:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new ftyq(fryk1, s, hfc2, hel2, hyt2, f2, hlm2, v, v1);
            }
            return;
        }
        goz1.M(0x52AE0A9);
        goz1.x();
        throw new ibnq();
    }

    @ibni
    public static final void c(fryk fryk0, hfc hfc0, String s, hll hll0, goz goz0, int v, int v1) {
        hll hll3;
        hll hll2;
        String s2;
        hfc hfc2;
        hll hll1;
        String s1;
        hfc hfc1;
        int v2;
        ibuq.f(fryk0, "resource");
        goz goz1 = goz0.ao(-397122002);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            s1 = s;
        }
        else if((v & 0x180) == 0) {
            s1 = s;
            v2 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        else {
            s1 = s;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            hll1 = hll0;
        }
        else if((v & 0xC00) == 0) {
            hll1 = hll0;
            v2 |= (goz1.X(hll1) ? 0x800 : 0x400);
        }
        else {
            hll1 = hll0;
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            s2 = s1;
            hll2 = hll1;
            goto label_99;
        }
        hfc hfc3 = (v1 & 2) == 0 ? hfc1 : hfc.e;
        String s3 = (v1 & 4) == 0 ? s1 : null;
        if((v1 & 8) != 0) {
            hll1 = null;
        }
        if(fryl.b(fryk0)) {
            gsb gsb0 = goz1.af();
            if(gsb0 == null) {
                return;
            }
            gsb0.d = new ftyt(fryk0, hfc3, s3, hll1, v, v1);
            return;
        }
        if((fryk0 instanceof fryh)) {
            goz1.M(1973708637);
            hpw hpw0 = ism.a(((fryh)fryk0).a, goz1, 0);
            goz1.M(0x24D3D4F3);
            long v3 = hll1 == null ? ((hll)goz1.h(fft.a)).j : hll1.j;
            goz1.x();
            fnq.a(hpw0, s3, hfc3, v3, goz1, v2 >> 3 & 0x70 | 8 | v2 << 3 & 0x380, 0);
            goz1.x();
            hll3 = hll1;
            goto label_96;
        }
        if((fryk0 instanceof fryj)) {
            goz1.M(0x75A82F06);
            String s4 = ftyy.g(((fryj)fryk0), goz1);
            hlm hlm0 = ftyy.a(hll1);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            hll3 = hll1;
            tzc.b(s4, s3, hfc3, null, null, 0.0f, hlm0, null, null, new ftys(((fryj)fryk0).c, null, context0), goz1, v2 >> 3 & 0x70 | v2 << 3 & 0x380, 440);
            frxt frxt0 = ((fryj)fryk0).d;
            fryd fryd0 = frxt0 == null ? null : frxt0.b;
            if(fryd0 != null) {
                ftyy.d(fryd0, goz1, 0);
            }
            goz1.x();
            goto label_96;
        }
        hll3 = hll1;
        if((fryk0 instanceof fryi)) {
            goz1.M(0x75AECC66);
            uhb uhb0 = ftyy.f(((fryi)fryk0), goz1);
            hlm hlm1 = ftyy.a(hll3);
            Context context1 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            tzc.b(uhb0, s3, hfc3, null, null, 0.0f, hlm1, null, null, new ftys(((fryi)fryk0).e, null, context1), goz1, v2 >> 3 & 0x70 | v2 << 3 & 0x380, 440);
            frxt frxt1 = ((fryi)fryk0).f;
            fryd fryd1 = frxt1 == null ? null : frxt1.b;
            if(fryd1 != null) {
                ftyy.d(fryd1, goz1, 0);
            }
            goz1.x();
            goto label_96;
        }
        if((fryk0 instanceof frxu)) {
            goz1.M(1974810253);
            cth.c(new hkn(((frxu)fryk0).a), s3, hfc3, null, null, 0.0f, ftyy.a(hll3), goz1, v2 >> 3 & 0x70 | v2 << 3 & 0x380, 0xB8);
            goz1.x();
            goto label_96;
        }
        if((fryk0 instanceof frxv)) {
            goz1.M(1975035313);
            ftyy.e(hfc3, ((frxv)fryk0), goz1, v2 >> 3 & 14 | 0x40);
            goz1.x();
        label_96:
            s2 = s3;
            hfc2 = hfc3;
            hll2 = hll3;
        label_99:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new ftyu(fryk0, hfc2, s2, hll2, v, v1);
            }
            return;
        }
        goz1.M(0x24D3C023);
        goz1.x();
        throw new ibnq();
    }

    public static final void d(fryd fryd0, goz goz0, int v) {
        String s;
        goz goz1 = goz0.ao(0x65329E6B);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(fryd0) : goz1.Z(fryd0)) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            tyb tyb0 = txc.d(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            if((fryd0 instanceof fryc)) {
                s = ((fryc)fryd0).a;
            }
            else {
                if((fryd0 instanceof fryb)) {
                    s = ((fryb)fryd0).a;
                    goto label_16;
                }
                if((fryd0 instanceof frxz)) {
                    s = ((frxz)fryd0).a;
                    goto label_16;
                }
                if(!(fryd0 instanceof frya)) {
                    throw new ibnq();
                }
                s = (int)((frya)fryd0).a;
            }
        label_16:
            tyb0.g(s).o();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftyr(fryd0, v);
        }
    }

    public static final void e(hfc hfc0, frxv frxv0, goz goz0, int v) {
        qok qok0;
        goz goz1 = goz0.ao(-1200497470);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v2 |= (((v & 0x40) == 0 ? goz1.X(frxv0) : goz1.Z(frxv0)) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_43;
        }
        fryp fryp0 = frxv0.a;
        if((fryp0 instanceof fryo)) {
            goz1.M(0x636DD44B);
            qov.a(((fryo)fryp0).a);
            qok0 = qpj.d(new qov(((fryo)fryp0).a), goz1, 0);
            goz1.x();
            goto label_25;
        }
        if((fryp0 instanceof frym)) {
            goz1.M(1668146220);
            ibuq.f(((frym)fryp0).a, "fileName");
            qok0 = qpj.d(new qos(((frym)fryp0).a), goz1, 0);
            goz1.x();
            goto label_25;
        }
        if((fryp0 instanceof fryn)) {
            goz1.M(1668150309);
            qok0 = fuqy.b(((fryn)fryp0).a, goz1);
            goz1.x();
        label_25:
            goz1.M(0x636E0189);
            qox qox0 = (fryp0 instanceof fryn) ? fuqy.c(((fryn)fryp0).a, null, goz1, 6) : null;
            goz1.x();
            qkb qkb0 = ((qop)qok0).b();
            frxt frxt0 = frxv0.b;
            qnu qnu0 = qnk.a(qkb0, false, false, false, null, 0.0f, (frxt0 == null ? 1 : frxt0.a), goz1, 0, 958);
            qkb qkb1 = ((qop)qok0).b();
            if(frxt0 != null) {
                v1 = frxt0.a;
            }
            qob.b(qkb1, hfc0, false, false, null, 0.0f, v1, false, false, false, 0, false, false, qox0, null, null, false, 0, goz1, v2 << 3 & 0x70, 0x1000, 0, 0x1FDFBC);
            goz1 = goz1;
            fryd fryd0 = frxt0 == null ? null : frxt0.b;
            if(fryd0 != null) {
                ftyy.d(fryd0, goz1, 0);
            }
            if(((Number)qnu0.a()).floatValue() == 1.0f && frxt0 != null) {
                ibth ibth0 = frxt0.c;
                if(ibth0 != null) {
                    ibth0.a();
                }
            }
        label_43:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new ftyv(hfc0, frxv0, v);
            }
            return;
        }
        goz1.M(1668140178);
        goz1.x();
        throw new ibnq();
    }

    private static final uhb f(fryi fryi0, goz goz0) {
        uhb uhb0;
        goz0.M(0xF9DEAFA5);
        csd.a(goz0);
        String s = fryi0.c;
        String s1 = fryi0.a;
        if(s != null && s.length() != 0) {
            uhd uhd0 = new uhd();
            uhd0.b("Bearer " + s);
            uhb0 = new uhb(s1, uhd0.a());
        }
        else {
            uhb0 = new uhb(s1);
        }
        goz0.x();
        return uhb0;
    }

    private static final String g(fryj fryj0, goz goz0) {
        String s;
        goz0.M(1949746007);
        if(csd.a(goz0)) {
            s = fryj0.b;
            if(s == null) {
                s = fryj0.a;
            }
        }
        else {
            s = fryj0.a;
        }
        goz0.x();
        return s;
    }
}

