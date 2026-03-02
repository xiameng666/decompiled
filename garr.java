import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class garr implements lqj {
    public final garw a;

    public garr(garw garw0) {
        this.a = garw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        garw garw0 = this.a;
        Bundle bundle0 = garw0.c;
        for(Object object1: ((gbfr)object0).b) {
            garw0.bf(((Long)object1).longValue());
        }
        gaxl.a();
        int v = 0;
        if(hzmb.d()) {
            ArrayList arrayList0 = new ArrayList();
            HashSet hashSet0 = new HashSet();
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: ((gbfr)object0).a) {
                hcnu hcnu0 = (hcnu)object2;
                garp garp0 = (garp)garw0.aS((hcnu0.c == null ? hcos.a : hcnu0.c).c, garp.class);
                if(garp0 == null) {
                    arrayList0.add(hcnu0);
                }
                else {
                    garp0.ae(hcnu0);
                    hashSet0.add(Long.valueOf(garp0.nz()));
                    arrayList1.add(garp0);
                }
            }
            for(Object object3: ((gbfr)object0).c) {
                hcnu hcnu1 = (hcnu)object3;
                garp garp1 = (garp)garw0.aS((hcnu1.c == null ? hcos.a : hcnu1.c).c, garp.class);
                if(garp1 == null) {
                    arrayList0.add(hcnu1);
                }
                else {
                    garp1.ae(hcnu1);
                    hashSet0.add(Long.valueOf(garp1.nz()));
                    arrayList1.add(garp1);
                }
            }
            for(Object object4: ((gbfr)object0).d) {
                hcnu hcnu2 = (hcnu)object4;
                garp garp2 = (garp)garw0.aS((hcnu2.c == null ? hcos.a : hcnu2.c).c, garp.class);
                if(garp2 == null) {
                    arrayList0.add(hcnu2);
                }
                else {
                    garp2.af(hcnu2, true);
                    hashSet0.add(Long.valueOf(garp2.nz()));
                    arrayList1.add(garp2);
                }
            }
            int v1 = garw0.aP();
            for(int v2 = 0; v2 < v1; ++v2) {
                gaxs gaxs0 = garw0.aT(v2);
                if((gaxs0 instanceof garp) && !hashSet0.contains(Long.valueOf(((garp)gaxs0).nz()))) {
                    HashSet hashSet1 = ((garp)gaxs0).n;
                    if(hashSet1 != null && !Collections.disjoint(hashSet1, hashSet0)) {
                        arrayList1.add(((garp)gaxs0));
                    }
                }
            }
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                garp garp3 = garw0.b(((hcnu)arrayList0.get(v4)), bundle0);
                if(garp3 != null) {
                    arrayList1.add(garp3);
                }
            }
            int v5 = arrayList1.size();
            while(v < v5) {
                ((garp)arrayList1.get(v)).G();
                ++v;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List list0 = ((gbfr)object0).a;
        for(Object object5: list0) {
            hcnu hcnu3 = (hcnu)object5;
            if(garw0.aR((hcnu3.c == null ? hcos.a : hcnu3.c).c) == null) {
                arrayList3.add(hcnu3);
            }
            else {
                arrayList2.add(hcnu3);
            }
        }
        arrayList2.addAll(((gbfr)object0).c);
        int v6 = arrayList2.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            hcnu hcnu4 = (hcnu)arrayList2.get(v7);
            garw0.i((hcnu4.c == null ? hcos.a : hcnu4.c).c, "BE_DM_16").ae(hcnu4);
        }
        for(Object object6: ((gbfr)object0).d) {
            hcos hcos0 = ((hcnu)object6).c;
            if(hcos0 == null) {
                hcos0 = hcos.a;
            }
            garw0.i(hcos0.c, "BE_DM_17").af(((hcnu)object6), true);
        }
        int v8 = arrayList3.size();
        while(v < v8) {
            garw0.b(((hcnu)arrayList3.get(v)), bundle0);
            ++v;
        }
        for(Object object7: list0) {
            hcos hcos1 = ((hcnu)object7).c;
            if(hcos1 == null) {
                hcos1 = hcos.a;
            }
            garp garp4 = (garp)garw0.aS(hcos1.c, garp.class);
            if(garp4 != null) {
                garp4.G();
            }
        }
    }
}

