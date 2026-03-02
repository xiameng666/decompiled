import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..time.Duration;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class dmmi {
    private final azts a;

    public dmmi(azts azts0) {
        this.a = azts0;
    }

    public final Object a(Account[] arr_account, ibrl ibrl0) {
        Account[] arr_account2;
        Object object3;
        Object object2;
        int v2;
        int v1;
        Account[] arr_account1;
        dmme dmme0;
        if((ibrl0 instanceof dmme)) {
            dmme0 = (dmme)ibrl0;
            int v = dmme0.g;
            if((v & 0x80000000) == 0) {
                dmme0 = new dmme(this, ibrl0);
            }
            else {
                dmme0.g = v - 0x80000000;
            }
        }
        else {
            dmme0 = new dmme(this, ibrl0);
        }
        Object object0 = dmme0.e;
        Object object1 = ibrx.a;
        switch(dmme0.g) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList(arr_account.length);
                arr_account1 = arr_account;
                v1 = arr_account.length;
                v2 = 0;
                object2 = arrayList0;
                goto label_30;
            }
            case 1: {
                v1 = dmme0.d;
                v2 = dmme0.c;
                object2 = dmme0.b;
                object3 = dmme0.a;
                arr_account2 = dmme0.h;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ((Collection)object2).add(((List)object0));
            ++v2;
            object2 = object3;
            arr_account1 = arr_account2;
        label_30:
            if(v2 >= v1) {
                break;
            }
            dmme0.h = arr_account1;
            dmme0.a = object2;
            dmme0.b = object2;
            dmme0.c = v2;
            dmme0.d = v1;
            dmme0.g = 1;
            Object object4 = this.b(arr_account1[v2], dmme0);
            if(object4 != object1) {
                arr_account2 = arr_account1;
                object0 = object4;
                object3 = object2;
                continue;
            }
            return object1;
        }
        return ibpo.r(((Iterable)object2));
    }

    public final Object b(Account account0, ibrl ibrl0) {
        Object object2;
        dmmf dmmf0;
        if((ibrl0 instanceof dmmf)) {
            dmmf0 = (dmmf)ibrl0;
            int v = dmmf0.d;
            if((v & 0x80000000) == 0) {
                dmmf0 = new dmmf(this, ibrl0);
            }
            else {
                dmmf0.d = v - 0x80000000;
            }
        }
        else {
            dmmf0 = new dmmf(this, ibrl0);
        }
        Object object0 = dmmf0.b;
        Object object1 = ibrx.a;
        switch(dmmf0.d) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.a.aw(account0);
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmmf0.a = account0;
                dmmf0.d = 1;
                object2 = fsdk.b(evql0, duration0, dmmf0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = dmmf0.a;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        if(((ProtoSafeParcelable)object2) != null) {
            ibuq.e(fsym.a, "getDefaultInstance(...)");
            fsym fsym0 = (fsym)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)fsym.a));
            if(fsym0 != null) {
                hfuo hfuo0 = fsym0.b;
                if(hfuo0 != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object3: hfuo0) {
                        gtkg gtkg0 = ((fsyk)object3).e;
                        if(gtkg0 == null) {
                            gtkg0 = gtkg.a;
                        }
                        gtkb gtkb0 = gtkg0.v == null ? gtkb.b : gtkg0.v;
                        if((gtls.b(gtkb0.e) == null ? gtls.h : gtls.b(gtkb0.e)) == gtls.b && gtkb0.g && (gtlq.b(gtkb0.c) == null ? gtlq.f : gtlq.b(gtkb0.c)) == gtlq.c) {
                            gtqj gtqj0 = gtqj.b(gtkg0.g) == null ? gtqj.i : gtqj.b(gtkg0.g);
                            if(edld.a.contains(gtqj0)) {
                                arrayList0.add(object3);
                            }
                        }
                    }
                    Object object4 = new ArrayList(ibpo.q(arrayList0, 10));
                    for(Object object5: arrayList0) {
                        ibuq.c(((fsyk)object5));
                        ((Collection)object4).add(new dmlx(account0, ((fsyk)object5)));
                    }
                    return object4;
                }
            }
        }
        return ibps.a;
    }

    public final Object c(dmlx dmlx0, ibrl ibrl0) {
        dmmg dmmg0;
        if((ibrl0 instanceof dmmg)) {
            dmmg0 = (dmmg)ibrl0;
            int v = dmmg0.c;
            if((v & 0x80000000) == 0) {
                dmmg0 = new dmmg(this, ibrl0);
            }
            else {
                dmmg0.c = v - 0x80000000;
            }
        }
        else {
            dmmg0 = new dmmg(this, ibrl0);
        }
        Object object0 = dmmg0.a;
        Object object1 = ibrx.a;
        switch(dmmg0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.a.an(dmlx0.a, (dmlx0.b.e == null ? gtkg.a : dmlx0.b.e).e, 3);
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmmg0.c = 1;
                Object object2 = fsdk.b(evql0, duration0, dmmg0);
                return object2 == object1 ? object1 : Boolean.valueOf(ibnw.b(object2));
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(ibnw.b(((ibnw)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(List list0, ibrl ibrl0) {
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        dmmh dmmh0;
        if((ibrl0 instanceof dmmh)) {
            dmmh0 = (dmmh)ibrl0;
            int v = dmmh0.g;
            if((v & 0x80000000) == 0) {
                dmmh0 = new dmmh(this, ibrl0);
            }
            else {
                dmmh0.g = v - 0x80000000;
            }
        }
        else {
            dmmh0 = new dmmh(this, ibrl0);
        }
        Object object0 = dmmh0.e;
        Object object1 = ibrx.a;
        switch(dmmh0.g) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    if((object2 instanceof dmlx)) {
                        arrayList0.add(object2);
                    }
                }
                if(arrayList0.isEmpty()) {
                    return dmls.a;
                }
                object3 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList0, 10)), 16));
                object4 = arrayList0.iterator();
                goto label_33;
            }
            case 1: {
                object5 = dmmh0.d;
                object3 = dmmh0.c;
                object4 = dmmh0.b;
                object6 = dmmh0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ((Map)object3).put(object5, ((Boolean)object0));
            object3 = object6;
        label_33:
            if(!((Iterator)object4).hasNext()) {
                break;
            }
            object5 = ((Iterator)object4).next();
            dmmh0.a = object3;
            dmmh0.b = object4;
            dmmh0.c = object3;
            dmmh0.d = object5;
            dmmh0.g = 1;
            object0 = this.c(((dmlx)object5), dmmh0);
            if(object0 != object1) {
                object6 = object3;
                continue;
            }
            return object1;
        }
        Set set0 = ((Map)object3).entrySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object7: set0) {
            Boolean boolean0 = (Boolean)((Map.Entry)object7).getValue();
            Object object8 = linkedHashMap0.get(boolean0);
            if(object8 == null) {
                object8 = new ArrayList();
                linkedHashMap0.put(boolean0, object8);
            }
            ((List)object8).add(((dmlx)((Map.Entry)object7).getKey()));
        }
        if(hwja.a.b().c()) {
            List list1 = (List)Map.-EL.getOrDefault(linkedHashMap0, Boolean.valueOf(true), ibps.a);
            ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
            for(Object object9: list1) {
                arrayList1.add(((dmlx)object9).a);
            }
            for(Object object10: ibpo.ae(arrayList1)) {
                this.a.ax(((Account)object10));
            }
        }
        return dmlr.b(linkedHashMap0);
    }
}

