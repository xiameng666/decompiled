import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class bty {
    public final Rational a;
    public final Rational b;
    public final Set c;
    public final bik d;
    private static final double e;
    private final Size f;
    private final bqq g;
    private final Map h;

    static {
        bty.e = Math.sqrt(2.37037);
    }

    public bty(bin bin0, Set set0) {
        Size size0 = bok.j(((bhj)bin0).a.e());
        bhi bhi0 = ((bhj)bin0).a;
        bqq bqq0 = new bqq(bhi0, size0);
        super();
        this.h = new HashMap();
        this.f = size0;
        Rational rational0 = ((double)size0.getWidth()) / ((double)size0.getHeight()) > bty.e ? bni.c : bni.a;
        Objects.toString(size0);
        Objects.toString(rational0);
        bcs.h("ResolutionsMerger");
        this.a = rational0;
        Rational rational1 = bni.a;
        if(rational0.equals(rational1)) {
            rational1 = bni.c;
            goto label_16;
        }
        if(rational0.equals(bni.c)) {
        label_16:
            this.b = rational1;
            this.d = bhi0;
            this.c = set0;
            this.g = bqq0;
            return;
        }
        Objects.toString(rational0);
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational0);
    }

    public static float a(Rational rational0, Rational rational1) {
        float f = rational0.floatValue();
        float f1 = rational1.floatValue();
        return f > f1 ? f1 / f : f / f1;
    }

    static Rect b(Size size0, Size size1) {
        RectF rectF1;
        RectF rectF0;
        Rational rational0 = bty.i(size1);
        float f = (float)size0.getWidth();
        float f1 = (float)size0.getHeight();
        Rational rational1 = bty.i(size0);
        if(Float.compare(rational0.floatValue(), rational1.floatValue()) == 0) {
            rectF0 = new RectF(0.0f, 0.0f, f, f1);
        }
        else {
            if(Float.compare(rational0.floatValue(), rational1.floatValue()) > 0) {
                float f2 = f / rational0.floatValue();
                float f3 = (f1 - f2) / 2.0f;
                rectF1 = new RectF(0.0f, f3, f, f2 + f3);
            }
            else {
                float f4 = rational0.floatValue() * f1;
                float f5 = (f - f4) / 2.0f;
                rectF1 = new RectF(f5, 0.0f, f4 + f5, f1);
            }
            rectF0 = rectF1;
        }
        Rect rect0 = new Rect();
        rectF0.round(rect0);
        return rect0;
    }

    static Rect c(Rect rect0) {
        return new Rect(rect0.top, rect0.left, rect0.bottom, rect0.right);
    }

    final btw d(bnc bnc0, Rect rect0, int v, boolean z) {
        Size size4;
        Size size3;
        Pair pair0;
        boolean z1;
        if(bok.n(v)) {
            rect0 = bty.c(rect0);
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(z) {
            Size size0 = bok.j(rect0);
            for(Object object0: this.e(bnc0)) {
                Size size1 = (Size)object0;
                Size size2 = bok.j(bty.b(size1, size0));
                if(bty.h(size2, size0)) {
                    continue;
                }
                pair0 = Pair.create(size1, size2);
                goto label_16;
            }
            pair0 = Pair.create(size0, size0);
        label_16:
            size3 = (Size)pair0.first;
            size4 = (Size)pair0.second;
        }
        else {
            Size size5 = bok.j(rect0);
            List list0 = this.e(bnc0);
            for(Object object1: list0) {
                Size size6 = (Size)object1;
                if(this.k(bty.j(size5), size6) || bty.h(size6, size5)) {
                    continue;
                }
                size3 = size6;
                goto label_35;
            }
            for(Object object2: list0) {
                size3 = (Size)object2;
                if(bty.h(size3, size5)) {
                    continue;
                }
                goto label_35;
            }
            size3 = size5;
        label_35:
            rect0 = bty.b(size5, size3);
            size4 = size3;
        }
        btw btw0 = new btw(rect0, size4, size3);
        return z1 ? new btw(bty.c(btw0.a), bok.k(btw0.b), btw0.c) : btw0;
    }

    public final List e(bnc bnc0) {
        Rational rational0;
        if(this.c.contains(bnc0)) {
            Map map0 = this.h;
            if(map0.containsKey(bnc0)) {
                return (List)j..util.Objects.requireNonNull(((List)map0.get(bnc0)));
            }
            List list0 = this.g.c(bnc0);
            HashMap hashMap0 = new HashMap();
            List list1 = new ArrayList();
            for(Object object0: list0) {
                Size size0 = (Size)object0;
                for(Object object1: hashMap0.keySet()) {
                    rational0 = (Rational)object1;
                    if(!bni.a(size0, rational0)) {
                        continue;
                    }
                    goto label_18;
                }
                rational0 = null;
            label_18:
                if(rational0 == null) {
                    rational0 = bty.i(size0);
                }
                else {
                    Size size1 = (Size)j..util.Objects.requireNonNull(((Size)hashMap0.get(rational0)));
                    if(size0.getHeight() > size1.getHeight() || size0.getWidth() > size1.getWidth() || size0.getWidth() == size1.getWidth() && size0.getHeight() == size1.getHeight()) {
                        continue;
                    }
                }
                list1.add(size0);
                hashMap0.put(rational0, size0);
            }
            map0.put(bnc0, list1);
            return list1;
        }
        Objects.toString(bnc0);
        throw new IllegalArgumentException("Invalid child config: " + bnc0);
    }

    public final List f(List list0, boolean z) {
        int v;
        HashMap hashMap0 = new HashMap();
        Rational rational0 = bni.a;
        hashMap0.put(rational0, new ArrayList());
        Rational rational1 = bni.c;
        hashMap0.put(rational1, new ArrayList());
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(rational0);
        arrayList0.add(rational1);
        Iterator iterator0 = list0.iterator();
        while(true) {
            v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Size size0 = (Size)object0;
            if(size0.getHeight() > 0) {
                List list1 = null;
                int v1 = arrayList0.size();
                while(v < v1) {
                    Rational rational2 = (Rational)arrayList0.get(v);
                    if(bni.a(size0, rational2)) {
                        list1 = (List)hashMap0.get(rational2);
                        break;
                    }
                    ++v;
                }
                if(list1 == null) {
                    list1 = new ArrayList();
                    Rational rational3 = bty.i(size0);
                    arrayList0.add(rational3);
                    hashMap0.put(rational3, list1);
                }
                ((List)j..util.Objects.requireNonNull(list1)).add(size0);
            }
        }
        ArrayList arrayList1 = new ArrayList(hashMap0.keySet());
        Collections.sort(arrayList1, new btx(bty.i(this.f)));
        List list2 = new ArrayList();
        int v2 = arrayList1.size();
        while(v < v2) {
            Rational rational4 = (Rational)arrayList1.get(v);
            if(!rational4.equals(rational1) && !rational4.equals(rational0)) {
                list2.addAll(this.g(rational4, ((List)j..util.Objects.requireNonNull(((List)hashMap0.get(rational4)))), z));
            }
            ++v;
        }
        return list2;
    }

    public final List g(Rational rational0, List list0, boolean z) {
        ArrayList arrayList3;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Size size0 = (Size)object0;
            if(bni.a(size0, rational0)) {
                arrayList0.add(size0);
            }
        }
        Collections.sort(arrayList0, new bnl(true));
        HashSet hashSet0 = new HashSet(arrayList0);
        for(Object object1: this.c) {
            List list1 = this.e(((bnc)object1));
            if(!z) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: list1) {
                    Size size1 = (Size)object2;
                    if(!this.k(rational0, size1)) {
                        arrayList1.add(size1);
                    }
                }
                list1 = arrayList1;
            }
            if(!list1.isEmpty()) {
                if(!list1.isEmpty() && !arrayList0.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator iterator3 = arrayList0.iterator();
                label_28:
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        Size size2 = (Size)object3;
                        Iterator iterator4 = list1.iterator();
                        do {
                            if(!iterator4.hasNext()) {
                                continue label_28;
                            }
                            Object object4 = iterator4.next();
                        }
                        while(bty.h(((Size)object4), size2));
                        arrayList2.add(size2);
                    }
                    arrayList0 = arrayList2;
                }
                else {
                    arrayList0 = new ArrayList();
                }
                if(!list1.isEmpty() && !arrayList0.isEmpty()) {
                    arrayList3 = new ArrayList();
                    Iterator iterator5 = (arrayList0.isEmpty() ? arrayList0 : new ArrayList(new LinkedHashSet(arrayList0))).iterator();
                label_43:
                    while(iterator5.hasNext()) {
                        Object object5 = iterator5.next();
                        Size size3 = (Size)object5;
                        for(Object object6: list1) {
                            if(bty.h(((Size)object6), size3)) {
                                continue label_43;
                            }
                        }
                        arrayList3.add(size3);
                    }
                    if(!arrayList3.isEmpty()) {
                        arrayList3.remove(arrayList3.size() - 1);
                    }
                }
                else {
                    arrayList3 = new ArrayList();
                }
                hashSet0.retainAll(arrayList3);
                continue;
            }
            return new ArrayList();
        }
        List list2 = new ArrayList();
        for(Object object7: arrayList0) {
            Size size4 = (Size)object7;
            if(!hashSet0.contains(size4)) {
                list2.add(size4);
            }
        }
        return list2;
    }

    static boolean h(Size size0, Size size1) {
        return size0.getHeight() > size1.getHeight() || size0.getWidth() > size1.getWidth();
    }

    private static Rational i(Size size0) {
        return new Rational(size0.getWidth(), size0.getHeight());
    }

    private static Rational j(Size size0) {
        Rational rational0 = bni.a;
        if(bni.a(size0, rational0)) {
            return rational0;
        }
        return bni.a(size0, bni.c) ? bni.c : bty.i(size0);
    }

    private final boolean k(Rational rational0, Size size0) {
        Rational rational1 = this.a;
        if(!rational1.equals(rational0) && !bni.a(size0, rational0)) {
            float f = rational1.floatValue();
            float f1 = rational0.floatValue();
            float f2 = bty.j(size0).floatValue();
            int v = Float.compare(f, f1);
            if(v != 0) {
                int v1 = Float.compare(f1, f2);
                if(v1 != 0) {
                    return v <= 0 ? v1 > 0 : f1 < f2;
                }
            }
        }
        return false;
    }
}

