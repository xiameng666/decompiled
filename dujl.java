import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class dujl {
    public static final void a(dujd dujd0, hfc hfc0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(dujd0, "state");
        goz goz1 = goz0.ao(1580015906);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(dujd0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if((v1 & 2) != 0) {
                hfc0 = hfc.e;
            }
            hfc hfc1 = dls.v(hfc0);
            iau iau0 = dhw.a(hei.a, false);
            int v3 = dujg.a(gol.c(goz1));
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
            dic dic0 = dic.a;
            if(((Configuration)goz1.h(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
                goz1.M(0x63031B31);
                dujl.d(dujd0, null, goz1, v2 & 14);
                dujl.c(dujd0, dic0.a(dls.k(hfc0, 120.0f), hei.e), goz1, v2 & 14);
            }
            else {
                goz1.M(0x63053D15);
                dujl.b(dujd0, hfc0, goz1, v2 & 0x7E);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duji(dujd0, hfc0, v, v1);
        }
    }

    public static final void b(dujd dujd0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x25A1A86F);
        int v1 = (v & 6) == 0 ? (goz1.Z(dujd0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dls.w(hfc0);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = dujg.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            dujl.d(dujd0, null, goz1, v1 & 14);
            hey hey0 = hfc.e;
            hfc hfc3 = dls.v(hey0);
            iau iau1 = dhw.a(hei.a, false);
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
            int v3 = dujg.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc4, ibtw3);
            hfc hfc5 = dls.k(hey0, 120.0f);
            dujl.c(dujd0, dic.a.a(hfc5, hei.e), goz1, v1 & 14);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dujj(dujd0, hfc0, v);
        }
    }

    public static final void c(dujd dujd0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x69F4DF11);
        int v1 = (v & 6) == 0 ? (goz1.Z(dujd0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc0;
            ftyy.c(new frxv(new fryn(fuqd.a, 0, 6), dujd0.b), hfc1, isq.c(0x7F152286, goz1), null, goz1, v1 & 0x70 | 8, 8);  // string:pay_transactions_status_icon_description "Status icon"
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dujk(dujd0, hfc1, v);
        }
    }

    public static final void d(dujd dujd0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(1515495002);
        if(((((v & 6) == 0 ? (goz1.Z(dujd0) ? 4 : 2) | v : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            fryv fryv0 = dujd0.a;
            if(fryw.d(fryv0)) {
                hfc hfc1 = dls.w(hfc0);
                iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
                int v1 = dujg.a(gol.c(goz1));
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
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                    Integer integer0 = v1;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc2, iej.c);
                fuhl.a(null, new fuhm(new fugt(new fryh(0x7F08038D), new fryr(0x7F151EDB), new frxo(0x7F04030C), null, 24), fryv0, null, 4), goz1, 0x40, 1);  // drawable:drivers_license_icon
                dlv.a(dls.e(hfc0, 32.0f), goz1);
                goz1.z();
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dujh(dujd0, hfc0, v);
        }
    }
}

