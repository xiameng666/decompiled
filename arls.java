import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class arls {
    private static final aqql a;
    private volatile int b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private final long e;
    private final arfz f;

    static {
        arls.a = new aqql(new String[]{"UsbConnectionStateTracker"});
    }

    public arls(ScheduledExecutorService scheduledExecutorService0, long v, arfz arfz0) {
        this.d = null;
        batl.b(v >= 0L);
        this.b = 3;
        this.c = scheduledExecutorService0;
        this.e = v;
        this.f = arfz0;
    }

    final void a() {
        synchronized(this) {
            if(this.b == 1) {
                arls.a.m("onConnected invoked when USB was already connected", new Object[0]);
                return;
            }
            this.g(1);
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.d = null;
            }
        }
    }

    final void b() {
        synchronized(this) {
            if(this.b != 1) {
                arls.a.m("onDisconnected invoked when USB was already disconnected", new Object[0]);
                return;
            }
            this.g(2);
            arlr arlr0 = () -> synchronized(this) {
                if(this.b != 2) {
                    arls.a.d("Not switching to DISCONNECTED_AFTER_COOLDOWN as USB has since reconnected.", new Object[0]);
                    return;
                }
                this.g(3);
            };
            this.d = ((bbll)this.c).g(arlr0, this.e, TimeUnit.MILLISECONDS);
        }
    }

    public final void c() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.d = null;
                arls.a.h("onOtherTransportConnected. Cancelled cooldown future.", new Object[0]);
            }
            arls.a.h("Setting existing usbConnectionStateTracker to OTHER_TRANSPORT_CONNECTED state", new Object[0]);
            this.g(4);
        }
    }

    public final void d() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.d = null;
                arls.a.h("onShutdown. Cancelled cooldown future.", new Object[0]);
            }
            this.g(5);
        }
    }

    // Detected as a lambda impl.
    public final void e() {
        synchronized(this) {
            if(this.b != 2) {
                arls.a.d("Not switching to DISCONNECTED_AFTER_COOLDOWN as USB has since reconnected.", new Object[0]);
                return;
            }
            this.g(3);
        }
    }

    private static String f(int v) {
        switch(v) {
            case 1: {
                return "CONNECTED";
            }
            case 2: {
                return "DISCONNECTED_WITHIN_COOLDOWN";
            }
            case 3: {
                return "DISCONNECTED_AFTER_COOLDOWN";
            }
            case 4: {
                return "OTHER_TRANSPORT_CONNECTED";
            }
            case 5: {
                return "SHUTDOWN";
            }
            default: {
                return Integer.toString(v);
            }
        }
    }

    private final void g(int v) {
        synchronized(this) {
            int v2 = this.b;
            arls.a.h("USB connection state transitioning from %s to %s", new Object[]{arls.f(v2), arls.f(v)});
            this.b = v;
            argf argf0 = this.f.a;
            if(v2 != 2) {
                if(v2 == 1 && v == 2) {
                    argf0.d.i(4, null, 1, 2);
                }
            }
            else if(v == 1) {
                argf0.d.i(5, null, 1, 3);
            }
            if((!hqhq.o() || !argf0.o) && v == 3) {
                argf0.j();
            }
        }
    }
}

