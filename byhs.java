import android.util.Log;
import android.webkit.URLUtil;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class byhs {
    public static final Object a(Object object0, Object object1, boolean z) {
        return object0 == null || !z ? object1 : object0;
    }

    public static final List b(List list0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = list0.iterator();
    label_2:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            byhy byhy0 = (byhy)object0;
            if((byhy0 instanceof byhu)) {
                byhw byhw0 = ((byhu)byhy0).b;
                if((byhw0 instanceof byia)) {
                    linkedHashMap0.put(new byhq(((byia)byhw0).a), byhy0);
                }
                else {
                    if(!(byhw0 instanceof byic)) {
                        throw new ibnq();
                    }
                    linkedHashMap0.put(new byhr(((byic)byhw0).a), byhy0);
                }
                continue;
            }
            if(!(byhy0 instanceof byhz)) {
                throw new ibnq();
            }
            Map map0 = ((byhz)byhy0).c;
            byhx byhx0 = (byhx)ibpo.S(map0.values());
            if(byhx0 == null) {
                continue;
            }
            byhu byhu0 = byhx0.b;
            if(byhu0 == null) {
                continue;
            }
            String s = byhu0.c;
            byhp byhp0 = new byhp(((byhz)byhy0).a, ((byhz)byhy0).b, s);
            if(!map0.isEmpty()) {
                for(Object object1: map0.entrySet()) {
                    List list1 = ((byhx)((Map.Entry)object1).getValue()).a;
                    if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                        for(Object object2: list1) {
                            if(ibuq.m(((byhu)object2).c, s)) {
                                continue;
                            }
                            else {
                                Log.w("CredentialSelector", "Skipping set with entries with different fulfillment actions");
                                continue label_2;
                            }
                            break;
                        }
                    }
                }
            }
            byhy byhy1 = (byhy)linkedHashMap0.get(byhp0);
            if(byhy1 == null) {
                linkedHashMap0.put(byhp0, byhy0);
            }
            else {
                Map map1 = ibpz.r(((byhz)byhy1).c);
                for(Object object3: ((byhz)byhy0).c.entrySet()) {
                    Map.-EL.compute(map1, ((Map.Entry)object3).getKey(), new byhn(new byhm(((Map.Entry)object3))));
                }
                linkedHashMap0.put(byhp0, byhz.a(((byhz)byhy1), map1));
            }
            continue;
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        Iterator iterator4 = linkedHashMap0.entrySet().iterator();
    label_51:
        while(iterator4.hasNext()) {
            Object object4 = iterator4.next();
            Map.Entry map$Entry0 = (Map.Entry)object4;
            byhy byhy2 = (byhy)map$Entry0.getValue();
            if((byhy2 instanceof byhz)) {
                int v = ((byhz)byhy2).b;
                if(((byhz)byhy2).c.size() != v) {
                    continue;
                }
                ibpw ibpw0 = ibwt.q(0, v).e();
                while(((ibwl)ibpw0).a) {
                    int v1 = ibpw0.a();
                    if(!((byhz)byhy2).c.containsKey(Integer.valueOf(v1))) {
                        continue label_51;
                    }
                }
            }
            linkedHashMap1.put(map$Entry0.getKey(), map$Entry0.getValue());
        }
        List list2 = new ArrayList(linkedHashMap1.size());
        for(Object object5: linkedHashMap1.entrySet()) {
            list2.add(((byhy)((Map.Entry)object5).getValue()));
        }
        return list2;
    }

    public static final byhu c(bydk bydk0, bydj bydj0, String s, String s1, String s2, String s3) {
        if((bydk0 instanceof byeg)) {
            if(ibzk.D(((byeg)bydk0).c)) {
                return null;
            }
            List list0 = ((byeg)bydk0).f;
            if(list0.isEmpty() || list0.isEmpty()) {
                return null;
            }
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                if(ibzk.D(((byeh)object0).a)) {
                    continue;
                }
                String s4 = byhj.b(bydk0.a, "androidx.credentials.registry.provider.action.GET_CREDENTIAL");
                byhw byhw0 = byhj.a(bydj0);
                String s5 = bydk0.b;
                String s6 = ((byeg)bydk0).c;
                String s7 = ((byeg)bydk0).d;
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ((byeg)bydk0).f) {
                    if(!ibzk.D(((byeh)object1).a)) {
                        arrayList0.add(object1);
                    }
                }
                ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                for(Object object2: arrayList0) {
                    arrayList1.add(new bywn(((byeh)object2).a, ((byeh)object2).b));
                }
                hkn hkn0 = byhj.c(((byeg)bydk0).e);
                String s8 = ((byeg)bydk0).g;
                String s9 = s8 == null ? null : ibzk.Q(s8, "${CALLER_DISPLAY_NAME}", s2);
                String s10 = ((byeg)bydk0).h;
                String s11 = ((byeg)bydk0).i;
                String s12 = ((byeg)bydk0).j;
                return s12 == null || !URLUtil.isValidUrl(s12) ? new bzbi(s, byhw0, s4, s3, s5, s1, hkn0, s6, s7, arrayList1, s9, s10, s11, null, ((byeg)bydk0).k) : new bzbi(s, byhw0, s4, s3, s5, s1, hkn0, s6, s7, arrayList1, s9, s10, s11, s12, ((byeg)bydk0).k);
            }
        }
        if((bydk0 instanceof byee)) {
            if(ibzk.D(((byee)bydk0).c)) {
                return null;
            }
            List list1 = ((byee)bydk0).e;
            if(list1.isEmpty()) {
                return null;
            }
            Iterator iterator3 = list1.iterator();
            while(true) {
                if(!iterator3.hasNext()) {
                    return null;
                }
                Object object3 = iterator3.next();
                if(ibzk.D(((byef)object3).a)) {
                    continue;
                }
                byhw byhw1 = byhj.a(bydj0);
                String s13 = byhj.b(bydk0.a, "androidx.credentials.registry.provider.action.GET_CREDENTIAL");
                String s14 = ((byee)bydk0).c;
                hkn hkn1 = byhj.c(((byee)bydk0).d);
                ArrayList arrayList2 = new ArrayList();
                for(Object object4: ((byee)bydk0).e) {
                    byef byef0 = (byef)object4;
                    if(!ibzk.D(byef0.a) && !ibzk.D(byef0.b)) {
                        arrayList2.add(object4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
                for(Object object5: arrayList2) {
                    arrayList3.add(new bzbh(((byef)object5).b));
                }
                URLUtil.isValidUrl(((byee)bydk0).g);
                return new bzbg(s, byhw1, s13, s1, hkn1, s14, arrayList3);
            }
        }
        if((bydk0 instanceof byds)) {
            String s15 = ((byds)bydk0).d;
            if(ibzk.D(s15)) {
                return null;
            }
            String s16 = ((byds)bydk0).c;
            if(ibzk.D(s16)) {
                return null;
            }
            byhw byhw2 = byhj.a(bydj0);
            String s17 = byhj.b(bydk0.a, "androidx.credentials.registry.provider.action.GET_CREDENTIAL");
            hkn hkn2 = byhj.c(((byds)bydk0).f);
            hkn hkn3 = byhj.c(((byds)bydk0).h);
            hkn hkn4 = byhj.c(((byds)bydk0).i);
            return new bzbd(s, byhw2, s17, s3, bydk0.b, s16, s15, ((byds)bydk0).e, hkn2, ((byds)bydk0).g, hkn3, hkn4);
        }
        if((bydk0 instanceof bydp) || (bydk0 instanceof bydo)) {
            return null;
        }
        throw new ibnq();
    }
}

