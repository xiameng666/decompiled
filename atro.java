import android.net.ConnectivityManager;
import j..util.Objects;
import java.util.concurrent.ScheduledFuture;

final class atro extends bbln {
    final atrp a;

    public atro(atrp atrp0) {
        Objects.requireNonNull(atrp0);
        this.a = atrp0;
        super(10);
    }

    @Override
    public final void run() {
        try {
            atro.sleep(this.a.d);
        }
        catch(InterruptedException unused_ex) {
            atrp.c.m("recovering from lame duck mode from sleep");
            return;
        }
        synchronized(atrp.class) {
            if(atrp.a != null) {
                atrp.c.m("recovering from lame duck mode after sleep");
                return;
            }
            atrp.c.m("exiting lame duck mode");
            auha auha0 = this.a.k;
            ScheduledFuture scheduledFuture0 = auha0.n;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            augn augn0 = new augn(auha0);
            auha0.f.execute(augn0);
            aush aush0 = auha0.s;
            if(aush0 != null) {
                auha0.v.e(aush0);
            }
            if(avij.e().n()) {
                atzk atzk0 = auha0.t;
                if(atzk0 != null) {
                    augy augy0 = auha0.u;
                    atzl atzl0 = atzk0.b;
                    if(atzl0 != null) {
                        atzl0.a.remove(augy0);
                    }
                }
            }
            aund aund0 = auha0.k;
            if(aund0 != null) {
                try {
                    aund0.c.j(aund0.e);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    aund0.a.h(illegalArgumentException0, "Error when trying to remove on Accounts updated listener.", new Object[0]);
                }
            }
            atrp atrp0 = this.a;
            aufx aufx0 = atrp0.h.l.d;
            if(aufx0 != null) {
                aufx0.d();
            }
            ausg ausg0 = atrp0.r;
            if(avij.e().r() && ausg0.c != null && ausg0.b != null) {
                ausg0.a.c("Unregister network info cache lost network listener", new Object[0]);
                avaa avaa0 = ausg0.c;
                ausi ausi0 = ausg0.b;
                batl.s(ausi0);
                if(avaa0.g) {
                    avaa.a.m("Unregistering lost network listener");
                    ausi0.d(avaa0.i);
                    avaa0.h = null;
                    avaa0.g = false;
                }
                else {
                    avaa.a.m("Already unregistered lost network listener");
                }
            }
            ausi ausi1 = ausg0.b;
            if(ausi1 != null) {
                try {
                    gmcg gmcg0 = ((ausn)ausi1).b;
                    if(!gmcg0.isShutdown()) {
                        gmcg0.shutdown();
                    }
                }
                catch(SecurityException securityException0) {
                    ausn.a.e(securityException0, "Error when attempting to shut down executor.", new Object[0]);
                }
                if(((ausn)ausi1).g) {
                    ausn.a.c("Stop monitoring connectivity changes", new Object[0]);
                    ((ausn)ausi1).h();
                    ConnectivityManager connectivityManager0 = ((ausn)ausi1).d;
                    if(connectivityManager0 != null) {
                        connectivityManager0.unregisterNetworkCallback(((ausn)ausi1).c);
                    }
                    if(!((ausn)ausi1).j) {
                        ((ausn)ausi1).h.unregisterReceiver(((ausn)ausi1).k);
                    }
                    ((ausn)ausi1).g = false;
                }
            }
            ausg0.b = null;
            atrp0.f.s();
            aufx aufx1 = atrp0.f.e;
            if(aufx1 != null) {
                aufx1.d();
            }
            atrp.b = null;
        }
    }
}

