import android.net.Uri;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;

public final class dmev {
    public static final dmew a(CardInfo cardInfo0) {
        String s;
        IssuerInfo issuerInfo0 = cardInfo0.l;
        if(issuerInfo0 == null) {
            s = "";
        }
        else {
            s = issuerInfo0.i;
            if(s == null) {
                s = "";
            }
        }
        int v = evjq.d(cardInfo0.f, cardInfo0.s);
        ibuq.e(cardInfo0.h, "getPanLastDigits(...)");
        return new dmew(v, cardInfo0.h, s, cardInfo0.e.toString(), cardInfo0.v, cardInfo0.k, cardInfo0.j, cardInfo0.i);
    }

    public static final dmew b(hkhr hkhr0, float f) {
        String s;
        int v2;
        ibuq.f(hkhr0, "paymentMethod");
        int v = -12303292;
        int v1 = -1;
        if(((hkhr0.q == null ? hkhh.a : hkhr0.q).b & 2) != 0) {
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            ibuq.e(hkhh0, "getDeviceDetails(...)");
            hkhm hkhm0 = hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f);
            ibuq.e(hkhm0, "getType(...)");
            hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
            if((hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f)) == hktu.a) {
                hkir hkir2 = hkhh0.g == null ? hkir.a : hkhh0.g;
                hkim hkim0 = hkim.b(hkir2.e) == null ? hkim.r : hkim.b(hkir2.e);
                ibuq.e(hkim0, "getPaymentNetwork(...)");
                switch(hkim0.ordinal()) {
                    case 1: {
                        v2 = 4;
                        break;
                    }
                    case 2: {
                        v2 = 3;
                        break;
                    }
                    case 3: {
                        v2 = 1;
                        break;
                    }
                    case 4: {
                        v2 = 2;
                        break;
                    }
                    case 5: {
                        v2 = 5;
                        break;
                    }
                    case 6: {
                        v2 = 6;
                        break;
                    }
                    case 7: {
                        v2 = 7;
                        break;
                    }
                    default: {
                        v2 = 1000;
                    }
                }
            }
            else {
                hkir hkir1 = hkhh0.g == null ? hkir.a : hkhh0.g;
                hktu hktu0 = hktu.b(hkir1.f) == null ? hktu.D : hktu.b(hkir1.f);
                ibuq.e(hktu0, "getCommonPaymentNetwork(...)");
                switch(hktu0.ordinal()) {
                    case 1: {
                        v2 = 4;
                        break;
                    }
                    case 2: {
                        v2 = 3;
                        break;
                    }
                    case 3: {
                        v2 = 1;
                        break;
                    }
                    case 4: {
                        v2 = 2;
                        break;
                    }
                    case 5: {
                        v2 = 5;
                        break;
                    }
                    case 6: {
                        v2 = 6;
                        break;
                    }
                    case 7: {
                        v2 = 7;
                        break;
                    }
                    default: {
                        v2 = 1000;
                    }
                }
            }
            if(hkhm0 != hkhm.g && hkhm0 != hkhm.h) {
                s = hkhh0.d;
                ibuq.c(s);
            }
            else {
                s = "";
            }
            if((hkhh0.b & 1) != 0) {
                v1 = (hkhh0.f == null ? hkhd.a : hkhh0.f).c;
            }
            String s1 = (hkhh0.h == null ? hkgs.a : hkhh0.h).j;
            ibuq.e(s1, "getProductShortName(...)");
            String s2 = hkhr0.h;
            String s3 = hkhr0.i;
            int v3 = dmex.a(v1, f);
            ibuq.f(hkhr0, "<this>");
            hkhh hkhh1 = hkhr0.q;
            if(((hkhh1 == null ? hkhh.a : hkhh1).b & 1) != 0) {
                if(hkhh1 == null) {
                    hkhh1 = hkhh.a;
                }
                v = (hkhh1.f == null ? hkhd.a : hkhh1.f).b;
            }
            int v4 = dmex.a(v, f);
            String s4 = hkhh0.c;
            ibuq.e(s4, "getCardArtFifeUrl(...)");
            return new dmew(v2, s, s1, s2, s3, v3, v4, Uri.parse(s4));
        }
        if((hkhr0.c & 4) != 0) {
            hkhk hkhk0 = hkhr0.k == null ? hkhk.a : hkhr0.k;
            ibuq.e(hkhk0, "getFullCardArt(...)");
            if((hkhk0.b & 1) != 0) {
                v1 = (hkhk0.e == null ? hkhd.a : hkhk0.e).c;
            }
            if((hkhk0.b & 1) != 0) {
                v = (hkhk0.e == null ? hkhd.a : hkhk0.e).b;
            }
            String s5 = hkhk0.d;
            ibuq.e(s5, "getCardArtOverlayTitle(...)");
            hkhh hkhh2 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            String s6 = (hkhh2.h == null ? hkgs.a : hkhh2.h).j;
            ibuq.e(s6, "getProductShortName(...)");
            String s7 = hkhr0.h;
            String s8 = hkhr0.i;
            int v5 = dmex.a(v1, f);
            int v6 = dmex.a(v, f);
            String s9 = hkhk0.c;
            ibuq.e(s9, "getCardArtFifeUrl(...)");
            return new dmew(1000, s5, s6, s7, s8, v5, v6, Uri.parse(s9));
        }
        return null;
    }

    public static final dmew c(hkhr hkhr0) {
        ibuq.f(hkhr0, "paymentMethod");
        return dmev.b(hkhr0, 1.0f);
    }

    public static final dmew d(dxev dxev0) {
        ibuq.f(dxev0, "paymentMethodData");
        ibuq.f(dxev0, "paymentMethodData");
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        ibuq.e(hkhr0, "getPaymentMethod(...)");
        return dmev.b(hkhr0, 1.0f);
    }
}

