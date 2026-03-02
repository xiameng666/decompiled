import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftyd {
    public static final void a(hfc hfc0, ftyi ftyi0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x4C1FFFED);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftyi0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            frxs frxs0 = ftyi0.g;
            goz1.M(-1004549716);
            if(frxs0 != null) {
                frxs0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            }
            goz1.x();
            iau iau0 = dhw.a(hei.a, false);
            long v2 = gol.c(goz1);
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
            int v3 = (int)(v2 ^ v2 >>> 0x20);
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
            dic dic0 = dic.a;
            hfc hfc2 = hfc.e;
            fubp.d(hhc.a(dls.o(iqn.a(hfc2, "LeadingElement"), (hyxx.c() ? 72.0f : 64.0f)).a((hyxx.c() ? hfc2 : dls.e(hfc2, 64.0f))), (ftyi0.e != ftxs.c && ftyi0.e != ftxs.b || (ftyi0.a instanceof fuax) ? 1.0f : 0.5f)), ftyi0.a, goz1, 0, 0);
            ftyl ftyl0 = ftyi0.f;
            goz1.M(622890340);
            if(ftyl0 != null) {
                hfc hfc3 = dic0.a(iqn.a(hfc2, "Badge"), hei.i);
                goz1.M(0x25209CE9);
                if(hyxx.c()) {
                    hfc2 = dla.d(crd.c(hfc2, 2.0f, fpu.a(goz1).F, eah.a), 2.0f);
                }
                goz1.x();
                hfc hfc4 = dls.k(hfc3.a(hfc2), 24.0f);
                hyxx.c();
                goz1.M(152850985);
                long v4 = fpu.a(goz1).a;
                goz1.x();
                goz1.M(0x2521008E);
                hyxx.c();
                long v5 = fpu.a(goz1).b;
                goz1.x();
                fax.b(hfc4, v4, v5, gzf.e(0x54D9F0D, new ftxy(ftyl0), goz1), goz1, 0xC00);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxw(hfc0, ftyi0, v);
        }
    }

    public static final void b(hfc hfc0, ftyi ftyi0, goz goz0, int v) {
        goz goz1 = goz0.ao(1958193109);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftyi0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(627906964);
            hll hll0 = ftyi0.g == null ? null : new hll(ftyi0.g.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))));
            goz1.x();
            fugo.b(0, ((fhvp[])ftyi0.i.toArray(new fhvp[0])), null, gzf.e(-950211784, new ftyc(ftyi0, hll0, hfc0, ftyi0), goz1), goz1, 0xC00, 4);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxv(hfc0, ftyi0, v);
        }
    }

    public static final void c(hfc hfc0, ftyi ftyi0, goz goz0, int v) {
        ibuq.f(ftyi0, "state");
        goz goz1 = goz0.ao(-575317028);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ftyi0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            if(ftyi0.h) {
                goz1.M(1945009596);
                ftyg.a(hey0, ibzy.h(400, ibzz.c), goz1, v1 & 14);
            }
            else {
                goz1.M(0x73EFB058);
                ftyd.b(hey0, ftyi0, goz1, v1 & 0x7E);
            }
            goz1.x();
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxx(hfc0, ftyi0, v);
        }
    }
}

