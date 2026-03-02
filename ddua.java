import android.util.ArraySet;
import android.util.Log;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ddua {
    private static ddua a;
    private final Map b;

    private ddua() {
        this.b = new bxd();
    }

    public static ddua a() {
        synchronized(ddua.class) {
            if(ddua.a == null) {
                ddua.a = new ddua();
            }
        }
        return ddua.a;
    }

    public final void b(ShareTarget shareTarget0, azyf azyf0) {
        synchronized(this) {
            Map map0 = this.b;
            if(!map0.containsKey(azyf0)) {
                map0.put(azyf0, new ArraySet());
            }
            if(!((Set)map0.get(azyf0)).add(shareTarget0)) {
                Log.w("NearbySharing", "Attempted to add a ShareTarget but the ShareTarget already exists.");
            }
        }
    }

    public final void c(azyf azyf0) {
        synchronized(this) {
            this.b.remove(azyf0);
        }
    }

    public final void d(ShareTarget shareTarget0, azyf azyf0) {
        synchronized(this) {
            Set set0 = (Set)this.b.get(azyf0);
            if(set0 == null) {
                Log.w("NearbySharing", "Attempted to remove a ShareTarget for an unknown callback.");
                return;
            }
            if(!set0.remove(shareTarget0)) {
                Log.w("NearbySharing", "Attempted to remove a ShareTarget but no existing ShareTarget found.");
            }
        }
    }

    public final void e() {
        synchronized(this) {
            Map map0 = this.b;
            for(Object object0: map0.entrySet()) {
                azyf azyf0 = (azyf)((Map.Entry)object0).getKey();
                for(Object object1: ((Set)((Map.Entry)object0).getValue())) {
                    azyf0.b(new ddtz(this, ((ShareTarget)object1)));
                }
            }
            map0.clear();
        }
    }

    public final void f(ShareTarget shareTarget0, azyf azyf0) {
        synchronized(this) {
            Set set0 = (Set)this.b.get(azyf0);
            if(set0 == null) {
                Log.w("NearbySharing", "Attempted to update a ShareTarget for an unknown callback.");
                return;
            }
            ggqj ggqj0 = ggfp.G(set0).om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                ShareTarget shareTarget1 = (ShareTarget)object0;
                if(shareTarget1.a == shareTarget0.a) {
                    set0.remove(shareTarget1);
                    set0.add(shareTarget0);
                    return;
                }
            }
            Log.w("NearbySharing", "Attempted to update a ShareTarget but no existing ShareTarget has the same ID.");
        }
    }
}

