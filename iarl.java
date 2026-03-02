import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class iarl extends iarm implements iavn {
    private int A;
    private gmcd B;
    public final Executor a;
    public final iaqy b;
    public final iara c;
    public final AtomicInteger d;
    public final long e;
    public final boolean f;
    public ibbr g;
    public ScheduledFuture h;
    public gmcd i;
    private final ibcd y;
    private final iasr z;

    public iarl(iarc iarc0, iaql iaql0, iavc iavc0) {
        iakk iakk0 = iavc0.b;
        iaki iaki0 = new iaki(iakk.a);
        iaki0.b(iaya.a, iapd.a);
        iaki0.b(iaya.b, iakk0);
        Class class0 = iarc0.a.getClass();
        iaql iaql1 = iaql.a(new ComponentName(iarc0.a, class0));
        iaki0.b(iamb.b, iaql1);
        iaki0.b(iamb.a, iaql0);
        iaki0.b(iarl.l, iarc0.g);
        iakk iakk1 = iaki0.a();
        String s = iarc0.a.getClass().getSimpleName();
        super(iarc0.c, iakk1, iaml.a(iarl.class, s + "->" + iaql0));
        this.A = 1001;
        this.y = iarc0.d;
        this.b = iarc0.e;
        this.a = iarc0.d.a();
        this.e = 60000L;
        Boolean boolean0 = (Boolean)iavc0.b.a(iaqm.c);
        this.f = boolean0 == null ? false : boolean0.booleanValue();
        this.d = new AtomicInteger();
        this.z = new iasr();
        Intent intent0 = iaql0.a.cloneFilter();
        this.c = new iasv(iarc0.b, iarc0.a, intent0, (iaql0.b == null ? null : iaql0.b), iarc0.f.b, this);
    }

    public final gmcd a(int v) {
        return (this.b instanceof iaqn) ? ((iaqn)this.b).b(v) : gmbu.m(new iari(this, v), this.a);
    }

    @Override  // iavb
    public final iauy b(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, ialc[] arr_ialc) {
        iauy iauy2;
        iauy iauy1;
        Throwable throwable2;
        iarl iarl0;
        iarq iarq0;
        ibfn ibfn0;
        int v;
        iauy iauy0;
        __monitor_enter(this);
        try {
            if(!this.y(3)) {
                iauy0 = iarl.z((this.w() ? this.s : iapk.p.f("newStream() before transportReady()")), this.r, arr_ialc);
                goto label_3;
            }
            goto label_5;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            iarl0 = this;
            goto label_35;
        }
    label_3:
        __monitor_exit(this);
        return iauy0;
        try {
        label_5:
            v = this.A;
            this.A = v + 1;
            if(v + 1 == 0xFFFFFF) {
                goto label_8;
            }
            goto label_9;
        }
        catch(Throwable throwable1) {
            iarl0 = this;
            goto label_34;
        }
        try {
        label_8:
            this.A = 1001;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            iarl0 = this;
            goto label_35;
        }
        try {
        label_9:
            ibfn0 = ibfn.l(arr_ialc, this.r);
            iarq0 = new iarq(this, this.r, v, iayh.j(iakq0));
            if(this.p.putIfAbsent(Integer.valueOf(v), iarq0) == null) {
                goto label_16;
            }
            goto label_28;
        }
        catch(Throwable throwable1) {
            iarl0 = this;
            goto label_34;
        }
    label_16:
        if(iarq0.a) {
            try {
                if(this.d.getAndIncrement() == 0) {
                    this.g.a(true);
                }
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
                iarl0 = this;
                goto label_35;
            }
        }
        try {
            iarl0 = this;
            iauy1 = new iasw(iarq0, new iasn(iarl0, v, iaoj0, iaof0, ibfn0), iarl0.r);
        }
        catch(Throwable throwable1) {
            goto label_34;
        }
        __monitor_exit(iarl0);
        return iauy1;
        try {
        label_28:
            iarl0 = this;
            iapk iapk0 = iapk.p.f("Clashing call IDs");
            iarl0.u(iapk0, true);
            iauy2 = iarl.z(iapk0, iarl0.r, arr_ialc);
            goto label_37;
        label_34:
            throwable2 = throwable1;
        label_35:
            __monitor_exit(iarl0);
        }
        catch(Throwable throwable1) {
            goto label_34;
        }
        throw throwable2;
    label_37:
        __monitor_exit(iarl0);
        return iauy2;
    }

    @Override  // ibbs
    public final Runnable d(ibbr ibbr0) {
        Runnable runnable0;
        synchronized(this) {
            this.g = ibbr0;
            runnable0 = new iarg(this);
        }
        return runnable0;
    }

    public final void e(Throwable throwable0) {
        synchronized(this) {
            this.u(iapk.p.f("Could not evaluate SecurityPolicy").e(throwable0), true);
        }
    }

    public final void f(IBinder iBinder0, iapk iapk0) {
        synchronized(this) {
            if(this.y(2)) {
                if(!iapk0.h()) {
                    this.u(iapk0, true);
                    return;
                }
                iasm iasm0 = iasm.b(iBinder0, this.a);
                this.t = iasm0;
                try {
                    iasm0.b.linkToDeath(this, 0);
                }
                catch(RemoteException unused_ex) {
                    this.u(iapk.q.f("Failed to observe outgoing binder"), true);
                    return;
                }
                if(!this.w()) {
                    this.x(3);
                    iakk iakk0 = this.r;
                    this.g.e();
                    this.r = iakk0;
                    this.g.b();
                    ScheduledFuture scheduledFuture0 = this.h;
                    if(scheduledFuture0 != null) {
                        scheduledFuture0.cancel(false);
                        this.h = null;
                    }
                }
            }
        }
    }

    @Override  // iarm
    protected final void g(Parcel parcel0) {
        parcel0.readInt();
    }

    public final void h(iapk iapk0) {
        synchronized(this) {
            if(this.y(2)) {
                if(!iapk0.h()) {
                    this.u(iapk0, true);
                    return;
                }
                this.c.a();
            }
        }
    }

    @Override  // iarm
    protected final void i(Parcel parcel0) {
        int v = Binder.getCallingUid();
        iaki iaki0 = new iaki(this.r);
        iaki0.b(iarl.k, Integer.valueOf(v));
        iapd iapd0 = v == Process.myUid() ? iapd.c : iapd.b;
        iaki0.b(iaya.a, iapd0);
        this.r = iaki0.a();
        if(this.y(2)) {
            int v1 = parcel0.readInt();
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(v1 != 1) {
                this.u(iapk.q.f("Wire format version mismatch"), true);
                return;
            }
            if(iBinder0 == null) {
                this.u(iapk.q.f("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            gmcd gmcd0 = this.a(v);
            this.B = gmcd0;
            gmbu.t(gmcd0, new iark(this, iBinder0), this.a);
        }
    }

    @Override  // iarm
    public final void j(iapk iapk0) {
        this.g.c(iapk0);
    }

    @Override  // iarm
    public final void k() {
        if(this.d.getAndSet(0) > 0) {
            this.g.a(false);
        }
        ScheduledFuture scheduledFuture0 = this.h;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
            this.h = null;
        }
        gmcd gmcd0 = this.i;
        if(gmcd0 != null) {
            gmcd0.cancel(false);
        }
        gmcd gmcd1 = this.B;
        if(gmcd1 != null) {
            gmcd1.cancel(false);
        }
        ((iasv)this.c).c(iapk.c);
        this.g.d();
    }

    public final void l(IBinder iBinder0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        iasm iasm0 = iasm.b(iBinder0, this.a);
        try {
            iasp iasp0 = iasp.c();
            TWR.declareResource(iasp0);
            TWR.useResource$NT(iasp0);
            iasp0.a().writeInt(1);
            iasp0.a().writeStrongBinder(this.o);
            iasm0.a(1, iasp0);
            FIN.finallyExec$NT(v);
        }
        catch(RemoteException remoteException0) {
            this.u(iarm.s(remoteException0), true);
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public final void m() {
        synchronized(this) {
            if(this.y(2)) {
                this.h = null;
                this.u(iapk.f.f("Connect timeout " + this.e + "ms lapsed"), true);
            }
        }
    }

    public final void n(iapk iapk0) {
        synchronized(this) {
            this.u(iapk0, true);
        }
    }

    @Override  // iarm
    public final void o() {
        this.m.b(this.n);
        this.y.b(this.a);
    }

    @Override  // ibbs
    public final void p(iapk iapk0) {
        synchronized(this) {
            gftb.z(iapk0, "reason");
            this.u(iapk0, false);
        }
    }

    @Override  // ibbs
    public final void q(iapk iapk0) {
        synchronized(this) {
            gftb.z(iapk0, "reason");
            this.u(iapk0, true);
        }
    }

    private static iauy z(iapk iapk0, iakk iakk0, ialc[] arr_ialc) {
        ibfn.l(arr_ialc, iakk0);
        return new iaxs(iapk0, arr_ialc);
    }
}

