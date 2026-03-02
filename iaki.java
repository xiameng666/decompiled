import java.util.IdentityHashMap;
import java.util.Map.Entry;

public final class iaki {
    public iakk a;
    public IdentityHashMap b;

    public iaki(iakk iakk0) {
        this.a = iakk0;
    }

    public final iakk a() {
        if(this.b != null) {
            for(Object object0: this.a.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!this.b.containsKey(map$Entry0.getKey())) {
                    this.b.put(((iakj)map$Entry0.getKey()), map$Entry0.getValue());
                }
            }
            this.a = new iakk(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(iakj iakj0, Object object0) {
        if(this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(iakj0, object0);
    }
}

