import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class epwe {
    public final frpi a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final gful_cronetEngineProvider d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    public final gful_cronetEngineProvider h;
    public final gful_cronetEngineProvider i;
    public final gful_cronetEngineProvider j;
    public final gful_cronetEngineProvider k;
    public final gful_cronetEngineProvider l;
    private final frph m;
    private final gful_cronetEngineProvider n;
    private final gful_cronetEngineProvider o;
    private final gful_cronetEngineProvider p;
    private final gful_cronetEngineProvider q;
    private final gful_cronetEngineProvider r;
    private final gful_cronetEngineProvider s;

    public epwe(ScheduledExecutorService scheduledExecutorService0, frpj frpj0, Application application0) {
        this.n = gfus.a(((gful_cronetEngineProvider)new epvm(this)));
        this.b = gfus.a(((gful_cronetEngineProvider)new epwd(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new epvn(this)));
        this.d = gfus.a(((gful_cronetEngineProvider)new epvo(this)));
        this.e = gfus.a(((gful_cronetEngineProvider)new epvp(this)));
        this.o = gfus.a(((gful_cronetEngineProvider)new epvq(this)));
        this.p = gfus.a(((gful_cronetEngineProvider)new epvr(this)));
        gfus.a(((gful_cronetEngineProvider)new epvs(this)));
        this.q = gfus.a(((gful_cronetEngineProvider)new epvt(this)));
        this.r = gfus.a(((gful_cronetEngineProvider)new epvu(this)));
        this.f = gfus.a(((gful_cronetEngineProvider)new epvv(this)));
        this.g = gfus.a(((gful_cronetEngineProvider)new epvw(this)));
        this.s = gfus.a(((gful_cronetEngineProvider)new epvx(this)));
        this.h = gfus.a(((gful_cronetEngineProvider)new epvy(this)));
        this.i = gfus.a(((gful_cronetEngineProvider)new epvz(this)));
        this.j = gfus.a(((gful_cronetEngineProvider)new epwa(this)));
        this.k = gfus.a(((gful_cronetEngineProvider)new epwb(this)));
        this.l = gfus.a(((gful_cronetEngineProvider)new epwc(this)));
        frpi frpi0 = frpi.c("gmscore_smartdevice");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.m = frpm.a(frpj0, scheduledExecutorService0, frpi0, application0);
            return;
        }
        this.m = frph0;
        ((frpm)frph0).b = frpj0;
    }

    public final void a(int v) {
        ((frpe)this.o.mr()).b(new Object[]{v});
    }

    public final void b(String s, String s1) {
        ((frpe)this.r.mr()).b(new Object[]{s, s1});
    }

    public final void c(String s, String s1) {
        ((frpe)this.q.mr()).b(new Object[]{s, s1});
    }

    public final void d(String s, boolean z) {
        ((frpe)this.s.mr()).b(new Object[]{s, Boolean.valueOf(z)});
    }

    public final void e(int v, int v1, int v2) {
        ((frpe)this.p.mr()).b(new Object[]{v, v1, v2});
    }

    public final void f() {
        ((frpe)this.n.mr()).b(new Object[0]);
    }
}

