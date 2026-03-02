import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator;
import j..util.Spliterators;
import j..util.stream.Stream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public abstract class ggds extends AbstractCollection implements Collection, Serializable {
    private static final Object[] VY = null;
    private static final long serialVersionUID = 0xDECAFL;

    static {
        ggds.VY = new Object[0];
    }

    public Object[] A() {
        return null;
    }

    @Override
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object arg1);

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public Iterator iterator() {
        return this.om();
    }

    public abstract ggqj om();

    public abstract boolean oo();

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    @Deprecated
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    @Override
    @Deprecated
    public final boolean retainAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 0x510);
    }

    @Override  // j$.util.Collection
    public final Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(ggds.VY);
    }

    @Override  // j$.util.Collection
    public final Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        gftb.check(arr_object);
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.A();
            if(arr_object1 == null) {
                arr_object = ggmp.a(arr_object, v);
                this.x(arr_object, 0);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.z(), this.y(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.x(arr_object, 0);
        return arr_object;
    }

    public gged_interceptors v() {
        return this.isEmpty() ? ggna.a : gged_interceptors.f(this.toArray());
    }

    public Object writeReplace() {
        return new ggeb(this.toArray());
    }

    public int x(Object[] arr_object, int v) {
        ggqj ggqj0 = this.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            arr_object[v] = object0;
            ++v;
        }
        return v;
    }

    public int y() {
        throw new UnsupportedOperationException();
    }

    public int z() {
        throw new UnsupportedOperationException();
    }
}

