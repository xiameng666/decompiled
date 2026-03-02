import j..util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;

abstract class ggkb extends ggod {
    public abstract Map a();

    @Override
    public final void clear() {
        this.a().clear();
    }

    @Override
    public boolean contains(Object object0) {
        if((object0 instanceof Map.Entry)) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ggkm.h(this.a(), object1);
            return Objects.equals(object2, ((Map.Entry)object0).getValue()) ? object2 != null || this.a().containsKey(object1) : false;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean remove(Object object0) {
        return !this.contains(object0) || !(object0 instanceof Map.Entry) ? false : this.a().keySet().remove(((Map.Entry)object0).getKey());
    }

    @Override  // ggod
    public final boolean removeAll(Collection collection0) {
        try {
            gftb.check(collection0);
            return ggog.p(this, collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            return ggog.q(this, collection0.iterator());
        }
    }

    @Override  // ggod
    public boolean retainAll(Collection collection0) {
        try {
            gftb.check(collection0);
            return super.retainAll(collection0);
        }
        catch(UnsupportedOperationException unused_ex) {
            HashSet hashSet0 = ggog.i(collection0.size());
            for(Object object0: collection0) {
                if(this.contains(object0) && (object0 instanceof Map.Entry)) {
                    hashSet0.add(((Map.Entry)object0).getKey());
                }
            }
            return this.a().keySet().retainAll(hashSet0);
        }
    }

    @Override
    public int size() {
        return this.a().size();
    }
}

