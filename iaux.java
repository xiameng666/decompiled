import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class iaux extends iakv {
    public static final double a;
    public final gRPCMethodDescriptor b;
    public final Executor c;
    public final iaun d;
    public final ialq e;
    public iaur f;
    public iakq g;
    public iauy h;
    public final ScheduledExecutorService i;
    public ialv j;
    public iali k;
    private static final Logger l;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final ibaf q;

    static {
        iaux.l = Logger.getLogger(iaux.class.getName());
        "gzip".getBytes(Charset.forName("US-ASCII"));
        iaux.a = (double)TimeUnit.SECONDS.toNanos(1L);
    }

    public iaux(gRPCMethodDescriptor iaoj0, Executor executor0, iakq iakq0, ibaf ibaf0, ScheduledExecutorService scheduledExecutorService0, iaun iaun0) {
        this.j = ialv.b;
        this.k = iali.a;
        this.b = iaoj0;
        boolean z = false;
        if(executor0 == gmap.a) {
            this.c = new ibfa();
            this.m = true;
        }
        else {
            this.c = new ibfe(executor0);
            this.m = false;
        }
        this.d = iaun0;
        this.e = ialq.b();
        if(iaoj0.type_ == gRPCMethodType.a || iaoj0.type_ == gRPCMethodType.c) {
            z = true;
        }
        this.n = z;
        this.g = iakq0;
        this.q = ibaf0;
        this.i = scheduledExecutorService0;
    }

    @Override  // iakv
    public final void a(String s, Throwable throwable0) {
        if(s == null && throwable0 == null) {
            CancellationException cancellationException0 = new CancellationException("Cancelled without a message or cause");
            iaux.l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", cancellationException0);
            throwable0 = cancellationException0;
        }
        if(!this.o) {
            try {
                this.o = true;
                if(this.h != null) {
                    iapk iapk0 = s == null ? iapk.c.f("Call cancelled without message") : iapk.c.f(s);
                    if(throwable0 != null) {
                        iapk0 = iapk0.e(throwable0);
                    }
                    this.h.c(iapk0);
                }
            }
            catch(Throwable throwable1) {
                iaur iaur0 = this.f;
                if(iaur0 != null) {
                    iaur0.b();
                }
                throw throwable1;
            }
            iaur iaur1 = this.f;
            if(iaur1 != null) {
                iaur1.b();
            }
        }
    }

    @Override  // iakv
    public final void b() {
        gftb.r(this.h != null, "Not started");
        gftb.r(((boolean)(this.o ^ 1)), "call was cancelled");
        gftb.r(((boolean)(this.p ^ 1)), "call already half-closed");
        this.p = true;
        this.h.e();
    }

    @Override  // iakv
    public final void c(int v) {
        boolean z = true;
        gftb.r(this.h != null, "Not started");
        if(v < 0) {
            z = false;
        }
        gftb.b(z, "Number requested must be non-negative");
        this.h.g(v);
    }

    @Override  // iakv
    public final void d(Object object0) {
        this.h(object0);
    }

    @Override  // iakv
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        iauy iauy0;
        ialh ialh0;
        iakq iakq0;
        gftb.r(this.h == null, "Already started");
        gftb.r(((boolean)(this.o ^ 1)), "call was cancelled");
        gftb.z(iaku0, "observer");
        gftb.z(iaof0, "headers");
        ialq ialq0 = this.e;
        iakp iakp0 = ibbo.a;
        ibbo ibbo0 = (ibbo)this.g.j(iakp0);
        if(ibbo0 != null) {
            Long long0 = ibbo0.b;
            if(long0 != null) {
                ials ials0 = ials.c(long0.longValue(), TimeUnit.NANOSECONDS);
                ials ials1 = this.g.b;
                if(ials1 == null || ials0.a(ials1) < 0) {
                    this.g = this.g.c(ials0);
                }
            }
            Boolean boolean0 = ibbo0.c;
            if(boolean0 != null) {
                if(boolean0.booleanValue()) {
                    iako iako0 = iakq.a(this.g);
                    iako0.g = Boolean.TRUE;
                    iakq0 = new iakq(iako0);
                }
                else {
                    iako iako1 = iakq.a(this.g);
                    iako1.g = Boolean.FALSE;
                    iakq0 = new iakq(iako1);
                }
                this.g = iakq0;
            }
            Integer integer0 = ibbo0.d;
            if(integer0 != null) {
                iakq iakq1 = this.g;
                Integer integer1 = iakq1.h;
                this.g = integer1 == null ? iakq1.f(integer0.intValue()) : iakq1.f(Math.min(integer1.intValue(), integer0.intValue()));
            }
            Integer integer2 = ibbo0.e;
            if(integer2 != null) {
                iakq iakq2 = this.g;
                Integer integer3 = iakq2.i;
                this.g = integer3 == null ? iakq2.g(integer2.intValue()) : iakq2.g(Math.min(integer3.intValue(), integer2.intValue()));
            }
        }
        String s = this.g.f;
        if(s == null) {
            ialh0 = ialf.a;
        }
        else {
            ialh0 = (ialh)this.k.b.get(s);
            if(ialh0 == null) {
                this.h = ibcc.a;
                iauq iauq0 = new iauq(this, iaku0, s);
                this.c.execute(iauq0);
                return;
            }
        }
        ialv ialv0 = this.j;
        iaof0.g(iayh.f);
        iaoa iaoa0 = iayh.b;
        iaof0.g(iaoa0);
        if(ialh0 != ialf.a) {
            iaof0.i(iaoa0, ialh0.c());
        }
        iaoa iaoa1 = iayh.c;
        iaof0.g(iaoa1);
        byte[] arr_b = ialv0.d;
        if(arr_b.length != 0) {
            iaof0.i(iaoa1, arr_b);
        }
        iaof0.g(iayh.d);
        iaof0.g(iayh.e);
        ials ials2 = this.f();
        iaur iaur0 = new iaur(this, ials2, ials2 != null);
        this.f = iaur0;
        if(ials2 != null && iaur0.c <= 0L) {
            ialc[] arr_ialc = iayh.l(this.g, 0, false);
            Long long1 = (Long)this.g.j(ialc.f);
            this.h = new iaxs(iapk.f.f(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", (ials2 == null ? "CallOptions" : "Context"), ((double)(((double)this.f.c) / iaux.a)), ((double)(long1 == null ? 0.0 : ((double)(((long)long1))) / iaux.a)))), arr_ialc);
        }
        else {
            iayi iayi0 = null;
            ibaf ibaf0 = this.q;
            gRPCMethodDescriptor iaoj0 = this.b;
            iakq iakq3 = this.g;
            ibbd ibbd0 = ibaf0.b;
            if(ibbd0.R) {
                ibbo ibbo1 = (ibbo)iakq3.j(iakp0);
                ibev ibev0 = ibbo1 == null ? null : ibbo1.f;
                if(ibbo1 != null) {
                    iayi0 = ibbo1.g;
                }
                iauy0 = new ibeu(ibaf0, iaoj0, iaof0, iakq3, ibev0, iayi0, ialq0);
            }
            else {
                ialc[] arr_ialc1 = iayh.l(iakq3, 0, false);
                ialq ialq1 = ialq0.a();
                try {
                    iauy0 = ibbd0.A.b(iaoj0, iaof0, iakq3, arr_ialc1);
                }
                finally {
                    ialq0.c(ialq1);
                }
            }
            this.h = iauy0;
        }
        if(this.m) {
            this.h.f();
        }
        Integer integer4 = this.g.h;
        if(integer4 != null) {
            this.h.k(integer4.intValue());
        }
        Integer integer5 = this.g.i;
        if(integer5 != null) {
            this.h.l(integer5.intValue());
        }
        if(ials2 != null) {
            this.h.i(ials2);
        }
        this.h.h(ialh0);
        this.h.j(this.j);
        this.d.b();
        this.h.m(new iauw(this, iaku0));
        iaur iaur1 = this.f;
        if(!iaur1.e) {
            if(iaur1.b && !iaur1.a) {
                ScheduledExecutorService scheduledExecutorService0 = iaur1.f.i;
                if(scheduledExecutorService0 != null) {
                    iaur1.d = scheduledExecutorService0.schedule(new iazs(iaur1), iaur1.c, TimeUnit.NANOSECONDS);
                }
            }
            ialq.d(gmap.a, "executor");
            if(iaur1.e) {
                iaur1.b();
            }
        }
    }

    public final ials f() {
        ials ials0 = this.g.b;
        return ials0 == null ? null : ials0;
    }

    public static final void g(iaku iaku0, iapk iapk0, iaof_metadata iaof0) {
        try {
            iaku0.a(iapk0, iaof0);
        }
        catch(RuntimeException runtimeException0) {
            iaux.l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", runtimeException0);
        }
    }

    private final void h(Object object0) {
        gftb.r(this.h != null, "Not started");
        gftb.r(((boolean)(this.o ^ 1)), "call was cancelled");
        gftb.r(((boolean)(this.p ^ 1)), "call was half-closed");
        try {
            iauy iauy0 = this.h;
            if((iauy0 instanceof ibeu)) {
                ibej ibej0 = ((ibeu)iauy0).s;
                if(ibej0.a) {
                    ibej0.f.a.n(((ibeu)iauy0).f.streamRequest(object0));
                }
                else {
                    ((ibeu)iauy0).s(new ibdx(((ibeu)iauy0), object0));
                }
            }
            else {
                iauy0.n(this.b.streamRequest(object0));
            }
        }
        catch(RuntimeException runtimeException0) {
            this.h.c(iapk.c.e(runtimeException0).f("Failed to stream message"));
            return;
        }
        catch(Error error0) {
            this.h.c(iapk.c.f("Client sendMessage() failed with Error"));
            throw error0;
        }
        if(!this.n) {
            this.h.d();
        }
    }

    @Override  // iakv
    public final iakk k() {
        return this.h == null ? iakk.a : this.h.a();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("method", this.b);
        return gfsv0.toString();
    }
}

