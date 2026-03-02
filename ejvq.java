import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ejvq {
    public static final ejvp a;
    public static final ejvp b;
    public final Object c;
    public final HashMap d;
    public final Map e;
    private static final Object f;
    private static volatile ejvq g;
    private static final ScheduledExecutorService h;

    static {
        ejvq.f = new Object();
        ejvq.a = new ejvm();
        ejvq.b = new ejvn();
        ejvq.h = clhl.b.h(1, clhr.b);
    }

    private ejvq() {
        this.c = new Object();
        this.d = new HashMap();
        this.e = new ConcurrentHashMap();
    }

    public static ejvq a() {
        if(ejvq.g == null) {
            Object object0 = ejvq.f;
            synchronized(object0) {
                if(ejvq.g == null) {
                    ejvq.g = new ejvq();
                }
            }
            return ejvq.g;
        }
        return ejvq.g;
    }

    public final void b(DataHolder dataHolder0, ejvp ejvp0) {
        Object object0 = null;
        synchronized(this.c) {
            if(dataHolder0.i != 0 && dataHolder0.e("account_name")) {
                String s = dataHolder0.b("account_name", 0, 0);
                if(!TextUtils.isEmpty(s)) {
                    object0 = s;
                }
            }
            if(object0 != null) {
                HashMap hashMap0 = this.d;
                if(hashMap0.containsKey(object0)) {
                    for(Object object2: ((WeakHashMap)hashMap0.get(object0)).values()) {
                        Iterator iterator1 = ((Set)object2).iterator();
                        while(iterator1.hasNext()) {
                            try {
                                Object object3 = iterator1.next();
                                ejvp0.a(((ejtq)object3), dataHolder0);
                            }
                            catch(RemoteException unused_ex) {
                                iterator1.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void c(String s, ejtq ejtq0) {
        this.e.put(s, ejtq0);
        ejvo ejvo0 = new ejvo(this, s);
        ejvq.h.schedule(ejvo0, 5L, TimeUnit.MINUTES);
    }
}

