import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class gwqm implements Collection {
    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Abstract implementation does not support adds.");
    }

    @Override
    public final boolean addAll(Collection collection0) {
        int v = 0;
        for(Object object0: collection0) {
            v |= this.add(object0);
        }
        return v != 0;
    }

    @Override
    public boolean contains(Object object0) {
        gwqn gwqn0 = this.f();
        while(gwqn0.hasNext()) {
            if(gwqn0.next().equals(object0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof Collection) && ((Collection)object0).size() == this.size() && this.containsAll(((Collection)object0));
    }

    public abstract gwqn f();

    @Override
    public int hashCode() {
        int v = 0;
        gwqn gwqn0 = this.f();
        while(gwqn0.hasNext()) {
            v += gwqn0.next().hashCode();
        }
        return v;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        return this.f();
    }

    @Override
    public boolean remove(Object object0) {
        gwqn gwqn0 = this.f();
        while(gwqn0.hasNext()) {
            if(gwqn0.next().equals(object0)) {
                gwqn0.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        int v = 0;
        if(this.size() > collection0.size()) {
            for(Object object0: collection0) {
                v |= this.remove(object0);
            }
            return v != 0;
        }
        gwqn gwqn0 = this.f();
        while(gwqn0.hasNext()) {
            Object object1 = gwqn0.next();
            if(collection0.contains(object1)) {
                gwqn0.remove();
                v = 1;
            }
        }
        return v != 0;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        boolean z = false;
        gwqn gwqn0 = this.f();
        while(gwqn0.hasNext()) {
            Object object0 = gwqn0.next();
            if(!collection0.contains(object0)) {
                gwqn0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public abstract int size();

    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        int v1;
        int v = this.size();
        if(arr_object.length < v) {
            Class class0 = arr_object.getClass().getComponentType();
            gwqz.a(class0);
            arr_object = (Object[])Array.newInstance(class0, v);
        }
        try {
            v1 = 0;
            gwqn gwqn0 = this.f();
            while(gwqn0.hasNext()) {
                Object object0 = gwqn0.next();
                arr_object[v1] = object0;
                ++v1;
            }
        }
        catch(ClassCastException classCastException0) {
            throw new ArrayStoreException(classCastException0.getMessage());
        }
        Arrays.fill(arr_object, v1, arr_object.length, null);
        return arr_object;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        gwqn gwqn0 = this.f();
        while(true) {
            Object object0 = gwqn0.next();
            if(object0 == this) {
                object0 = "(this Collection)";
            }
            stringBuilder0.append(object0);
            if(!gwqn0.hasNext()) {
                break;
            }
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

