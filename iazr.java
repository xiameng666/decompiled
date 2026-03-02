import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class iazr {
    public static final long a;
    public static final long b;
    public final ScheduledExecutorService c;
    public final gfug d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final Runnable g;
    public final Runnable h;
    public final long i;
    public final long j;
    public int k;
    public final iazq l;

    static {
        iazr.a = TimeUnit.SECONDS.toNanos(10L);
        iazr.b = TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public iazr(iazq iazq0, ScheduledExecutorService scheduledExecutorService0, long v, long v1) {
        gfug gfug0 = new gfug();
        super();
        this.k = 1;
        this.g = new iazs(new iazn(this));
        this.h = new iazs(new iazo(this));
        this.l = iazq0;
        gftb.z(scheduledExecutorService0, "scheduler");
        this.c = scheduledExecutorService0;
        this.d = gfug0;
        this.i = v;
        this.j = v1;
        gfug0.e();
        gfug0.f();
    }

    public final void a() {
        synchronized(this) {
            this.d.e();
            this.d.f();
            int v1 = this.k;
            if(v1 == 2) {
                this.k = 3;
                return;
            }
            if(v1 != 4 && v1 != 5) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.e;
            boolean z = false;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            if(this.k == 5) {
                this.k = 1;
                return;
            }
            this.k = 2;
            if(this.f == null) {
                z = true;
            }
            gftb.r(z, "There should be no outstanding pingFuture");
            this.f = this.c.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
        }
    }

    public final void b() {
        synchronized(this) {
            int v1 = this.k;
            if(v1 == 1) {
                this.k = 2;
                if(this.f == null) {
                    long v2 = this.d.a(TimeUnit.NANOSECONDS);
                    this.f = this.c.schedule(this.h, this.i - v2, TimeUnit.NANOSECONDS);
                }
            }
            else if(v1 == 5) {
                this.k = 4;
            }
        }
    }

    public final void c() {
        synchronized(this) {
        }
        switch(this.k) {
            case 2: 
            case 3: {
                this.k = 1;
                return;
            }
            case 4: {
                this.k = 5;
            }
        }
    }

    public final void d() {
        synchronized(this) {
        }
    }

    public final void e() {
        synchronized(this) {
            if(this.k != 6) {
                this.k = 6;
                ScheduledFuture scheduledFuture0 = this.e;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                ScheduledFuture scheduledFuture1 = this.f;
                if(scheduledFuture1 != null) {
                    scheduledFuture1.cancel(false);
                    this.f = null;
                }
            }
        }
    }
}

