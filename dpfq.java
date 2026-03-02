import android.net.Uri;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

public final class dpfq {
    public static CardInfo a(hkhr hkhr0) {
        return dpfq.b(hkhr0, false);
    }

    public static CardInfo b(hkhr hkhr0, boolean z) {
        int v2;
        TokenReference tokenReference0;
        int v1;
        int v;
        hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        esko esko0 = new esko();
        esko0.a = (hjwt0.d == null ? hjwq.a : hjwt0.d).b;
        hjwq hjwq0 = hjwt0.d;
        esko0.a = (hjwq0 == null ? hjwq.a : hjwq0).b;
        if(hjwq0 == null) {
            hjwq0 = hjwq.a;
        }
        esko0.c = hjwq0.c.toByteArray();
        esko0.e = hkhr0.h;
        esko0.B = (hkhr0.e == null ? hjqn.a : hkhr0.e).b;
        esko0.i = Uri.parse((hkhr0.q == null ? hkhh.a : hkhr0.q).c);
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        switch((hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f)).ordinal()) {
            case 1: {
                v = 4;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 1;
                break;
            }
            case 4: {
                v = 2;
                break;
            }
            case 7: {
                v = 8;
                break;
            }
            default: {
                v = 1000;
            }
        }
        try {
            esko0.f = v;
            hkhh hkhh1 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            hkir hkir1 = hkhh1.g == null ? hkir.a : hkhh1.g;
            switch((hktu.b(hkir1.f) == null ? hktu.D : hktu.b(hkir1.f)).ordinal()) {
                case 1: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    v1 = 2;
                    break;
                }
                case 2: 
                case 7: {
                    v1 = 3;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown payment network");
                }
            }
            tokenReference0 = new TokenReference(null, v1);
        }
        catch(IllegalArgumentException unused_ex) {
            tokenReference0 = null;
        }
        switch((hkiq.b(hkir1.h) == null ? hkiq.f : hkiq.b(hkir1.h)).ordinal()) {
            case 1: {
                v2 = 3;
                break;
            }
            case 2: {
                v2 = 2;
                break;
            }
            case 3: {
                v2 = 5;
                break;
            }
            case 4: {
                v2 = 4;
                break;
            }
            default: {
                v2 = 1;
            }
        }
        esko0.g = new TokenStatus((tokenReference0 == null ? null : tokenReference0), v2, z, null, 0);
        hkhh hkhh2 = hkhr0.q;
        hkhh hkhh3 = hkhh2 == null ? hkhh.a : hkhh2;
        esko0.o = (hkhh3.g == null ? hkir.a : hkhh3.g).l;
        if(hkhh2 == null) {
            hkhh2 = hkhh.a;
        }
        esko0.G = hkhh2.e.replaceAll("\\D", "");
        hkhh hkhh4 = hkhr0.q;
        hkhh hkhh5 = hkhh4 == null ? hkhh.a : hkhh4;
        esko0.m = (hkhh5.g == null ? hkir.a : hkhh5.g).d;
        if(((hkhh4 == null ? hkhh.a : hkhh4).b & 4) != 0) {
            if(hkhh4 == null) {
                hkhh4 = hkhh.a;
            }
            hkgs hkgs0 = hkhh4.h == null ? hkgs.a : hkhh4.h;
            esko0.l = new IssuerInfo(hkgs0.c, null, null, (hkgs0.h == null ? hjqa.a : hkgs0.h).b, (hkgs0.h == null ? hjqa.a : hkgs0.h).c, (hkgs0.g == null ? hjwp.a : hkgs0.g).b, null, null, hkgs0.j, null, null, null, null, 0L, null, null, null, null, null, null, null, 0);
        }
        return esko0.a();
    }

    public static gtnm c(hktu hktu0) {
        switch(hktu0.ordinal()) {
            case 1: {
                return gtnm.e;
            }
            case 3: {
                return gtnm.d;
            }
            case 2: 
            case 7: {
                return gtnm.f;
            }
            default: {
                return gtnm.z;
            }
        }
    }

    public static gtnm d(int v) {
        switch(v) {
            case 1: {
                return gtnm.m;
            }
            case 2: {
                return gtnm.d;
            }
            case 3: {
                return gtnm.f;
            }
            case 4: {
                return gtnm.e;
            }
            case 5: {
                return gtnm.h;
            }
            case 6: {
                return gtnm.i;
            }
            case 7: {
                return gtnm.j;
            }
            case 8: {
                return gtnm.k;
            }
            case 9: {
                return gtnm.l;
            }
            case 13: {
                return gtnm.o;
            }
            case 14: {
                return gtnm.q;
            }
            case 15: {
                return gtnm.p;
            }
            case 16: {
                return gtnm.s;
            }
            default: {
                throw new IllegalArgumentException("Unknown token provider " + v);
            }
        }
    }

    public static hktu e(int v) {
        switch(v) {
            case 1: {
                return hktu.d;
            }
            case 2: {
                return hktu.e;
            }
            case 3: {
                return hktu.c;
            }
            case 4: {
                return hktu.b;
            }
            case 5: {
                return hktu.f;
            }
            case 6: {
                return hktu.A;
            }
            case 7: {
                return hktu.g;
            }
            case 8: {
                return hktu.h;
            }
            case 9: {
                return hktu.B;
            }
            case 10: {
                return hktu.C;
            }
            case 11: {
                return hktu.j;
            }
            case 12: {
                return hktu.i;
            }
            case 13: {
                return hktu.l;
            }
            default: {
                throw new IllegalArgumentException(a.h(v, "Unknown network "));
            }
        }
    }
}

