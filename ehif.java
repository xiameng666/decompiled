import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class ehif {
    private final Context a;
    private final ehim b;
    private final gfug c;
    private Long d;

    public ehif(Context context0, ehim ehim0, gfug gfug0) {
        this.d = (long)0L;
        this.a = context0;
        this.b = ehim0;
        this.c = gfug0;
    }

    public final void a() {
        this.c.e();
        this.c.f();
        this.d = (long)(System.nanoTime() / 1000L);
    }

    public final void b(String s, int v) {
        this.c.g();
        ehin ehin0 = new ehin();
        ehin0.a = s;
        ehin0.d(this.d.longValue());
        ehin0.g(this.c.a(TimeUnit.MICROSECONDS));
        ehin0.f(v);
        ehin0.b(false);
        ehin0.b = efpu.c(this.a);
        ehin0.c(0);
        ehin0.e(iapk.b.t.r);
        gipd gipd0 = ehin0.a();
        this.b.e(gipd0);
    }

    public final void c(String s, int v, int v1) {
        this.c.g();
        ehin ehin0 = this.e(s, v, v1);
        ehin0.e(iapk.b.t.r);
        gipd gipd0 = ehin0.a();
        this.b.e(gipd0);
    }

    public final void d(String s, iapl iapl0) {
        if(hwzc.a.c().aR()) {
            this.c.g();
            ehin ehin0 = this.e(s, 0, 0);
            ehin0.e(iapl0.a.t.r);
            ehin0.c(0);
            gipd gipd0 = ehin0.a();
            this.b.e(gipd0);
        }
    }

    private final ehin e(String s, int v, int v1) {
        ehin ehin0 = new ehin();
        ehin0.a = s;
        ehin0.d(this.d.longValue());
        ehin0.g(this.c.a(TimeUnit.MICROSECONDS));
        ehin0.b(true);
        ehin0.f(v);
        ehin0.c(v1);
        ehin0.b = efpu.c(this.a);
        return ehin0;
    }
}

