import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.pay.pass.idcard.view.components.MsoDropDown;

public final class dujx {
    public static final String a(hfwn hfwn0, Context context0) {
        ibuq.f(hfwn0, "<this>");
        ibuq.f(context0, "context");
        String s = MsoDropDown.a.h(context0, hfwn0);
        ibuq.e(s, "format(...)");
        return s;
    }

    public static final void b(dujy dujy0, goz goz0, int v) {
        hfwn hfwn3;
        ibuq.f(dujy0, "state");
        goz goz1 = goz0.ao(0xEF76E925);
        if((((v & 6) == 0 ? (goz1.Z(dujy0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goto label_54;
        }
        else if(dujy0.a) {
            gtyc gtyc0 = dujy0.b;
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = dujp.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            fryr fryr0 = new fryr(0x7F151FB9);  // string:pay_mso_info_cert_signed "Certificate signed date"
            hfwn hfwn0 = gtyc0.c == null ? hfwn.a : gtyc0.c;
            ibuq.e(hfwn0, "getSignedTimestamp(...)");
            dujx.d(fryr0, new fryu(dujx.a(hfwn0, context0)), null, null, goz1, 0);
            fryr fryr1 = new fryr(0x7F151FBB);  // string:pay_mso_info_cert_valid_from "Certificate valid from"
            hfwn hfwn1 = gtyc0.d == null ? hfwn.a : gtyc0.d;
            ibuq.e(hfwn1, "getValidFromTimestamp(...)");
            dujx.d(fryr1, new fryu(dujx.a(hfwn1, context0)), null, null, goz1, 0);
            fryr fryr2 = new fryr(0x7F151FBC);  // string:pay_mso_info_cert_valid_until "Certificate valid until"
            hfwn hfwn2 = gtyc0.e == null ? hfwn.a : gtyc0.e;
            ibuq.e(hfwn2, "getValidUntilTimestamp(...)");
            dujx.d(fryr2, new fryu(dujx.a(hfwn2, context0)), null, null, goz1, 0);
            if((gtyc0.b & 8) == 0) {
                hfwn3 = gtyc0.e;
                if(hfwn3 == null) {
                    hfwn3 = hfwn.a;
                }
            }
            else {
                hfwn3 = gtyc0.f;
                if(hfwn3 == null) {
                    hfwn3 = hfwn.a;
                }
            }
            ibuq.c(hfwn3);
            dujx.d(new fryr(0x7F151FB8), new fryu(dujx.a(hfwn3, context0)), null, null, goz1, 0);  // string:pay_mso_info_cert_expected_update "Certificate expected update"
            goz1.z();
        label_54:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new dujw(dujy0, v);
            }
        }
        else {
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new dujv(dujy0, v);
            }
        }
    }

    public static final void c(dujy dujy0, ibts ibts0, goz goz0, int v) {
        hfc hfc6;
        hfc hfc3;
        ibuq.f(dujy0, "state");
        ibuq.f(ibts0, "onExpandedChanged");
        goz goz1 = goz0.ao(1501101416);
        int v1 = (v & 6) == 0 ? (goz1.Z(dujy0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new dgh();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc0 = hfc.e;
            hfc hfc1 = dls.w(hfc0);
            ctp ctp0 = fxh.b(false, 0.0f, 0L, 7);
            goz1.M(-1633490746);
            int v2 = ((v1 & 0x70) == 0x20 ? 1 : 0) | goz1.Z(dujy0);
            Object object2 = goz1.j();
            if(v2 != 0 || object2 == object1) {
                object2 = new dujr(ibts0, dujy0);
                goz1.P(object2);
            }
            goz1.x();
            hfc hfc2 = cru.c(hfc1, ((dgg)object0), ctp0, false, null, null, ((ibth)object2), 28);
            goz1.M(0xDF2F7B0F);
            boolean z = dujy0.a;
            if(z) {
                goz1.M(0x6E3C21FE);
                Object object3 = goz1.j();
                if(object3 == object1) {
                    object3 = new dujs();
                    goz1.P(object3);
                }
                goz1.x();
                hfc3 = iuc.d(hfc0, ((ibts)object3));
            }
            else {
                hfc3 = hfc0;
            }
            goz1.x();
            hfc hfc4 = cci.b(hfc2.a(hfc3));
            goz1.M(0xDF2F949A);
            if(hwev.c()) {
                hfc hfc5 = cqx.c(hhi.a(dls.t(dls.w(hfc0), 56.0f, 0.0f, 2), fulh.a(fule.a, goz1)), fpu.a(goz1).F);
                goz1.M(0x6E3C21FE);
                Object object4 = goz1.j();
                if(object4 == object1) {
                    object4 = new dujt();
                    goz1.P(object4);
                }
                goz1.x();
                hfc6 = iuc.c(hfc5, true, ((ibts)object4));
            }
            else {
                hfc6 = hfc0;
            }
            goz1.x();
            if(hwev.c()) {
                hfc0 = dla.i(hfc0, 20.0f, 0.0f, 2);
            }
            hfc hfc7 = iqn.a(hfc6, "MsoDropDown");
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v3 = dujp.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc8 = hew.c(goz1, hfc7);
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
            guo.b(goz1, hfc8, iej.c);
            fuar.f(hfc4.a(hfc0), new fuat(new fryr(0x7F151FBA), null, null, new fubv((z ? new fryh(0x7F0805AA) : new fryh(0x7F0805A8)), null, null, null, null, 0x7E), 0, null, null, null, null, false, false, false, null, false, 0x3FF6), goz1, 0x40, 0);  // string:pay_mso_info_cert_title "Certificate info"
            dujx.b(dujy0, goz1, v1 & 14);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duju(dujy0, ibts0, v);
        }
    }

    public static final void d(fryv fryv0, fryv fryv1, hfc hfc0, fule fule0, goz goz0, int v) {
        fule fule1;
        hfc hfc1;
        int v1;
        fryv fryv2;
        goz goz1 = goz0.ao(0x43710CD5);
        if((v & 6) == 0) {
            fryv2 = fryv0;
            v1 = v | (goz1.Z(fryv2) ? 4 : 2);
        }
        else {
            fryv2 = fryv0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fryv1) ? 0x20 : 16);
        }
        if(((v1 | 0x180) & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            fule1 = fule0;
        }
        else {
            fuar.f(dla.j(hfc.e, 20.0f, 0.0f, 0.0f, 0.0f, 14).a(hfc.e), new fuat(fryv2, fryv1, null, null, 0, null, null, null, null, true, false, true, null, false, 0x35FC), goz1, 0x40, 0);
            fule1 = fule.c;
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dujq(fryv0, fryv1, hfc1, fule1, v);
        }
    }
}

