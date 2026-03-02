import android.util.ArrayMap;
import android.util.Pair;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public final class gpqu implements Runnable {
    public final gpqy a;
    public final String b;
    public final cqrr c;

    public gpqu(gpqy gpqy0, String s, cqrr cqrr0) {
        this.a = gpqy0;
        this.b = s;
        this.c = cqrr0;
    }

    @Override
    public final void run() {
        boolean z;
        ArrayMap arrayMap0;
        gpqy gpqy0;
        String s = gpqj.a(this.b);
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            gpqy0 = this.a;
            gpqx gpqx0 = gpqy0.d;
            arrayMap0 = gpqx0.a;
            if(v >= arrayMap0.size()) {
                break;
            }
            if(s.equals(((Pair)arrayMap0.keyAt(v)).first)) {
                arrayList0.add(((gpsh)arrayMap0.valueAt(v)));
            }
        }
        if(!arrayList0.isEmpty()) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                gpsh gpsh0 = (gpsh)arrayList0.get(v1);
                gpqo.a(gpsh0.g);
                ArrayMap arrayMap1 = gpsh0.l;
                if(arrayMap1.remove(this.c) == null) {
                }
                else if(arrayMap1.isEmpty()) {
                    gpsh0.h();
                    gpsh0.h.c();
                    gpqo.a(gpsh0.i.c);
                    gpsh0.i.b.remove(gpsh0.j);
                }
                z = arrayMap1.isEmpty();
                if(z) {
                    gpqm gpqm0 = gpqy0.a;
                    ScheduledExecutorService scheduledExecutorService0 = gpsh0.d;
                    if(!scheduledExecutorService0.isShutdown()) {
                        scheduledExecutorService0.shutdownNow();
                    }
                    gpqm0.a.remove(scheduledExecutorService0);
                    for(int v2 = 0; v2 < arrayMap0.size(); ++v2) {
                        if(Objects.equals(gpsh0, arrayMap0.valueAt(v2))) {
                            arrayMap0.removeAt(v2);
                            break;
                        }
                    }
                    if(gpqy0.f.a) {
                        gpqs gpqs0 = new gpqs(gpqy0, gpsh0.j);
                        gpqy0.e.c(gpqs0, 10000L);
                    }
                }
            }
            if(gpqx0.a()) {
                gpqn.c(gpqy0.c, "All service type listeners unregistered; stopping discovery");
                gpso gpso0 = gpqy0.b;
                gpqn.d(((gpsm)gpso0).q, "Stop discovery.");
                if(((gpsm)gpso0).m != null) {
                    synchronized(((gpsm)gpso0).a) {
                        ((gpsm)gpso0).a.clear();
                    }
                    synchronized(((gpsm)gpso0).b) {
                        ((gpsm)gpso0).b.clear();
                    }
                    ((gpsm)gpso0).d.release();
                    gpqg gpqg0 = ((gpsm)gpso0).s.a;
                    gpqn.d(gpqg0.a, "Stop watching connectivity changes");
                    if(gpqg0.e) {
                        gpqg0.c.unregisterNetworkCallback(gpqg0.b);
                        synchronized(gpqg0.d) {
                            gpqg0.d.clear();
                        }
                        gpqg0.e = false;
                    }
                    ((gpsm)gpso0).k = true;
                    gpsv gpsv0 = ((gpsm)gpso0).q;
                    gpqn.d(gpsv0, "wait For Send Thread To Stop");
                    if(((gpsm)gpso0).h == null) {
                        gpqn.e(gpsv0, "socket thread is already dead.");
                    }
                    else {
                        ((gpsm)gpso0).e(((gpsm)gpso0).h);
                        ((gpsm)gpso0).h = null;
                    }
                    Thread thread0 = ((gpsm)gpso0).i;
                    if(thread0 != null) {
                        ((gpsm)gpso0).e(thread0);
                        ((gpsm)gpso0).i = null;
                    }
                    synchronized(((gpsm)gpso0).e) {
                        ((gpsm)gpso0).m = null;
                        ((gpsm)gpso0).n = null;
                    }
                    synchronized(((gpsm)gpso0).f) {
                        gpsm gpsm0 = (gpsm)gpso0;
                    }
                }
            }
        }
    }
}

