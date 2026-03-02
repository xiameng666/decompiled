import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class azwb {
    public final Map a;
    public final Map b;

    public azwb() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public final void a(boolean z, Status status0) {
        synchronized(this.a) {
            HashMap hashMap0 = new HashMap(this.a);
        }
        synchronized(this.b) {
            HashMap hashMap1 = new HashMap(this.b);
        }
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(z || ((Boolean)map$Entry0.getValue()).booleanValue()) {
                ((BasePendingResult)map$Entry0.getKey()).k(status0);
            }
        }
        for(Object object1: hashMap1.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object1;
            if(z || ((Boolean)map$Entry1.getValue()).booleanValue()) {
                ((evqp)map$Entry1.getKey()).d(new aztb(status0));
            }
        }
    }
}

