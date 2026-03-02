import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class focq {
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
    private final frph l;

    public focq(ScheduledExecutorService scheduledExecutorService0, frpj frpj0, Application application0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new foca(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new focn(this)));
        this.d = gfus.a(((gful_cronetEngineProvider)new foco(this)));
        this.e = gfus.a(((gful_cronetEngineProvider)new focp(this)));
        gfus.a(((gful_cronetEngineProvider)new focb(this)));
        this.f = gfus.a(((gful_cronetEngineProvider)new focc(this)));
        this.g = gfus.a(((gful_cronetEngineProvider)new focd(this)));
        this.h = gfus.a(((gful_cronetEngineProvider)new foce(this)));
        this.i = gfus.a(((gful_cronetEngineProvider)new focf(this)));
        gfus.a(((gful_cronetEngineProvider)new focg(this)));
        gfus.a(((gful_cronetEngineProvider)new foch(this)));
        this.j = gfus.a(((gful_cronetEngineProvider)new foci(this)));
        gfus.a(((gful_cronetEngineProvider)new focj(this)));
        this.k = gfus.a(((gful_cronetEngineProvider)new fock(this)));
        gfus.a(((gful_cronetEngineProvider)new focl(this)));
        gfus.a(((gful_cronetEngineProvider)new focm(this)));
        frpi frpi0 = frpi.c("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.l = frpm.a(frpj0, scheduledExecutorService0, frpi0, application0);
            return;
        }
        this.l = frph0;
        ((frpm)frph0).b = frpj0;
    }
}

