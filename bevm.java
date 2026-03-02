import j..util.Map.-EL;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class bevm {
    public static final gged_interceptors a(List list0, Map map0, gged_interceptors gged0) {
        Iterator iterator2;
        HashMap hashMap2;
        gged_interceptors gged2;
        Iterator iterator3;
        HashMap hashMap3;
        Map map1 = map0;
        if(!map1.isEmpty() && !list0.isEmpty() && !gged0.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                hhyh hhyh0 = (hhyh)gged0.get(v1);
                for(Object object0: hhyh0.c) {
                    hashMap0.put(gqlo.c(((hhyf)object0)), hhyh0);
                }
            }
            HashMap hashMap1 = new HashMap();
            Map.-EL.forEach(map1, new bevd(hashMap1));
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator1 = list0.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                gqlt gqlt0 = (gqlt)object1;
                gged_interceptors gged1 = gqlt0.c;
                gqlo gqlo0 = (gqlo)gqlo.b(((bedg)((gqmd)gged1.get(0)).c().get(0)).c).g();
                gfsx gfsx0 = gqlo0 == null ? gfqx.a : gfsx.l(((hhyh)hashMap0.get(gqlo0)));
                if(gfsx0.i()) {
                    ggfp ggfp0 = ggch.j(((hhyh)gfsx0.d()).c).l(new bevj()).p();
                    ggch ggch0 = ggch.j(map1.keySet());
                    Objects.requireNonNull(ggfp0);
                    if(ggch0.s(new bevk(ggfp0))) {
                        ggfp ggfp1 = ggch.j(gged1).m(new beve()).i(new bevf()).i(new bevg()).l(new bevh()).p();
                        ggfp ggfp2 = ggch.j(ggfp1).l(new bevi()).p();
                        ArrayList arrayList1 = new ArrayList();
                        int v2 = ((ggna)gged1).c;
                        int v3 = 0;
                        while(v3 < v2) {
                            gged_interceptors gged3 = ((gqmd)gged1.get(v3)).c();
                            int v4 = ((ggna)gged3).c;
                            int v5 = 0;
                        alab1:
                            while(true) {
                                if(v5 >= v4) {
                                    hashMap3 = hashMap0;
                                    iterator3 = iterator1;
                                    break;
                                }
                                bedg bedg0 = (bedg)gged3.get(v5);
                                if(gqmq.a(bedg0)) {
                                    hashMap3 = hashMap0;
                                    iterator3 = iterator1;
                                }
                                else {
                                    hashMap3 = hashMap0;
                                    String s = bedg0.a;
                                    iterator3 = iterator1;
                                    if(!s.trim().isEmpty()) {
                                        gfsx gfsx1 = gqlo.b(bedg0.c);
                                        if(gfsx1.i()) {
                                            Object object2 = gfsx1.d();
                                            String s1 = (String)map1.get(object2);
                                            if(s1 != null) {
                                                if(!((gqlo)gfsx1.d()).d()) {
                                                    ggfn ggfn0 = new ggfn();
                                                    ggfn0.i(object2);
                                                    if(hashMap1.containsKey(s1)) {
                                                        ggfn0.k(((Iterable)hashMap1.get(s1)));
                                                    }
                                                    ggfp ggfp3 = ggfn0.h();
                                                    String s2 = s.toLowerCase(Locale.getDefault());
                                                    ggqj ggqj0 = ggfp3.om();
                                                    while(ggqj0.hasNext()) {
                                                        Object object3 = ggqj0.next();
                                                        if(!ggfp1.contains(new bevl(s2.toLowerCase(Locale.getDefault()), ((gqlo)object3)))) {
                                                            continue;
                                                        }
                                                        break alab1;
                                                    }
                                                    arrayList1.add(new bevq(bedg0, gqlt0.b, s1));
                                                }
                                                else if(!ggfp2.contains(s.toLowerCase(Locale.getDefault()))) {
                                                    arrayList1.add(new bevq(bedg0, gqlt0.b, s1));
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                ++v5;
                                iterator1 = iterator3;
                                map1 = map0;
                                hashMap0 = hashMap3;
                            }
                            ++v3;
                            iterator1 = iterator3;
                            map1 = map0;
                            hashMap0 = hashMap3;
                        }
                        hashMap2 = hashMap0;
                        iterator2 = iterator1;
                        gged2 = gged_interceptors.i(arrayList1);
                    }
                    else {
                        gged2 = ggna.a;
                        hashMap2 = hashMap0;
                        iterator2 = iterator1;
                    }
                }
                else {
                    gged2 = ggna.a;
                    hashMap2 = hashMap0;
                    iterator2 = iterator1;
                }
                arrayList0.addAll(gged2);
                iterator1 = iterator2;
                map1 = map0;
                hashMap0 = hashMap2;
            }
            return gged_interceptors.i(arrayList0);
        }
        return ggna.a;
    }
}

