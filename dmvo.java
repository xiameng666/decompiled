import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

public final class dmvo implements ibts {
    public final hkhr a;
    public final dmwr b;
    public final ibvd c;

    public dmvo(hkhr hkhr0, dmwr dmwr0, ibvd ibvd0) {
        this.a = hkhr0;
        this.b = dmwr0;
        this.c = ibvd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        fuat fuat3;
        fuat fuat2;
        fuat fuat1;
        fryr fryr0;
        ibuq.f(((dnr)object0), "$this$LazyColumn");
        dol.a(((dnr)object0), dmzo.d);
        hkhr hkhr0 = this.a;
        dol.a(((dnr)object0), new gze(2008794952, true, new dmvt(hkhr0)));
        dol.a(((dnr)object0), dmzo.e);
        hkhc hkhc0 = hkhr0.t == null ? hkhc.a : hkhr0.t;
        switch((hkhb.a(hkhc0.d) == 0 ? 1 : hkhb.a(hkhc0.d)) - 2) {
            case 1: {
                fryr0 = new fryr(0x7F151C0D);  // string:pay_bank_account_detail_savings "Savings"
                break;
            }
            case 2: {
                fryr0 = new fryr(0x7F151C0C);  // string:pay_bank_account_detail_checking "Checking"
                break;
            }
            case 3: {
                fryr0 = new fryr(0x7F151C0E);  // string:pay_bank_account_detail_transacting_account "Account"
                break;
            }
            default: {
                fryr0 = new fryu("");
            }
        }
        dmwr dmwr0 = this.b;
        if(fryw.b(fryr0, dmwr0.requireContext())) {
            dol.a(((dnr)object0), new gze(-599024732, true, new dmvv(fryr0, dnpy.b(hkhr0), dmwr0)));
        }
        String s = (hkhr0.t == null ? hkhc.a : hkhr0.t).e;
        ibuq.e(s, "getBranchCode(...)");
        if(s.length() > 0) {
            dol.a(((dnr)object0), new gze(0xF4AF8B8D, true, new dmvw(s)));
        }
        dol.a(((dnr)object0), dmzo.f);
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkgs hkgs0 = hkhh0.h == null ? hkgs.a : hkhh0.h;
        ibuq.e(hkgs0, "getIssuerData(...)");
        fuaz fuaz0 = new fuaz(new fryh(0x7F080615), null, null, null, 30);  // drawable:gs_receipt_long_vd_theme_24
        fuat fuat0 = new fuat(new fryr(0x7F152258), null, fuaz0, null, 0x2EF4A, null, new dmvp(dmwr0), null, null, false, false, false, null, false, 0x3FAA);  // string:pay_transactions_activity "Activity"
        String s1 = hkgs0.c;
        ibuq.e(s1, "getName(...)");
        if(s1.length() > 0) {
            String s2 = hkgs0.d;
            ibuq.e(s2, "getPhoneNumber(...)");
            if(s2.length() > 0 && edpi.c(dmwr0.requireContext())) {
                fuaz fuaz1 = new fuaz(new fryh(0x7F0804F3), null, null, null, 30);  // drawable:gs_call_vd_theme_24
                fuat1 = new fuat(new frys(0x7F151C20, new Object[]{hkgs0.c}), null, fuaz1, null, 0x2EF4C, null, new dmvq(dmwr0, hkgs0), null, null, false, false, false, null, false, 0x3FAA);  // string:pay_call_issuer_label "Call %1$s"
            }
            else {
                fuat1 = null;
            }
        }
        else {
            fuat1 = null;
        }
        String s3 = hkgs0.c;
        ibuq.e(s3, "getName(...)");
        if(s3.length() > 0) {
            String s4 = hkgs0.f;
            ibuq.e(s4, "getTermsAndConditionsUrl(...)");
            if(s4.length() > 0) {
                fuaz fuaz2 = new fuaz(new fryh(0x7F080B44), null, null, null, 30);  // drawable:quantum_gm_ic_description_vd_theme_24
                fuat2 = new fuat(new frys(0x7F151E33, new Object[]{hkgs0.c}), null, fuaz2, null, 0x2EF89, null, new dmvr(dmwr0, hkgs0), null, null, false, false, false, null, false, 0x3FAA);  // string:pay_fops_terms_and_conditions "%1$s terms and conditions"
            }
            else {
                fuat2 = null;
            }
        }
        else {
            fuat2 = null;
        }
        String s5 = hkgs0.c;
        ibuq.e(s5, "getName(...)");
        if(s5.length() > 0) {
            String s6 = hkgs0.e;
            ibuq.e(s6, "getPrivacyUrl(...)");
            if(s6.length() > 0) {
                fuaz fuaz3 = new fuaz(new fryh(0x7F080604), null, null, null, 30);  // drawable:gs_policy_vd_theme_24
                fuat3 = new fuat(new frys(0x7F152076, new Object[]{hkgs0.c}), null, fuaz3, null, 0x2EF88, null, new dmvs(dmwr0, hkgs0), null, null, false, false, false, null, false, 0x3FAA);  // string:pay_privacy_policy "%1$s privacy policy"
            }
            else {
                fuat3 = null;
            }
        }
        else {
            fuat3 = null;
        }
        List list0 = ibpg.H(new fuat[]{fuat0, fuat1, fuat2, fuat3});
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(list0);
        ((dnr)object0).b(snapshotStateList0.a(), null, new dmvz(snapshotStateList0), new gze(2039820996, true, new dmwa(snapshotStateList0, snapshotStateList0)));
        dol.a(((dnr)object0), dmzo.g);
        dol.a(((dnr)object0), new gze(2106274244, true, new dmvy(this.c)));
        return ibom.a;
    }
}

