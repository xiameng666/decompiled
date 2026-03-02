import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuef {
    public static final void a(hfc hfc0, fucg fucg0, goz goz0, int v, int v1) {
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0x30B710A3);
        if(v1 != 0) {
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
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fucg0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc1 = hfc.e;
            }
            dle dle0 = new dle(12.0f, 10.0f, 12.0f, 10.0f);
            jjy jjy0 = new jjy(5);
            fuhx.b(hfc1, new fuhy(fuhq.c, false, fucg0.a, jjy0, null, null, dle0, fuhp.a, null, fucg0.d, 786), null, goz1, v2 & 14 | 0x40, 4);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuea(hfc1, fucg0, v, v1);
        }
    }

    public static final void b(fudz fudz0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x7E9072E2);
        if((((v & 6) == 0 ? (goz1.Z(fudz0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hey0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v2 = (int)(v1 ^ v1 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            jbn jbn0 = fpu.d(goz1).g;
            long v3 = fpu.a(goz1).q;
            ftzd.a(fudz0.a, null, v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
            dlv.a(dls.e(hey0, 4.0f), goz1);
            fryv fryv0 = fudz0.b;
            goz1.M(272098370);
            if(fryv0 == null) {
                goz2 = goz1;
            }
            else {
                jbn jbn1 = fpu.d(goz1).k;
                goz2 = goz1;
                ftzd.a(fryv0, null, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz2, 0, 0, 0x1FFFA);
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fueb(fudz0, v);
        }
    }

    public static final void c(hfc hfc0, fueg fueg0, goz goz0, int v) {
        long v2;
        ibuq.f(fueg0, "state");
        goz goz1 = goz0.ao(-742302662);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(fueg0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            if(hyxx.c()) {
                goz1.M(2121474408);
                v2 = fpu.a(goz1).F;
            }
            else {
                goz1.M(0x7E74532B);
                v2 = fsbs.i(fpu.a(goz1), ((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), goz1);
            }
            goz1.x();
            fcp fcp0 = fiqw.b(v2, 0L, goz1, 14);
            goz1.M(0xE8DB6F16);
            eaa eaa0 = hyxx.c() ? fulh.a(fueg0.g, goz1) : fitu.a.e;
            goz1.x();
            gze gze0 = gzf.e(196531069, new fuee(fueg0), goz1);
            fira.b(fueg0.h, hfc0, false, eaa0, fcp0, null, gze0, goz1, v1 << 3 & 0x70 | 0x6000000, 0xE4);
            goz1 = goz1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuec(hfc0, fueg0, v);
        }
    }
}

