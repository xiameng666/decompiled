import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class ggnk extends gggc {
    public static final ggnk a;
    final transient gged_interceptors d;

    static {
        ggnk.a = new ggnk(ggna.a, ggmi.a);
    }

    public ggnk(gged_interceptors gged0, Comparator comparator0) {
        super(comparator0);
        this.d = gged0;
    }

    @Override  // ggds
    public final Object[] A() {
        return this.d.A();
    }

    @Override  // gggc
    public final Object ceiling(Object object0) {
        int v = this.f(object0, true);
        return v == this.size() ? null : this.d.get(v);
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        if(object0 != null) {
            try {
                if(Collections.binarySearch(this.d, object0, this.b) >= 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if((collection0 instanceof ggmb)) {
            collection0 = ((ggmb)collection0).i();
        }
        if(ggok.a(this.b, collection0) && collection0.size() > 1) {
            ggqj ggqj0 = this.om();
            Iterator iterator0 = collection0.iterator();
            if(!ggqj0.hasNext()) {
                return false;
            }
            Object object0 = iterator0.next();
            Object object1 = ggqj0.next();
            try {
                while(true) {
                    int v = this.Q(object1, object0);
                    if(v < 0) {
                        if(!ggqj0.hasNext()) {
                            return false;
                        }
                        object1 = ggqj0.next();
                    }
                    else {
                        if(v != 0) {
                            break;
                        }
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        object0 = iterator0.next();
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
            return false;
        }
        return super.containsAll(collection0);
    }

    @Override  // gggc
    public final Iterator descendingIterator() {
        return this.ol();
    }

    final int e(Object object0, boolean z) {
        gftb.check(object0);
        int v = Collections.binarySearch(this.d, object0, this.b);
        if(v >= 0) {
            return z ? v + 1 : v;
        }
        return ~v;
    }

    @Override  // ggfp
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Set)) {
            return false;
        }
        if(this.size() != ((Set)object0).size()) {
            return false;
        }
        if(this.isEmpty()) {
            return true;
        }
        if(ggok.a(this.b, ((Set)object0))) {
            Iterator iterator0 = ((Set)object0).iterator();
            try {
                ggqj ggqj0 = this.om();
                do {
                    if(!ggqj0.hasNext()) {
                        return true;
                    }
                    Object object1 = ggqj0.next();
                    Object object2 = iterator0.next();
                }
                while(object2 != null && this.Q(object1, object2) == 0);
            }
            catch(ClassCastException | NoSuchElementException unused_ex) {
                return false;
            }
            return false;
        }
        return this.containsAll(((Set)object0));
    }

    final int f(Object object0, boolean z) {
        gftb.check(object0);
        int v = Collections.binarySearch(this.d, object0, this.b);
        if(v >= 0) {
            return z ? v : v + 1;
        }
        return ~v;
    }

    @Override  // gggc
    public final Object first() {
        if(!this.isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override  // gggc
    public final Object floor(Object object0) {
        int v = this.e(object0, true) - 1;
        return v == -1 ? null : this.d.get(v);
    }

    final ggnk g(int v, int v1) {
        if(v == 0) {
            if(v1 != this.size()) {
                v = 0;
                goto label_5;
            }
            return this;
        }
    label_5:
        if(v < v1) {
            Comparator comparator0 = this.b;
            return new ggnk(this.d.b(v, v1), comparator0);
        }
        return ggnk.W(this.b);
    }

    @Override  // gggc
    public final Object higher(Object object0) {
        int v = this.f(object0, false);
        return v == this.size() ? null : this.d.get(v);
    }

    @Override  // gggc
    public final Iterator iterator() {
        return this.om();
    }

    @Override  // gggc
    public final gggc k() {
        Comparator comparator0 = Collections.reverseOrder(this.b);
        return this.isEmpty() ? ggnk.W(comparator0) : new ggnk(this.d.ot(), comparator0);
    }

    @Override  // gggc
    public final Object last() {
        if(!this.isEmpty()) {
            return this.d.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override  // gggc
    public final Object lower(Object object0) {
        int v = this.e(object0, false) - 1;
        return v == -1 ? null : this.d.get(v);
    }

    @Override  // gggc
    public final gggc n(Object object0, boolean z) {
        return this.g(0, this.e(object0, z));
    }

    @Override  // gggc
    public final ggqj ol() {
        return this.d.ot().E();
    }

    @Override  // gggc
    public final ggqj om() {
        return this.d.E();
    }

    @Override  // ggds
    public final boolean oo() {
        return this.d.oo();
    }

    @Override  // gggc
    public final gggc q(Object object0, boolean z, Object object1, boolean z1) {
        return this.t(object0, z).n(object1, z1);
    }

    @Override
    public final int size() {
        return this.d.size();
    }

    @Override  // gggc
    public final gggc t(Object object0, boolean z) {
        return this.g(this.f(object0, z), this.size());
    }

    @Override  // ggfp
    public final gged_interceptors v() {
        return this.d;
    }

    @Override  // gggc
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override  // ggds
    public final int x(Object[] arr_object, int v) {
        return this.d.x(arr_object, v);
    }

    @Override  // ggds
    public final int y() {
        return this.d.y();
    }

    @Override  // ggds
    public final int z() {
        return this.d.z();
    }
}

