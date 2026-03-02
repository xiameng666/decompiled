import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class iawh extends iakv {
    public final ialq a;
    public iakv b;
    private static final iakv c;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private iaku g;
    private iapk h;
    private List i;
    private iawg j;

    static {
        Logger.getLogger(iawh.class.getName());
        iawh.c = new iawa();
    }

    protected iawh(Executor executor0, ScheduledExecutorService scheduledExecutorService0, ials ials0) {
        ScheduledFuture scheduledFuture0;
        this.i = new ArrayList();
        gftb.z(executor0, "callExecutor");
        this.e = executor0;
        gftb.z(scheduledExecutorService0, "scheduler");
        this.a = ialq.b();
        if(ials0 == null) {
            scheduledFuture0 = null;
        }
        else {
            long v = ials0.b(TimeUnit.NANOSECONDS);
            scheduledFuture0 = scheduledExecutorService0.schedule(new iavt(this, v), v, TimeUnit.NANOSECONDS);
        }
        this.d = scheduledFuture0;
    }

    @Override  // iakv
    public final void a(String s, Throwable throwable0) {
        iapk iapk0 = s == null ? iapk.c.f("Call cancelled without message") : iapk.c.f(s);
        if(throwable0 != null) {
            iapk0 = iapk0.e(throwable0);
        }
        this.g(iapk0, false);
    }

    @Override  // iakv
    public final void b() {
        this.j(new iavz(this));
    }

    @Override  // iakv
    public final void c(int v) {
        if(this.f) {
            this.b.c(v);
            return;
        }
        this.j(new iavy(this, v));
    }

    @Override  // iakv
    public final void d(Object object0) {
        if(this.f) {
            this.b.d(object0);
            return;
        }
        this.j(new iavx(this, object0));
    }

    @Override  // iakv
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        iapk iapk0;
        gftb.r(this.g == null, "already started");
        synchronized(this) {
            gftb.z(iaku0, "listener");
            this.g = iaku0;
            iapk0 = this.h;
            boolean z = this.f;
            if(!z) {
                iawg iawg0 = new iawg(iaku0);
                this.j = iawg0;
                iaku0 = iawg0;
            }
        }
        if(iapk0 != null) {
            iawb iawb0 = new iawb(this, iaku0, iapk0);
            this.e.execute(iawb0);
            return;
        }
        if(z) {
            this.b.e(iaku0, iaof0);
            return;
        }
        this.j(new iavv(this, iaku0, iaof0));
    }

    protected void f() {
    }

    public final void g(iapk iapk0, boolean z) {
        boolean z1;
        iaku iaku0;
        synchronized(this) {
            if(this.b == null) {
                this.i(iawh.c);
                iaku0 = this.g;
                this.h = iapk0;
                z1 = false;
                goto label_11;
            }
            if(!z) {
                iaku0 = null;
                z1 = true;
            label_11:
                if(z1) {
                    this.j(new iavw(this, iapk0));
                }
                else {
                    if(iaku0 != null) {
                        iawb iawb0 = new iawb(this, iaku0, iapk0);
                        this.e.execute(iawb0);
                    }
                    this.h();
                }
                this.f();
            }
        }
    }

    public final void h() {
        List list1;
        for(List list0 = new ArrayList(); true; list0 = list1) {
            synchronized(this) {
                if(this.i.isEmpty()) {
                    break;
                }
                list1 = this.i;
                this.i = list0;
            }
            for(Object object0: list1) {
                ((Runnable)object0).run();
            }
            list1.clear();
        }
        this.i = null;
        this.f = true;
        iawg iawg0 = this.j;
        if(iawg0 != null) {
            iavu iavu0 = new iavu(this, iawg0);
            this.e.execute(iavu0);
        }
    }

    public final void i(iakv iakv0) {
        gftb.u(this.b == null, "realCall already set to %s", this.b);
        ScheduledFuture scheduledFuture0 = this.d;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.b = iakv0;
    }

    private final void j(Runnable runnable0) {
        synchronized(this) {
            if(!this.f) {
                this.i.add(runnable0);
                return;
            }
        }
        runnable0.run();
    }

    @Override  // iakv
    public final iakk k() {
        synchronized(this) {
        }
        return this.b == null ? iakk.a : this.b.k();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("realCall", this.b);
        return gfsv0.toString();
    }
}

