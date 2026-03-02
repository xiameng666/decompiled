package j$.util.stream;

import j..nio.file.y;
import j..util.Objects;
import j..util.Spliterator;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

public final class u extends l5 {
    @Override  // j$.util.stream.b
    public final j2 C(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        if(l7.DISTINCT.w(b0.f)) {
            return b0.j(spliterator0, false, intFunction0);
        }
        if(l7.ORDERED.w(b0.f)) {
            return u.M(b0, spliterator0);
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        y y0 = new y(7, atomicBoolean0, concurrentHashMap0);
        Objects.requireNonNull(y0);
        new u0(y0, false).b(b0, spliterator0);
        Set set0 = concurrentHashMap0.keySet();
        if(atomicBoolean0.get()) {
            HashSet hashSet0 = new HashSet(set0);
            hashSet0.add(null);
            set0 = hashSet0;
        }
        return new n2(set0);
    }

    @Override  // j$.util.stream.b
    public final Spliterator D(b b0, Spliterator spliterator0) {
        if(l7.DISTINCT.w(b0.f)) {
            return b0.L(spliterator0);
        }
        return l7.ORDERED.w(b0.f) ? u.M(b0, spliterator0).spliterator() : new z7(b0.L(spliterator0), new ConcurrentHashMap());
    }

    @Override  // j$.util.stream.b
    public final u5 F(int v, u5 u50) {
        Objects.requireNonNull(u50);
        if(l7.DISTINCT.w(v)) {
            return u50;
        }
        return l7.SORTED.w(v) ? new s(u50) : new t(u50);
    }

    public static n2 M(b b0, Spliterator spliterator0) {
        k k0 = new k(8);
        n n0 = new n(5);
        n n1 = new n(6);
        Objects.requireNonNull(k0);
        Objects.requireNonNull(n0);
        Objects.requireNonNull(n1);
        return new n2(((Collection)new h4(m7.REFERENCE, n1, n0, k0, 3).b(b0, spliterator0)));
    }
}

