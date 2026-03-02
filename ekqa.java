import android.content.ComponentName;

public final class ekqa {
    public final double a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    private static final clmq f;
    private static final clmq g;
    private static final clmq h;

    static {
        ekqa.f = new clmq(((gful_cronetEngineProvider)new ekpw()));
        ekqa.g = new clmq(((gful_cronetEngineProvider)new ekpx()));
        ekqa.h = new clmq(((gful_cronetEngineProvider)new ekpy()));
    }

    public ekqa(ekpz ekpz0) {
        this.a = ekpz0.a;
        this.e = ekpz0.e;
        this.b = ekpz0.b;
        this.c = ekpz0.c;
        this.d = ekpz0.d;
    }

    public static ekqa a() {
        return new ekpz().a();
    }

    public static ekqa b(ComponentName componentName0, cllp cllp0) {
        ekpz ekpz0 = new ekpz();
        clmo clmo0 = new clmo();
        clmo0.c = componentName0.getPackageName();
        clmo0.d = componentName0.getClassName();
        clmo0.e = cllp0.j;
        clmp clmp0 = new clmp(clmo0);
        if((cllp0 instanceof clkr) && ekqa.f.d(clmp0)) {
            ekpz0.a = hrwu.a.b().a();
        }
        if(((cllp0 instanceof clkr) || (cllp0 instanceof clko)) && ekqa.g.d(clmp0)) {
            ekpz0.e = 3;
            ekpz0.b = hrwu.a.b().d();
        }
        if((cllp0 instanceof clkr) && ekqa.h.d(clmp0)) {
            long v = hrwu.a.b().c();
            long v1 = hrwu.a.b().b();
            ekpz0.c = v;
            ekpz0.d = v1;
        }
        return ekpz0.a();
    }
}

