import java.util.Collection;
import java.util.Iterator;

public abstract class ggci extends ggcs implements Collection {
    @Override
    public boolean add(Object object0) {
        return this.h().add(object0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        return this.h().addAll(collection0);
    }

    @Override
    public void clear() {
        this.h().clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.h().contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        return this.h().containsAll(collection0);
    }

    protected abstract Collection h();

    @Override
    public final boolean isEmpty() {
        return this.h().isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.h().iterator();
    }

    public final boolean k(Object object0) {
        return gghd.o(this.iterator(), object0);
    }

    protected final Object[] l() {
        return this.toArray(new Object[this.size()]);
    }

    @Override  // ggcs
    protected Object oi() {
        throw null;
    }

    @Override
    public boolean remove(Object object0) {
        return this.h().remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        return this.h().removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        return this.h().retainAll(collection0);
    }

    @Override
    public final int size() {
        return this.h().size();
    }

    @Override
    public Object[] toArray() {
        return this.h().toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.h().toArray(arr_object);
    }
}

