import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ggyq implements ghbk, Serializable, Iterable {
    public static final ggyy a = null;
    public ArrayList b;
    private static final long serialVersionUID = 1L;

    static {
        ggyp ggyp0 = (Iterable iterable0) -> {
            ggyq ggyq0 = new ggyq();
            gggq.t(ggyq0.b, iterable0);
            return ggyq0;
        };
        ggyq.a = new ggyw(ggyo.a, ggyo.a, ggyp0);
    }

    public ggyq() {
        this.b = new ArrayList();
    }

    public static int a(List list0, ggym ggym0, int v) {
        int v1 = list0.size() - 1;
        while(v <= v1) {
            int v2 = v + v1 >> 1;
            int v3 = ((ggym)list0.get(v2)).a(ggym0);
            if(v3 < 0) {
                v = v2 + 1;
                continue;
            }
            if(v3 > 0) {
                v1 = v2 - 1;
                continue;
            }
            return v2;
        }
        return v;
    }

    public final int b() {
        return this.b.size();
    }

    // Detected as a lambda impl.
    public static ggyq c(Iterable iterable0) {
        ggyq ggyq0 = new ggyq();
        gggq.t(ggyq0.b, iterable0);
        return ggyq0;
    }

    public final void d(List list0) {
        this.b = new ArrayList(list0);
        list0.clear();
    }

    public final boolean e(ggym ggym0) {
        int v = Collections.binarySearch(this.b, ggym0);
        if(v < 0) {
            v = -v - 1;
        }
        return v >= this.b.size() || !((ggym)this.b.get(v)).G().V(ggym0) ? v != 0 && ((ggym)this.b.get(v - 1)).F().P(ggym0) : true;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggyq) ? this.b.equals(((ggyq)object0).b) : false;
    }

    @Override  // ghbk
    public final ggyh f() {
        if(this.b.isEmpty()) {
            return ggyh.d();
        }
        ghae ghae0 = ghae.a;
        ghae ghae1 = ghae0;
        for(Object object0: this) {
            ghae1 = ghae.l(ghae1, ghae.o(((ggym)object0).I(), ggyi.a(((ggym)object0).j())));
        }
        ggyh ggyh0 = new ggyh((ghae1.t(ghae0) ? ghae.b : ghae.q(ghae1)), ggxr.a);
        for(Object object1: this) {
            ggyh ggyh1 = new ggyi(((ggym)object1)).f();
            if(ggyh0.k()) {
                ggyh0 = ggyh1;
            }
            else {
                if(ggyh1.k()) {
                    continue;
                }
                ghae ghae2 = ggyh0.a;
                ggxr ggxr0 = ggxr.d(new ggxr(ghae2, ggyh1.a), ggyh1.b);
                ggxr ggxr1 = ggxr0.h(ggxr0.f * 8.926193E-16);
                ggxr ggxr2 = ggyh0.b;
                if(ggxr2.f > ggxr1.f) {
                    ggxr1 = ggxr2;
                }
                ggyh0 = new ggyh(ghae2, ggxr1);
            }
        }
        return ggyh0;
    }

    public final boolean g(ghae ghae0) {
        return this.e(ggym.B(ghae0));
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        return this.e(ggyi0.d);
    }

    @Override
    public final int hashCode() {
        int v = 17;
        for(Object object0: this) {
            v = v * 37 + ((ggym)object0).hashCode();
        }
        return v;
    }

    public final boolean i(ggym ggym0) {
        int v = Collections.binarySearch(this.b, ggym0);
        if(v < 0) {
            v = -v - 1;
        }
        return v >= this.b.size() || !((ggym)this.b.get(v)).G().V(ggym0.F()) ? v != 0 && ((ggym)this.b.get(v - 1)).F().P(ggym0.G()) : true;
    }

    @Override
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final boolean j() {
        for(int v = 1; v < this.b.size(); ++v) {
            if(((ggym)this.b.get(v - 1)).F().a(((ggym)this.b.get(v)).G()) >= 0) {
                return false;
            }
            if(v >= 3) {
                ggym ggym0 = (ggym)this.b.get(v - 3);
                ggym ggym1 = (ggym)this.b.get(v - 2);
                ggym ggym2 = (ggym)this.b.get(v - 1);
                ggym ggym3 = (ggym)this.b.get(v);
                long v1 = ggym0.c;
                long v2 = ggym1.c;
                long v3 = ggym2.c;
                long v4 = ggym3.c;
                if((v1 ^ v2 ^ v3) == v4) {
                    long v5 = ggym3.o();
                    long v6 = v5 + v5;
                    if(!ggym3.R()) {
                        long v7 = ~(v6 + (v6 + v6));
                        long v8 = v4 & v7;
                        if((v1 & v7) == v8 && (v2 & v7) == v8 && (v3 & v7) == v8) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void k(ArrayList arrayList0) {
        this.b = arrayList0;
        this.n();
    }

    public final void l(List list0) {
        this.b = new ArrayList(list0.size());
        for(Object object0: list0) {
            this.b.add(new ggym(((long)(((Long)object0)))));
        }
        this.n();
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        return this.i(ggyi0.d);
    }

    public final void n() {
        ggyq.o(this.b);
    }

    public static void o(List list0) {
        Collections.sort(list0);
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            ggym ggym0 = (ggym)list0.get(v);
            if(v1 <= 0 || !((ggym)list0.get(v1 - 1)).O(ggym0)) {
                while(v1 > 0 && ggym0.O(((ggym)list0.get(v1 - 1)))) {
                    --v1;
                }
                while(v1 >= 3) {
                    long v2 = ((ggym)list0.get(v1 - 3)).c ^ ((ggym)list0.get(v1 - 2)).c ^ ((ggym)list0.get(v1 - 1)).c;
                    long v3 = ggym0.c;
                    if(v2 != v3) {
                        break;
                    }
                    long v4 = ggym0.o();
                    long v5 = v4 + v4;
                    long v6 = ~(v5 + (v5 + v5));
                    long v7 = v3 & v6;
                    if((((ggym)list0.get(v1 - 3)).c & v6) != v7 || (((ggym)list0.get(v1 - 2)).c & v6) != v7 || (v6 & ((ggym)list0.get(v1 - 1)).c) != v7 || ggym0.R()) {
                        break;
                    }
                    ggym0 = ggym0.D();
                    v1 += -3;
                }
                list0.set(v1, ggym0);
                ++v1;
            }
        }
        int v8 = list0.size();
        while(v1 < v8) {
            --v8;
            list0.remove(v8);
        }
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

