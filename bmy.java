import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class bmy {
    public final Map a;
    private final String b;

    public bmy(String s) {
        this.a = new LinkedHashMap();
        this.b = s;
    }

    public final bma a() {
        bma bma0 = new bma();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            bmx bmx0 = (bmx)map$Entry0.getValue();
            if(bmx0.f && bmx0.e) {
                String s = (String)map$Entry0.getKey();
                bma0.s(bmx0.a);
                arrayList0.add(s);
            }
        }
        bcs.h("UseCaseAttachState");
        return bma0;
    }

    public final bma b() {
        bma bma0 = new bma();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            bmx bmx0 = (bmx)map$Entry0.getValue();
            if(bmx0.e) {
                bma0.s(bmx0.a);
                arrayList0.add(((String)map$Entry0.getKey()));
            }
        }
        bcs.h("UseCaseAttachState");
        return bma0;
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableCollection(this.e(new bmu()));
    }

    public final Collection d() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((bmx)map$Entry0.getValue()).e) {
                arrayList0.add(((bmx)map$Entry0.getValue()).b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList0);
    }

    public final Collection e(bmw bmw0) {
        Collection collection0 = new ArrayList();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(bmw0.a(((bmx)map$Entry0.getValue()))) {
                ((List)collection0).add(((bmx)map$Entry0.getValue()).a);
            }
        }
        return collection0;
    }

    public final void f(String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        this.k(s, bmb0, bnc0, bmi0, list0).f = true;
    }

    public final void g(String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        this.k(s, bmb0, bnc0, bmi0, list0).e = true;
        this.i(s, bmb0, bnc0, bmi0, list0);
    }

    public final void h(String s) {
        Map map0 = this.a;
        if(map0.containsKey(s)) {
            bmx bmx0 = (bmx)map0.get(s);
            bmx0.f = false;
            if(!bmx0.e) {
                map0.remove(s);
            }
        }
    }

    public final void i(String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        Map map0 = this.a;
        if(!map0.containsKey(s)) {
            return;
        }
        bmx bmx0 = new bmx(bmb0, bnc0, bmi0, list0);
        bmx bmx1 = (bmx)map0.get(s);
        bmx0.e = bmx1.e;
        bmx0.f = bmx1.f;
        map0.put(s, bmx0);
    }

    public final boolean j(String s) {
        return this.a.containsKey(s) ? ((bmx)this.a.get(s)).e : false;
    }

    private final bmx k(String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        Map map0 = this.a;
        bmx bmx0 = (bmx)map0.get(s);
        if(bmx0 == null) {
            bmx0 = new bmx(bmb0, bnc0, bmi0, list0);
            map0.put(s, bmx0);
        }
        return bmx0;
    }
}

