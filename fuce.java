import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuce {
    public static final void a(hfc hfc0, fucf fucf0, goz goz0, int v, int v1) {
        jbn jbn0;
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(fucf0, "state");
        goz goz1 = goz0.ao(0x8C0C447C);
        boolean z = true;
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
            v2 |= (goz1.Z(fucf0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            if(v1 != 0) {
                hfc1 = hfc.e;
            }
            hfc hfc2 = dls.w(hfc1);
            iau iau0 = dii.a(dho.c, hei.n, goz1, 0x30);
            long v3 = gol.c(goz1);
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
            int v4 = (int)(v3 >>> 0x20 ^ v3);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc3, iej.c);
            fryk fryk0 = fucf0.a;
            goz1.M(0x5DA5C43D);
            if(fryk0 != null) {
                hfc hfc4 = dls.k(hfc.e, 88.0f);
                goz1.M(0x5DA5D648);
                String s = null;
                CharSequence charSequence0 = fucf0.b == null ? null : fucf0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                goz1.x();
                if(charSequence0 != null) {
                    s = charSequence0.toString();
                }
                ftyy.c(fryk0, hfc4, s, null, goz1, 0x30, 8);
            }
            goz1.x();
            fryv fryv0 = fucf0.c;
            if(fucf0.d) {
                goz1.M(1461140969);
                jbn0 = fpu.d(goz1).t;
            }
            else {
                goz1.M(0x5718774D);
                jbn0 = fpu.d(goz1).v;
            }
            goz1.x();
            long v5 = fpu.a(goz1).q;
            hfc hfc5 = dla.j(hfc.e, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new fucc();
                goz1.P(object0);
            }
            goz1.x();
            ftzd.a(fryv0, iuc.d(hfc5, ((ibts)object0)), v5, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FDF8);
            goz1.M(1571165073);
            goz1.M(1571165010);
            fryv fryv1 = fucf0.e;
            if(fryv1 == null || fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))).length() <= 0) {
                z = false;
            }
            goz1.x();
            if(z) {
                jbn jbn1 = fpu.d(goz1).h;
                goz2 = goz1;
                ftzd.a(fryv1, null, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz2, 0, 0, 0x1FFFA);
            }
            else {
                goz2 = goz1;
            }
            goz2.x();
            goz2.z();
            hfc1 = hfc1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fucd(hfc1, fucf0, v, v1);
        }
    }
}

