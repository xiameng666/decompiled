import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class argt implements arfj {
    public static final aqql a;
    private final Context b;
    private final arfk c;
    private final arem d;
    private final argm e;
    private final ScheduledExecutorService f;
    private final aqxj g;
    private final aqvv h;
    private final gful_cronetEngineProvider i;
    private final List j;
    private boolean k;
    private final ares l;

    static {
        argt.a = new aqql(new String[]{"SourceServiceLifecycleManager"});
    }

    public argt(Context context0, arfk arfk0, arem arem0, ares ares0, argm argm0, aqvv aqvv0, aqxj aqxj0, ScheduledExecutorService scheduledExecutorService0) {
        this.i = gfus.a(((gful_cronetEngineProvider)new argn()));
        this.j = new ArrayList();
        this.k = false;
        this.b = context0;
        this.c = arfk0;
        this.d = arem0;
        batl.s(ares0);
        this.l = ares0;
        batl.s(argm0);
        this.e = argm0;
        batl.s(aqvv0);
        this.h = aqvv0;
        this.f = scheduledExecutorService0;
        this.g = aqxj0;
    }

    @Override  // arfj
    public final void a() {
        synchronized(this) {
            argt.a.d("D2dTransportDriver shutdown complete.", new Object[0]);
            this.i(10, null, 1, 1);
        }
    }

    public final void b(PrintWriter printWriter0) {
        synchronized(this) {
            if(hqhq.m()) {
                printWriter0.println("SourceServiceLifeCycleManager:");
                printWriter0.println();
                for(Object object0: this.j) {
                    printWriter0.println(((args)object0).toString());
                }
                this.g.c(printWriter0);
                return;
            }
            printWriter0.println("    App data transfer disabled");
        }
    }

    public final void c(String s) {
        synchronized(this) {
            argt.a.d(s, new Object[0]);
            String s1 = hqhq.m() ? "enabled" : "disabled";
            argt.a.j("    App data transfer " + s1, new Object[0]);
        }
    }

    public final void d() {
        synchronized(this) {
            if(!((Boolean)this.i.mr()).booleanValue() && this.k) {
                argt.a.h("D2dTransport ready, but was already ready. Not re-initializing.", new Object[0]);
                return;
            }
            argt.a.h("D2dTransport ready: initializing for D2d transfer.", new Object[0]);
            this.i(8, null, 3, 3);
            this.c.d();
            this.k = true;
        }
    }

    public final void e() {
        synchronized(this) {
            if(!((Boolean)this.i.mr()).booleanValue() && !this.k) {
                argt.a.h("Ready to shutdown after switching to GMSTransport, but was already shut down.", new Object[0]);
                return;
            }
            argt.a.h("Finished attempting to switch from D2DTransport. Shutting down driver and service.", new Object[0]);
            this.c.g(this);
            this.l();
            this.k = false;
        }
    }

    public final void f() {
        synchronized(this) {
            if(!hqhq.m()) {
                this.c("App data disabled, not enabling D2dTransport.");
                return;
            }
            if(((Boolean)this.i.mr()).booleanValue() && this.g.a() == 2) {
                argt.a.j("Not switching transports as we already requested that switch.", new Object[0]);
                return;
            }
            this.i(2, null, 1, 3);
            gmbu.t(this.j(2), new argo(this), this.f);
            this.c("Preparing to initialize D2dTransport");
        }
    }

    public final void g() {
        synchronized(this) {
            this.d.f();
            if(!hqhq.m()) {
                this.c("App data disabled, no need to disable D2dTransport.");
                this.l();
                return;
            }
            this.i(3, null, 1, 2);
            gmbu.t(this.j(1), new argq(this), this.f);
            this.c("Scheduled switch back to GmsTransport");
        }
    }

    public static int h(int v) {
        return v == 1 ? 2 : 3;
    }

    public final void i(int v, String s, int v1, int v2) {
        switch(v - 1) {
            case 1: {
                this.k(new args("EVENT_PERPARE_APP_DATA_TRANSFER", s));
                break;
            }
            case 2: {
                this.k(new args("EVENT_TRY_STOP_SERVICE", s));
                break;
            }
            case 3: {
                this.k(new args("ENTER_COOLDOWN", s));
                break;
            }
            case 4: {
                this.k(new args("EXIT_COOLDOWN", s));
                break;
            }
            case 5: {
                this.k(new args("SWITCHING_TRANSPORT", s));
                break;
            }
            case 6: {
                this.k(new args("SWITCH_COMPLETE", s));
                break;
            }
            case 7: {
                this.k(new args("PREPARE_DRIVER", s));
                break;
            }
            case 8: {
                this.k(new args("REQUEST_DRIVER_SHUTDOWN", s));
                break;
            }
            case 9: {
                this.k(new args("DRIVER_SHUTDOWN_COMPLETE", s));
            }
        }
        arem arem0 = this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkze.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkze)hftp0.b_message).c = v - 1;
        ((hkze)hftp0.b_message).b |= 1;
        long v3 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hkze)hftv0).b |= 2;
        ((hkze)hftv0).d = v3;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hkze)hftv1).e = v1 - 1;
        ((hkze)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkze)hftp0.b_message).f = v2 - 1;
        ((hkze)hftp0.b_message).b |= 8;
        hkze hkze0 = (hkze)hftp0.N_build();
        arem0.i.add(hkze0);
    }

    private final gmcd j(int v) {
        gmcd gmcd0 = this.g.d(this.b, v, this.d);
        gmbu.t(gmcd0, new argp(this, v), this.f);
        return gmcd0;
    }

    private final void k(args args0) {
        synchronized(this) {
            this.j.add(args0);
        }
    }

    private final void l() {
        gmbu.t(this.h.b(), new argr(this), gmap.a);
        new arej().b(this.b);
        this.h.e();
        argh argh0 = new argh(this.e);
        this.e.a.post(argh0);
        argj argj0 = new argj(this.e);
        this.e.a.post(argj0);
        Intent intent0 = D2dSourceChimeraService.a(this.b);
        this.b.stopService(intent0);
        arew arew0 = new arew();
        this.l.a(arew0);
    }
}

