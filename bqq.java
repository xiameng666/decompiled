import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class bqq {
    private final bik a;
    private final int b;
    private final int c;
    private final Rational d;
    private final bqr e;

    public bqq(bik bik0, Size size0) {
        Rational rational0;
        this.a = bik0;
        this.b = bik0.b();
        this.c = bik0.a();
        if(size0 == null) {
            List list0 = bik0.l(0x100);
            if(list0.isEmpty()) {
                rational0 = null;
            }
            else {
                Size size1 = (Size)Collections.max(list0, new bnl());
                rational0 = new Rational(size1.getWidth(), size1.getHeight());
            }
        }
        else {
            rational0 = new Rational(size0.getWidth(), size0.getHeight());
        }
        this.d = rational0;
        this.e = new bqr(bik0, rational0);
    }

    static Rational a(int v, boolean z) {
        switch(v) {
            case -1: {
                return null;
            }
            case 0: {
                return z ? bni.a : bni.b;
            }
            default: {
                if(v != 1) {
                    bcs.a("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + v);
                    return null;
                }
                return z ? bni.c : bni.d;
            }
        }
    }

    static List b(List list0) {
        List list1 = new ArrayList();
        list1.add(bni.a);
        list1.add(bni.c);
        Iterator iterator0 = list0.iterator();
    label_4:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Size size0 = (Size)object0;
            Rational rational0 = new Rational(size0.getWidth(), size0.getHeight());
            if(!list1.contains(rational0)) {
                int v = list1.size();
                int v1 = 0;
                while(v1 < v) {
                    if(bni.a(size0, ((Rational)list1.get(v1)))) {
                        continue label_4;
                    }
                    ++v1;
                }
                list1.add(rational0);
            }
        }
        return list1;
    }

    public final List c(bnc bnc0) {
        List list0 = ((bko)bnc0).I();
        if(list0 != null) {
            return list0;
        }
        Object[] arr_object = null;
        btu btu0 = ((bko)bnc0).M();
        List list1 = ((bko)bnc0).N();
        int v = bnc0.a();
        Rational rational0 = null;
        if(list1 != null) {
            for(Object object0: list1) {
                Pair pair0 = (Pair)object0;
                if(((int)(((Integer)pair0.first))) == v) {
                    arr_object = (Size[])pair0.second;
                    break;
                }
            }
        }
        List list2 = arr_object == null ? null : Arrays.asList(arr_object);
        if(list2 == null) {
            list2 = this.a.l(v);
        }
        List list3 = new ArrayList(list2);
        Collections.sort(list3, new bnl(true));
        if(list3.isEmpty()) {
            bcs.d("SupportedOutputSizesCollector", a.f(v, "The retrieved supported resolutions from camera info internal is empty. Format is ", "."));
        }
        if(btu0 == null) {
            bqr bqr0 = this.e;
            if(list3.isEmpty()) {
                return list3;
            }
            ArrayList arrayList0 = new ArrayList(list3);
            Collections.sort(arrayList0, new bnl(true));
            ArrayList arrayList1 = new ArrayList();
            Size size0 = ((bko)bnc0).K();
            Size size1 = (Size)arrayList0.get(0);
            if(size0 == null || bri.a(size1) < bri.a(size0)) {
                size0 = size1;
            }
            Size size2 = bqr0.a(((bko)bnc0));
            Size size3 = bri.b;
            int v2 = bri.a(size3);
            if(bri.a(size0) < v2) {
                size3 = bri.a;
            }
            else if(size2 != null && bri.a(size2) < v2) {
                size3 = size2;
            }
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Size size4 = (Size)arrayList0.get(v4);
                if(bri.a(size4) <= bri.a(size0) && bri.a(size4) >= bri.a(size3) && !arrayList1.contains(size4)) {
                    arrayList1.add(size4);
                }
            }
            if(arrayList1.isEmpty()) {
                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size3 + "\nmaxSize = " + size0 + "\ninitial size list: " + arrayList0);
            }
            if(((bko)bnc0).F()) {
                rational0 = bqq.a(((bko)bnc0).C(), bqr0.b);
            }
            else {
                Size size5 = bqr0.a(((bko)bnc0));
                if(size5 != null) {
                    for(Object object1: bqq.b(arrayList1)) {
                        rational0 = (Rational)object1;
                        if(!bni.a(size5, rational0)) {
                            continue;
                        }
                        goto label_63;
                    }
                    rational0 = new Rational(size5.getWidth(), size5.getHeight());
                }
            }
        label_63:
            if(size2 == null) {
                size2 = ((bko)bnc0).J();
            }
            List list4 = new ArrayList();
            new HashMap();
            if(rational0 == null) {
                list4.addAll(arrayList1);
                if(size2 != null) {
                    bqq.e(list4, size2);
                    return list4;
                }
            }
            else {
                Map map0 = bqq.d(arrayList1);
                if(size2 != null) {
                    for(Object object2: map0.keySet()) {
                        bqq.e(((List)map0.get(((Rational)object2))), size2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(map0.keySet());
                Collections.sort(arrayList2, new bnh(rational0, bqr0.a));
                int v5 = arrayList2.size();
                for(int v1 = 0; v1 < v5; ++v1) {
                    for(Object object3: ((List)map0.get(((Rational)arrayList2.get(v1))))) {
                        Size size6 = (Size)object3;
                        if(!list4.contains(size6)) {
                            list4.add(size6);
                        }
                    }
                }
            }
            return list4;
        }
        Size size7 = ((bko)bnc0).K();
        ((bko)bnc0).P();
        if(!bnc0.A()) {
            bnc0.a();
        }
        Objects.toString(bnc0);
        bcs.h("SupportedOutputSizesCollector");
        return bqq.f(((bko)bnc0).E(), list3, size7, this.d);
    }

    static Map d(List list0) {
        Map map0 = new HashMap();
        for(Object object0: bqq.b(list0)) {
            map0.put(((Rational)object0), new ArrayList());
        }
        for(Object object1: list0) {
            Size size0 = (Size)object1;
            for(Object object2: map0.keySet()) {
                Rational rational0 = (Rational)object2;
                if(bni.a(size0, rational0)) {
                    ((List)map0.get(rational0)).add(size0);
                }
            }
        }
        return map0;
    }

    static void e(List list0, Size size0) {
        ArrayList arrayList0 = new ArrayList();
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            Size size1 = (Size)list0.get(v);
            if(size1.getWidth() >= size0.getWidth() && size1.getHeight() >= size0.getHeight()) {
                break;
            }
            arrayList0.add(0, size1);
        }
        list0.removeAll(arrayList0);
        Collections.reverse(list0);
        list0.addAll(arrayList0);
    }

    public static List f(btu btu0, List list0, Size size0, Rational rational0) {
        Map map0 = bqq.d(list0);
        Rational rational1 = bqq.a(0, rational0 == null || rational0.getNumerator() >= rational0.getDenominator());
        ArrayList arrayList0 = new ArrayList(map0.keySet());
        Collections.sort(arrayList0, new bnh(rational1, rational0));
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            Rational rational2 = (Rational)arrayList0.get(v);
            linkedHashMap0.put(rational2, ((List)map0.get(rational2)));
        }
        if(size0 != null) {
            int v2 = bri.a(size0);
            for(Object object0: linkedHashMap0.keySet()) {
                List list1 = (List)linkedHashMap0.get(((Rational)object0));
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: list1) {
                    Size size1 = (Size)object1;
                    if(bri.a(size1) <= v2) {
                        arrayList1.add(size1);
                    }
                }
                list1.clear();
                list1.addAll(arrayList1);
            }
        }
        btv btv0 = btu0.b;
        for(Object object2: linkedHashMap0.keySet()) {
            List list2 = (List)linkedHashMap0.get(((Rational)object2));
            if(!list2.isEmpty()) {
                int v3 = btv0.c;
                Integer integer0 = v3;
                if(!btv0.equals(btv.a)) {
                    Size size2 = btv0.b;
                    integer0.getClass();
                    if(v3 == 0) {
                        boolean z = list2.contains(size2);
                        list2.clear();
                        if(!z) {
                            continue;
                        }
                        list2.add(size2);
                    }
                    else {
                        bqq.e(list2, size2);
                    }
                }
            }
        }
        List list3 = new ArrayList();
        for(Object object3: linkedHashMap0.values()) {
            for(Object object4: ((List)object3)) {
                Size size3 = (Size)object4;
                if(!list3.contains(size3)) {
                    list3.add(size3);
                }
            }
        }
        return list3;
    }
}

