import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bjm {
    public final Set a;
    public int b;
    public boolean c;
    public bhv d;
    public bms e;
    private List f;
    private boolean g;
    private blb h;

    public bjm() {
        this.a = new HashSet();
        this.h = blb.a();
        this.b = -1;
        this.c = false;
        this.f = new ArrayList();
        this.g = false;
        this.e = bms.d();
    }

    public bjm(bjo bjo0) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.h = blb.a();
        this.b = -1;
        this.c = false;
        this.f = new ArrayList();
        this.g = false;
        this.e = bms.d();
        hashSet0.addAll(bjo0.d);
        this.h = blb.b(bjo0.e);
        this.b = bjo0.f;
        this.f.addAll(bjo0.h);
        this.g = bjo0.i;
        bms bms0 = bjo0.j;
        ArrayMap arrayMap0 = new ArrayMap();
        for(Object object0: bms0.b()) {
            arrayMap0.put(((String)object0), bms0.a(((String)object0)));
        }
        this.e = new bms(arrayMap0);
        this.c = bjo0.g;
    }

    public final Range a() {
        return (Range)this.h.m(bjo.c, bmi.a);
    }

    public final bjo b() {
        ArrayList arrayList0 = new ArrayList(this.a);
        blf blf0 = blf.f(this.h);
        int v = this.b;
        boolean z = this.c;
        ArrayList arrayList1 = new ArrayList(this.f);
        boolean z1 = this.g;
        bms bms0 = this.e;
        ArrayMap arrayMap0 = new ArrayMap();
        for(Object object0: bms0.b()) {
            arrayMap0.put(((String)object0), bms0.a(((String)object0)));
        }
        return new bjo(arrayList0, blf0, v, z, arrayList1, z1, new bms(arrayMap0), this.d);
    }

    public final void c(Collection collection0) {
        for(Object object0: collection0) {
            this.d(((bhl)object0));
        }
    }

    public final void d(bhl bhl0) {
        if(this.f.contains(bhl0)) {
            return;
        }
        this.f.add(bhl0);
    }

    public final void e(bjr bjr0, Object object0) {
        this.h.c(bjr0, object0);
    }

    public final void f(bjt bjt0) {
        for(Object object0: bjt0.r()) {
            Object object1 = this.h.m(((bjr)object0), null);
            Object object2 = bjt0.l(((bjr)object0));
            if(!(object1 instanceof bla)) {
                if((object2 instanceof bla)) {
                    object2 = ((bla)object2).a();
                }
                this.h.d(((bjr)object0), bjt0.g(((bjr)object0)), object2);
                continue;
            }
            bla bla0 = (bla)object1;
            bla bla1 = (bla)object2;
            throw null;
        }
    }

    public final void g(bka bka0) {
        this.a.add(bka0);
    }

    public final void h(String s, Object object0) {
        this.e.c(s, object0);
    }

    public final void i(Range range0) {
        this.e(bjo.c, range0);
    }

    public final void j(bjt bjt0) {
        this.h = blb.b(bjt0);
    }

    public final void k(int v) {
        if(v != 0) {
            this.e(bnc.z, Integer.valueOf(v));
        }
    }

    public final void l(int v) {
        if(v != 0) {
            this.e(bnc.A, Integer.valueOf(v));
        }
    }

    public final void m() {
        this.g = true;
    }
}

