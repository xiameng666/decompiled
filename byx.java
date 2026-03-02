import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class byx extends bzq implements ibvo, Set {
    public final bzn a;

    public byx(bzn bzn0) {
        super(bzn0);
        this.a = bzn0;
    }

    @Override  // bzq
    public final boolean add(Object object0) {
        return this.a.j(object0);
    }

    @Override  // bzq
    public final boolean addAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        return this.a.k(collection0);
    }

    @Override  // bzq
    public final void clear() {
        this.a.d();
    }

    @Override  // bzq
    public final Iterator iterator() {
        return new byw(this);
    }

    @Override  // bzq
    public final boolean remove(Object object0) {
        return this.a.l(object0);
    }

    @Override  // bzq
    public final boolean removeAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzn bzn0 = this.a;
        int v = bzn0.d;
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            bzn0.e(object0);
        }
        return v != bzn0.d;
    }

    @Override  // bzq
    public final boolean retainAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzn bzn0 = this.a;
        Object[] arr_object = bzn0.b;
        int v = bzn0.d;
        long[] arr_v = bzn0.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v2 << 3) + v4;
                            if(!ibpo.aB(collection0, arr_object[v6])) {
                                bzn0.i(v6);
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return v != bzn0.d;
    }
}

