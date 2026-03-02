import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class agb {
    public bxf a;
    public bxd b;
    private bxf c;
    private bxd d;
    private bxd e;
    private bxd f;
    private bxd g;
    private boolean h;
    private int i;
    private boolean j;

    public agb() {
        this.a = new bxf();
        this.c = new bxf();
        this.d = new bxd();
        this.e = new bxd();
        this.f = new bxd();
        this.b = new bxd();
        this.g = new bxd();
        this.h = false;
        this.i = 1;
        this.j = false;
    }

    public agb(agc agc0) {
        this.a = new bxf();
        this.c = new bxf();
        this.d = new bxd();
        this.e = new bxd();
        this.f = new bxd();
        this.b = new bxd();
        this.g = new bxd();
        this.h = false;
        this.i = 1;
        this.j = false;
        this.a.addAll(agc0.a);
        this.c.addAll(agc0.b);
        for(Object object0: agc0.c.entrySet()) {
            this.d.put(((String)((Map.Entry)object0).getKey()), new bxf(((Collection)((Map.Entry)object0).getValue())));
        }
        this.e = agc.a(agc0.d);
        this.f.putAll(agc0.e);
        for(Object object1: agc0.f.entrySet()) {
            this.b.put(((String)((Map.Entry)object1).getKey()), new bxf(((Collection)((Map.Entry)object1).getValue())));
        }
        this.g.putAll(agc0.g);
        this.h = agc0.h;
        this.i = agc0.i;
    }

    public final agc a() {
        bxf bxf0 = new bxf(this.c);
        bxf0.addAll(this.d.keySet());
        bxf0.addAll(this.e.keySet());
        bxf0.addAll(this.f.keySet());
        bxf0.addAll(this.b.keySet());
        bxe bxe0 = new bxe(this.a);
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            bxf0.remove(((aes)object0).a);
        }
        if(!bxf0.isEmpty()) {
            throw new IllegalArgumentException(a.i(bxf0, "Schema types ", " referenced, but were not added."));
        }
        if(this.a.isEmpty() && this.i != 1) {
            throw new IllegalArgumentException("Cannot set version to the request if schema is empty.");
        }
        this.j = true;
        return new agc(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i);
    }

    public final void b() {
        if(this.j) {
            bxd bxd0 = new bxd(this.d.d_num);
            for(Object object0: this.d.entrySet()) {
                bxd0.put(((String)((Map.Entry)object0).getKey()), new bxf(((Collection)((Map.Entry)object0).getValue())));
            }
            this.d = bxd0;
            this.f = new bxd(this.f);
            this.e = agc.a(this.e);
            bxd bxd1 = new bxd(this.b.d_num);
            for(Object object1: this.b.entrySet()) {
                bxd1.put(((String)((Map.Entry)object1).getKey()), new bxf(((Collection)((Map.Entry)object1).getValue())));
            }
            this.b = bxd1;
            this.a = new bxf(this.a);
            this.c = new bxf(this.c);
            this.g = new bxd(this.g);
            this.j = false;
        }
    }

    public final void c(String s, Set set0) {
        kay.i(s);
        kay.i(set0);
        for(Object object0: set0) {
            kay.f(((Integer)object0).intValue(), 1, 11, "permission");
        }
        this.b();
        Set set1 = (Set)this.e.get(s);
        if(set1 == null) {
            set1 = new bxf();
            this.e.put(s, set1);
        }
        set1.add(set0);
    }

    public final void d(Collection collection0) {
        kay.i(collection0);
        this.b();
        this.a.addAll(collection0);
    }

    public final void e(boolean z) {
        this.b();
        this.h = z;
    }

    public final void f(String s, afj afj0) {
        kay.i(s);
        this.b();
        if(afj0 != null && !afj0.a().isEmpty()) {
            this.f.put(s, afj0);
            return;
        }
        this.f.remove(s);
    }

    public final void g(String s) {
        kay.i(s);
        this.b();
        this.c.add(s);
    }

    public final void h(String s, afj afj0) {
        kay.i(s);
        kay.i(afj0);
        this.b();
        Set set0 = (Set)this.d.get(s);
        if(set0 == null) {
            set0 = new bxf();
        }
        set0.add(afj0);
        this.d.put(s, set0);
    }

    public final void i(Class[] arr_class) {
        this.b();
        List list0 = Arrays.asList(arr_class);
        kay.i(list0);
        this.b();
        aev aev0 = aev.b();
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.addAll(list0);
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            for(Object object0: aev0.a(((Class)arrayList0.get(v1))).e()) {
                Class class0 = (Class)object0;
                if(!arrayList0.contains(class0)) {
                    arrayList0.add(class0);
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            arrayList1.add(aev0.a(((Class)arrayList0.get(v))).a());
        }
        this.d(arrayList1);
    }

    public final void j(aes[] arr_aes) {
        this.b();
        this.d(Arrays.asList(arr_aes));
    }

    public final void k(Class class0, afj afj0) {
        this.b();
        this.h(aev.b().a(class0).d(), afj0);
    }
}

