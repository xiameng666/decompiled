import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class ggca extends ggct implements Serializable {
    final int a;
    private final Queue b;
    private static final long serialVersionUID;

    public ggca(int v) {
        gftb.d(v >= 0, "maxSize (%s) must >= 0", v);
        this.b = new ArrayDeque(v);
        this.a = v;
    }

    @Override  // ggci
    public final boolean add(Object object0) {
        gftb.check(object0);
        int v = this.a;
        if(v == 0) {
            return true;
        }
        if(this.size() == v) {
            this.b.remove();
        }
        this.b.add(object0);
        return true;
    }

    @Override  // ggci
    public final boolean addAll(Collection collection0) {
        int v = collection0.size();
        int v1 = this.a;
        if(v >= v1) {
            this.clear();
            return gggq.t(this, gggq.i(collection0, v - v1));
        }
        return gghd.n(this, collection0.iterator());
    }

    public final int b() {
        return this.a - this.size();
    }

    @Override  // ggct
    protected final Queue c() {
        return this.b;
    }

    @Override  // ggct
    protected final Collection h() {
        return this.b;
    }

    @Override  // ggct
    public final boolean offer(Object object0) {
        this.add(object0);
        return true;
    }

    @Override  // ggci
    protected final Object oi() {
        return this.b;
    }
}

