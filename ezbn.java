import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ezbn implements ezck {
    public static final bboh a;
    public final Object b;
    public final Set c;
    public Bundle d;
    public ezbf e;
    private static final Object f;
    private static WeakReference g;
    private final Context h;
    private final ServiceConnection i;
    private final gmcg j;
    private final Executor k;

    static {
        ezbn.a = bboh.b("TrustAgent", bbcu.aR);
        ezbn.f = new Object();
        ezbn.g = new WeakReference(null);
    }

    protected ezbn(Context context0, gmcg gmcg0) {
        this.b = new Object();
        this.c = new HashSet();
        this.i = new ezbj(this);
        this.h = context0;
        this.j = gmcg0;
        this.k = new ezci();
    }

    public static ezbn a() {
        ezbn ezbn0;
        Context context0 = AppContextProvider.a();
        synchronized(ezbn.f) {
            ezbn0 = (ezbn)ezbn.g.get();
            if(ezbn0 == null) {
                ezbn0 = new ezbn(context0, gmcn.a(new bblp(1, 9)));
                ezbn.g = new WeakReference(ezbn0);
            }
        }
        return ezbn0;
    }

    @Override  // ezck
    public final Set b() {
        synchronized(this.b) {
        }
        return this.d.keySet();
    }

    @Override  // ezck
    public final void c() {
    }

    public final void d(String s, Object object0) {
        synchronized(this.b) {
            ezbh ezbh0 = new ezbh(this, object0, s);
            this.j.d(ezbh0);
        }
    }

    @Override  // ezck
    public final void e(String s, boolean z) {
        synchronized(this.b) {
            this.d.putBoolean(s, z);
        }
        this.d(s, Boolean.valueOf(z));
    }

    @Override  // ezck
    public final void f(String s, String s1) {
        synchronized(this.b) {
            this.d.putString(s, s1);
        }
        this.d(s, s1);
    }

    @Override  // ezck
    public final void g(String s) {
        synchronized(this.b) {
            if(!this.d.containsKey(s)) {
                return;
            }
            this.d.remove(s);
        }
        this.d(s, null);
    }

    public final void h(ezbl ezbl0) {
        synchronized(this.b) {
            this.c.add(ezbl0);
        }
        Object object0 = this.b;
        __monitor_enter(object0);
        if(this.c.size() == 1) {
            if(this.e == null) {
                try {
                    Intent intent0 = new Intent().setClassName(this.h, "com.google.android.gms.trustagent.PreferenceService");
                    synchronized(object0) {
                        if(!bbic.a().e(this.h, "PreferenceServiceClient", intent0, this.i, 1)) {
                            ((ggtj)((ggtj)ezbn.a.j()).ar(0x4375)).x("[PreferenceServiceClient] Failed to start PreferenceService. Preferences won\'t work");
                        }
                    }
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    throw throwable0;
                }
                __monitor_exit(object0);
                goto label_25;
            }
            __monitor_exit(object0);
            return;
        }
    label_25:
        __monitor_exit(object0);
    }

    public final void i(ezbl ezbl0) {
        synchronized(this.b) {
            this.c.remove(ezbl0);
        }
        synchronized(this.b) {
            if(this.c.isEmpty()) {
                this.e = null;
                this.d = null;
                bbic.a().b(this.h, this.i);
            }
        }
    }

    @Override  // ezck
    public final boolean j(String s) {
        throw null;
    }

    public final boolean k() {
        synchronized(this.b) {
        }
        return this.d != null;
    }

    public final void l() {
        synchronized(this.b) {
            ezbi ezbi0 = new ezbi(this);
            gmbu.t(this.j.e(ezbi0), new ezbk(this), this.k);
        }
    }

    @Override  // ezck
    public final boolean m(String s) {
        synchronized(this.b) {
        }
        return this.d.getBoolean(s, false);
    }
}

