import android.accounts.Account;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class bnre implements gfsi {
    public final bnrm a;
    public final gsyz b;
    public final Account c;
    public final gtbr d;

    public bnre(bnrm bnrm0, gsyz gsyz0, Account account0, gtbr gtbr0) {
        this.a = bnrm0;
        this.b = gsyz0;
        this.c = account0;
        this.d = gtbr0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqux[] arr_fqux;
        long v = TimeUnit.MILLISECONDS.toSeconds(this.a.e.d().toEpochMilli());
        gsyz gsyz0 = this.b;
        gtai gtai0 = ((ggeo)object0).containsKey(gsyz0) ? ((gtai)((ggeo)object0).get(gsyz0)) : this.a.i();
        Account account0 = this.c;
        bnry bnry0 = new bnry(v, gtai0);
        ConcurrentMap concurrentMap0 = this.a.b;
        bnrl bnrl0 = concurrentMap0.containsKey(account0) ? ((bnrl)concurrentMap0.get(account0)) : new bnrl(ggfz.c);
        ArrayList arrayList0 = new ArrayList();
        EnumMap enumMap0 = new EnumMap(fquo.class);
        for(Object object1: this.d.b) {
            gtbs gtbs0 = (gtbs)object1;
            if((gtbs0.c == null ? hfwn.a : gtbs0.c).b >= bnry0.a) {
                if((gtbs0.c == null ? hfwn.a : gtbs0.c).b > bnry0.b) {
                    break;
                }
                if((gtbs0.b & 4) != 0) {
                    int v1 = (byte)gtbs0.e;
                    gfsx gfsx0 = fquo.b(((byte)v1));
                    if(gfsx0.i()) {
                        Map.-EL.putIfAbsent(enumMap0, gfsx0.d(), Integer.valueOf(enumMap0.size()));
                    }
                    else {
                        ((ggtj)((ggtj)bnrm.a.j()).p(10)).y("Unrecognized component set id %s", ((byte)v1));
                        continue;
                    }
                }
                arrayList0.add(gtbs0);
            }
        }
        if(enumMap0.isEmpty()) {
            gftb.check(bnrl0.d);
            arr_fqux = (fqux[])Arrays.copyOf(bnrl0.d, bnrl0.d.length + 1);
            arr_fqux[bnrl0.d.length] = fqux.a(gsyz0);
        }
        else {
            gftb.check(bnrl0.d);
            arr_fqux = (fqux[])Arrays.copyOf(bnrl0.d, bnrl0.d.length + enumMap0.size());
            Map.-EL.forEach(enumMap0, new bnrh(bnrl0, arr_fqux, gsyz0));
        }
        int v2 = arrayList0.size();
        long[] arr_v = bnrl0.a;
        gftb.check(arr_v);
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + v2);
        long[] arr_v2 = bnrl0.c;
        gftb.check(arr_v2);
        long[] arr_v3 = Arrays.copyOf(arr_v2, arr_v2.length + v2);
        short[] arr_v4 = bnrl0.b;
        gftb.check(arr_v4);
        short[] arr_v5 = Arrays.copyOf(arr_v4, arr_v4.length + v2);
        int v3 = 0;
        while(v3 < v2) {
            gtbs gtbs1 = (gtbs)arrayList0.get(v3);
            arr_v1[arr_v.length + v3] = bnrm.a((gtbs1.d == null ? gtag.a : gtbs1.d).b);
            arr_v3[arr_v2.length + v3] = (gtbs1.c == null ? hfwn.a : gtbs1.c).b;
            if((gtbs1.b & 4) == 0) {
                arr_v5[arr_v4.length + v3] = (short)bnrl0.d.length;
            }
            else {
                Integer integer0 = (Integer)enumMap0.get(fquo.b(((byte)gtbs1.e)).d());
                gftb.check(integer0);
                arr_v5[arr_v4.length + v3] = (short)(((int)integer0) + bnrl0.d.length);
            }
            ++v3;
            v2 = v2;
            concurrentMap0 = concurrentMap0;
        }
        concurrentMap0.put(account0, new bnrl(arr_v1, arr_v5, arr_v3, arr_fqux));
        return null;
    }
}

