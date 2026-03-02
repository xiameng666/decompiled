import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class ejvy extends cjtm {
    private final ejts a;
    private final String b;

    static {
        bboh.b("ClearListenersOperation", bbcu.s);
    }

    public ejvy(ejts ejts0, String s, azug azug0) {
        super(18, "ClearListeners", azug0);
        this.a = ejts0;
        this.b = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ejvq ejvq0 = ejvq.a();
        Object object0 = ejvq0.c;
        ejts ejts0 = this.a;
        String s = this.b;
        synchronized(object0) {
            HashMap hashMap0 = ejvq0.d;
            if(hashMap0.containsKey(s)) {
                ((WeakHashMap)hashMap0.get(s)).remove(ejts0);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

