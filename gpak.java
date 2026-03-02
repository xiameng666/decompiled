import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class gpak {
    static void a(List list0) {
        HashMap hashMap0 = new HashMap(list0.size());
        for(Object object0: list0) {
            gozv gozv0 = (gozv)object0;
            gpai gpai0 = new gpai(gozv0);
            for(Object object1: gozv0.a) {
                gpay gpay0 = (gpay)object1;
                gpaj gpaj0 = new gpaj(gpay0, ((boolean)(gozv0.f() ^ 1)));
                if(!hashMap0.containsKey(gpaj0)) {
                    hashMap0.put(gpaj0, new HashSet());
                }
                Set set0 = (Set)hashMap0.get(gpaj0);
                if(!set0.isEmpty() && !gpaj0.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", gpay0));
                }
                set0.add(gpai0);
            }
        }
        for(Object object2: hashMap0.values()) {
            for(Object object3: ((Set)object2)) {
                gpai gpai1 = (gpai)object3;
                for(Object object4: gpai1.a.b) {
                    gpal gpal0 = (gpal)object4;
                    if(gpal0.a()) {
                        Set set1 = (Set)hashMap0.get(new gpaj(gpal0.a, gpal0.b()));
                        if(set1 != null) {
                            for(Object object5: set1) {
                                gpai1.b.add(((gpai)object5));
                                ((gpai)object5).c.add(gpai1);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet0 = new HashSet();
        for(Object object6: hashMap0.values()) {
            hashSet0.addAll(((Set)object6));
        }
        HashSet hashSet1 = new HashSet();
        for(Object object7: hashSet0) {
            gpai gpai2 = (gpai)object7;
            if(gpai2.a()) {
                hashSet1.add(gpai2);
            }
        }
        int v = 0;
        while(!hashSet1.isEmpty()) {
            Object object8 = hashSet1.iterator().next();
            gpai gpai3 = (gpai)object8;
            hashSet1.remove(gpai3);
            ++v;
            for(Object object9: gpai3.b) {
                gpai gpai4 = (gpai)object9;
                gpai4.c.remove(gpai3);
                if(gpai4.a()) {
                    hashSet1.add(gpai4);
                }
            }
        }
        if(v == list0.size()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object10: hashSet0) {
            gpai gpai5 = (gpai)object10;
            if(!gpai5.a() && !gpai5.b.isEmpty()) {
                arrayList0.add(gpai5.a);
            }
        }
        throw new gpam(arrayList0);
    }
}

