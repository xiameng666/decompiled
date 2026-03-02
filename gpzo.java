import java.util.ArrayList;
import java.util.Iterator;

public final class gpzo extends gpzq implements Iterable {
    private final ArrayList a;

    public gpzo() {
        this.a = new ArrayList();
    }

    @Override  // gpzq
    public final int a() {
        return this.k().a();
    }

    public final int b() {
        return this.a.size();
    }

    public final gpzq c(int v) {
        return (gpzq)this.a.get(v);
    }

    @Override  // gpzq
    public final String d() {
        return this.k().d();
    }

    public final void e(gpzq gpzq0) {
        this.a.add(gpzq0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gpzo) && ((gpzo)object0).a.equals(this.a);
    }

    public final boolean f(gpzq gpzq0) {
        return this.a.contains(gpzq0);
    }

    @Override  // gpzq
    public final boolean g() {
        return this.k().g();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    private final gpzq k() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        if(v == 1) {
            return (gpzq)arrayList0.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + v);
    }
}

