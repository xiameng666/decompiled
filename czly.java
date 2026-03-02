import android.content.Context;
import android.hardware.Sensor;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public final class czly {
    public static final Map a;
    public static final Map b;
    public final czlu c;
    public boolean d;
    private static final byte[] e;
    private static final byte[] f;
    private static final ExecutorService g;
    private final Context h;
    private final boolean i;
    private djcr j;

    static {
        czly.e = new byte[]{-34, -85};
        czly.f = new byte[]{-2, -51, 12, 34, 56, 78};
        czly.a = new HashMap();
        czly.b = new HashMap();
        czly.g = new bblp(1, 9);
    }

    public czly(Context context0) {
        this.d = false;
        this.h = context0.getApplicationContext();
        this.c = new czlu(context0);
        this.i = context0.getPackageManager().hasSystemFeature("android.hardware.uwb");
    }

    public static int a(djcj djcj0) {
        return djcj0 == null ? 0 : ((int)djcj0.b);
    }

    public final cuur b() {
        cuur cuur0;
        synchronized(this) {
            cuur0 = cuur.b(9, new Random().nextInt(4) + 9);
        }
        return cuur0;
    }

    public final czlw c(cuuq cuuq0, cuur cuur0, czlv czlv0) {
        czlw czlw0;
        synchronized(this) {
            int v1 = ~czly.o(cuuq0, cuur0);
            czlw0 = new czlw(v1);
            Map map0 = czly.b;
            if(map0.containsKey(czlw0)) {
                this.h(czlw0);
            }
            djck djck0 = new djck();
            djck0.a = 2;
            djck0.b = v1;
            djck0.c = czly.k();
            djck0.f = 3;
            djck0.d = czly.l(cuur0);
            czlr czlr0 = new czlr(this, czlv0);
            djcu djcu0 = new djcu();
            djcu0.a = 1;
            djcu0.b();
            djcv djcv0 = djcu0.a();
            djcr djcr0 = cumi.g(this.h, djcv0);
            ((djgg)djcr0).a = new djcp(czly.q(cuuq0).e());
            map0.put(czlw0, new czlx(djcr0, djck0, czlr0, true));
        }
        return czlw0;
    }

    public final void d(czlw czlw0, cuuq cuuq0) {
        cuuq cuuq1;
        czlx czlx0;
        Map map0;
        synchronized(this) {
            map0 = czly.b;
            if(!map0.containsKey(czlw0)) {
                czkq.a.e().p("Session handle not cached!! Cannot start ranging", new Object[0]);
                return;
            }
            goto label_6;
        }
        return;
    label_6:
        czlx0 = (czlx)map0.get(czlw0);
        cuuq1 = czly.q(cuuq0);
        czly.a.put(cuuq1, cuuq0);
        djck djck0 = czlx0.b;
        if(djck0.e.isEmpty()) {
            czlu czlu0 = this.c;
            if(!czlu0.e) {
                czlu0.b.enable();
                TracingSensorEventListener tracingSensorEventListener0 = czlu0.c;
                if(tracingSensorEventListener0 != null) {
                    Sensor sensor0 = czlu0.d.getDefaultSensor(1);
                    czlu0.d.registerListener(tracingSensorEventListener0, sensor0, 3);
                }
                czlu0.e = true;
            }
            if(czlu0.a.getResources().getConfiguration().orientation == 1) {
                djck0.b(djct.a(cuuq1.e()));
                djcl djcl0 = djck0.a();
                czly.m(czlx0.a, djcl0, czlx0.c);
                goto label_36;
            }
            return;
        }
        else {
            goto label_26;
        }
        goto label_36;
        try {
        label_26:
            czkq.a.b().p("UltraWidebandPublicApi: Add controlee.", new Object[0]);
            djcp djcp0 = new djcp(cuuq1.e());
            czly.p("addControlee", czlx0.a.b(djcp0));
        }
        catch(ExecutionException executionException0) {
            czkq.a.e().f(executionException0).p("Failed to add controlee", new Object[0]);
        }
        catch(InterruptedException interruptedException0) {
            czkq.a.e().f(interruptedException0).p("Failed to add controlee", new Object[0]);
            Thread.currentThread().interrupt();
        }
    label_36:
        czlx0.e.add(cuuq1);
    }

    public final void e(List list0) {
        synchronized(this) {
            for(Object object0: list0) {
                cuuq cuuq0 = (cuuq)object0;
                Map map0 = czly.a;
                if(map0.containsKey(cuuq0)) {
                    map0.remove(cuuq0);
                }
            }
        }
    }

    public final void f() {
        synchronized(this) {
            Map map0 = czly.b;
            if(!map0.isEmpty() && this.j()) {
                for(Object object0: map0.values()) {
                    this.i(((czlx)object0).a, ((czlx)object0).c);
                }
            }
            map0.clear();
            czly.a.clear();
        }
    }

    public final void g(czlw czlw0) {
        synchronized(this) {
            Map map0 = czly.b;
            if(map0.containsKey(czlw0)) {
                czlx czlx0 = (czlx)map0.get(czlw0);
                this.i(czlx0.a, czlx0.c);
                map0.remove(czlw0);
                this.e(czlx0.e);
            }
        }
    }

    public final void h(czlw czlw0) {
        synchronized(this) {
            Map map0 = czly.b;
            if(map0.containsKey(czlw0)) {
                czlx czlx0 = (czlx)map0.get(czlw0);
                this.i(czlx0.a, czlx0.c);
                map0.remove(czlw0);
                this.e(czlx0.e);
            }
            for(Object object0: map0.values()) {
                if(!((czlx)object0).d) {
                    continue;
                }
                goto label_24;
            }
            czlu czlu0 = this.c;
            if(czlu0.e) {
                czlu0.b.disable();
                TracingSensorEventListener tracingSensorEventListener0 = czlu0.c;
                if(tracingSensorEventListener0 != null) {
                    czlu0.d.unregisterListener(tracingSensorEventListener0);
                }
                czlu0.e = false;
                return;
            }
        label_24:
        }
    }

    public final void i(djcr djcr0, djco djco0) {
        synchronized(this) {
            try {
                czkq.a.b().p("UltraWidebandPublicApi: Stop UWB ranging.", new Object[0]);
                czly.p("stopRanging", djcr0.g(djco0));
            }
            catch(ExecutionException executionException0) {
                czkq.a.e().f(executionException0).p("Failed to stop UWB Ranging", new Object[0]);
            }
            catch(InterruptedException interruptedException0) {
                czkq.a.e().f(interruptedException0).p("Failed to stop UWB Ranging", new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean j() {
        this.d = false;
        if(this.i) {
            try {
                if(this.j == null) {
                    djcu djcu0 = new djcu();
                    djcu0.a = 2;
                    djcv djcv0 = djcu0.a();
                    this.j = cumi.g(this.h, djcv0);
                }
                Boolean boolean0 = (Boolean)czly.p("isAvailable", this.j.d());
                if(boolean0 != null && boolean0.booleanValue()) {
                    this.d = true;
                    return true;
                }
                czkq.a.b().h("UWB isAvailable %s.", boolean0);
                return false;
            }
            catch(ExecutionException | InterruptedException exception0) {
                czkq.a.e().f(exception0).p("Failed to get UWB connection Info.", new Object[0]);
            }
        }
        return false;
    }

    public static final byte[] k() {
        byte[] arr_b = new byte[8];
        System.arraycopy(czly.e, 0, arr_b, 0, 2);
        System.arraycopy(czly.f, 0, arr_b, 2, 6);
        return arr_b;
    }

    public static final djcs l(cuur cuur0) {
        return new djcs(cuur0.c, cuur0.d);
    }

    public static final void m(djcr djcr0, djcl djcl0, djco djco0) {
        try {
            czkq.a.b().p("UltraWidebandPublicApi: Start UWB ranging.", new Object[0]);
            czly.p("startRanging", djcr0.f(djcl0, djco0));
        }
        catch(ExecutionException executionException0) {
            czkq.a.e().f(executionException0).p("Failed to start UWB Ranging", new Object[0]);
        }
        catch(InterruptedException interruptedException0) {
            czkq.a.e().f(interruptedException0).p("Failed to start UWB Ranging", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public final czlw n(cuuq cuuq0, cuur cuur0, cuuq cuuq1) {
        czlw czlw0;
        synchronized(this) {
            int v1 = ~czly.o(cuuq1, cuur0);
            czlw0 = new czlw(v1);
            Map map0 = czly.b;
            if(map0.containsKey(czlw0)) {
                this.g(czlw0);
            }
            cuuq cuuq2 = czly.q(cuuq1);
            czly.a.put(cuuq2, cuuq1);
            djck djck0 = new djck();
            djck0.a = 2;
            djck0.b = v1;
            djck0.c = czly.k();
            djck0.f = 3;
            djck0.d = czly.l(cuur0);
            djck0.b(djct.a(cuuq2.e()));
            czls czls0 = new czls(this);
            djcu djcu0 = new djcu();
            djcu0.a = 2;
            djcv djcv0 = djcu0.a();
            djcr djcr0 = cumi.g(this.h, djcv0);
            ((djgg)djcr0).a = new djcp(czly.q(cuuq0).e());
            czlx czlx0 = new czlx(djcr0, djck0, czls0, false);
            czly.m(djcr0, djck0.a(), czls0);
            czlx0.e.add(cuuq2);
            map0.put(czlw0, czlx0);
        }
        return czlw0;
    }

    private static int o(cuuq cuuq0, cuur cuur0) {
        ghga ghga0 = ghgc.a.h();
        ghga0.l(cuuq0.e());
        ghga0.j(cuur0.a());
        return ghga0.s().a();
    }

    private static Object p(String s, evql evql0) {
        czlq czlq0 = new czlq(s, evql0);
        return ((bblp)czly.g).e(czlq0).get();
    }

    private static final cuuq q(cuuq cuuq0) {
        cuup cuup0 = cuuq0.a;
        cuup cuup1 = cuup.a;
        if(cuup0 != cuup1) {
            if(cuup0 == cuup.b) {
                return new cuuq(cuup1, glxf.d(((short)(((int)(glxd.c(cuuq0.b) & 0xFFFFL))))));
            }
            throw new IllegalArgumentException();
        }
        return cuuq0;
    }
}

