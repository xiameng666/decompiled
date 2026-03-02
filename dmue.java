import android.accounts.Account;
import android.util.SparseArray;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.SeInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import j..util.Collection.-EL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dmue {
    public final dypz a;
    public static final int b;
    private static final bboh c;
    private final dlmc d;
    private final dmtn e;
    private final dmuj f;
    private final gmcg g;
    private final easw h;
    private final dypo i;
    private final dypr j;
    private final dmuh k;
    private final dxzo l;
    private final etgl m;

    static {
        dmue.c = bboh.b("Pay", bbcu.cZ);
    }

    public dmue(etgl etgl0, dlmc dlmc0, dmtn dmtn0, dmuj dmuj0, gmcg gmcg0, easw easw0, dypo dypo0, dypz dypz0, dypr dypr0, dmuh dmuh0, dxzo dxzo0) {
        this.m = etgl0;
        this.d = dlmc0;
        this.e = dmtn0;
        this.f = dmuj0;
        this.g = gmcg0;
        this.h = easw0;
        this.i = dypo0;
        this.a = dypz0;
        this.j = dypr0;
        this.k = dmuh0;
        this.l = dxzo0;
    }

    public final dxeo a(Account account0) {
        int v6;
        boolean z2;
        hkim hkim6;
        boolean z1;
        hkim hkim4;
        hktu hktu1;
        hkim hkim1;
        int v5;
        GetAllCardsResponse getAllCardsResponse1;
        int v4;
        hkiq hkiq0;
        gged_interceptors gged5;
        gged_interceptors gged4;
        gged_interceptors gged3;
        GetAllCardsResponse getAllCardsResponse0 = (GetAllCardsResponse)evrg.o(this.m.k(account0, false), 10L, TimeUnit.SECONDS);
        gged_interceptors gged0 = getAllCardsResponse0.a == null ? ggna.a : gged_interceptors.k(getAllCardsResponse0.a);
        gged_interceptors gged1 = this.e.b();
        SparseArray sparseArray0 = getAllCardsResponse0.e;
        gged_interceptors gged2 = (gged_interceptors)Collection.-EL.stream(this.i.e()).filter(new dmud(this)).collect(ggaf.a);
        String s = gfta.b(getAllCardsResponse0.c);
        ggdy ggdy0 = new ggdy();
        HashSet hashSet0 = new HashSet(gged2);
        int v = ((ggna)gged1).c;
        int v1 = 0;
        while(v1 < v) {
            dxes dxes0 = (dxes)gged1.get(v1);
            hkhr hkhr0 = dxes0.c == null ? hkhr.b : dxes0.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxev.a).v_newBuilder();
            String s1 = dxes0.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((dxev)hftv0).e = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            dxev dxev0 = (dxev)hftp0.b_message;
            hkhr0.getClass();
            dxev0.c = hkhr0;
            dxev0.b |= 1;
            if(((hkhr0.d == null ? hjwt.a : hkhr0.d).b & 2) == 0) {
                getAllCardsResponse1 = getAllCardsResponse0;
                gged3 = gged0;
                gged4 = gged1;
                gged5 = gged2;
                v4 = v;
                v5 = v1;
                hjwt hjwt5 = hkhr0.d;
                if(((hjwt5 == null ? hjwt.a : hjwt5).b & 4) != 0) {
                    if(hjwt5 == null) {
                        hjwt5 = hjwt.a;
                    }
                    hjwx hjwx2 = hjwt5.e == null ? hjwx.a : hjwt5.e;
                    if((hjww.b(hjwx2.b) == null ? hjww.l : hjww.b(hjwx2.b)) != hjww.k) {
                        hjwt hjwt6 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                        hjwx hjwx3 = hjwt6.e == null ? hjwx.a : hjwt6.e;
                        gftb.r(((boolean)(hjwx3.c.isEmpty() ^ 1)), "Secure Element Card Id shouldn\'t be empty.");
                        Iterator iterator0 = gged5.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                goto label_363;
                            }
                            Object object0 = iterator0.next();
                            dylc dylc0 = (dylc)object0;
                            if(hjwx3.c.equals(dylc0.d)) {
                                dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                                if((hjww.b(hjwx3.b) == null ? hjww.l : hjww.b(hjwx3.b)) == fsiu.a.get(dyna0)) {
                                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)dylf.a).v_newBuilder();
                                    if(!hftp11.b_message.isImmutable()) {
                                        hftp11.ensureMutable();
                                    }
                                    dylf dylf0 = (dylf)hftp11.b_message;
                                    dylc0.getClass();
                                    dylf0.d = dylc0;
                                    dylf0.b |= 2;
                                    hjqn hjqn0 = hkhr0.e == null ? hjqn.a : hkhr0.e;
                                    if(!hftp11.b_message.isImmutable()) {
                                        hftp11.ensureMutable();
                                    }
                                    dylf dylf1 = (dylf)hftp11.b_message;
                                    hjqn0.getClass();
                                    dylf1.c = hjqn0;
                                    dylf1.b |= 1;
                                    dylf dylf2 = (dylf)hftp11.N_build();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dxev dxev7 = (dxev)hftp0.b_message;
                                    dylf2.getClass();
                                    dxev7.g = dylf2;
                                    dxev7.b |= 8;
                                    hashSet0.remove(dylc0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            else {
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                hjwq hjwq0 = hjwt0.d == null ? hjwq.a : hjwt0.d;
                int v2 = ((ggna)gged0).c;
                String s2 = hjwq0.b;
                int v3 = 0;
                while(v3 < v2) {
                    gged3 = gged0;
                    CardInfo cardInfo0 = (CardInfo)gged0.get(v3);
                    gged4 = gged1;
                    String s3 = cardInfo0.a;
                    ++v3;
                    if(s2.equals(s3)) {
                        hkhr hkhr1 = ((dxev)hftp0.b_message).c;
                        if(hkhr1 == null) {
                            hkhr1 = hkhr.b;
                        }
                        TokenStatus tokenStatus0 = cardInfo0.g;
                        if(tokenStatus0 == null) {
                            gged5 = gged2;
                            hkiq0 = hkiq.a;
                        }
                        else {
                            gged5 = gged2;
                            switch(tokenStatus0.b) {
                                case 3: {
                                    hkiq0 = hkiq.b;
                                    break;
                                }
                                case 4: {
                                    hkiq0 = hkiq.e;
                                    break;
                                }
                                case 5: {
                                    hkiq0 = hkiq.d;
                                    break;
                                }
                                case 2: 
                                case 6: {
                                    hkiq0 = hkiq.c;
                                    break;
                                }
                                default: {
                                    hkiq0 = hkiq.a;
                                }
                            }
                        }
                        hkhh hkhh0 = hkhr1.q == null ? hkhh.a : hkhr1.q;
                        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                        v4 = v;
                        if(hkiq0 == (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h))) {
                            getAllCardsResponse1 = getAllCardsResponse0;
                            v5 = v1;
                        }
                        else {
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hkhr1).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)hkhr1));
                            hkhh hkhh1 = hkhr1.q == null ? hkhh.a : hkhr1.q;
                            getAllCardsResponse1 = getAllCardsResponse0;
                            v5 = v1;
                            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hkhh1).jf(5, null);
                            hftp2.X(((ProtoLiteMessage)hkhh1));
                            hkhh hkhh2 = hkhr1.q == null ? hkhh.a : hkhr1.q;
                            hkir hkir1 = hkhh2.g == null ? hkir.a : hkhh2.g;
                            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hkir1).jf(5, null);
                            hftp3.X(((ProtoLiteMessage)hkir1));
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            hkir hkir2 = (hkir)hftp3.b_message;
                            hkir2.h = hkiq0.a();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            hkhh hkhh3 = (hkhh)hftp2.b_message;
                            hkir hkir3 = (hkir)hftp3.N_build();
                            hkir3.getClass();
                            hkhh3.g = hkir3;
                            hkhh3.b |= 2;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hkhr hkhr2 = (hkhr)hftp1.b_message;
                            hkhh hkhh4 = (hkhh)hftp2.N_build();
                            hkhh4.getClass();
                            hkhr2.q = hkhh4;
                            hkhr2.c |= 0x20;
                            hkhr1 = (hkhr)hftp1.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dxev dxev1 = (dxev)hftp0.b_message;
                            hkhr1.getClass();
                            dxev1.c = hkhr1;
                            dxev1.b |= 1;
                        }
                        if(hkiq0 != hkiq.a) {
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)dxet.a).v_newBuilder();
                            boolean z = s3.equals(s);
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((dxet)hftp4.b_message).c = z;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dxev dxev2 = (dxev)hftp0.b_message;
                            dxet dxet0 = (dxet)hftp4.N_build();
                            dxet0.getClass();
                            dxev2.d = dxet0;
                            dxev2.b |= 2;
                        }
                        hkhh hkhh5 = hkhr1.q;
                        if(((hkhh5 == null ? hkhh.a : hkhh5).b & 2) == 0) {
                            hkim1 = hkim.a;
                        }
                        else {
                            hkhh hkhh6 = hkhh5 == null ? hkhh.a : hkhh5;
                            hkim hkim0 = hkim.b((hkhh6.g == null ? hkir.a : hkhh6.g).e);
                            hkim1 = hkim0 == null ? hkim.r : hkim0;
                        }
                        if(((hkhh5 == null ? hkhh.a : hkhh5).b & 2) == 0) {
                            hktu1 = hktu.a;
                        }
                        else {
                            if(hkhh5 == null) {
                                hkhh5 = hkhh.a;
                            }
                            hktu hktu0 = hktu.b((hkhh5.g == null ? hkir.a : hkhh5.g).f);
                            hktu1 = hktu0 == null ? hktu.D : hktu0;
                        }
                        hkim hkim2 = hkim.q;
                        if(hkim1.equals(hkim2) || hktu1.equals(hktu.C) || hkim1.equals(hkim.p) || hktu1.equals(hktu.B)) {
                            if(tokenStatus0.b == 6) {
                                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)dxet.a).v_newBuilder();
                                if(!hftp5.b_message.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                ((dxet)hftp5.b_message).b = true;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                dxev dxev3 = (dxev)hftp0.b_message;
                                dxet dxet1 = (dxet)hftp5.N_build();
                                dxet1.getClass();
                                dxev3.d = dxet1;
                                dxev3.b |= 2;
                            }
                            else if(sparseArray0.size() > 0) {
                                hkhr hkhr3 = ((dxev)hftp0.b_message).c;
                                if(hkhr3 == null) {
                                    hkhr3 = hkhr.b;
                                }
                                hkhh hkhh7 = hkhr3.q == null ? hkhh.a : hkhr3.q;
                                hkir hkir4 = hkhh7.g == null ? hkir.a : hkhh7.g;
                                hktu hktu2 = hktu.a;
                                if((hktu.b(hkir4.f) == null ? hktu.D : hktu.b(hkir4.f)).equals(hktu2)) {
                                    hkhh hkhh9 = hkhr3.q;
                                    if(((hkhh9 == null ? hkhh.a : hkhh9).b & 2) == 0) {
                                        hkim4 = hkim.a;
                                    }
                                    else {
                                        if(hkhh9 == null) {
                                            hkhh9 = hkhh.a;
                                        }
                                        hkim hkim3 = hkim.b((hkhh9.g == null ? hkir.a : hkhh9.g).e);
                                        hkim4 = hkim3 == null ? hkim.r : hkim3;
                                    }
                                    z1 = hkim2.equals(hkim4);
                                }
                                else {
                                    hkhh hkhh8 = hkhr3.q == null ? hkhh.a : hkhr3.q;
                                    hkir hkir5 = hkhh8.g == null ? hkir.a : hkhh8.g;
                                    z1 = (hktu.b(hkir5.f) == null ? hktu.D : hktu.b(hkir5.f)).equals(hktu.C);
                                }
                                if(z1) {
                                    String s4 = (String)sparseArray0.get(1);
                                    if(!gfta.c(s4)) {
                                        hkhr hkhr4 = ((dxev)hftp0.b_message).c;
                                        if(hkhr4 == null) {
                                            hkhr4 = hkhr.b;
                                        }
                                        hjwt hjwt1 = hkhr4.d == null ? hjwt.a : hkhr4.d;
                                        if((hjwt1.d == null ? hjwq.a : hjwt1.d).b.equals(s4)) {
                                            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)dxet.a).v_newBuilder();
                                            if(!hftp6.b_message.isImmutable()) {
                                                hftp6.ensureMutable();
                                            }
                                            ((dxet)hftp6.b_message).c = true;
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            dxev dxev4 = (dxev)hftp0.b_message;
                                            dxet dxet2 = (dxet)hftp6.N_build();
                                            dxet2.getClass();
                                            dxev4.d = dxet2;
                                            dxev4.b |= 2;
                                        }
                                    }
                                }
                                else {
                                    hkhr hkhr5 = ((dxev)hftp0.b_message).c;
                                    if(hkhr5 == null) {
                                        hkhr5 = hkhr.b;
                                    }
                                    hkhh hkhh10 = hkhr5.q == null ? hkhh.a : hkhr5.q;
                                    hkir hkir6 = hkhh10.g == null ? hkir.a : hkhh10.g;
                                    if((hktu.b(hkir6.f) == null ? hktu.D : hktu.b(hkir6.f)).equals(hktu2)) {
                                        hkhh hkhh12 = hkhr5.q;
                                        if(((hkhh12 == null ? hkhh.a : hkhh12).b & 2) == 0) {
                                            hkim6 = hkim.a;
                                        }
                                        else {
                                            if(hkhh12 == null) {
                                                hkhh12 = hkhh.a;
                                            }
                                            hkim hkim5 = hkim.b((hkhh12.g == null ? hkir.a : hkhh12.g).e);
                                            hkim6 = hkim5 == null ? hkim.r : hkim5;
                                        }
                                        z2 = hkim.p.equals(hkim6);
                                    }
                                    else {
                                        hkhh hkhh11 = hkhr5.q == null ? hkhh.a : hkhr5.q;
                                        hkir hkir7 = hkhh11.g == null ? hkir.a : hkhh11.g;
                                        z2 = (hktu.b(hkir7.f) == null ? hktu.D : hktu.b(hkir7.f)).equals(hktu.B);
                                    }
                                    if(z2) {
                                        String s5 = (String)sparseArray0.get(2);
                                        if(!gfta.c(s5)) {
                                            hkhr hkhr6 = ((dxev)hftp0.b_message).c;
                                            if(hkhr6 == null) {
                                                hkhr6 = hkhr.b;
                                            }
                                            hjwt hjwt2 = hkhr6.d == null ? hjwt.a : hkhr6.d;
                                            if((hjwt2.d == null ? hjwq.a : hjwt2.d).b.equals(s5)) {
                                                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)dxet.a).v_newBuilder();
                                                if(!hftp7.b_message.isImmutable()) {
                                                    hftp7.ensureMutable();
                                                }
                                                ((dxet)hftp7.b_message).c = true;
                                                if(!hftp0.b_message.isImmutable()) {
                                                    hftp0.ensureMutable();
                                                }
                                                dxev dxev5 = (dxev)hftp0.b_message;
                                                dxet dxet3 = (dxet)hftp7.N_build();
                                                dxet3.getClass();
                                                dxev5.d = dxet3;
                                                dxev5.b |= 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        TransactionInfo transactionInfo0 = cardInfo0.n;
                        if(transactionInfo0 != null) {
                            switch(transactionInfo0.d) {
                                case 2: {
                                    v6 = 3;
                                    break;
                                }
                                case 3: {
                                    v6 = 4;
                                    break;
                                }
                                case 4: {
                                    v6 = 5;
                                    break;
                                }
                                default: {
                                    v6 = 2;
                                }
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((dxev)hftp0.b_message).f = v6 - 2;
                        }
                        if(!hwfk.a.b().bB()) {
                            hkhr hkhr7 = ((dxev)hftp0.b_message).c;
                            if(hkhr7 == null) {
                                hkhr7 = hkhr.b;
                            }
                            SeInfo seInfo0 = cardInfo0.R;
                            ibuq.f(hkhr7, "<this>");
                            if(((hkhr7.d == null ? hjwt.a : hkhr7.d).b & 4) != 0) {
                                String s6 = seInfo0 == null ? null : seInfo0.e;
                                if(s6 != null && s6.length() != 0) {
                                    ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)hkhr7).jf(5, null);
                                    hftp8.X(((ProtoLiteMessage)hkhr7));
                                    ibuq.f(hftp8, "builder");
                                    hjwt hjwt3 = ((hkhr)hftp8.b_message).d;
                                    if(hjwt3 == null) {
                                        hjwt3 = hjwt.a;
                                    }
                                    ibuq.e(hjwt3, "getId(...)");
                                    ProtoLiteBuilder hftp9 = (ProtoLiteBuilder)((ProtoLiteMessage)hjwt3).jf(5, null);
                                    hftp9.X(((ProtoLiteMessage)hjwt3));
                                    ibuq.f(hftp9, "builder");
                                    hjwx hjwx0 = ((hjwt)hftp9.b_message).e;
                                    if(hjwx0 == null) {
                                        hjwx0 = hjwx.a;
                                    }
                                    ibuq.e(hjwx0, "getSecureElementCardId(...)");
                                    ProtoLiteBuilder hftp10 = (ProtoLiteBuilder)((ProtoLiteMessage)hjwx0).jf(5, null);
                                    hftp10.X(((ProtoLiteMessage)hjwx0));
                                    hjwz hjwz0 = hjwy.a(hftp10);
                                    hjwz0.b(s6);
                                    hjwx hjwx1 = hjwz0.a();
                                    ibuq.f(hjwx1, "value");
                                    if(!hftp9.b_message.isImmutable()) {
                                        hftp9.ensureMutable();
                                    }
                                    hjwt hjwt4 = (hjwt)hftp9.b_message;
                                    hjwx1.getClass();
                                    hjwt4.e = hjwx1;
                                    hjwt4.b |= 4;
                                    ProtoLiteMessage hftv1 = hftp9.N_build();
                                    ibuq.e(hftv1, "build(...)");
                                    ibuq.f(((hjwt)hftv1), "value");
                                    if(!hftp8.b_message.isImmutable()) {
                                        hftp8.ensureMutable();
                                    }
                                    hkhr hkhr8 = (hkhr)hftp8.b_message;
                                    ((hjwt)hftv1).getClass();
                                    hkhr8.d = (hjwt)hftv1;
                                    hkhr8.c |= 1;
                                    ProtoLiteMessage hftv2 = hftp8.N_build();
                                    ibuq.e(hftv2, "build(...)");
                                    hkhr7 = (hkhr)hftv2;
                                }
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dxev dxev6 = (dxev)hftp0.b_message;
                            hkhr7.getClass();
                            dxev6.c = hkhr7;
                            dxev6.b |= 1;
                        }
                        goto label_355;
                    }
                    gged1 = gged4;
                    gged0 = gged3;
                }
                getAllCardsResponse1 = getAllCardsResponse0;
                gged3 = gged0;
                gged4 = gged1;
                gged5 = gged2;
                v4 = v;
                v5 = v1;
            }
        label_355:
            for(Object object1: new hfuh(hkhr0.g, hkhr.a)) {
                if(((hkhq)object1) != hkhq.b) {
                    continue;
                }
                if((((dxev)hftp0.b_message).b & 2) != 0) {
                    ggdy0.i(((dxev)hftp0.N_build()));
                }
                goto label_363;
            }
            ggdy0.i(((dxev)hftp0.N_build()));
        label_363:
            v1 = v5 + 1;
            gged1 = gged4;
            gged0 = gged3;
            gged2 = gged5;
            v = v4;
            getAllCardsResponse0 = getAllCardsResponse1;
        }
        for(Object object2: hashSet0) {
            ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)dxev.a).v_newBuilder();
            ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)dylf.a).v_newBuilder();
            if(!hftp13.b_message.isImmutable()) {
                hftp13.ensureMutable();
            }
            dylf dylf3 = (dylf)hftp13.b_message;
            ((dylc)object2).getClass();
            dylf3.d = (dylc)object2;
            dylf3.b |= 2;
            dylf dylf4 = (dylf)hftp13.N_build();
            if(!hftp12.b_message.isImmutable()) {
                hftp12.ensureMutable();
            }
            dxev dxev8 = (dxev)hftp12.b_message;
            dylf4.getClass();
            dxev8.g = dylf4;
            dxev8.b |= 8;
            ggdy0.i(((dxev)hftp12.N_build()));
        }
        gged_interceptors gged6 = ggdy0.h();
        List list0 = this.k.b(getAllCardsResponse0, gged6);
        gged_interceptors gged7 = gged_interceptors.i(this.d.a().b);
        ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)dxeo.a).v_newBuilder();
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        dxeo dxeo0 = (dxeo)hftp14.b_message;
        dxeo0.b();
        hfrj.E(list0, dxeo0.b);
        String s7 = gfta.b(getAllCardsResponse0.c);
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        ((dxeo)hftp14.b_message).c = s7;
        String s8 = gfta.b(getAllCardsResponse0.d);
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        ((dxeo)hftp14.b_message).d = s8;
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        dxeo dxeo1 = (dxeo)hftp14.b_message;
        hfuo hfuo0 = dxeo1.e;
        if(!hfuo0.c()) {
            dxeo1.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged7, dxeo1.e);
        String s9 = gfta.b(getAllCardsResponse0.g);
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        ((dxeo)hftp14.b_message).f = s9;
        return (dxeo)hftp14.N_build();
    }

    // Detected as a lambda impl.
    final void b(dxeo dxeo0, boolean z) {
        try {
            dmuj dmuj0 = this.f;
            gged_interceptors gged0 = gged_interceptors.B(hkid.f, hkid.j, hkid.k, hkid.l, hkid.m, hkid.b, hkid.g, hkid.c, hkid.h, hkid.s, hkid.r, hkid.w, new hkid[]{hkid.x});
            hkgt hkgt0 = (hkgt)((ProtoLiteMessage)hkgu.a).v_newBuilder();
            ByteString hfsf0 = dmuj0.a();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            ((hkgu)hkgt0.b_message).d = hfsf0;
            hjwr hjwr0 = dmuj0.b.a();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            hkgu hkgu0 = (hkgu)hkgt0.b_message;
            hjwr0.getClass();
            hkgu0.e = hjwr0;
            hkgu0.b |= 2;
            hkgt0.a(gged0);
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            hkgu hkgu1 = (hkgu)hkgt0.b_message;
            hkgu1.b |= 4;
            hkgu1.f = true;
            boolean z1 = hwev.c();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            ((hkgu)hkgt0.b_message).g = z1;
            hkgu hkgu2 = (hkgu)((ProtoLiteBuilder)hkgt0).N_build();
            hkgv hkgv0 = (hkgv)dptv.e(dmuj0.a, dpuj.ar, ((MessageLite)hkgu2), ((MessageLite)hkgv.a));
            dypr dypr0 = this.j;
            gged_interceptors gged1 = gged_interceptors.h(gggq.d(hkgv0.c, new dypq()));
            ggek ggek0 = new ggek();
            for(Object object0: gged1) {
                hkhr hkhr0 = (hkhr)object0;
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                if((hjwt0.b & 4) != 0) {
                    ggek0.i((hjwt0.e == null ? hjwx.a : hjwt0.e), (hkhr0.e == null ? hjqn.a : hkhr0.e));
                }
            }
            ggeo ggeo0 = ggek0.b();
            if(!ggeo0.isEmpty()) {
                dypo dypo0 = dypr0.b;
                gged_interceptors gged2 = dypo0.d();
                if(!gged2.isEmpty()) {
                    int v = ((ggna)gged2).c;
                    for(int v1 = 0; v1 < v; ++v1) {
                        dylc dylc0 = (dylc)gged2.get(v1);
                        dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                        hjww hjww0 = (hjww)fsiu.a.get(dyna0);
                        if(hjww0 == null) {
                            hjww0 = hjww.a;
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjwx.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjwx hjwx0 = (hjwx)hftp0.b_message;
                        hjwx0.b = hjww0.a();
                        String s = dylc0.d;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjwx hjwx1 = (hjwx)hftp0.b_message;
                        s.getClass();
                        hjwx1.c = s;
                        hjqn hjqn0 = (hjqn)ggeo0.get(((hjwx)hftp0.N_build()));
                        if(hjqn0 != null && !dypo0.l(dylc0, hjqn0)) {
                            ((ggtj)((ggtj)dypr.a.j()).ar(11705)).R("Could not update the gpm ID for %s with card id %s", (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).name(), dylc0.d);
                        }
                    }
                }
            }
            gged_interceptors gged3 = dmue.f(dxeo0.b, hkgv0);
            if(!dmue.c(dxeo0.b, dxeo0.e, hkgv0.b, gged3)) {
                dxeq dxeq0 = (dxeq)((ProtoLiteMessage)dxer.a).v_newBuilder();
                dxeq0.a(hkgv0.b);
                dxer dxer0 = (dxer)((ProtoLiteBuilder)dxeq0).N_build();
                this.d.f(dxer0);
                this.e.d(gged3);
                if(hwsd.Q()) {
                    dxzo dxzo0 = this.l;
                    List list0 = (List)Collection.-EL.stream(gged3).map(new dmty()).collect(ggaf.a);
                    ibuq.f(list0, "currentClientPaymentMethods");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: list0) {
                        hkhh hkhh0 = ((hkhr)object1).q;
                        if(hkhh0 == null) {
                            hkhh0 = hkhh.a;
                        }
                        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                        String s1 = hkir0.c.length() == 0 ? null : hkir0.c;
                        if(s1 != null) {
                            arrayList0.add(s1);
                        }
                    }
                    dxzl dxzl0 = new dxzl(new dxzk(ibpo.ay(arrayList0)));
                    edng.a(dxzo0.b.b(dxzl0, dxzo0.a));
                }
                if(z) {
                    this.h.a();
                }
            }
        }
        catch(IOException | InterruptedException | ExecutionException | TimeoutException | dpuk exception0) {
            a.ae(dmue.c.i(), "Failed to refresh payment method.", exception0);
        }
    }

    static boolean c(List list0, List list1, List list2, gged_interceptors gged0) {
        if(!list1.equals(list2)) {
            return false;
        }
        if(list0.size() != ((ggna)gged0).c) {
            return false;
        }
        for(Object object0: list0) {
            gfsx gfsx0 = gggq.c(gged0, new dmtx(((dxev)object0)));
            if(gfsx0.i()) {
                hkhr hkhr0 = ((dxev)object0).c;
                if(hkhr0 == null) {
                    hkhr0 = hkhr.b;
                }
                hkhr hkhr1 = ((dxes)gfsx0.d()).c;
                if(hkhr1 == null) {
                    hkhr1 = hkhr.b;
                }
                if(!dnpx.h(hkhr0, hkhr1)) {
                    return false;
                }
                continue;
            }
            return false;
        }
        return true;
    }

    public final boolean d(hjqn hjqn0) {
        if(!((ProtoLiteMessage)hjqn0).equals(hjqn.a)) {
            dmtn dmtn0 = this.e;
            gged_interceptors gged0 = dmtn0.b();
            gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(gged0).filter(new dmuc(hjqn0)).collect(ggaf.a);
            if(((ggna)gged0).c != gged1.size()) {
                dmtn0.d(gged1);
                return true;
            }
        }
        return false;
    }

    public final void e(dxeo dxeo0) {
        dmtz dmtz0 = () -> try {
            dmuj dmuj0 = this.f;
            gged_interceptors gged0 = gged_interceptors.B(hkid.f, hkid.j, hkid.k, hkid.l, hkid.m, hkid.b, hkid.g, hkid.c, hkid.h, hkid.s, hkid.r, hkid.w, new hkid[]{hkid.x});
            hkgt hkgt0 = (hkgt)((ProtoLiteMessage)hkgu.a).v_newBuilder();
            ByteString hfsf0 = dmuj0.a();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            ((hkgu)hkgt0.b_message).d = hfsf0;
            hjwr hjwr0 = dmuj0.b.a();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            hkgu hkgu0 = (hkgu)hkgt0.b_message;
            hjwr0.getClass();
            hkgu0.e = hjwr0;
            hkgu0.b |= 2;
            hkgt0.a(gged0);
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            hkgu hkgu1 = (hkgu)hkgt0.b_message;
            hkgu1.b |= 4;
            hkgu1.f = true;
            boolean z1 = hwev.c();
            if(!hkgt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgt0).ensureMutable();
            }
            ((hkgu)hkgt0.b_message).g = z1;
            hkgu hkgu2 = (hkgu)((ProtoLiteBuilder)hkgt0).N_build();
            hkgv hkgv0 = (hkgv)dptv.e(dmuj0.a, dpuj.ar, ((MessageLite)hkgu2), ((MessageLite)hkgv.a));
            dypr dypr0 = this.j;
            gged_interceptors gged1 = gged_interceptors.h(gggq.d(hkgv0.c, new dypq()));
            ggek ggek0 = new ggek();
            for(Object object0: gged1) {
                hkhr hkhr0 = (hkhr)object0;
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                if((hjwt0.b & 4) != 0) {
                    ggek0.i((hjwt0.e == null ? hjwx.a : hjwt0.e), (hkhr0.e == null ? hjqn.a : hkhr0.e));
                }
            }
            ggeo ggeo0 = ggek0.b();
            if(!ggeo0.isEmpty()) {
                dypo dypo0 = dypr0.b;
                gged_interceptors gged2 = dypo0.d();
                if(!gged2.isEmpty()) {
                    int v = ((ggna)gged2).c;
                    for(int v1 = 0; v1 < v; ++v1) {
                        dylc dylc0 = (dylc)gged2.get(v1);
                        dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                        hjww hjww0 = (hjww)fsiu.a.get(dyna0);
                        if(hjww0 == null) {
                            hjww0 = hjww.a;
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjwx.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjwx hjwx0 = (hjwx)hftp0.b_message;
                        hjwx0.b = hjww0.a();
                        String s = dylc0.d;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hjwx hjwx1 = (hjwx)hftp0.b_message;
                        s.getClass();
                        hjwx1.c = s;
                        hjqn hjqn0 = (hjqn)ggeo0.get(((hjwx)hftp0.N_build()));
                        if(hjqn0 != null && !dypo0.l(dylc0, hjqn0)) {
                            ((ggtj)((ggtj)dypr.a.j()).ar(11705)).R("Could not update the gpm ID for %s with card id %s", (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).name(), dylc0.d);
                        }
                    }
                }
            }
            gged_interceptors gged3 = dmue.f(dxeo0.b, hkgv0);
            if(!dmue.c(dxeo0.b, dxeo0.e, hkgv0.b, gged3)) {
                dxeq dxeq0 = (dxeq)((ProtoLiteMessage)dxer.a).v_newBuilder();
                dxeq0.a(hkgv0.b);
                dxer dxer0 = (dxer)((ProtoLiteBuilder)dxeq0).N_build();
                this.d.f(dxer0);
                this.e.d(gged3);
                if(hwsd.Q()) {
                    dxzo dxzo0 = this.l;
                    List list0 = (List)Collection.-EL.stream(gged3).map(new dmty()).collect(ggaf.a);
                    ibuq.f(list0, "currentClientPaymentMethods");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: list0) {
                        hkhh hkhh0 = ((hkhr)object1).q;
                        if(hkhh0 == null) {
                            hkhh0 = hkhh.a;
                        }
                        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                        String s1 = hkir0.c.length() == 0 ? null : hkir0.c;
                        if(s1 != null) {
                            arrayList0.add(s1);
                        }
                    }
                    dxzl dxzl0 = new dxzl(new dxzk(ibpo.ay(arrayList0)));
                    edng.a(dxzo0.b.b(dxzl0, dxzo0.a));
                }
                if(true) {
                    this.h.a();
                }
            }
        }
        catch(IOException | InterruptedException | ExecutionException | TimeoutException | dpuk exception0) {
            a.ae(dmue.c.i(), "Failed to refresh payment method.", exception0);
        };
        this.g.execute(dmtz0);
    }

    static final gged_interceptors f(List list0, hkgv hkgv0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: hkgv0.c) {
            hkhr hkhr0 = (hkhr)object0;
            gfsx gfsx0 = gggq.c(list0, new dmua(hkhr0));
            if(gfsx0.i()) {
            label_10:
                String s = gfsx0.i() ? ((dxev)gfsx0.d()).e : UUID.randomUUID().toString();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxes.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((dxes)hftv0).d = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dxes dxes0 = (dxes)hftp0.b_message;
                hkhr0.getClass();
                dxes0.c = hkhr0;
                dxes0.b |= 1;
                ggdy0.i(((dxes)hftp0.N_build()));
            }
            else {
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                hjwx hjwx0 = hjwt0.e == null ? hjwx.a : hjwt0.e;
                if(!dylv.a.contains((hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b))) || !Collection.-EL.stream(list0).noneMatch(new dmub(hkhr0))) {
                    goto label_10;
                }
            }
        }
        return ggdy0.h();
    }
}

