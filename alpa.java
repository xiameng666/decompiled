import android.os.Process;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class alpa {
    public final Map a;
    private static final baun b;
    private static alpa c;

    static {
        alpa.b = new baun("ProximityAuth", new String[]{"MessageProcessorManager"});
    }

    public alpa() {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public final aloz a(String s) {
        return (aloz)this.a.get(s);
    }

    public static alpa b() {
        synchronized(alpa.class) {
            if(alpa.c == null) {
                Object[] arr_object = {Process.myUserHandle()};
                alpa.b.h("MessageProcessorManager instantiated for user %s", arr_object);
                alpa.c = new alpa();
            }
        }
        return alpa.c;
    }

    public final List c() {
        return gged_interceptors.i(this.a.keySet());
    }

    public final List d() {
        synchronized(this.a) {
        }
        return gged_interceptors.i(this.a.values());
    }

    public final void e(int v, int v1, String s, boolean z) {
        aloz aloz0 = (aloz)this.a.get(s);
        if(aloz0 != null && hpzm.z()) {
            aloz0.h = altq.b(v);
            aloz0.i = altq.b(v1);
            if(z) {
                if(hpzm.s()) {
                    alor alor0 = new alor(aloz0);
                    aloz0.g.execute(alor0);
                    return;
                }
                aloz0.q();
            }
        }
    }

    public final void f() {
        Map map0 = this.a;
        synchronized(map0) {
            for(Object object0: map0.values()) {
                aloz aloz0 = (aloz)object0;
                if(hpzm.s()) {
                    alom alom0 = new alom(aloz0);
                    aloz0.g.execute(alom0);
                }
                else {
                    aloz0.n();
                }
            }
        }
    }

    public final void g(String s) {
        this.a.remove(s);
    }
}

