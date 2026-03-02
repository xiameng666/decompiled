import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;

public final class swg {
    public static final swe a;
    public List b;
    public swe c;
    public final swc d;

    static {
        swg.a = new swe(sxd.a, sxd.a, 0);
    }

    public swg() {
        this(Collections.EMPTY_LIST, swg.a, swc.b);
    }

    public swg(List list0, swe swe0, swc swc0) {
        this.c = swe0;
        this.b = new ArrayList(list0);
        this.d = swc0;
    }

    public final sxd a(byte[] arr_b) {
        sxd sxd0 = swg.e(this.b, arr_b);
        return sxd0.d() ? new sxd(((svt)((swf)sxd0.b()).a())) : sxd.a;
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public final boolean c(byte[] arr_b) {
        return this.a(arr_b).d();
    }

    public final int d(swh swh0) {
        int v2;
        boolean z;
        synchronized(this) {
            Map map0 = swh0.a;
            if(map0.isEmpty() && swh0.b.isEmpty() && swh0.c.isEmpty() && !swh0.d.d()) {
                return 2;
            }
            ArrayList arrayList0 = new ArrayList(this.b);
            int v1 = swh0.c.isEmpty() ^ 1;
            for(Object object0: swh0.c) {
                swy swy0 = (swy)object0;
                if(swy0.c()) {
                    sxd sxd0 = swg.e(arrayList0, ((ssr)swy0.b()).a());
                    if(!sxd0.d()) {
                        return 3;
                    }
                    ((swf)sxd0.b()).a.remove();
                }
                else {
                    svt svt0 = (svt)swy0.a();
                    sxd sxd1 = swg.e(arrayList0, svt0.e().a());
                    if(sxd1.d()) {
                        ((swf)sxd1.b()).b(svt0);
                    }
                    else {
                        arrayList0.add(svt0);
                    }
                }
            }
            Iterator iterator1 = map0.entrySet().iterator();
            while(true) {
                z = false;
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object1 = iterator1.next();
                sxd sxd2 = swg.e(arrayList0, ((svt)((Map.Entry)object1).getKey()).e().a());
                if(!sxd2.d()) {
                    return 3;
                }
                swf swf0 = (swf)sxd2.b();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(((svt)swf0.a()).k());
                for(Object object2: ((List)((Map.Entry)object1).getValue())) {
                    swy swy1 = (swy)object2;
                    if(!swy1.c()) {
                        stb stb0 = (stb)swy1.a();
                        stb stb1 = (stb)linkedHashMap0.put(stb0.d(), stb0);
                        if(stb1 == null || !Arrays.equals(stb1.a(), stb0.a())) {
                            v2 = 1;
                            goto label_50;
                        }
                    }
                    else if(linkedHashMap0.remove(swy1.b()) != null) {
                        v2 = 1;
                        goto label_50;
                    }
                    v2 = 0;
                label_50:
                    v1 |= v2;
                }
                swf0.b(new svr(linkedHashMap0));
            }
            for(Object object3: swh0.b.entrySet()) {
                sxd sxd3 = swg.e(arrayList0, ((svt)((Map.Entry)object3).getKey()).e().a());
                if(!sxd3.d()) {
                    return 3;
                }
                swf swf1 = (swf)sxd3.b();
                ssp ssp0 = ((svt)swf1.a()).e().f;
                svt svt1 = ((svt)swf1.a()).f(((ssp)((Map.Entry)object3).getValue()));
                v1 |= (ssp0 == ((Map.Entry)object3).getValue() ? 0 : 1);
                swf1.b(svt1);
            }
            swe swe0 = (swe)swh0.d.c(this.c);
            if(this.c != swe0 && (this.c.c != swe0.c || !this.c.a.equals(swe0.a) || !this.c.b.equals(swe0.b)) || v1 != 0) {
                z = true;
            }
            this.b = arrayList0;
            this.c = swe0;
        }
        return z ? 1 : 2;
    }

    private static sxd e(List list0, byte[] arr_b) {
        ListIterator listIterator0 = list0.listIterator();
        while(listIterator0.hasNext()) {
            if(Arrays.equals(((svt)listIterator0.next()).e().a(), arr_b)) {
                return new sxd(new swf(listIterator0));
            }
        }
        return sxd.a;
    }
}

