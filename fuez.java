import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuez {
    public static final void a(hfc hfc0, fufb fufb0, goz goz0, int v, int v1) {
        long v3;
        int v2;
        ibuq.f(fufb0, "state");
        goz goz1 = goz0.ao(0x991F6390);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fufb0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            hfc hfc1 = iqn.a(hfc0, "TestTagCard");
            if(hyxx.c()) {
                goz1.M(0xF2340D82);
                v3 = fpu.a(goz1).F;
            }
            else {
                goz1.M(0xF2352FC5);
                v3 = fsbs.i(fpu.a(goz1), ((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), goz1);
            }
            goz1.x();
            fcp fcp0 = fiqw.b(v3, fpu.a(goz1).p, goz1, 10);
            goz1.M(-824900706);
            eaa eaa0 = hyxx.c() ? fulh.a(fufb0.i, goz1) : fitu.a.e;
            goz1.x();
            ibth ibth0 = fufb0.j;
            if(ibth0 == null) {
                goz1.M(-231052186);
                fira.a(hfc1, eaa0, fcp0, null, null, gzf.e(892094345, new fueq(fufb0), goz1), goz1, 0x30000, 24);
            }
            else {
                goz1.M(0xF23C7F27);
                gze gze0 = gzf.e(-1021191339, new fuer(fufb0), goz1);
                fira.b(ibth0, hfc1, fufb0.a, eaa0, fcp0, null, gze0, goz1, 0x6000000, 0xE0);
            }
            goz1 = goz1;
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuen(hfc0, fufb0, v, v1);
        }
    }

    public static final void b(fufb fufb0, goz goz0, int v) {
        ibtw ibtw7;
        ibtw ibtw6;
        ibth ibth1;
        ibts ibts1;
        ibtw ibtw5;
        ibtw ibtw4;
        goz goz1 = goz0.ao(0x9FE0EB0E);
        if((((v & 6) == 0 ? v | (goz1.Z(fufb0) ? 4 : 2) : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dls.w(dla.f(hey0, (hyxx.c() ? 20.0f : 24.0f), 20.0f, (hyxx.c() ? 20.0f : 24.0f), (fufb0.h == null ? 20.0f : 4.0f)));
            iau iau0 = dll.b(dho.g(16.0f), hei.j, goz1, 6);
            int v1 = fuem.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            guo.a(goz1, iej.g);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            dlq dlq0 = dlq.a;
            goz1.M(0x935D1FED);
            fryh fryh0 = fufb0.b;
            boolean z = fryl.c(fryh0);
            ibts ibts0 = iej.g;
            if(z) {
                ibtw4 = ibtw1;
                ibtw5 = ibtw2;
                ibts1 = ibts0;
                ibth1 = ibth0;
                ibtw6 = ibtw0;
                ibtw7 = ibtw3;
                cth.a(ism.a(fryh0.a, goz1, 0), null, iqn.a(dlq0.a(dls.u(dla.d(dls.k(hey0, 24.0f), 2.0f)), hei.k), "TestTagStartIcon"), null, null, 0.0f, new hlb(fpu.a(goz1).o, 5), goz1, 56, 56);
            }
            else {
                ibtw4 = ibtw1;
                ibtw5 = ibtw2;
                ibth1 = ibth0;
                ibtw6 = ibtw0;
                ibtw7 = ibtw3;
                ibts1 = ibts0;
            }
            goz1.x();
            gze gze0 = gzf.e(0xABF66C11, new fueu(fufb0, fufb0), goz1);
            hfc hfc2 = dlo.a(dlq0, hey0, 1.0f);
            hek hek0 = hei.k;
            hfc hfc3 = dlq0.a(hfc2, hek0);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = fuet.a;
                goz1.P(object0);
            }
            goz1.x();
            int v2 = fuem.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth1);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, ((iau)object0), ibtw6);
            guo.b(goz1, gzk1, ibtw4);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                goz1.P(integer1);
                goz1.p(integer1, ibtw5);
            }
            guo.a(goz1, ibts1);
            guo.b(goz1, hfc4, ibtw7);
            gze0.a(goz1, Integer.valueOf(6));
            goz1.z();
            fuek fuek0 = fufb0.g;
            if((fuek0 instanceof fueh)) {
                goz1.M(0xD8860F59);
                goz1.M(-662269097);
                hfc hfc5 = dlq0.a(iqn.a(hey0, "TestTagCheckbox"), hek0);
                firc.a(((fueh)fuek0).a, hfc5, fufb0.a, null, goz1, 0x30);
                goz1.x();
            }
            else if((fuek0 instanceof fuei)) {
                goz1.M(-661433709);
                int v3 = ((fuei)fuek0).a.a;
                if(v3 != 0) {
                    cth.a(ism.a(v3, goz1, 0), null, iqn.a(dlq0.a(dls.u(dla.d(dls.k(hey0, 24.0f), 2.0f)), hek0), "TestTagEndIcon"), null, null, 0.0f, new hlb(fpu.a(goz1).o, 5), goz1, 56, 56);
                }
            }
            else {
                if(!(fuek0 instanceof fuel) && !ibuq.m(fuek0, fuej.a)) {
                    goz1.M(0x935F209E);
                    goz1.x();
                    throw new ibnq();
                }
                goz1.M(-660817150);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuep(fufb0, v);
        }
    }

    public static final void c(hfc hfc0, fufb fufb0, goz goz0, int v) {
        goz goz1 = goz0.ao(-605776306);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fufb0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            grx grx0 = AndroidCompositionLocals_androidKt.b;
            Context context0 = (Context)goz1.h(grx0);
            boolean z1 = fryw.c(fufb0.c, context0);
            fryv fryv0 = null;
            fuel fuel0 = (fufb0.g instanceof fuel) ? ((fuel)fufb0.g) : null;
            fryv fryv1 = fuel0 == null ? null : fuel0.a;
            boolean z2 = fryw.c(fryv1, ((Context)goz1.h(grx0)));
            fuel fuel1 = (fufb0.g instanceof fuel) ? ((fuel)fufb0.g) : null;
            fufd fufd0 = fuel1 == null ? null : fuel1.b;
            if((fufd0 instanceof fuff)) {
                fryv0 = ((fuff)fufd0).a;
            }
            else if((fufd0 instanceof fufc)) {
                fryv0 = ((fufc)fufd0).a;
            }
            else if(!(fufd0 instanceof fufe) && fufd0 != null) {
                throw new ibnq();
            }
            goz1.M(0x7518911B);
            if(fryv0 == null || !fryw.b(fryv0, ((Context)goz1.h(grx0)))) {
                z = false;
            }
            goz1.x();
            gze gze0 = gzf.e(0x13F004FB, new fuey(fufb0, fryv1, fryv0, fufd0), goz1);
            goz1.M(0x97EA02AA);
            int v2 = goz1.Y(z2) | goz1.Y(z) | goz1.Y(z1);
            Object object0 = goz1.j();
            if(v2 != 0 || object0 == gop.a) {
                object0 = new fuex(z2, z, z1);
                goz1.P(object0);
            }
            goz1.x();
            int v3 = fuem.a(gol.c(goz1));
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
            guo.b(goz1, ((iau)object0), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            gze0.a(goz1, Integer.valueOf(6));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fueo(hfc0, fufb0, v);
        }
    }

    public static final void d(fufb fufb0, goz goz0) {
        fuez.b(fufb0, goz0, 0);
    }
}

