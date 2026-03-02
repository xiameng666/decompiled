import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class bevv {
    public final bdzt a;
    public final aysr b;
    private static final bboh c;
    private final bggr d;

    static {
        bevv.c = bboh.b("PasswordChangesProcessor", bbcu.cX);
    }

    public bevv(bdzt bdzt0, aysr aysr0, bggr bggr0) {
        this.a = bdzt0;
        this.b = aysr0;
        this.d = bggr0;
    }

    public final Object a(String s, evql evql0, ibrl ibrl0) {
        gged_interceptors gged0;
        bevu bevu0;
        if((ibrl0 instanceof bevu)) {
            bevu0 = (bevu)ibrl0;
            int v = bevu0.c;
            if((v & 0x80000000) == 0) {
                bevu0 = new bevu(this, ibrl0);
            }
            else {
                bevu0.c = v - 0x80000000;
            }
        }
        else {
            bevu0 = new bevu(this, ibrl0);
        }
        Object object0 = bevu0.a;
        Object object1 = ibrx.a;
        switch(bevu0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bevu0.d = s;
                    bevu0.c = 1;
                    object0 = ictn.b(evql0, bevu0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        s = bevu0.d;
                        ibnx.b(object0);
                    }
                    gged0 = (gged_interceptors)object0;
                    goto label_26;
                }
                catch(aztb aztb0) {
                }
                break;
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bevv.c.j(), "Unable to list passwords for checkup caches cleanup.", aztb0);
        return ibom.a;
    label_26:
        bggr bggr0 = this.d;
        ibuq.f(s, "accountName");
        ibuq.f(gged0, "actualPasswords");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        for(Object object2: gged0) {
            arrayList0.add(new bggb(grcj.a(((heqb)object2).g), new grdf(((heqb)object2).i)));
        }
        Set set0 = ibpo.ay(arrayList0);
        ArrayList arrayList1 = new ArrayList(ibpo.q(set0, 10));
        for(Object object3: set0) {
            arrayList1.add(((bggb)object3).b);
        }
        Set set1 = ibpo.ay(arrayList1);
        bdue bdue0 = bggr0.a;
        List list0 = bdue0.a(s);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object4: list0) {
            linkedHashMap0.put(hfxt.a(((bdun)object4).b), object4);
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(set0, 10));
        for(Object object5: set0) {
            arrayList2.add(grcg.a(((bggb)object5).a, ((bggb)object5).b).b);
        }
        Set set2 = ibpo.ay(arrayList2);
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object6: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object6;
            if(!set2.contains(((ByteString)map$Entry0.getKey()))) {
                linkedHashMap1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        List list1 = ibpo.ar(linkedHashMap1.values());
        list1.getClass();
        bdug bdug0 = new bdug(((bdum)bdue0), list1);
        oqj.b(((bdum)bdue0).a, false, true, bdug0);
        bdva bdva0 = bggr0.b;
        List list2 = bdva0.a(s);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list2, 10)), 16));
        for(Object object7: list2) {
            linkedHashMap2.put(hfxt.a(((bdvj)object7).b), object7);
        }
        ArrayList arrayList3 = new ArrayList(ibpo.q(set1, 10));
        for(Object object8: set1) {
            arrayList3.add(bgie.a(((grdf)object8)).b);
        }
        Set set3 = ibpo.ay(arrayList3);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for(Object object9: linkedHashMap2.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object9;
            if(!set3.contains(((ByteString)map$Entry1.getKey()))) {
                linkedHashMap3.put(map$Entry1.getKey(), map$Entry1.getValue());
            }
        }
        List list3 = ibpo.ar(linkedHashMap3.values());
        list3.getClass();
        bdvb bdvb0 = new bdvb(((bdvi)bdva0), list3);
        oqj.b(((bdvi)bdva0).a, false, true, bdvb0);
        return ibom.a;
    }
}

