import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;

public final class byeb {
    public static final Object a(bxxd bxxd0, String s, String s1, String s2, ibwv ibwv0) {
        byfq byfq0 = bxxd0.c;
        byte[] arr_b = byfq0.d.toByteArray();
        ibuq.e(arr_b, "toByteArray(...)");
        byte[] arr_b1 = byfq0.c.toByteArray();
        ibuq.e(arr_b1, "toByteArray(...)");
        bzmi bzmi0 = new bzmi(arr_b, s, arr_b1, new bzck(s1, s2));
        bzdj bzdj0 = bzmi0.a;
        Map map0 = bzdj0.a.e;
        if(!map0.containsKey("_start")) {
            throw new IllegalArgumentException("Unknown export");
        }
        Object object0 = map0.get("_start");
        ibuq.c(object0);
        boolean z = bzdj0.m(((bzcv)object0).b, false);
        bzdj0.g();
        if(z) {
            bzdj0.c();
        }
        bzcy bzcy0 = bzmi0.f;
        if(hufl.a.c().B()) {
            Objects.toString(bzcy0.a);
        }
        ArrayList arrayList0 = new ArrayList(bzmi0.b.size());
        for(Object object1: bzmi0.b.entrySet()) {
            arrayList0.add(((bzmz)((Map.Entry)object1).getValue()).a());
        }
        ArrayList arrayList1 = new ArrayList(bzmi0.c.size());
        for(Object object2: bzmi0.c.entrySet()) {
            arrayList1.add(((bzcr)((Map.Entry)object2).getValue()).a());
        }
        List list0 = ibpo.ak(arrayList0, arrayList1);
        ArrayList arrayList2 = new ArrayList(bzmi0.d.size());
        for(Object object3: bzmi0.d.entrySet()) {
            bzcs bzcs0 = (bzcs)((Map.Entry)object3).getValue();
            String s3 = bzcs0.a;
            int v = bzcs0.b;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(bzcs0.c.size()));
            for(Object object4: bzcs0.c.entrySet()) {
                Object object5 = ((Map.Entry)object4).getKey();
                Map map1 = (Map)((Map.Entry)object4).getValue();
                ArrayList arrayList3 = new ArrayList(map1.size());
                for(Object object6: map1.entrySet()) {
                    arrayList3.add(((bzcr)((Map.Entry)object6).getValue()).a());
                }
                linkedHashMap0.put(object5, arrayList3);
            }
            arrayList2.add(new bzct(s3, v, linkedHashMap0));
        }
        String s4 = (byfq0.b & 4) == 0 ? null : byfq0.e;
        if(!ibuq.m(ibwv0, new ibuk(bydl.class))) {
            throw new IllegalArgumentException("Passed in an invalid class.");
        }
        String s5 = bxxd0.a;
        String s6 = bxxd0.b;
        LinkedHashMap linkedHashMap1 = byec.a(s4, list0);
        ArrayList arrayList4 = new ArrayList(ibpo.q(arrayList2, 10));
        for(Object object7: arrayList2) {
            String s7 = ((bzct)object7).a;
            int v1 = ((bzct)object7).b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ibpz.a(((bzct)object7).c.size()));
            for(Object object8: ((bzct)object7).c.entrySet()) {
                linkedHashMap2.put(((Map.Entry)object8).getKey(), new bydn(byec.a(s4, ((List)((Map.Entry)object8).getValue()))));
            }
            arrayList4.add(new bydm(s7, v1, linkedHashMap2));
        }
        return new bydl(s5, s6, linkedHashMap1, arrayList4);
    }
}

