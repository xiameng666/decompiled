import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class dmpj {
    private final dmlf a;
    private final azts b;

    public dmpj(azts azts0, dmlf dmlf0) {
        this.b = azts0;
        this.a = dmlf0;
        bboh.b("Pay", bbcu.cZ);
    }

    public final Object a(Account[] arr_account, ibrl ibrl0) {
        Account[] arr_account2;
        Object object3;
        Object object2;
        int v2;
        int v1;
        Account[] arr_account1;
        dmpg dmpg0;
        if((ibrl0 instanceof dmpg)) {
            dmpg0 = (dmpg)ibrl0;
            int v = dmpg0.g;
            if((v & 0x80000000) == 0) {
                dmpg0 = new dmpg(this, ibrl0);
            }
            else {
                dmpg0.g = v - 0x80000000;
            }
        }
        else {
            dmpg0 = new dmpg(this, ibrl0);
        }
        Object object0 = dmpg0.e;
        Object object1 = ibrx.a;
        switch(dmpg0.g) {
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
                v1 = dmpg0.d;
                v2 = dmpg0.c;
                object2 = dmpg0.b;
                object3 = dmpg0.a;
                arr_account2 = dmpg0.h;
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
            dmpg0.h = arr_account1;
            dmpg0.a = object2;
            dmpg0.b = object2;
            dmpg0.c = v2;
            dmpg0.d = v1;
            dmpg0.g = 1;
            Object object4 = this.b(arr_account1[v2], dmpg0);
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
        ibps ibps0;
        Object object2;
        dmph dmph0;
        if((ibrl0 instanceof dmph)) {
            dmph0 = (dmph)ibrl0;
            int v = dmph0.d;
            if((v & 0x80000000) == 0) {
                dmph0 = new dmph(this, ibrl0);
            }
            else {
                dmph0.d = v - 0x80000000;
            }
        }
        else {
            dmph0 = new dmph(this, ibrl0);
        }
        Object object0 = dmph0.b;
        Object object1 = ibrx.a;
        switch(dmph0.d) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.b.aK(account0, 2);
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmph0.a = account0;
                dmph0.d = 1;
                object2 = fsdk.b(evql0, duration0, dmph0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = dmph0.a;
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
        if(((ProtoSafeParcelable)object2) == null) {
            ibps0 = ibps.a;
        }
        else {
            ibuq.e(dxeo.a, "getDefaultInstance(...)");
            dxeo dxeo0 = (dxeo)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)dxeo.a));
            if(dxeo0 == null) {
                ibps0 = ibps.a;
            }
            else {
                hfuo hfuo0 = dxeo0.b;
                if(hfuo0 == null) {
                    ibps0 = ibps.a;
                }
                else {
                    ibps0 = new ArrayList();
                    for(Object object3: hfuo0) {
                        ibuq.c(((dxev)object3));
                        if(dmpj.d(((dxev)object3))) {
                            ibps0.add(object3);
                        }
                    }
                }
            }
        }
        Object object4 = new ArrayList(ibpo.q(ibps0, 10));
        for(Object object5: ibps0) {
            ibuq.c(((dxev)object5));
            if(!dmpj.d(((dxev)object5))) {
                throw new IllegalStateException("Check failed.");
            }
            hkhr hkhr0 = ((dxev)object5).c;
            if(hkhr0 == null) {
                hkhr0 = hkhr.b;
            }
            ibuq.e(hkhr0, "getPaymentMethod(...)");
            dyle dyle0 = dyld.a(((ProtoLiteMessage)dylc.a).v_newBuilder());
            dyle0.d(dyna.j);
            hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
            String s = (hjwt0.e == null ? hjwx.a : hjwt0.e).c;
            ibuq.e(s, "getServiceProviderCardId(...)");
            dyle0.e(s);
            dyni dyni0 = dynh.a(((ProtoLiteMessage)dyng.a).v_newBuilder());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhl.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            hkho hkho0 = hkhr0.v == null ? hkho.a : hkhr0.v;
            String s1 = (hkho0.b == 1 ? ((hkhn)hkho0.c) : hkhn.a).b;
            ibuq.e(s1, "getCardTypeId(...)");
            ibuq.f(s1, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyhl dyhl0 = (dyhl)hftp0.b_message;
            s1.getClass();
            dyhl0.b |= 1;
            dyhl0.c = s1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((dyhl)hftv0), "value");
            ProtoLiteBuilder hftp1 = dyni0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dyng dyng0 = (dyng)hftp1.b_message;
            ((dyhl)hftv0).getClass();
            dyng0.c = (dyhl)hftv0;
            dyng0.b = 9;
            dyle0.f(dyni0.b());
            ((Collection)object4).add(new dmlz(account0, dyle0.a()));
            continue;
        }
        return object4;
    }

    public final Object c(List list0, ibrl ibrl0) {
        Object object9;
        dmpi dmpi0;
        if((ibrl0 instanceof dmpi)) {
            dmpi0 = (dmpi)ibrl0;
            int v = dmpi0.d;
            if((v & 0x80000000) == 0) {
                dmpi0 = new dmpi(this, ibrl0);
            }
            else {
                dmpi0.d = v - 0x80000000;
            }
        }
        else {
            dmpi0 = new dmpi(this, ibrl0);
        }
        Object object0 = dmpi0.b;
        Object object1 = ibrx.a;
        switch(dmpi0.d) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    if((object2 instanceof dmlz)) {
                        arrayList0.add(object2);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: arrayList0) {
                    dyna dyna0 = dyna.b(((dmlz)object3).b.c);
                    if(dyna0 == null) {
                        dyna0 = dyna.k;
                    }
                    if(dyna0 == dyna.j) {
                        arrayList1.add(object3);
                    }
                }
                if(arrayList1.isEmpty()) {
                    return dmmd.a;
                }
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList1, 10)), 16));
                for(Object object4: arrayList1) {
                    linkedHashMap0.put(((dmlz)object4).b.d, object4);
                }
                LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                for(Object object5: arrayList1) {
                    Account account0 = ((dmlz)object5).a;
                    Object object6 = linkedHashMap1.get(account0);
                    if(object6 == null) {
                        object6 = new ArrayList();
                        linkedHashMap1.put(account0, object6);
                    }
                    ((List)object6).add(object5);
                }
                dmlf dmlf0 = this.a;
                ArrayList arrayList2 = new ArrayList(linkedHashMap1.size());
                for(Object object7: linkedHashMap1.entrySet()) {
                    Account account1 = (Account)((Map.Entry)object7).getKey();
                    Iterable iterable0 = (Iterable)((Map.Entry)object7).getValue();
                    ArrayList arrayList3 = new ArrayList(ibpo.q(iterable0, 10));
                    for(Object object8: iterable0) {
                        arrayList3.add(((dmlz)object8).b);
                    }
                    arrayList2.add(new dmkx(account1, ibpo.ay(arrayList3)));
                }
                dmpi0.a = linkedHashMap0;
                dmpi0.d = 1;
                object0 = dmlf.a(dmlf0, arrayList2, dmpi0);
                if(object0 != object1) {
                    object9 = linkedHashMap0;
                    break;
                }
                return object1;
            }
            case 1: {
                object9 = dmpi0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ArrayList arrayList4 = new ArrayList(ibpo.q(((dmla)object0).a, 10));
        for(Object object10: ((dmla)object0).a) {
            Object object11 = ((Map)object9).get(((dylc)object10).d);
            if(object11 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList4.add(((dmlz)object11));
            continue;
        }
        Set set0 = ibpo.ay(arrayList4);
        ArrayList arrayList5 = new ArrayList(ibpo.q(((dmla)object0).b, 10));
        for(Object object12: ((dmla)object0).b) {
            Object object13 = ((Map)object9).get(((dylc)object12).d);
            if(object13 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList5.add(((dmlz)object13));
            continue;
        }
        return new dmmd(set0, ibpo.ay(arrayList5));
    }

    private static final boolean d(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        ibuq.e(hkhr0, "getPaymentMethod(...)");
        if(((hkhr0.d == null ? hjwt.a : hkhr0.d).b & 2) == 0 && (hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)) == hkhm.c) {
            hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
            hjwx hjwx0 = hjwt0.e == null ? hjwx.a : hjwt0.e;
            return (hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)) == hjww.k;
        }
        return false;
    }
}

