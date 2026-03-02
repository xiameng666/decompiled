import android.content.Context;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.IceCandidate;

public final class czno extends czmm {
    public final Context a;
    public final czvk b;
    public final czzi c;
    final ScheduledExecutorService d;
    public boolean e;
    boolean f;
    private final gmcg g;
    private final Map h;

    public czno(Context context0, czvk czvk0) {
        this.d = cuui.f();
        this.g = cuui.a(10);
        this.h = new bxd();
        this.a = context0;
        this.b = czvk0;
        this.f = false;
        if(hvol.as()) {
            this.c = new czzi(context0);
            return;
        }
        this.c = null;
    }

    @Override  // czmm
    public final czle a(String s, czyv czyv0, gybo gybo0, cump cump0, String s1, boolean z) {
        czle czle2;
        synchronized(this) {
            if(!this.g()) {
                cvae cvae0 = new cvae(s, 8, s1);
                gymd gymd0 = this.i();
                czke.b(cvae0, gylz.c, gymd0, null);
                return new czle((this.m() ? gyxo.P : gyxo.at));
            }
            this.f = z;
            cznn cznn0 = new cznn(this, this.a, s, czyv0, gybo0, cump0, this.d, this.g, s1);
            if(this.b.a(cznn0) != czvj.b) {
                czkq.a.e().h("Unable to connect to %s because registration failed.", czyv0);
                return new czle((cump0.d() ? gyxo.p : cznn0.h));
            }
            czze czze0 = cznn0.f;
            if(czze0 != null) {
                czze0.g(new czmn(this, cznn0));
            }
            czle2 = new czle(czze0, gyxo.b);
        }
        return czle2;
    }

    @Override  // czmm
    public final czle b(String s, czyv czyv0, gybo gybo0, czml czml0, String s1, boolean z) {
        czle czle1;
        synchronized(this) {
            if(!this.g()) {
                cvae cvae0 = new cvae(s, 4, s1);
                gymd gymd0 = this.i();
                czke.b(cvae0, gylz.c, gymd0, null);
                return new czle(Boolean.valueOf(false), (this.m() ? gyxo.P : gyxo.at));
            }
            if(this.f(s)) {
                czke.b(new cvae(s, 4, s1), gymt.a, gymd.cn, null);
                return new czle(Boolean.valueOf(false), gyxo.aK);
            }
            this.f = z;
            czmq czmq0 = new czmq(this, czml0, s);
            cznf cznf0 = new cznf(this, this.a, s, czyv0, gybo0, czmq0, this.d, this.g, s1);
            if(this.b.a(cznf0) != czvj.b) {
                return new czle(Boolean.valueOf(false), cznf0.d);
            }
            this.h.put(s, cznf0);
            czle1 = new czle(Boolean.valueOf(true), cznf0.d);
        }
        return czle1;
    }

    @Override  // czmm
    public final void c(PrintWriter printWriter0) {
        printWriter0.write("[WebRTC]:\n");
        printWriter0.write(String.format("  Is Available: %s\n", Boolean.valueOf(this.g())));
        printWriter0.flush();
    }

    @Override  // czmm
    public final void d() {
        synchronized(this) {
            cuui.h(this.d, "WebRtc.singleThreadOffloader");
            cuui.h(this.g, "WebRtc.riskyApiThreadPool");
            bxe bxe0 = new bxe(new bxf(this.h.keySet()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                this.e(((String)object0));
            }
            czzi czzi0 = this.c;
            if(czzi0 != null) {
                czzi0.d();
            }
        }
    }

    @Override  // czmm
    public final void e(String s) {
        synchronized(this) {
            if(!this.f(s)) {
                czkq.a.b().h("Skipping stop accepting connections: we are not currently accepting WebRTC connections for %s.", s);
                return;
            }
            cznf cznf0 = (cznf)this.h.remove(s);
            this.b.e(cznf0);
            czkq.a.b().h("Stopped accepting WebRTC connections for %s", s);
        }
    }

    @Override  // czmm
    public final boolean f(String s) {
        boolean z;
        synchronized(this) {
            z = this.h.containsKey(s);
        }
        return z;
    }

    @Override  // czmm
    public final boolean g() {
        return hvol.aU() && this.m() && czno.r(this.a);
    }

    @Override  // czmm
    public final boolean h() {
        return this.e;
    }

    final gymd i() {
        if(!hvol.aU()) {
            return gymd.d;
        }
        if(!this.m()) {
            return gymd.bf;
        }
        Context context0 = this.a;
        if(!czno.r(context0)) {
            if(bbnp.k(context0) && !hvol.aW()) {
                return gymd.cp;
            }
            if(bbnp.n(context0) && !hvol.aX()) {
                return gymd.cq;
            }
            return !bbnp.e(context0) || hvol.aV() ? gymd.ci : gymd.cj;
        }
        return gymd.a;
    }

    final String j(String s) {
        String s1;
        long v = SystemClock.elapsedRealtime();
        try {
            s1 = (String)gxyl.a(new czms(this, s), "getDroidGuardResult", new gxyk(new gxyj((hvol.as() ? hvog.aF() : hvog.aI())), null, 3));
        }
        finally {
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] WebRtc getDroidGuardResult took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - v));
            }
        }
        return s1;
    }

    public final void k(Runnable runnable0) {
        this.d.execute(runnable0);
    }

    public final void l(czvg czvg0) {
        synchronized(this) {
            this.b.e(czvg0);
        }
    }

    final boolean m() {
        return dack.a(this.a).z();
    }

    final czle n(Context context0, String s, int v, czys czys0, czyp czyp0, List list0, Executor executor0, Executor executor1, String s1) {
        return czyb.n(context0, s, czys0, czyp0, list0, executor0, executor1, s1, this.f, this);
    }

    static final byte[] o(czyv czyv0, List list0) {
        return czyw.b(czyv0, list0).toBytesArray();
    }

    static final byte[] p(czyv czyv0, IceCandidate iceCandidate0) {
        return czyw.b(czyv0, Arrays.asList(new IceCandidate[]{iceCandidate0})).toBytesArray();
    }

    static final boolean q(czzk czzk0, String s, int v, czyv czyv0, byte[] arr_b) {
        if(czzk0 == null) {
            return false;
        }
        Boolean boolean0 = (Boolean)gxyl.a(new czmt(czzk0, s, v, czyv0, arr_b), "sendMessage", new gxyk(new gxyj(hvog.aI()), null, 3));
        return boolean0 != null && boolean0.booleanValue();
    }

    private static boolean r(Context context0) {
        if(bbnp.k(context0) && hvol.aW()) {
            return true;
        }
        return !bbnp.n(context0) || !hvol.aX() ? bbnp.e(context0) && hvol.aV() : true;
    }
}

