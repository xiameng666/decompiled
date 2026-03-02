import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Conflict;
import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Error;
import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Success;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class bddu {
    private final bgog a;
    private final bgof b;
    private final beih c;
    private final bdbt d;

    public bddu(bgog bgog0, bgof bgof0, beih beih0, bdbt bdbt0) {
        ibuq.f(beih0, "passwordDataRepository");
        super();
        this.a = bgog0;
        this.b = bgof0;
        this.c = beih0;
        this.d = bdbt0;
    }

    public final Object a(bdcd bdcd0, ibrl ibrl0) {
        bdds bdds0;
        if((ibrl0 instanceof bdds)) {
            bdds0 = (bdds)ibrl0;
            int v = bdds0.c;
            if((v & 0x80000000) == 0) {
                bdds0 = new bdds(this, ibrl0);
            }
            else {
                bdds0.c = v - 0x80000000;
            }
        }
        else {
            bdds0 = new bdds(this, ibrl0);
        }
        Object object0 = bdds0.a;
        Object object1 = ibrx.a;
        switch(bdds0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = bdcd0.c();
                    bdds0.c = 1;
                    object0 = ictn.b(evql0, bdds0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    return (List)object0;
                }
                catch(aztb | CancellationException unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    static Object b(bddu bddu0, List list0, String s, ibrl ibrl0) {
        Object object18;
        Map map3;
        Object object17;
        Map map2;
        Object object14;
        Object object13;
        int v5;
        bddu bddu5;
        Iterator iterator4;
        int v4;
        Object object11;
        heqb heqb1;
        int v2;
        Object object9;
        bddu bddu3;
        Object object8;
        Object object7;
        Object object6;
        List list5;
        Map map1;
        bdcd bdcd2;
        Object object2;
        List list1;
        bdcd bdcd0;
        bddt bddt0;
        bddu bddu1 = bddu0;
        if((ibrl0 instanceof bddt)) {
            bddt0 = (bddt)ibrl0;
            int v = bddt0.l;
            if((v & 0x80000000) == 0) {
                bddt0 = new bddt(bddu1, ibrl0);
            }
            else {
                bddt0.l = v - 0x80000000;
            }
        }
        else {
            bddt0 = new bddt(bddu1, ibrl0);
        }
        Object object0 = bddt0.j;
        Object object1 = ibrx.a;
        switch(bddt0.l) {
            case 0: {
                ibnx.b(object0);
                bdcd0 = bddu1.d.a(s);
                bddt0.a = bddu1;
                list1 = list0;
                bddt0.b = list1;
                bddt0.c = bdcd0;
                bddt0.l = 1;
                object2 = bddu1.a(bdcd0, bddt0);
                if(object2 != object1) {
                    goto label_31;
                }
                return object1;
            }
            case 1: {
                bdcd bdcd1 = (bdcd)bddt0.c;
                list1 = (List)bddt0.b;
                bddu bddu2 = (bddu)bddt0.a;
                ibnx.b(object0);
                bdcd0 = bdcd1;
                bddu1 = bddu2;
                object2 = object0;
            label_31:
                if(((List)object2) == null) {
                    return BatchUploadResult.Error.a;
                }
                bgod bgod0 = bgog.a(list1, ((List)object2));
                List list2 = bgod0.a;
                Map map0 = bgod0.b;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object3: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    heqb heqb0 = (heqb)map$Entry0.getKey();
                    List list3 = (List)map$Entry0.getValue();
                    if(!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator iterator1 = list3.iterator();
                        while(true) {
                            if(!iterator1.hasNext()) {
                                goto label_49;
                            }
                            Object object4 = iterator1.next();
                            if(ibuq.m(((heqb)object4).i, heqb0.i)) {
                                if(((heqb0.s == null ? hept.a : heqb0.s).b & 8) == 0) {
                                    goto label_49;
                                }
                                break;
                            }
                        }
                    }
                    else {
                    label_49:
                        long v1 = bgof.a(heqb0);
                        ArrayList arrayList0 = new ArrayList(ibpo.q(list3, 10));
                        for(Object object5: list3) {
                            arrayList0.add(Long.valueOf(bgof.a(((heqb)object5))));
                        }
                        if(v1 > ((Number)Collections.max(arrayList0)).longValue()) {
                            goto label_57;
                        }
                        continue;
                    }
                label_57:
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
                Set set0 = linkedHashMap0.keySet();
                Set set1 = ibqg.e(map0.keySet(), set0);
                bgoe bgoe0 = new bgoe(ggdx.a(set0), ggdx.a(set1));
                List list4 = ibpo.ak(list2, bgoe0.a);
                Iterator iterator3 = list4.iterator();
                bdcd2 = bdcd0;
                map1 = map0;
                list5 = list4;
                object6 = bgoe0.a;
                object7 = bgoe0.b;
                object8 = object7;
                bddu3 = bddu1;
                object9 = iterator3;
                v2 = 1;
                goto label_104;
            }
            case 2: {
                int v3 = bddt0.i;
                heqb1 = bddt0.m;
                Object object10 = bddt0.h;
                object11 = bddt0.g;
                list5 = (List)bddt0.f;
                object8 = bddt0.e;
                object6 = bddt0.d;
                map1 = (Map)bddt0.c;
                bdcd2 = (bdcd)bddt0.b;
                bddu bddu4 = (bddu)bddt0.a;
                try {
                    object9 = object10;
                    bddu3 = bddu4;
                    ibnx.b(object0);
                    v4 = v3;
                    object9 = object10;
                    bddu3 = bddu4;
                    goto label_123;
                }
                catch(aztb unused_ex) {
                }
                catch(CancellationException unused_ex) {
                    goto label_137;
                }
                object9 = object10;
                bddu3 = bddu4;
                goto label_137;
            }
            case 3: {
                v2 = bddt0.i;
                object9 = bddt0.h;
                object7 = bddt0.g;
                list5 = (List)bddt0.f;
                object8 = bddt0.e;
                object6 = bddt0.d;
                map1 = (Map)bddt0.c;
                bdcd2 = (bdcd)bddt0.b;
                bddu3 = (bddu)bddt0.a;
                try {
                    ibnx.b(object0);
                }
                catch(aztb | CancellationException unused_ex) {
                    goto label_138;
                }
            label_104:
                while(((Iterator)object9).hasNext()) {
                    Object object12 = ((Iterator)object9).next();
                    heqb heqb2 = (heqb)object12;
                    try {
                        evql evql0 = bdcd2.e(((MessageLite)heqb2));
                        bddt0.a = bddu3;
                        bddt0.b = bdcd2;
                        bddt0.c = map1;
                        bddt0.d = object6;
                        bddt0.e = object8;
                        bddt0.f = list5;
                        bddt0.g = object7;
                        bddt0.h = object9;
                        bddt0.m = heqb2;
                        bddt0.i = v2;
                        bddt0.l = 2;
                        if(ictn.b(evql0, bddt0) != object1) {
                            goto label_120;
                        }
                        return object1;
                    }
                    catch(aztb | CancellationException unused_ex) {
                        goto label_138;
                    }
                label_120:
                    heqb1 = heqb2;
                    v4 = v2;
                    object11 = object7;
                    try {
                    label_123:
                        evql evql1 = bddu3.c.d(heqb1);
                        bddt0.a = bddu3;
                        bddt0.b = bdcd2;
                        bddt0.c = map1;
                        bddt0.d = object6;
                        bddt0.e = object8;
                        bddt0.f = list5;
                        bddt0.g = object11;
                        bddt0.h = object9;
                        bddt0.m = null;
                        bddt0.i = v4;
                        bddt0.l = 3;
                        if(ictn.b(evql1, bddt0) == object1) {
                            return object1;
                        }
                        goto label_140;
                    }
                    catch(aztb | CancellationException unused_ex) {
                    label_137:
                        object7 = object11;
                    }
                label_138:
                    v2 = 0;
                    continue;
                label_140:
                    object7 = object11;
                    v2 = v4;
                }
                iterator4 = ((List)object7).iterator();
                bddu5 = bddu3;
                v5 = v2;
                object13 = list5;
                object14 = object6;
                map2 = map1;
                goto label_166;
            }
            case 4: {
                v5 = bddt0.i;
                iterator4 = (Iterator)bddt0.f;
                object13 = bddt0.e;
                Object object15 = bddt0.d;
                List list6 = (List)bddt0.c;
                map2 = (Map)bddt0.b;
                bddu bddu6 = (bddu)bddt0.a;
                try {
                    ibnx.b(object0);
                    object14 = list6;
                    bddu5 = bddu6;
                    object8 = object15;
                }
                catch(aztb | CancellationException unused_ex) {
                    object14 = list6;
                    bddu5 = bddu6;
                    object8 = object15;
                    goto label_183;
                }
            label_166:
                while(iterator4.hasNext()) {
                    Object object16 = iterator4.next();
                    heqb heqb3 = (heqb)object16;
                    try {
                        evql evql2 = bddu5.c.d(heqb3);
                        bddt0.a = bddu5;
                        bddt0.b = map2;
                        bddt0.c = object14;
                        bddt0.d = object8;
                        bddt0.e = object13;
                        bddt0.f = iterator4;
                        bddt0.g = null;
                        bddt0.h = null;
                        bddt0.m = null;
                        bddt0.i = v5;
                        bddt0.l = 4;
                        if(ictn.b(evql2, bddt0) != object1) {
                            continue;
                        }
                    }
                    catch(aztb | CancellationException unused_ex) {
                    label_183:
                        v5 = 0;
                        continue;
                    }
                    return object1;
                }
                try {
                    evql evql3 = bddu5.c.f();
                    bddt0.a = map2;
                    bddt0.b = object14;
                    bddt0.c = object8;
                    bddt0.d = object13;
                    bddt0.e = null;
                    bddt0.f = null;
                    bddt0.g = null;
                    bddt0.h = null;
                    bddt0.m = null;
                    bddt0.i = v5;
                    bddt0.l = 5;
                    if(ictn.b(evql3, bddt0) != object1) {
                        object17 = object13;
                        map3 = map2;
                        object18 = object8;
                        break;
                    }
                }
                catch(aztb | CancellationException unused_ex) {
                    object17 = object13;
                    map3 = map2;
                    object18 = object8;
                    break;
                }
                return object1;
            }
            case 5: {
                v5 = bddt0.i;
                object17 = bddt0.d;
                object18 = (List)bddt0.c;
                object14 = (List)bddt0.b;
                map3 = (Map)bddt0.a;
                try {
                    ibnx.b(object0);
                }
                catch(aztb | CancellationException unused_ex) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!map3.isEmpty()) {
            return new BatchUploadResult.Conflict(map3.size(), ((List)object14).size(), ((List)object18).size());
        }
        return v5 != 0 ? new BatchUploadResult.Success(((List)object17).size()) : BatchUploadResult.Error.a;
    }
}

