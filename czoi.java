import android.content.Context;
import android.os.SystemClock;
import j..util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.SessionDescription;

final class czoi extends czvg {
    public final String a;
    public final czyv b;
    public final String c;
    public gyxo d;
    public cumn e;
    public final List f;
    public final ScheduledExecutorService g;
    final czos h;
    public czzk i;
    private final Context j;
    private final gybo k;
    private final czml l;
    private final Map m;
    private final ScheduledExecutorService p;
    private final gmcg q;
    private List r;
    private cumn s;
    private long t;

    public czoi(czos czos0, Context context0, String s, czyv czyv0, gybo gybo0, czml czml0, ScheduledExecutorService scheduledExecutorService0, gmcg gmcg0, String s1) {
        Objects.requireNonNull(czos0);
        this.h = czos0;
        super(81);
        this.m = new bxd();
        this.d = gyxo.b;
        this.f = new CopyOnWriteArrayList();
        this.g = cuui.f();
        this.j = context0;
        this.a = s;
        this.b = czyv0;
        this.k = gybo0;
        this.l = czml0;
        this.p = scheduledExecutorService0;
        this.q = gmcg0;
        this.c = s1;
    }

    @Override  // czvg
    public final czvf a() {
        czyv czyv0 = this.b;
        String s = this.h.j(czyv0.a);
        if(s == null) {
            czkq.a.b().p("Failed to start listening for incoming WebRTC connections because we failed to get a DroidGuard ID.", new Object[0]);
            czke.b(new cvae(this.a, 4, this.c), gymt.f, gymd.bh, null);
            this.d = gyxo.bB;
            return czvf.c;
        }
        czzk czzk0 = new czzk(this.j, czyv0, s, this.k);
        String s1 = this.a;
        if(!czzk0.e(s1, 2, new czny(this))) {
            if(czmk.U(s1)) {
                this.d = gyxo.bD;
                return czvf.c;
            }
            return czvf.d;
        }
        this.t = SystemClock.elapsedRealtime();
        this.r = czzk0.c(s1, 2);
        cznz cznz0 = () -> synchronized(this) {
            if(!this.l()) {
                czkq.a.b().p("Skipping restart listening for tachyon inbox messages since we are not accepting connections.", new Object[0]);
                return;
            }
            czzk czzk0 = this.i;
            if(czzk0 == null) {
                czkq.a.b().p("Failed to processRestartTachyonReceiveMessages, tachyonSignalingMessenger is null.", new Object[0]);
                return;
            }
            czzk0.f();
            czzk czzk1 = this.i;
            cznx cznx0 = new cznx(this);
            if(!czzk1.e(this.a, 2, cznx0)) {
                czkq.a.b().p("Failed to restart listening for tachyon inbox messages since we failed to reach Tachyon.", new Object[0]);
                return;
            }
            czkq.a.b().p("Successfully restarted listening for tachyon inbox messages.", new Object[0]);
        };
        long v = hvog.ae();
        this.s = cumn.c(czkq.a, cznz0, v, this.p);
        this.i = czzk0;
        czkq.a.b().h("Started listening for WebRTC connections as %s.", czyv0);
        return czvf.b;
    }

    public final void b(Runnable runnable0) {
        this.p.execute(runnable0);
    }

    public final void c(czze czze0, czyv czyv0) {
        synchronized(this) {
            if(czze0.l()) {
                return;
            }
            czmk.A(czze0, "WebRTC", czyv0.toString());
            this.h(czyv0);
        }
    }

    public final void d(czze czze0) {
        synchronized(this) {
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] WebRtc signaling took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - this.t));
            }
            czml czml0 = this.l;
            czvg czvg0 = new czvg(83);
            czos czos0 = ((czns)czml0).a;
            czvj czvj0 = czos0.b.a(czvg0);
            if(czvj.b != czvj0) {
                czkq.a.c().p("Failed to create a WebRtcSocket because we were unable to register the MediumOperation.", new Object[0]);
                czmk.A(czze0, "WebRTC", czze0.a);
                return;
            }
            czze0.g(new cznr(czos0, czvg0));
            ((czns)czml0).b.a(((czns)czml0).c, czze0);
        }
    }

    // Detected as a lambda impl.
    public final void e() {
        synchronized(this) {
            if(!this.l()) {
                czkq.a.b().p("Skipping restart listening for tachyon inbox messages since we are not accepting connections.", new Object[0]);
                return;
            }
            czzk czzk0 = this.i;
            if(czzk0 == null) {
                czkq.a.b().p("Failed to processRestartTachyonReceiveMessages, tachyonSignalingMessenger is null.", new Object[0]);
                return;
            }
            czzk0.f();
            czzk czzk1 = this.i;
            cznx cznx0 = new cznx(this);
            if(!czzk1.e(this.a, 2, cznx0)) {
                czkq.a.b().p("Failed to restart listening for tachyon inbox messages since we failed to reach Tachyon.", new Object[0]);
                return;
            }
            czkq.a.b().p("Successfully restarted listening for tachyon inbox messages.", new Object[0]);
        }
    }

    public final void f(byte[] arr_b) {
        czle czle0;
        gyuk gyuk0;
        synchronized(this) {
            if(!this.l()) {
                czkq.a.b().p("Ignoring Tachyon message since we are not accepting connections.", new Object[0]);
                return;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyuk.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gyuk0 = (gyuk)hftv0;
            }
            catch(hfur hfur0) {
                czkq.a.b().f(hfur0).p("Failed to parse tachyon signaling frame.", new Object[0]);
                return;
            }
            if((gyuk0.b & 1) != 0) {
                czyv czyv0 = new czyv((gyuk0.e == null ? gyug.a : gyuk0.e).c);
                int v1 = gyuk0.c;
                if(v1 == 6) {
                    this.h(czyv0);
                    if(this.r == null) {
                        czle0 = new czle(gyxo.bF);
                    }
                    else {
                        czoc czoc0 = new czoc(this, czyv0);
                        czog czog0 = new czog(this, czyv0);
                        List list0 = this.r;
                        czoh czoh0 = new czoh(this, czyv0);
                        czle czle1 = this.h.n(this.j, this.a, 2, czoc0, czog0, list0, this.p, this.q, this.c, czoh0, false);
                        czyo czyo0 = (czyo)czle1.a.g();
                        if(czyo0 == null) {
                            czle0 = new czle(czle1.b);
                        }
                        else {
                            this.m.put(czyv0, czyo0);
                            czle0 = new czle(((czyo)this.m.get(czyv0)), gyxo.b);
                        }
                    }
                    czyo czyo1 = (czyo)czle0.a.g();
                    if(czyo1 == null) {
                        czkq.a.b().p("Unable to send offer. Failed to create a ConnectionFlow.", new Object[0]);
                        return;
                    }
                    czyo1.g();
                    return;
                }
                switch(v1) {
                    case 3: {
                        SessionDescription sessionDescription0 = czyw.f(gyuk0);
                        czyo czyo2 = this.o(czyv0);
                        if(czyo2 == null) {
                            czkq.a.b().p("Unable to receive offer. Failed to load a ConnectionFlow.", new Object[0]);
                            return;
                        }
                        czyo2.c(sessionDescription0);
                        return;
                    }
                    case 4: {
                        SessionDescription sessionDescription1 = czyw.f(gyuk0);
                        czyo czyo3 = this.o(czyv0);
                        if(czyo3 == null) {
                            czkq.a.b().p("Unable to receive answer. Failed to create a ConnectionFlow.", new Object[0]);
                            return;
                        }
                        czyo3.c(sessionDescription1);
                        return;
                    }
                    case 5: {
                        List list1 = czyw.e(gyuk0);
                        czyo czyo4 = this.o(czyv0);
                        if(czyo4 == null) {
                            czkq.a.b().p("Unable to receive ice candidates. Failed to create a ConnectionFlow.", new Object[0]);
                            return;
                        }
                        czyo4.i(list1);
                        return;
                    }
                    default: {
                        czkq.a.b().p("Received unknown WebRTC frame: ignoring.", new Object[0]);
                        return;
                    }
                }
            }
            czkq.a.b().p("Invalid WebRTC frame: sender id is missing.", new Object[0]);
        }
    }

    @Override  // czvg
    public final void g() {
        cuui.h(this.g, "AcceptingConnectionsOperation.alarmExecutor");
        cumn cumn0 = this.e;
        if(cumn0 != null) {
            cumn0.b();
            this.e = null;
        }
        czzk czzk0 = this.i;
        if(czzk0 != null) {
            czzk0.f();
            this.i.a();
        }
        this.i = null;
        this.r = null;
        cumn cumn1 = this.s;
        if(cumn1 != null) {
            cumn1.b();
            this.s = null;
        }
        Map map0 = this.m;
        for(Object object0: map0.values()) {
            ((czyo)object0).a();
        }
        map0.clear();
    }

    public final void h(czyv czyv0) {
        czyo czyo0 = (czyo)this.m.remove(czyv0);
        if(czyo0 != null) {
            czyo0.f();
        }
    }

    private final czyo o(czyv czyv0) {
        return (czyo)this.m.get(czyv0);
    }
}

