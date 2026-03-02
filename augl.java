import android.content.Context;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class augl {
    public final avjh a;
    public final gful_cronetEngineProvider b;
    public final ScheduledExecutorService c;
    public final avaa d;
    public final auiz e;
    public final auhn f;
    public final auum g;
    public final Context h;
    public final atxp i;
    public final aulm j;
    public final Map k;
    public augf l;
    public auie m;
    public Set n;
    public int o;
    public boolean p;
    public boolean q;
    public auha r;
    final List s;
    public final bbfe_BaseGrpcServer t;
    public final ausg u;

    public augl(Context context0, ScheduledExecutorService scheduledExecutorService0, auiz auiz0, aulm aulm0, auhn auhn0, auum auum0, bbfe_BaseGrpcServer bbfe0, ausg ausg0, avaa avaa0, atxp atxp0) {
        this.a = new avjh("DiscoveryContext");
        this.b = gfus.a(((gful_cronetEngineProvider)new augj()));
        this.k = new ConcurrentHashMap();
        this.s = DesugarCollections.synchronizedList(new ArrayList());
        this.h = context0;
        this.c = scheduledExecutorService0;
        this.e = auiz0;
        this.j = aulm0;
        this.f = auhn0;
        this.g = auum0;
        this.t = bbfe0;
        this.u = ausg0;
        this.d = avaa0;
        this.i = atxp0;
    }

    public final void a(augk augk0) {
        this.s.add(augk0);
    }

    public final void b() {
        List list0 = this.s;
        synchronized(list0) {
            this.a.m("notify discovery stopped");
            for(Object object0: list0) {
                ((augk)object0).b();
            }
        }
    }
}

