import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class eglf {
    public static final Object a;
    public static final eglf b;
    public final Map c;

    static {
        bboh.b("ListenersManager", bbcu.f);
        eglf.a = new Object();
        eglf.b = new eglf();
    }

    public eglf() {
        this.c = new WeakHashMap();
    }

    public final void a() {
        synchronized(eglf.a) {
            Iterator iterator0 = this.c.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                try {
                    ((efzc)map$Entry0.getValue()).h(ApiMetadata.b);
                }
                catch(RemoteException unused_ex) {
                    iterator0.remove();
                }
            }
        }
    }
}

