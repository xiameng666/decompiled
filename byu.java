import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class byu extends bzj implements ibvo, Set {
    public final bzg a;

    public byu(bzg bzg0) {
        super(bzg0);
        this.a = bzg0;
    }

    @Override  // bzj
    public final boolean add(Object object0) {
        return this.a.f(object0);
    }

    @Override  // bzj
    public final boolean addAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzg bzg0 = this.a;
        int v = bzg0.g;
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            int v1 = bzg0.c(object0);
            bzg0.b[v1] = object0;
            long[] arr_v = bzg0.c;
            int v2 = bzg0.d;
            arr_v[v1] = ((long)v2) & 0x7FFFFFFFL | 0x3FFFFFFF80000000L;
            if(v2 != 0x7FFFFFFF) {
                arr_v[v2] = (((long)v1) & 0x7FFFFFFFL) << 0x1F | arr_v[v2] & 0xC00000007FFFFFFFL;
            }
            bzg0.d = v1;
            if(bzg0.e == 0x7FFFFFFF) {
                bzg0.e = v1;
            }
        }
        return v != bzg0.g;
    }

    @Override  // bzj
    public final void clear() {
        this.a.d();
    }

    @Override  // bzj
    public final Iterator iterator() {
        return new byt(this);
    }

    @Override  // bzj
    public final boolean remove(Object object0) {
        return this.a.g(object0);
    }

    @Override  // bzj
    public final boolean removeAll(Collection collection0) {
        int v11;
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzg bzg0 = this.a;
        int v = bzg0.g;
        ibuq.f(collection0, "elements");
        Iterator iterator0 = collection0.iterator();
        while(true) {
            int v1 = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            int v2 = object0 == null ? 0 : object0.hashCode();
            int v3 = bzg0.f;
            int v4 = v2 * 0xCC9E2D51 ^ v2 * 0xCC9E2D51 << 16;
            int v5 = v4 >>> 7 & v3;
        alab1:
            while(true) {
                int v6 = (v5 & 7) << 3;
                long v7 = -((long)v6) >> 0x3F & bzg0.a[(v5 >> 3) + 1] << 0x40 - v6 | bzg0.a[v5 >> 3] >>> v6;
                long v8 = ((long)(v4 & 0x7F)) * 0x101010101010101L ^ v7;
                for(long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L; v9 != 0L; v9 &= -1L + v9) {
                    int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                    if(ibuq.m(bzg0.b[v10], object0)) {
                        v11 = v10;
                        break alab1;
                    }
                }
                if((~v7 << 6 & v7 & 0x8080808080808080L) == 0L) {
                    v1 += 8;
                    v5 = v5 + v1 & v3;
                    continue;
                }
                else {
                    v11 = -1;
                }
                break;
            }
            if(v11 >= 0) {
                bzg0.e(v11);
            }
        }
        return v != bzg0.g;
    }

    @Override  // bzj
    public final boolean retainAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        return this.a.h(collection0);
    }
}

