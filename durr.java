import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class durr {
    public static final void a(hfc hfc0, Set set0, ibts ibts0, goz goz0, int v) {
        durs durs0;
        ibuq.f(hfc0, "modifier");
        ibuq.f(ibts0, "onIdTypeClick");
        goz goz1 = goz0.ao(0x7AFD4060);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(set0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            List list0 = ibpo.ao(set0, new durq());
            ibuq.f(list0, "idTypes");
            ibuq.f(ibts0, "onIdTypeClick");
            goz1.M(0x62B23EEC);
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                dtzi dtzi0 = (dtzi)object0;
                ibuq.f(dtzi0, "idType");
                ibuq.f(ibts0, "onIdTypeClick");
                goz1.M(-1681812038);
                switch(dtzi0.ordinal()) {
                    case 0: {
                        durs0 = new durs(new fryr(0x7F151ED0), new fryr(0x7F151EAC), new fryh(0x7F08038D));  // string:pay_id_drivers_license_or_state_id "Driver\'s license or state ID"
                        break;
                    }
                    case 1: {
                        durs0 = new durs(new fryr(0x7F151ED6), new frys(0x7F151ECB, new Object[]{new fryr(0x7F151EF3)}), new fryh(0x7F080460));  // string:pay_id_id_pass "ID pass"
                        break;
                    }
                    case 2: {
                        durs0 = new durs(new fryr(0x7F151EC6), new fryr(0x7F151EC6), new fryh(0x7F08038D));  // string:pay_id_card_riker_visible_name "Riker"
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unsupported ID type in IdTypeSelectorFragment");
                    }
                }
                fuba fuba0 = new fuba(durs0.c, null, null, false, 30);
                goz1.M(-1633490746);
                int v2 = ((v1 >> 3 & 0x70 ^ 0x30) <= 0x20 || !goz1.X(ibts0)) && (v1 >> 3 & 0x30) != 0x20 ? 0 : 1;
                Object object1 = goz1.j();
                if((goz1.V(dtzi0.ordinal()) | v2) != 0 || object1 == gop.a) {
                    object1 = new durh(ibts0, dtzi0);
                    goz1.P(object1);
                }
                goz1.x();
                ftzv ftzv0 = new ftzv(durs0.a, durs0.b, null, fuba0, null, null, null, false, ((ibth)object1), 0, null, 0xDF4);
                goz1.x();
                arrayList0.add(ftzv0);
            }
            fulg.c(arrayList0);
            goz1.x();
            hfc hfc1 = cvf.c(hfc0, cvf.d(0, goz1, 0, 1));
            dhg dhg0 = dho.g(32.0f);
            hej hej0 = hei.m;
            iau iau0 = dii.a(dhg0, hej0, goz1, 6);
            int v3 = durc.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts1 = iej.g;
            guo.a(goz1, ibts1);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            durr.e(null, goz1, 0);
            iau iau1 = dii.a(dho.g(2.0f), hej0, goz1, 0);
            int v4 = durc.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc.e);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer1 = v4;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts1);
            guo.b(goz1, hfc3, ibtw3);
            goz1.M(-392789081);
            for(Object object2: arrayList0) {
                ftzt.a(null, ((ftzv)object2), goz1, 0x40, 1);
            }
            goz1.x();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duri(hfc0, set0, ibts0, v);
        }
    }

    public static final void b(hfc hfc0, Set set0, ibth ibth0, ibts ibts0, goz goz0, int v) {
        goz goz2;
        int v1;
        hfc hfc1;
        ibuq.f(ibth0, "onNavIconClick");
        ibuq.f(ibts0, "onIdTypeClick");
        goz goz1 = goz0.ao(0xF28D36EB);
        if((v & 6) == 0) {
            hfc1 = hfc0;
            v1 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(set0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fxw.a(hfc1, gzf.e(0x316283A7, new durn(ibth0), goz1), null, null, null, 0, 0L, 0L, null, gzf.e(1104405244, new duro(set0, ibts0), goz1), goz2, v1 & 14 | 0x30000030, 508);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new durj(hfc0, set0, ibth0, ibts0, v);
        }
    }

    public static final void c(hfc hfc0, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onNavIconClick");
        goz goz1 = goz0.ao(1284109940);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            fxw.a(hfc0, gzf.e(916079416, new durp(ibth0), goz1), null, null, null, 0, 0L, 0L, null, duqu.a, goz1, v1 & 14 | 0x30000030, 508);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new durl(hfc0, ibth0, v);
        }
    }

    public static final void d(hfc hfc0, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onNavIconClick");
        goz goz1 = goz0.ao(-1105728904);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ibth0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            djf djf0 = new djf();
            gze gze0 = gzf.e(0x1FA82772, new durm(ibth0), goz1);
            far.d(duqu.b, hfc.e, gze0, null, 0.0f, djf0, null, null, goz1, v1 << 3 & 0x70 | 390, 0xD8);
            hfc0 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new durd(hfc0, ibth0, v);
        }
    }

    public static final void e(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xB2F4122F);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = durc.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            fuhl.a(null, new fuhm(new fugt(new fryh(0x7F08038D), new fryr(0x7F151EDB), new frxo(0x7F04030C), null, 24), new fryr(0x7F151EAA), null, 4), goz1, 0x40, 1);  // drawable:drivers_license_icon
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new durg(hfc0, v);
        }
    }

    public static final void f(hfc hfc0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        goz goz1 = goz0.ao(0xA3A81B0);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            hfc1 = hfc.e;
            goz2 = goz1;
            gdh.b(isq.c(0x7F151D44, goz1), hfc1, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).j, goz2, (v | 6) << 3 & 0x70, 0, 0x1FFFC);  // string:pay_drivers_license_device_ineligible_details "This device doesn\'t support 
                                                                                                                                                                 // IDs in Wallet"
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new durf(hfc1, v);
        }
    }

    public static final void g(hfc hfc0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        goz goz1 = goz0.ao(0xD3BAF3BE);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            hfc1 = hfc.e;
            goz2 = goz1;
            gdh.b(isq.c(0x7F151D9B, goz1), hfc1, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).d, goz2, (v | 6) << 3 & 0x70, 0, 0x1FFFC);  // string:pay_drivers_license_qr_wrong_doctype_error_message "Pass not supported"
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new durk(hfc1, v);
        }
    }

    public static final void h(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xD415654B);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dls.k(hfc0, 48.0f);
            cth.a(ism.a(0x7F080570, goz1, 0), isq.c(0x7F152183, goz1), hfc1, null, null, 0.0f, new hlb(hln.c(fipx.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), 0x7F0402C1)), 5), goz1, 8, 56);  // drawable:gs_error_vd_theme_48
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dure(hfc0, v);
        }
    }
}

