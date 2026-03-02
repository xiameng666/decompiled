import android.net.Uri;
import java.util.List;

public final class dmvf implements ibts {
    public final dmwr a;

    public dmvf(dmwr dmwr0) {
        this.a = dmwr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dmyz)object0), "details");
        this.a.H();
        dxev dxev0 = ((dmyz)object0).a;
        String s = ((dmyz)object0).b;
        dmuy dmuy0 = this.a.z();
        ibuq.f(s, "defaultClientTokenId");
        if(dmuy0.l == null || !dnpx.g(dmuy0.l, dxev0) || !ibuq.m(s, dmuy0.m)) {
            dmuy0.l = dxev0;
            dmuy0.m = s;
            if(hwfk.S()) {
                dmuy0.j.clear();
            }
            else {
                dmuy0.i.clear();
            }
            List list0 = dmuy0.k;
            list0.clear();
            if(hwfk.S()) {
                Integer integer0 = dmuy0.f();
                String s1 = dmuy0.a.getString(0x7F152258);  // string:pay_transactions_activity "Activity"
                ibuq.e(s1, "getString(...)");
                dmuy0.j.add(new dnfq(((int)0x7F080615), null, integer0, null, s1, null, null, null, null, null, null, null, new dmuw(dmuy0), null, null, 0x1BFFEA));  // drawable:gs_receipt_long_vd_theme_24
            }
            else {
                dnfo dnfo0 = new dnfo();
                dnfo0.j(Integer.valueOf(0x7F080615));  // drawable:gs_receipt_long_vd_theme_24
                dnfo0.l(Integer.valueOf(dmuy0.f()));
                dnfo0.a = dmuy0.a.getString(0x7F152258);  // string:pay_transactions_activity "Activity"
                dnfo0.o(new dmun(dmuy0));
                dnfp dnfp0 = dnfo0.a();
                dmuy0.i.add(dnfp0);
            }
            fhwo fhwo0 = dmuy0.g.a;
            list0.add(fhwo0.a(0x2EF4A));
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            hkgs hkgs0 = hkhh0.h == null ? hkgs.a : hkhh0.h;
            ibuq.e(hkgs0, "getIssuerData(...)");
            String s2 = hkgs0.c;
            ibuq.e(s2, "getName(...)");
            if(s2.length() > 0) {
                String s3 = hkgs0.d;
                ibuq.e(s3, "getPhoneNumber(...)");
                if(s3.length() > 0) {
                    du du0 = dmuy0.a;
                    if(edpi.c(du0.requireContext())) {
                        String s4 = du0.getString(0x7F151C20, new Object[]{hkgs0.c});  // string:pay_call_issuer_label "Call %1$s"
                        ibuq.e(s4, "getString(...)");
                        if(hwfk.S()) {
                            Integer integer1 = dmuy0.f();
                            dmuy0.j.add(new dnfq(((int)0x7F0804F3), null, integer1, null, s4, null, null, null, null, null, null, null, new dmuo(dmuy0, hkgs0), null, null, 0x1BFFEA));  // drawable:gs_call_vd_theme_24
                        }
                        else {
                            dnfo dnfo1 = new dnfo();
                            dnfo1.j(Integer.valueOf(0x7F0804F3));  // drawable:gs_call_vd_theme_24
                            dnfo1.l(Integer.valueOf(dmuy0.f()));
                            dnfo1.a = s4;
                            dnfo1.o(new dmup(dmuy0, hkgs0));
                            dnfp dnfp1 = dnfo1.a();
                            dmuy0.i.add(dnfp1);
                        }
                        list0.add(fhwo0.a(0x2EF4C));
                    }
                }
            }
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh1 = hkhr1.q == null ? hkhh.a : hkhr1.q;
            hkgs hkgs1 = hkhh1.h == null ? hkgs.a : hkhh1.h;
            ibuq.e(hkgs1, "getIssuerData(...)");
            String s5 = hkgs1.c;
            ibuq.e(s5, "getName(...)");
            if(s5.length() > 0) {
                String s6 = hkgs1.f;
                ibuq.e(s6, "getTermsAndConditionsUrl(...)");
                if(s6.length() > 0) {
                    String s7 = dmuy0.a.getString(0x7F151E33, new Object[]{hkgs1.c});  // string:pay_fops_terms_and_conditions "%1$s terms and conditions"
                    ibuq.e(s7, "getString(...)");
                    Uri uri0 = Uri.parse(hkgs1.f);
                    if(hwfk.S()) {
                        Integer integer2 = dmuy0.f();
                        dmuy0.j.add(new dnfq(((int)0x7F080B44), null, integer2, null, s7, null, null, null, null, null, null, null, new dmuq(dmuy0, uri0), null, null, 0x1BFFEA));  // drawable:quantum_gm_ic_description_vd_theme_24
                    }
                    else {
                        dnfo dnfo2 = new dnfo();
                        dnfo2.j(Integer.valueOf(0x7F080B44));  // drawable:quantum_gm_ic_description_vd_theme_24
                        dnfo2.l(Integer.valueOf(dmuy0.f()));
                        dnfo2.a = s7;
                        dnfo2.o(new dmur(dmuy0, uri0));
                        dnfp dnfp2 = dnfo2.a();
                        dmuy0.i.add(dnfp2);
                    }
                    list0.add(fhwo0.a(0x2EF89));
                }
            }
            hkhr hkhr2 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh2 = hkhr2.q == null ? hkhh.a : hkhr2.q;
            hkgs hkgs2 = hkhh2.h == null ? hkgs.a : hkhh2.h;
            ibuq.e(hkgs2, "getIssuerData(...)");
            String s8 = hkgs2.c;
            ibuq.e(s8, "getName(...)");
            if(s8.length() > 0) {
                String s9 = hkgs2.e;
                ibuq.e(s9, "getPrivacyUrl(...)");
                if(s9.length() > 0) {
                    String s10 = dmuy0.a.getString(0x7F152076, new Object[]{hkgs2.c});  // string:pay_privacy_policy "%1$s privacy policy"
                    ibuq.e(s10, "getString(...)");
                    Uri uri1 = Uri.parse(hkgs2.e);
                    if(hwfk.S()) {
                        Integer integer3 = dmuy0.f();
                        dmuy0.j.add(new dnfq(((int)0x7F080604), null, integer3, null, s10, null, null, null, null, null, null, null, new dmuu(dmuy0, uri1), null, null, 0x1BFFEA));  // drawable:gs_policy_vd_theme_24
                    }
                    else {
                        dnfo dnfo3 = new dnfo();
                        dnfo3.j(Integer.valueOf(0x7F080604));  // drawable:gs_policy_vd_theme_24
                        dnfo3.l(Integer.valueOf(dmuy0.f()));
                        dnfo3.a = s10;
                        dnfo3.o(new dmuv(dmuy0, uri1));
                        dnfp dnfp3 = dnfo3.a();
                        dmuy0.i.add(dnfp3);
                    }
                    list0.add(fhwo0.a(0x2EF88));
                }
            }
            hkhr hkhr3 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh3 = hkhr3.q == null ? hkhh.a : hkhr3.q;
            hkgs hkgs3 = hkhh3.h == null ? hkgs.a : hkhh3.h;
            ibuq.e(hkgs3, "getIssuerData(...)");
            hkhr hkhr4 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh4 = hkhr4.q == null ? hkhh.a : hkhr4.q;
            hkir hkir0 = hkhh4.g == null ? hkir.a : hkhh4.g;
            ibuq.e(hkir0, "getTokenData(...)");
            int v = 0x7F151F24;  // string:pay_install_app "Get app"
            Object object1 = null;
            if(hwfk.S()) {
                if(hkgs3 != null && hkir0 != null && (hkgs3.b & 2) != 0) {
                    hjqa hjqa0 = hkgs3.h == null ? hjqa.a : hkgs3.h;
                    ibuq.e(hjqa0, "getAppDetails(...)");
                    hjwp hjwp0 = hkgs3.g == null ? hjwp.a : hkgs3.g;
                    ibuq.e(hjwp0, "getAppIntentInfo(...)");
                    du du1 = dmuy0.a;
                    if(frxe.d(du1.requireContext(), hjqa0.e)) {
                        v = 0x7F1508AA;  // string:common_open "Open"
                    }
                    String s11 = du1.getString(v);
                    ibuq.e(s11, "getString(...)");
                    int v1 = du1.getResources().getDimensionPixelSize(0x7F070DE0);  // dimen:pay_fops_details_action_app_logo_size
                    String s12 = hjqa0.b;
                    ibuq.e(s12, "getAppName(...)");
                    object1 = new dnfq(null, (hjqa0.d == null ? hjqk.a : hjqa0.d).b, null, v1, s12, hjqa0.c, null, null, null, null, s11, null, new dmus(dmuy0, hkgs3, hjqa0, hjwp0), null, null, 0x1AFFC5);
                }
                if(object1 != null) {
                    dmuy0.j.add(object1);
                    list0.add(fhwo0.a(0x2EF4B));
                }
            }
            else {
                if(hkgs3 != null && hkir0 != null && (hkgs3.b & 2) != 0) {
                    hjqa hjqa1 = hkgs3.h == null ? hjqa.a : hkgs3.h;
                    ibuq.e(hjqa1, "getAppDetails(...)");
                    hjwp hjwp1 = hkgs3.g == null ? hjwp.a : hkgs3.g;
                    ibuq.e(hjwp1, "getAppIntentInfo(...)");
                    du du2 = dmuy0.a;
                    if(frxe.d(du2.requireContext(), hjqa1.e)) {
                        v = 0x7F1508AA;  // string:common_open "Open"
                    }
                    String s13 = du2.getString(v);
                    ibuq.e(s13, "getString(...)");
                    int v2 = du2.getResources().getDimensionPixelSize(0x7F070DE0);  // dimen:pay_fops_details_action_app_logo_size
                    dnfo dnfo4 = new dnfo();
                    dnfo4.a = hjqa1.b;
                    dnfo4.p(hjqa1.c);
                    dnfo4.b(s13);
                    dnfo4.m((hjqa1.d == null ? hjqk.a : hjqa1.d).b);
                    dnfo4.k(Integer.valueOf(v2));
                    dnfo4.o(new dmut(dmuy0, hkgs3, hjqa1, hjwp1));
                    object1 = dnfo4.a();
                }
                if(object1 != null) {
                    dmuy0.i.add(object1);
                    list0.add(fhwo0.a(0x2EF4B));
                }
            }
            dmuy0.q();
        }
        return ibom.a;
    }
}

