import android.content.Context;

public final class ftrn {
    public static final String a(Context context0, hjin hjin0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hjin0, "amount");
        return ftrn.e(context0, hjin0, false);
    }

    public static final String b(Context context0, hknp hknp0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hknp0, "coreTransaction");
        return ftrn.f(context0, hknp0, true, false);
    }

    public static final String c(Context context0, hknp hknp0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hknp0, "coreTransaction");
        return ftrn.f(context0, hknp0, false, true);
    }

    public static final String d(Context context0, hjin hjin0) {
        ibuq.f(context0, "<this>");
        ibuq.f(hjin0, "amount");
        return ftrn.e(context0, hjin0, true);
    }

    private static final String e(Context context0, hjin hjin0, boolean z) {
        return !fscd.k(hjin0) || z ? ftro.b(context0, hjin0) : "";
    }

    private static final String f(Context context0, hknp hknp0, boolean z, boolean z1) {
        boolean z2 = false;
        if(ftrp.d(hknp0)) {
            if(((hknp0.D == null ? hkno.a : hknp0.D).b & 1) != 0) {
                hkno hkno0 = hknp0.D == null ? hkno.a : hknp0.D;
                hkog hkog0 = hkno0.d == null ? hkog.a : hkno0.d;
                ibuq.e(hkog0, "getTransitPurchaseDetails(...)");
                int v = hkog0.c;
                if(v == 1) {
                    hjin hjin0 = hknp0.j == null ? hjin.a : hknp0.j;
                    ibuq.e(hjin0, "getAmount(...)");
                    return ftrn.e(context0, hjin0, false);
                }
                if(z && v == 2) {
                    hjin hjin1 = ((hkoe)hkog0.d).b;
                    if(hjin1 == null) {
                        hjin1 = hjin.a;
                    }
                    ibuq.e(hjin1, "getCost(...)");
                    return ftrn.e(context0, hjin1, false);
                }
                return "";
            }
            hkua hkua0 = ftrp.b(hknp0);
            if(ftrp.f(hkua0)) {
                if(z1) {
                    ibuq.e("Pass used", "getString(...)");
                    return "Pass used";
                }
                return "";
            }
            if(!ibpo.aB(ftrp.a, hkua0) && fscd.k((hknp0.j == null ? hjin.a : hknp0.j))) {
                return "";
            }
            hjin hjin2 = hknp0.j == null ? hjin.a : hknp0.j;
            ibuq.e(hjin2, "getAmount(...)");
            return ftrn.e(context0, hjin2, true);
        }
        if((hknp0.c & 4) == 0) {
            String s = hknp0.k;
            ibuq.e(s, "getDisplayAmountDescription(...)");
            if(s.length() != 0) {
                String s1 = hknp0.k;
                ibuq.e(s1, "getDisplayAmountDescription(...)");
                return s1;
            }
        }
        hjin hjin3 = hknp0.j == null ? hjin.a : hknp0.j;
        ibuq.e(hjin3, "getAmount(...)");
        hknh hknh0 = hknp0.C == null ? hknh.a : hknp0.C;
        hjwx hjwx0 = hknh0.d == null ? hjwx.a : hknh0.d;
        if((hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)) == hjww.j) {
            z2 = true;
        }
        return ftrn.e(context0, hjin3, z2);
    }
}

