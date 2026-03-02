import com.google.android.gms.cast.CastDevice;
import j..util.Objects;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Set;

public final class auhs {
    final auia a;

    public auhs() {
        throw null;
    }

    public auhs(auia auia0) {
        Objects.requireNonNull(auia0);
        this.a = auia0;
        super();
    }

    public final void a(auhy auhy0, int v, String s, String s1) {
        auia auia0 = this.a;
        auah auah0 = auhy0.a;
        auia0.a.q("notifyProberError IP: %s, networkId: %s, error: %s", auah0, s1, s);
        Map map0 = auia0.i;
        InetSocketAddress inetSocketAddress0 = auah0.b();
        gket gket0 = gket.b(v);
        CastDevice castDevice0 = (CastDevice)map0.get(inetSocketAddress0);
        if(castDevice0 != null) {
            map0.remove(inetSocketAddress0);
            if(gket0 != null) {
                Set set0 = auhy0.b();
                boolean z = auhy0.d();
                auia0.j.W(castDevice0, set0, gket0, z);
            }
        }
        if(s1 != null) {
            new ault(auia0.k.a, auia0.k.b, auhy0, s1, v, System.currentTimeMillis()).b();
        }
        auia0.j.k.d(auah0, gket0);
    }

    public final void b() {
        auhy auhy0;
        auia auia0 = this.a;
        synchronized(auia0.c) {
            auhy0 = auia0.c.isEmpty() ? null : ((auhy)auia0.c.poll());
        }
        if(auhy0 != null) {
            auia0.a(auhy0);
        }
    }
}

