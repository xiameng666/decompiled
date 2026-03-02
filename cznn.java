import android.content.Context;
import android.os.SystemClock;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class cznn extends czvg {
    public final String a;
    public final czyv b;
    public final czyv c;
    public final CountDownLatch d;
    public czyb e;
    public czze f;
    public final String g;
    public gyxo h;
    public cumn i;
    public final List j;
    public final ScheduledExecutorService k;
    final czno l;
    public czzk m;
    private final Context p;
    private final gybo q;
    private final ScheduledExecutorService r;
    private final gmcg s;
    private long t;

    public cznn(czno czno0, Context context0, String s, czyv czyv0, gybo gybo0, cump cump0, ScheduledExecutorService scheduledExecutorService0, gmcg gmcg0, String s1) {
        Objects.requireNonNull(czno0);
        this.l = czno0;
        super(82, cump0);
        this.d = new CountDownLatch(1);
        this.h = gyxo.b;
        this.j = new CopyOnWriteArrayList();
        this.k = cuui.f();
        this.p = context0;
        this.a = s;
        this.b = czyv0;
        this.c = czyv.a();
        this.q = gybo0;
        this.r = scheduledExecutorService0;
        this.s = gmcg0;
        this.g = s1;
    }

    @Override  // czvg
    public final czvf a() {
        czyv czyv0 = this.c;
        czno czno0 = this.l;
        String s = czno0.j(czyv0.a);
        if(s == null) {
            czkq.a.b().h("Failed to connect to Peer %s because we failed to get a DroidGuard ID.", this.b);
            czke.b(new cvae(this.a, 8, this.g), gymb.m, gymd.bh, null);
            this.h = gyxo.bB;
            return czvf.c;
        }
        czzk czzk0 = new czzk(this.p, czyv0, s, this.q);
        this.m = czzk0;
        List list0 = czzk0.c(this.a, 3);
        cznk cznk0 = new cznk(this);
        cznm cznm0 = new cznm(this);
        czle czle0 = czno0.n(this.p, this.a, 3, cznk0, cznm0, list0, this.r, this.s, this.g);
        czyb czyb0 = (czyb)czle0.a.g();
        this.e = czyb0;
        if(czyb0 == null) {
            this.h = czle0.b;
            return czvf.c;
        }
        czzk czzk1 = this.m;
        if(czzk1 == null) {
            this.h = gyxo.bC;
            return czvf.c;
        }
        czvf czvf0 = this.d(czzk1, czyb0);
        czzk czzk2 = this.m;
        if(czzk2 != null) {
            czzk2.f();
            this.m.a();
            this.m = null;
        }
        if(czvf0 == czvf.b) {
            return this.i(83);
        }
        this.h = gyxo.ci;
        return czvf.c;
    }

    public final void b(Runnable runnable0) {
        this.r.execute(runnable0);
    }

    public final void c(czze czze0) {
        synchronized(this) {
            czmk.A(czze0, "WebRTC", czze0.a);
        }
    }

    private final czvf d(czzk czzk0, czyb czyb0) {
        this.t = SystemClock.elapsedRealtime();
        czni czni0 = new czni(this);
        String s = this.a;
        if(!czzk0.e(s, 3, czni0)) {
            czyb0.k();
            czzk0.f();
            return czvf.c;
        }
        czyv czyv0 = this.b;
        if(!czno.q(czzk0, s, 3, czyv0, czyw.d(this.c).toBytesArray())) {
            czyb0.k();
            czzk0.f();
            czkq.a.b().h("Failed to connect to Peer %s because could not send the signaling poke to the peer.", czyv0);
            return czvf.c;
        }
        try {
            long v = hvog.aD();
            if(!this.d.await(v, TimeUnit.MILLISECONDS)) {
                throw new TimeoutException();
            }
        }
        catch(InterruptedException | IllegalStateException | TimeoutException exception0) {
            goto label_22;
        }
        if(this.f != null) {
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] WebRtc signaling took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - this.t));
            }
            return czvf.b;
        }
        try {
            throw new IllegalStateException();
        }
        catch(InterruptedException | IllegalStateException | TimeoutException exception0) {
        label_22:
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
                czke.b(new cvae(this.a, 8, this.g), gymb.j, gymd.t, null);
            }
            else if((exception0 instanceof IllegalStateException)) {
                czke.b(new cvae(this.a, 8, this.g), gymb.j, gymd.u, null);
            }
            else if((exception0 instanceof TimeoutException)) {
                czke.b(new cvae(this.a, 8, this.g), gymb.j, gymd.y, null);
            }
            czyb0.k();
            czzk0.f();
            return czvf.c;
        }
    }

    @Override  // czvg
    public final void g() {
        cuui.h(this.k, "ConnectionOperation.alarmExecutor");
        cumn cumn0 = this.i;
        if(cumn0 != null) {
            cumn0.b();
            this.i = null;
        }
        czzk czzk0 = this.m;
        if(czzk0 != null) {
            czzk0.f();
            this.m.a();
            this.m = null;
        }
        czyb czyb0 = this.e;
        if(czyb0 != null) {
            czyb0.k();
        }
    }
}

