import android.util.Log;
import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import j..time.Instant;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

final class byob implements icih {
    final byof a;

    public byob(byof byof0) {
        this.a = byof0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bxzv bxzv5;
        bysl bysl0;
        boolean z4;
        boolean z2;
        bxzv bxzv4;
        byot byot0;
        bysj bysj0;
        Instant instant2;
        bxzv bxzv0;
        byvx byvx0;
        Long long0;
        if(((byag)object0) != null) {
            byof byof0 = this.a;
            byai byai0 = byof0.c;
            byai byai1 = ((byag)object0).b;
            Object object1 = null;
            if(!ibuq.m(byai0, byai1)) {
                if((((byag)object0) instanceof byac) || (((byag)object0) instanceof byab)) {
                    byom byom0 = (byom)byof0.f.b();
                    byom byom1 = byom0 == null ? null : byom.a(byom0, null, null, null, null, new bxzt(bxzu.f, null), null, 0xEF);
                    byof0.f.g(byom1);
                }
                if(byai1 == null) {
                    long0 = null;
                }
                else if((byai1 instanceof bybi)) {
                    long0 = (long)((bybi)byai1).a;
                }
                else {
                    long0 = null;
                }
                byof0.e = new AtomicLong((long0 == null ? bxzl.a() : ((long)long0)));
                long v = byof0.e.get();
                long v1 = byof0.d;
                if(bxzl.b() != null) {
                    StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
                    statsEvent$Builder0.setAtomId(211800);
                    statsEvent$Builder0.writeLong(v);
                    statsEvent$Builder0.writeLong(v1);
                    statsEvent$Builder0.usePooledBuffer();
                    StatsLog.write(statsEvent$Builder0.build());
                }
            }
            byof0.c = byai1;
            boolean z = true;
            if((((byag)object0) instanceof byae)) {
                bxzx bxzx0 = ((byae)(((byag)object0))).a;
                try {
                    List list0 = bxzx0.a;
                    bybx bybx0 = bxzx0.b;
                    Map map0 = bybx0.e;
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            byoh byoh0 = new byoh(map0);
                            for(Object object2: linkedHashMap0.values()) {
                                ibpo.t(((List)object2), byoh0);
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap0.size());
                            for(Object object3: linkedHashMap0.entrySet()) {
                                arrayList2.add(new byvy(((String)((Map.Entry)object3).getKey()), ((List)((Map.Entry)object3).getValue())));
                            }
                            byvz byvz0 = new byvz(ibpo.ao(arrayList2, new byok()), arrayList0, ((bxzv)ibpo.U(arrayList1, 0)));
                            boolean z1 = bxzx0.c;
                            List list1 = byvz0.a;
                            if(list1.isEmpty() && byvz0.c == null) {
                                List list2 = byvz0.b;
                                if(!list2.isEmpty()) {
                                    for(Object object4: list2) {
                                        if(((bybt)object4).j) {
                                            continue;
                                        }
                                        goto label_64;
                                    }
                                }
                                byvx0 = byvx.e;
                            }
                            else {
                            label_64:
                                if(z1) {
                                    byvx0 = byvx.f;
                                }
                                else if(list1.isEmpty() && byvz0.b.isEmpty() && byvz0.c != null) {
                                    byvx0 = byvx.d;
                                }
                                else {
                                    byvx0 = byvw.b(byvz0, byvw.a(byvz0) != null) == null ? byvx.a : byvx.b;
                                }
                            }
                            List list3 = byvz0.b;
                            if(list1.size() == 1 && list3.isEmpty()) {
                                bxzv0 = (bxzv)ibpo.R(((byvy)ibpo.R(list1)).b);
                            }
                            else {
                                bxzv0 = !list1.isEmpty() || list3.size() != 1 ? null : ((bxzv)ibpo.R(list3));
                            }
                            byvv byvv0 = new byvv(z1, list0, bybx0, byvz0, byvx0, bxzv0, false);
                            byvz byvz1 = byvv0.c;
                            bybu bybu0 = byvw.a(byvz1);
                            if(bybu0 == null) {
                                z = false;
                            }
                            bybu bybu1 = byvw.b(byvz1, z);
                            object1 = byol.a(null, (bybu1 == null ? byvv0 : byvv.a(byvv0, null, bybu1, false, 0x5F)), bybu0);
                            break;
                        }
                        Object object5 = iterator0.next();
                        arrayList0.addAll(((bybv)object5).e);
                        bxzv bxzv1 = ((bybv)object5).g;
                        if(bxzv1 != null) {
                            arrayList1.add(bxzv1);
                        }
                        batl.l(arrayList1.size() <= 1);
                        for(Object object6: ((bybv)object5).d) {
                            byoj byoj0 = new byoj(new byoi(((bybu)object6)));
                            Map.-EL.compute(linkedHashMap0, ((bybu)object6).q, byoj0);
                        }
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                if(object1 == null) {
                    byof0.v();
                    return ibom.a;
                }
                byof0.f.g(object1);
                byvv byvv1 = object1.b;
                if(byvv1 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    bybx bybx1 = byvv1.b;
                    for(Object object7: bybx1.e.values()) {
                        switch(((Number)object7).intValue()) {
                            case 100: {
                                arrayList3.add(bxzs.b);
                                break;
                            }
                            case 1000: {
                                arrayList3.add(bxzs.c);
                                break;
                            }
                            default: {
                                arrayList3.add(bxzs.a);
                            }
                        }
                    }
                    int v2 = byvv1.c.c == null ? byvv1.c.a.size() : byvv1.c.a.size() + 1;
                    long v3 = byof0.a();
                    byaj byaj0 = byaj.a;
                    ArrayList arrayList4 = new ArrayList(ibpo.q(arrayList3, 10));
                    for(Object object8: arrayList3) {
                        arrayList4.add(((bxzs)object8).a());
                    }
                    bxzl.h(v3, byaj0, arrayList4, bybx1.a, v2);
                    return ibom.a;
                }
            }
            else {
                if(!(((byag)object0) instanceof byad)) {
                    goto label_236;
                }
                bxzr bxzr0 = ((byad)(((byag)object0))).a;
                ArrayList arrayList5 = new ArrayList();
                List list4 = bxzr0.a;
                Iterator iterator7 = list4.iterator();
                byat byat0 = null;
                byat byat1 = null;
                bxzv bxzv2 = null;
                byat byat2 = null;
                while(true) {
                    byaw byaw0 = bxzr0.c;
                    if(!iterator7.hasNext()) {
                        goto label_172;
                    }
                    Object object9 = iterator7.next();
                    byat2 = (byat)object9;
                    String s = byat2.d;
                    if(s.equals(byaw0.g)) {
                        byat0 = byat2;
                    }
                    List list5 = byat2.a;
                    if(!list5.isEmpty() && byaw0.h.contains(s)) {
                        if(byat1 == null) {
                            byat1 = byat2;
                        }
                        else {
                            byas byas0 = (byas)ibpo.T(list5);
                            Instant instant0 = byas0 == null ? null : byas0.l;
                            byas byas1 = (byas)ibpo.T(byat1.a);
                            if(byas1 != null) {
                                Instant instant1 = byas1.l;
                                if(instant1 != null) {
                                    instant2 = instant1;
                                    goto label_156;
                                }
                            }
                            instant2 = Instant.MIN;
                            ibuq.e(instant2, "MIN");
                        label_156:
                            if(instant0 != null && instant0.compareTo(instant2) > 0) {
                                byat1 = byat2;
                            }
                        }
                    }
                    if(!list5.isEmpty()) {
                        for(Object object10: list5) {
                            arrayList5.add(new ibns(((byas)object10), byat2));
                        }
                    }
                    bxzv bxzv3 = byat2.b;
                    if(bxzv3 != null && bxzv2 != null) {
                        bysj0 = null;
                    }
                    else {
                        bxzv2 = bxzv3;
                        continue;
                    label_172:
                        if(byat0 == null) {
                            byat0 = byat1;
                        }
                        List list6 = ibpo.ao(arrayList5, new bynz());
                        if(list6.isEmpty()) {
                            if(bxzv2 == null) {
                                bxzv2 = null;
                            }
                            else if(byat2 != null) {
                                byot0 = new byot(byat2, bxzv2);
                                goto label_193;
                            }
                        }
                        if(byat0 != null) {
                            List list7 = byat0.a;
                            if(!list7.isEmpty()) {
                                bxzv4 = bxzv2;
                                byot0 = new byot(byat0, ((bxzv)ibpo.R(list7)));
                                goto label_194;
                            }
                        }
                        if(list6.isEmpty()) {
                            byot0 = null;
                        }
                        else {
                            ibns ibns0 = (ibns)ibpo.R(list6);
                            bxzv4 = bxzv2;
                            byot0 = new byot(((byat)ibns0.b), ((byas)ibns0.a));
                            goto label_194;
                        }
                    label_193:
                        bxzv4 = bxzv2;
                    label_194:
                        if(byot0 == null) {
                            z2 = false;
                        }
                        else {
                            ibuq.f(list6, "sortedCreateOptionsPairs");
                            boolean z3 = byaw0.i;
                            if(list6.size() == 1) {
                                byas byas2 = bysk.b(byot0);
                                if(z3 && byas2 != null && byas2.n) {
                                    z4 = true;
                                    goto label_205;
                                }
                            }
                            z4 = false;
                        label_205:
                            z2 = bysk.c(byot0, z4);
                        }
                        if(arrayList5.size() == 0 && bxzv4 != null) {
                            bysl0 = bysl.e;
                        }
                        else {
                            bysl0 = z2 ? bysl.b : bysl.a;
                        }
                        bysj0 = new bysj(list4, bxzr0.b, bysl0, byaw0, list6, byot0, bxzv4, byat1 != null);
                    }
                    break;
                }
                if(bysj0 == null) {
                    Log.e("CredentialSelector", "Request is Create but CreateCredentialUiState is null");
                }
                else {
                    if(bysj0.d.i && bysj0.e.size() == 1) {
                        byot byot1 = bysj0.f;
                        if(byot1 == null) {
                            bxzv5 = null;
                        }
                        else {
                            bxzv5 = byot1.b;
                            if(bxzv5 == null || !(bxzv5 instanceof byas) || !((byas)bxzv5).n) {
                                bxzv5 = null;
                            }
                        }
                    }
                    else {
                        bxzv5 = null;
                    }
                    object1 = byol.a(bysj0, null, bxzv5);
                }
                if(object1 == null) {
                    byof0.v();
                    return ibom.a;
                }
                byof0.f.g(object1);
                bysj bysj1 = object1.a;
                if(bysj1 != null) {
                    long v4 = byof0.a();
                    List list8 = ibpo.b(bysj1.d.c.a());
                    bxzl.h(v4, byaj.b, list8, bysj1.d.d, (bysj1.h == null ? bysj1.e.size() : bysj1.e.size() + 1));
                    return ibom.a;
                label_236:
                    if((((byag)object0) instanceof byaf)) {
                        Log.e("CredentialSelector", "Unsupported request type");
                        byof0.v();
                        return ibom.a;
                    }
                    if((((byag)object0) instanceof byab)) {
                        byom byom2 = new byom(null, null, null, null, null, false, new byny(((byab)(((byag)object0))).a), 0xBC);
                        byof0.f.g(byom2);
                        bxzl.h(byof0.a(), byaj.c, ibps.a, ((byab)(((byag)object0))).a, 0);
                        return ibom.a;
                    }
                    if(!(((byag)object0) instanceof byac)) {
                        throw new ibnq();
                    }
                    byom byom3 = new byom(null, null, null, null, null, false, new byny(null), 0xBC);
                    byof0.f.g(byom3);
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

