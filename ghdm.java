import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ghdm {
    public static double a(List list0) {
        ghdi ghdi0;
        List list1;
        int v;
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = ggia.e(list0.size());
            Iterator iterator0 = list0.iterator();
            while(true) {
                v = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                ghae ghae0 = (ghae)object0;
                if(!arrayList0.isEmpty() && ghae0.t(((ghae)gggq.p(arrayList0)))) {
                }
                else if(arrayList0.size() >= 2 && ghae0.t(((ghae)arrayList0.get(arrayList0.size() - 2)))) {
                    arrayList0.remove(arrayList0.size() - 1);
                }
                else {
                    arrayList0.add(ghae0);
                }
            }
            if(arrayList0.size() < 3) {
                list1 = ggna.a;
            }
            else {
                if(((ghae)arrayList0.get(0)).t(((ghae)gggq.p(arrayList0)))) {
                    arrayList0.remove(arrayList0.size() - 1);
                }
                int v1;
                for(v1 = 0; ((ghae)arrayList0.get(v1 + 1)).t(((ghae)arrayList0.get(arrayList0.size() - v1 - 1))); ++v1) {
                }
                list1 = arrayList0.subList(v1, arrayList0.size() - v1);
            }
            if(!list1.isEmpty()) {
                if(list1.isEmpty()) {
                    ghdi0 = new ghdi(0, 1);
                }
                else {
                    ArrayList arrayList1 = ggia.d(new Integer[]{((int)0)});
                    for(int v2 = 1; v2 < list1.size(); ++v2) {
                        if(((ghae)list1.get(v2)).j(((ghae)list1.get(((Integer)arrayList1.get(0)).intValue()))) <= 0) {
                            if(((ghae)list1.get(v2)).j(((ghae)list1.get(((Integer)arrayList1.get(0)).intValue()))) < 0) {
                                arrayList1.clear();
                            }
                            arrayList1.add(Integer.valueOf(v2));
                        }
                    }
                    ghdi ghdi1 = new ghdi(((int)(((Integer)arrayList1.get(0)))), 1);
                    ghdk ghdk0 = new ghdk(list1);
                    int v3 = arrayList1.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        int v5 = (int)(((Integer)arrayList1.get(v4)));
                        ghdi ghdi2 = new ghdi(v5, 1);
                        ghdi ghdi3 = new ghdi(v5 + list1.size(), -1);
                        if(ghdk0.compare(ghdi2, ghdi1) < 0) {
                            ghdi1 = ghdi2;
                        }
                        if(ghdk0.compare(ghdi3, ghdi1) < 0) {
                            ghdi1 = ghdi3;
                        }
                    }
                    ghdi0 = ghdi1;
                }
                int v6 = list1.size();
                int v7 = ghdi0.a;
                int v8 = ghdi0.b;
                double f = ggxv.c(((ghae)list1.get((v7 + v6 - v8) % v6)), ((ghae)list1.get(v7 % v6)), ((ghae)list1.get((v7 + v8) % v6)));
                double f1 = 0.0;
                while(v < v6 - 1) {
                    v7 += v8;
                    double f2 = ggxv.c(((ghae)list1.get((v7 - v8) % v6)), ((ghae)list1.get(v7 % v6)), ((ghae)list1.get((v7 + v8) % v6))) + f1;
                    double f3 = f + f2;
                    ++v;
                    f1 = f - f3 + f2;
                    f = f3;
                }
                return Math.max(-6.283185, Math.min(6.283185, ((double)v8) * (f + f1)));
            }
            return 6.283185;
        }
        return -6.283185;
    }
}

