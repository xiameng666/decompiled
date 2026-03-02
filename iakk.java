import j..util.Objects;
import java.util.IdentityHashMap;
import java.util.Map.Entry;

public final class iakk {
    public static final iakk a;
    public final IdentityHashMap b;
    private static final IdentityHashMap c;

    static {
        IdentityHashMap identityHashMap0 = new IdentityHashMap();
        iakk.c = identityHashMap0;
        iakk.a = new iakk(identityHashMap0);
    }

    public iakk(IdentityHashMap identityHashMap0) {
        this.b = identityHashMap0;
    }

    public final Object a(iakj iakj0) {
        return this.b.get(iakj0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            IdentityHashMap identityHashMap0 = this.b;
            IdentityHashMap identityHashMap1 = ((iakk)object0).b;
            if(identityHashMap0.size() != identityHashMap1.size()) {
                return false;
            }
            for(Object object1: identityHashMap0.entrySet()) {
                if(!identityHashMap1.containsKey(((Map.Entry)object1).getKey())) {
                    return false;
                }
                if(!Objects.equals(((Map.Entry)object1).getValue(), identityHashMap1.get(((Map.Entry)object1).getKey()))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.b.entrySet()) {
            v += Objects.hash(new Object[]{((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()});
        }
        return v;
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

