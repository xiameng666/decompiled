import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class yfr extends SparseArray implements Iterable {
    public final int a(int v, Object object0) {
        if(object0 == null) {
            return 0;
        }
        Set set0 = (Set)this.get(v);
        if(set0 == null) {
            HashSet hashSet0 = new HashSet();
            this.append(v, hashSet0);
            hashSet0.add(object0);
            return 2;
        }
        return set0.add(object0) ? 1 : 0;
    }

    public final int b(int v, Object object0) {
        Set set0 = (Set)this.get(v);
        if(set0 == null) {
            return 0;
        }
        if(set0.remove(object0)) {
            if(set0.isEmpty()) {
                this.remove(v);
                return 4;
            }
            return 3;
        }
        return 0;
    }

    public final boolean c() {
        return this.size() == 0;
    }

    @Override
    public final Iterator iterator() {
        return new yfq(this);
    }
}

