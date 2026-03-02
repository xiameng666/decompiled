import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class ejvs extends ejvr {
    private final ejts b;
    private final String c;

    public ejvs(ejts ejts0, ejtq ejtq0, String s, azug azug0) {
        super(ejtq0, "AddListener", azug0);
        this.b = ejts0;
        this.c = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ejvq ejvq0 = ejvq.a();
        Object object0 = ejvq0.c;
        ejts ejts0 = this.b;
        ejtq ejtq0 = this.a;
        String s = this.c;
        synchronized(object0) {
            HashMap hashMap0 = ejvq0.d;
            WeakHashMap weakHashMap0 = (WeakHashMap)hashMap0.get(s);
            if(weakHashMap0 == null) {
                weakHashMap0 = new WeakHashMap();
                hashMap0.put(s, weakHashMap0);
            }
            Set set0 = (Set)weakHashMap0.get(ejts0);
            if(set0 == null) {
                set0 = new HashSet();
                weakHashMap0.put(ejts0, set0);
            }
            boolean z = set0.add(ejtq0);
        }
        if(z) {
            this.a.d(new Status(0), ApiMetadata.b);
            return;
        }
        ejtq ejtq1 = this.a;
        Log.w("RemindersApiOp", String.format(("Duplicate listener " + ejtq1 + " " + ejxg.a())));
        ejtq1.d(new Status(10), ApiMetadata.b);
    }
}

