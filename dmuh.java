import android.accounts.Account;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class dmuh {
    private static final bboh a;
    private final Account b;
    private final eeeg c;
    private final etgl d;

    static {
        dmuh.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmuh(Account account0, etgl etgl0, eeeg eeeg0) {
        this.b = account0;
        this.d = etgl0;
        this.c = eeeg0;
    }

    public static gged_interceptors a(List list0) {
        String s;
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < list0.size(); ++v) {
            dxev dxev0 = (dxev)list0.get(v);
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hjqn hjqn0 = hkhr0.e == null ? hjqn.a : hkhr0.e;
            SortItem sortItem0 = new SortItem();
            sortItem0.b = (long)v;
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hjqn hjqn1 = hkhr1.e == null ? hjqn.a : hkhr1.e;
            if(hjqn1.b.isEmpty()) {
                s = hjqn1.c.isEmpty() ? dmuh.c(dxev0) : hjqn1.c;
            }
            else {
                s = hjqn1.b;
            }
            sortItem0.a = s;
            sortItem0.c = hjqn0.c;
            ggdy0.i(sortItem0);
        }
        return ggdy0.h();
    }

    final List b(GetAllCardsResponse getAllCardsResponse0, List list0) {
        gged_interceptors gged0;
        String s1;
        ggek ggek0 = new ggek();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            dxev dxev0 = (dxev)object0;
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhj hkhj0 = hkhr1.u == null ? hkhj.a : hkhr1.u;
            if((hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)) == hkhm.g && (hkhj0.b & 1) != 0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtlg.a).v_newBuilder();
                String s = (hkhj0.c == null ? hjws.a : hkhj0.c).c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((gtlg)hftv0).c = s;
                long v = (hkhj0.c == null ? hjws.a : hkhj0.c).b;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gtlg)hftp0.b_message).b = v;
                gtlg gtlg0 = (gtlg)hftp0.N_build();
                hkhr hkhr2 = dxev0.c == null ? hkhr.b : dxev0.c;
                hjqn hjqn0 = hkhr2.e == null ? hjqn.a : hkhr2.e;
                if(hjqn0.b.isEmpty()) {
                    s1 = hjqn0.c.isEmpty() ? null : hjqn0.c;
                }
                else {
                    s1 = hjqn0.b;
                }
                if(s1 != null) {
                    ggek0.i(s1, fscd.c(gtlg0));
                }
            }
        }
        ggeo ggeo0 = ggek0.b();
        try {
            gged0 = this.c.a(2);
        }
        catch(dmhl dmhl0) {
            a.ae(dmuh.a.j(), "Could not get sort items from database.", dmhl0);
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(list0);
        int v1 = arrayList0.size();
        HashMap hashMap0 = ggkm.k(v1 + v1);
        int v2 = arrayList0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            dxev dxev1 = (dxev)arrayList0.get(v4);
            hkhr hkhr3 = dxev1.c == null ? hkhr.b : dxev1.c;
            hjqn hjqn1 = hkhr3.e == null ? hjqn.a : hkhr3.e;
            if(!hjqn1.b.isEmpty()) {
                hashMap0.put(hjqn1.b, dxev1);
            }
            if(!hjqn1.c.isEmpty()) {
                hashMap0.put(hjqn1.c, dxev1);
            }
            dylf dylf0 = dxev1.g == null ? dylf.a : dxev1.g;
            if(!(dylf0.d == null ? dylc.a : dylf0.d).d.isEmpty()) {
                hashMap0.put(dmuh.c(dxev1), dxev1);
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v5 = ((ggna)gged0).c;
        for(int v6 = 0; v6 < v5; ++v6) {
            SortItem sortItem0 = (SortItem)gged0.get(v6);
            dxev dxev2 = hashMap0.containsKey(sortItem0.a) ? ((dxev)hashMap0.get(sortItem0.a)) : ((dxev)hashMap0.get(sortItem0.c));
            if(dxev2 != null) {
                arrayList1.add(dxev2);
                arrayList0.remove(dxev2);
            }
        }
        if(arrayList1.isEmpty()) {
            int v7 = arrayList0.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                dxev dxev3 = (dxev)arrayList0.get(v8);
                hkhr hkhr4 = dxev3.c == null ? hkhr.b : dxev3.c;
                hjwt hjwt0 = hkhr4.d == null ? hjwt.a : hkhr4.d;
                if((hjwt0.b & 2) != 0 && (hjwt0.d == null ? hjwq.a : hjwt0.d).b.equals(getAllCardsResponse0.c)) {
                    arrayList1.add(0, dxev3);
                }
                else {
                    arrayList1.add(dxev3);
                }
            }
        }
        else {
            arrayList1.addAll(arrayList0);
        }
        try {
            gged_interceptors gged1 = dmuh.a(arrayList1);
            int v9 = ((ggna)gged1).c;
            ArrayList arrayList2 = new ArrayList(v9);
            for(int v3 = 0; v3 < v9; ++v3) {
                String s2 = ((SortItem)gged1.get(v3)).a;
                String s3 = (String)ggeo0.getOrDefault(s2, "");
                etrt etrt0 = new etrt();
                etrt0.a(s2);
                etrt0.a.h = s3;
                arrayList2.add(etrt0.a);
            }
            this.d.dj(2, this.b, arrayList2);
            if(!ggia.i(gged1, gged0)) {
                this.c.b(2, gged1);
                return gged_interceptors.i(arrayList1);
            }
        }
        catch(dmhl dmhl1) {
            a.ae(dmuh.a.j(), "Could not write the sort order.", dmhl1);
            return gged_interceptors.i(arrayList1);
        }
        return gged_interceptors.i(arrayList1);
    }

    private static String c(dxev dxev0) {
        dylf dylf0 = dxev0.g == null ? dylf.a : dxev0.g;
        dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
        dylf dylf1 = dxev0.g == null ? dylf.a : dxev0.g;
        return (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).name() + (dylf1.d == null ? dylc.a : dylf1.d).d;
    }
}

