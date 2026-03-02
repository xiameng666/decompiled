import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class ako implements Iterable {
    public akk b;
    public akk c;
    public final WeakHashMap d;
    public int e;

    public ako() {
        this.d = new WeakHashMap();
        this.e = 0;
    }

    protected akk a(Object object0) {
        akk akk0;
        for(akk0 = this.b; akk0 != null && !akk0.a.equals(object0); akk0 = akk0.c) {
        }
        return akk0;
    }

    public Object b(Object object0) {
        akk akk0 = this.a(object0);
        if(akk0 == null) {
            return null;
        }
        --this.e;
        WeakHashMap weakHashMap0 = this.d;
        if(!weakHashMap0.isEmpty()) {
            for(Object object1: weakHashMap0.keySet()) {
                ((akn)object1).dF(akk0);
            }
        }
        akk akk1 = akk0.d;
        akk akk2 = akk0.c;
        if(akk1 == null) {
            this.b = akk2;
        }
        else {
            akk1.c = akk2;
        }
        akk akk3 = akk0.c;
        if(akk3 == null) {
            this.c = akk1;
        }
        else {
            akk3.d = akk1;
        }
        akk0.c = null;
        akk0.d = null;
        return akk0.b;
    }

    public final akk d(Object object0, Object object1) {
        akk akk0 = new akk(object0, object1);
        ++this.e;
        akk akk1 = this.c;
        if(akk1 == null) {
            this.b = akk0;
        }
        else {
            akk1.c = akk0;
            akk0.d = akk1;
        }
        this.c = akk0;
        return akk0;
    }

    public final akl e() {
        akl akl0 = new akl(this);
        this.d.put(akl0, Boolean.valueOf(false));
        return akl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ako)) {
            return false;
        }
        if(this.e != ((ako)object0).e) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((ako)object0).iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = iterator1.next();
            if(map$Entry0 == null) {
                if(object2 != null) {
                    return false;
                }
                object2 = null;
            }
            if(map$Entry0 != null && !map$Entry0.equals(object2)) {
                return false;
            }
        }
        return !iterator0.hasNext() && !iterator1.hasNext();
    }

    public final Object f(Object object0, Object object1) {
        akk akk0 = this.a(object0);
        if(akk0 != null) {
            return akk0.b;
        }
        this.d(object0, object1);
        return null;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += ((Map.Entry)object0).hashCode();
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new aki(this.b, this.c);
        this.d.put(iterator0, Boolean.valueOf(false));
        return iterator0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((Map.Entry)object0).toString());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

