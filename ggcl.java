import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public abstract class ggcl extends ggci implements List {
    @Override
    public void add(int v, Object object0) {
        this.i().add(v, object0);
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        return this.i().addAll(v, collection0);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this || this.i().equals(object0);
    }

    @Override
    public final Object get(int v) {
        return this.i().get(v);
    }

    @Override  // ggci
    protected Collection h() {
        throw null;
    }

    @Override
    public int hashCode() {
        return this.i().hashCode();
    }

    protected abstract List i();

    @Override
    public final int indexOf(Object object0) {
        return this.i().indexOf(object0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return this.i().lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return this.i().listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.i().listIterator(v);
    }

    @Override
    public final Object remove(int v) {
        return this.i().remove(v);
    }

    @Override
    public Object set(int v, Object object0) {
        return this.i().set(v, object0);
    }

    @Override
    public List subList(int v, int v1) {
        return this.i().subList(v, v1);
    }
}

