import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

final class ibbd extends ianj_grpcChannel implements iamk {
    public final iawo A;
    public final ibbc B;
    public final AtomicBoolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public final iaun G;
    public final iaup H;
    public final iakt I;
    public final iamg J;
    public final ibaz K;
    public ibbq L;
    public boolean M;
    public final boolean N;
    public final ibed O;
    public final long P;
    public final long Q;
    public final boolean R;
    final iayo S;
    public final ibaf T;
    public int U;
    public final iazx V;
    private final String W;
    private final URI X;
    private final iaov Y;
    private final iaon Z;
    static final Logger a;
    private final iauh aa;
    private final ibcd ab;
    private final ibaj ac;
    private final ibaj ad;
    private final long ae;
    private final iakr af;
    private final Set ag;
    private final CountDownLatch ah;
    private final ibbr ai;
    private final ibdk aj;
    private final ibcb ak;
    static final iapk b;
    static final iapk c;
    static final iapk d;
    public static final ibbq e;
    public static final iami f;
    public static final iamy g;
    public static final iakv h;
    public final iaml i;
    public final iavd j;
    public final ibba k;
    public final Executor l;
    public final ibfr m;
    final iaps n;
    public final ialv o;
    public final iali p;
    public final iavp q;
    public final List r;
    public final String s;
    public iaou t;
    public boolean u;
    public iban v;
    public boolean w;
    public final Set x;
    public Collection y;
    public final Object z;

    static {
        ibbd.a = Logger.getLogger(ibbd.class.getName());
        ibbd.b = iapk.q.f("Channel shutdownNow invoked");
        ibbd.c = iapk.q.f("Channel shutdown invoked");
        ibbd.d = iapk.q.f("Subchannel shutdown invoked");
        ibbd.e = new ibbq(null, new HashMap(), new HashMap(), null, null, null);
        ibbd.f = new iazv();
        ibbd.g = new ibac();
        ibbd.h = new ibae();
    }

    public ibbd(ibbl ibbl0, iavd iavd0, URI uRI0, iaov iaov0, ibcd ibcd0, gful_cronetEngineProvider gful0, List list0, ibfr ibfr0) {
        iaps iaps0 = new iaps(new ibad(this));
        this.n = iaps0;
        this.q = new iavp();
        this.x = new HashSet(16, 0.75f);
        this.z = new Object();
        boolean z = true;
        this.ag = new HashSet(1, 0.75f);
        this.B = new ibbc(this);
        this.C = new AtomicBoolean(false);
        this.ah = new CountDownLatch(1);
        this.U = 1;
        this.L = ibbd.e;
        this.M = false;
        this.O = new ibed();
        this.ai = new ibai(this);
        this.S = new ibak(this);
        this.T = new ibaf(this);
        gftb.z(ibbl0.h, "target");
        this.W = ibbl0.h;
        iaml iaml0 = iaml.b("Channel", ibbl0.h);
        this.i = iaml0;
        gftb.z(ibfr0, "timeProvider");
        this.m = ibfr0;
        ibcd ibcd1 = ibbl0.d;
        gftb.z(ibcd1, "executorPool");
        this.ab = ibcd1;
        Object object0 = ibcd1.a();
        gftb.z(object0, "executor");
        this.l = object0;
        gftb.z(ibbl0.e, "offloadExecutorPool");
        ibaj ibaj0 = new ibaj(ibbl0.e);
        this.ad = ibaj0;
        iaum iaum0 = new iaum(iavd0, ibaj0);
        this.j = iaum0;
        new iaum(iavd0, ibaj0);
        ibba ibba0 = new ibba(iaum0.c());
        this.k = ibba0;
        iaup iaup0 = new iaup(iaml0, ibfr0.a(), "Channel for \'" + ibbl0.h + "\'");
        this.H = iaup0;
        iauo iauo0 = new iauo(iaup0, ibfr0);
        this.I = iauo0;
        this.R = true;
        iauh iauh0 = new iauh(iani.b());
        this.aa = iauh0;
        this.X = uRI0;
        this.Y = iaov0;
        iaot iaot0 = new iaot(true, iauh0);
        iaok.a();
        ibcb ibcb0 = new ibcb();
        this.ak = ibcb0;
        iaol iaol0 = new iaol();
        ibbl0.o.a();
        iaol0.a = (int)443;
        gftb.check(iayh.k);
        iaol0.b = iayh.k;
        gftb.check(iaps0);
        iaol0.c = iaps0;
        gftb.check(ibba0);
        iaol0.e = ibba0;
        iaol0.d = iaot0;
        gftb.check(iauo0);
        iaol0.f = iauo0;
        iaol0.g = ibaj0;
        iaol0.j = ibcb0;
        iaol0.h = ibbl0.f;
        IdentityHashMap identityHashMap0 = ibbl0.i;
        if(identityHashMap0 != null) {
            for(Object object1: identityHashMap0.entrySet()) {
                iaom iaom0 = (iaom)((Map.Entry)object1).getKey();
                Object object2 = ((Map.Entry)object1).getValue();
                gftb.z(iaom0, "key");
                gftb.z(object2, "value");
                if(iaol0.i == null) {
                    iaol0.i = new IdentityHashMap();
                }
                iaol0.i.put(iaom0, object2);
            }
        }
        iaon iaon0 = new iaon(iaol0);
        this.Z = iaon0;
        this.t = ibbd.u(uRI0, iaov0, iaon0);
        this.ac = new ibaj(ibcd0);
        iawo iawo0 = new iawo(this.l, this.n);
        this.A = iawo0;
        iawo0.f = this.ai;
        iawo0.c = new iawi(iawo0, this.ai);
        iawo0.d = new iawj(iawo0, this.ai);
        iawo0.e = new iawk(iawo0, this.ai);
        this.N = true;
        ibaz ibaz0 = new ibaz(this, this.t.a());
        this.K = ibaz0;
        this.af = iala.a(ibaz0, list0);
        this.r = new ArrayList(ibbl0.g);
        gftb.z(gful0, "stopwatchSupplier");
        long v = ibbl0.m;
        if(v == -1L) {
            this.ae = -1L;
        }
        else {
            if(v < ibbl.b) {
                z = false;
            }
            gftb.e(z, "invalid idleTimeoutMillis %s", v);
            this.ae = ibbl0.m;
        }
        ibal ibal0 = new ibal(this);
        ScheduledExecutorService scheduledExecutorService0 = this.j.c();
        gfug gfug0 = new gfug();
        this.aj = new ibdk(ibal0, this.n, scheduledExecutorService0, gfug0);
        ialv ialv0 = ibbl0.k;
        gftb.z(ialv0, "decompressorRegistry");
        this.o = ialv0;
        gftb.z(ibbl0.l, "compressorRegistry");
        this.p = ibbl0.l;
        this.s = ibbl0.j;
        this.Q = 0x1000000L;
        this.P = 0x100000L;
        iazx iazx0 = new iazx(this, ibfr0);
        this.V = iazx0;
        this.G = iazx0.a();
        gftb.check(ibbl0.n);
        this.J = ibbl0.n;
        iamg.a(ibbl0.n.c, this);
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        return this.af.a(iaoj0, iakq0);
    }

    @Override  // iakr
    public final String b() {
        return this.af.b();
    }

    @Override  // iamq
    public final iaml c() {
        return this.i;
    }

    @Override  // ianj_grpcChannel
    public final ianj_grpcChannel d() {
        this.v();
        return this;
    }

    @Override  // ianj_grpcChannel
    public final ianj_grpcChannel e() {
        this.w();
        return this;
    }

    @Override  // ianj_grpcChannel
    public final void f() {
        iazz iazz0 = new iazz(this);
        this.n.execute(iazz0);
    }

    @Override  // ianj_grpcChannel
    public final void g(iall iall0, Runnable runnable0) {
        iazy iazy0 = new iazy(this, runnable0, iall0);
        this.n.execute(iazy0);
    }

    @Override  // ianj_grpcChannel
    public final boolean h(long v, TimeUnit timeUnit0) {
        return this.ah.await(v, timeUnit0);
    }

    @Override  // ianj_grpcChannel
    public final boolean i() {
        return this.C.get();
    }

    @Override  // ianj_grpcChannel
    public final boolean j() {
        return this.F;
    }

    @Override  // ianj_grpcChannel
    public final iall k() {
        iall iall0 = this.q.b;
        if(iall0 != null) {
            return iall0;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public final Executor l(iakq iakq0) {
        return iakq0.c == null ? this.l : iakq0.c;
    }

    public final void m(boolean z) {
        ibdk ibdk0 = this.aj;
        ibdk0.e = false;
        if(z) {
            ScheduledFuture scheduledFuture0 = ibdk0.f;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                ibdk0.f = null;
            }
        }
    }

    public final void n() {
        this.s(true);
        this.A.a(null);
        this.I.a(2, "Entering IDLE state");
        this.q.a(iall.d);
        Object[] arr_object = {this.z, this.A};
        for(int v = 0; v < 2; ++v) {
            if(this.S.a.contains(arr_object[v])) {
                this.o();
                return;
            }
        }
    }

    final void o() {
        this.n.d();
        if(!this.C.get() && !this.w) {
            if(this.S.a.isEmpty()) {
                this.r();
            }
            else {
                this.m(false);
            }
            if(this.v == null) {
                this.I.a(2, "Exiting idle mode");
                iban iban0 = new iban(this);
                iban0.a = new iauc(this.aa, iban0);
                this.v = iban0;
                this.q.a(iall.a);
                ibap ibap0 = new ibap(this, iban0, this.t);
                this.t.d(ibap0);
                this.u = true;
            }
        }
    }

    public final void p() {
        if(this.D) {
            for(Object object0: this.x) {
                ((iazk)object0).h(ibbd.b);
                iayz iayz0 = new iayz(((iazk)object0), ibbd.b);
                ((iazk)object0).g.execute(iayz0);
            }
            Iterator iterator1 = this.ag.iterator();
            if(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                ibce ibce0 = (ibce)object1;
                throw null;
            }
        }
    }

    public final void q() {
        if(!this.F && this.C.get() && this.x.isEmpty() && this.ag.isEmpty()) {
            this.I.a(2, "Terminated");
            iamg.b(this.J.c, this);
            this.ab.b(this.l);
            this.ac.b();
            this.ad.b();
            this.j.close();
            this.F = true;
            this.ah.countDown();
        }
    }

    public final void r() {
        long v = this.ae;
        if(v == -1L) {
            return;
        }
        ibdk ibdk0 = this.aj;
        long v1 = TimeUnit.MILLISECONDS.toNanos(v);
        long v2 = ibdk0.a() + v1;
        ibdk0.e = true;
        if(v2 - ibdk0.d < 0L || ibdk0.f == null) {
            ScheduledFuture scheduledFuture0 = ibdk0.f;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            ibdj ibdj0 = new ibdj(ibdk0);
            ibdk0.f = ibdk0.a.schedule(ibdj0, v1, TimeUnit.NANOSECONDS);
        }
        ibdk0.d = v2;
    }

    public final void s(boolean z) {
        this.n.d();
        if(z) {
            gftb.r(this.u, "nameResolver is not started");
            gftb.r(this.v != null, "lbHelper is null");
        }
        iaou iaou0 = this.t;
        if(iaou0 != null) {
            iaou0.c();
            this.u = false;
            this.t = z ? ibbd.u(this.X, this.Y, this.Z) : null;
        }
        iban iban0 = this.v;
        if(iban0 != null) {
            iauc iauc0 = iban0.a;
            iauc0.b.d();
            iauc0.b = null;
            this.v = null;
        }
    }

    public final void t(iand iand0) {
        this.A.a(iand0);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.g("logId", this.i.a);
        gfsv0.add("target", this.W);
        return gfsv0.toString();
    }

    static iaou u(URI uRI0, iaov iaov0, iaon iaon0) {
        iaou iaou0 = iaov0.a(uRI0, iaon0);
        if(iaou0 == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for " + uRI0);
        }
        ScheduledExecutorService scheduledExecutorService0 = iaon0.e;
        if(scheduledExecutorService0 != null) {
            return new ibez(iaou0, new iauj(scheduledExecutorService0, iaon0.c));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    public final void v() {
        this.I.a(1, "shutdown() called");
        if(!this.C.compareAndSet(false, true)) {
            return;
        }
        ibaa ibaa0 = new ibaa(this);
        this.n.execute(ibaa0);
        ibar ibar0 = new ibar(this.K);
        this.K.c.n.execute(ibar0);
        iazw iazw0 = new iazw(this);
        this.n.execute(iazw0);
    }

    public final void w() {
        this.I.a(1, "shutdownNow() called");
        this.v();
        ibas ibas0 = new ibas(this.K);
        this.K.c.n.execute(ibas0);
        ibab ibab0 = new ibab(this);
        this.n.execute(ibab0);
    }
}

