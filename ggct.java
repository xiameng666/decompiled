import java.util.Collection;
import java.util.Queue;

public abstract class ggct extends ggci implements Queue {
    protected abstract Queue c();

    @Override
    public final Object element() {
        return this.c().element();
    }

    @Override  // ggci
    protected Collection h() {
        throw null;
    }

    @Override
    public boolean offer(Object object0) {
        return this.c().offer(object0);
    }

    @Override
    public final Object peek() {
        return this.c().peek();
    }

    @Override
    public final Object poll() {
        return this.c().poll();
    }

    @Override
    public final Object remove() {
        return this.c().remove();
    }
}

