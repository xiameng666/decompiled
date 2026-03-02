import android.content.Context;
import java.io.PrintWriter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class aqxj {
    public static final baun a;
    public int b;
    public int c;
    public final ScheduledExecutorService d;
    public final int e;
    private gmcd f;

    static {
        aqxj.a = aqql.a("TransportSwitcher");
    }

    public aqxj(ScheduledExecutorService scheduledExecutorService0) {
        this.b = 0;
        this.c = 0;
        this.d = scheduledExecutorService0;
        this.e = (int)hqhq.a.j().y();
    }

    public final int a() {
        synchronized(this) {
        }
        return this.c;
    }

    public static String b(int v) {
        switch(v) {
            case 0: {
                return "UNKNOWN_TRANSPORT";
            }
            case 1: {
                return "GMS_TRANSPORT";
            }
            default: {
                return "D2D_TRANSPORT";
            }
        }
    }

    public final void c(PrintWriter printWriter0) {
        synchronized(this) {
            printWriter0.println("TransportSwitcher:");
            printWriter0.println("    currentTransport=" + aqxj.b(this.b));
            if(this.f != null) {
                printWriter0.println("    switchingToTransport=" + aqxj.b(this.c));
            }
        }
    }

    public final gmcd d(Context context0, int v, arem arem0) {
        synchronized(this) {
            if(this.f != null) {
                int v2 = this.c;
                if(v == v2) {
                    aqxj.a.h("Asked to switch to %s but was already switching to that", new Object[]{aqxj.b(v)});
                    return this.f;
                }
                aqxj.a.h("Asked to switch to %s, so cancelled in-progress switch to %s", new Object[]{aqxj.b(v), aqxj.b(v2)});
                this.b = 0;
                this.f.cancel(true);
            }
            else if(v == this.b) {
                aqxj.a.d("Asked to switch to %s but that was current transport and no switch in progress.", new Object[]{aqxj.b(v)});
                return gmbu.i(null);
            }
            aqxj.a.h("Starting switch from %s to %s", new Object[]{aqxj.b(this.b), aqxj.b(v)});
            this.c = v;
            aqxg aqxg0 = new aqxg(this, context0, v, arem0);
            aqxh aqxh0 = new aqxh(this, v);
            aqxp aqxp0 = aqxp.a(hqhq.a.j().w(), TimeUnit.MILLISECONDS);
            gmcd gmcd1 = gmbu.q(new aqzq(((gful_cronetEngineProvider)aqxg0), this.d, this.e, aqxh0, aqxp0), hqhq.e(), TimeUnit.MILLISECONDS, this.d);
            this.f = gmcd1;
            gmbu.t(gmcd1, new aqxi(this, v), this.d);
        }
        return this.f;
    }

    static void e(aqxj aqxj0) {
        aqxj0.f = null;
    }
}

