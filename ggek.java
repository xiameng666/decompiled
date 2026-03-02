import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;

public class ggek {
    public Comparator a;
    Object[] b;
    int c;
    boolean d;
    ggej e;

    public ggek() {
        this(4);
    }

    public ggek(int v) {
        this.b = new Object[v + v];
        this.c = 0;
        this.d = false;
    }

    private final ggeo a(boolean z) {
        Object[] arr_object;
        if(z) {
            ggej ggej0 = this.e;
            if(ggej0 != null) {
                throw ggej0.a();
            }
        }
        int v = this.c;
        if(this.a == null) {
            arr_object = this.b;
        }
        else {
            if(this.d) {
                this.b = Arrays.copyOf(this.b, v + v);
            }
            arr_object = this.b;
            if(!z) {
                int v1 = this.c;
                HashSet hashSet0 = new HashSet();
                BitSet bitSet0 = new BitSet();
                for(int v2 = v1 - 1; v2 >= 0; --v2) {
                    if(!hashSet0.add(Objects.requireNonNull(arr_object[v2 + v2]))) {
                        bitSet0.set(v2);
                    }
                }
                if(!bitSet0.isEmpty()) {
                    int v3 = v1 - bitSet0.cardinality();
                    Object[] arr_object1 = new Object[v3 + v3];
                    int v4 = 0;
                    int v5 = 0;
                    while(v4 < v1 + v1) {
                        if(bitSet0.get(v4 >>> 1)) {
                            v4 += 2;
                        }
                        else {
                            int v6 = v5 + 1;
                            int v7 = v4 + 1;
                            arr_object1[v5] = Objects.requireNonNull(arr_object[v4]);
                            v5 += 2;
                            v4 += 2;
                            arr_object1[v6] = Objects.requireNonNull(arr_object[v7]);
                        }
                    }
                    arr_object = arr_object1;
                }
                if(arr_object.length < this.b.length) {
                    v = arr_object.length >>> 1;
                }
            }
            ggek.h(arr_object, v, this.a);
        }
        this.d = true;
        ggeo ggeo0 = ggnf.e(v, arr_object, this);
        if(z) {
            ggej ggej1 = this.e;
            if(ggej1 != null) {
                throw ggej1.a();
            }
        }
        return ggeo0;
    }

    public ggeo b() {
        return this.a(true);
    }

    private final void c(int v) {
        Object[] arr_object = this.b;
        int v1 = v + v;
        if(v1 > arr_object.length) {
            this.b = Arrays.copyOf(arr_object, ggdr.f(arr_object.length, v1));
            this.d = false;
        }
    }

    @Deprecated
    public final ggeo f() {
        return this.b();
    }

    public final ggeo g() {
        return this.a(false);
    }

    static void h(Object[] arr_object, int v, Comparator comparator0) {
        Map.Entry[] arr_map$Entry = new Map.Entry[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = v2 + v2;
            arr_map$Entry[v2] = new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(arr_object[v3]), Objects.requireNonNull(arr_object[v3 + 1]));
        }
        ggmo ggmo0 = ggmo.g(comparator0);
        Arrays.sort(arr_map$Entry, 0, v, new gfze(ggka.b, ggmo0));
        for(int v1 = 0; v1 < v; ++v1) {
            int v4 = v1 + v1;
            arr_object[v4] = arr_map$Entry[v1].getKey();
            arr_object[v4 + 1] = arr_map$Entry[v1].getValue();
        }
    }

    public void i(Object object0, Object object1) {
        this.c(this.c + 1);
        ggag.a(object0, object1);
        Object[] arr_object = this.b;
        int v = this.c;
        int v1 = v + v;
        arr_object[v1] = object0;
        arr_object[v1 + 1] = object1;
        this.c = v + 1;
    }

    public final void j(Map.Entry map$Entry0) {
        this.i(map$Entry0.getKey(), map$Entry0.getValue());
    }

    public final void k(ggek ggek0) {
        gftb.check(ggek0);
        this.c(this.c + ggek0.c);
        System.arraycopy(ggek0.b, 0, this.b, this.c + this.c, ggek0.c + ggek0.c);
        this.c += ggek0.c;
    }

    public final void l(Iterable iterable0) {
        if((iterable0 instanceof Collection)) {
            this.c(this.c + ((Collection)iterable0).size());
        }
        for(Object object0: iterable0) {
            this.j(((Map.Entry)object0));
        }
    }

    public final void m(Map map0) {
        this.l(map0.entrySet());
    }
}

