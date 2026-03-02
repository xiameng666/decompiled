import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class aigo {
    public final frpi a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final gful_cronetEngineProvider d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    private final frph h;

    public aigo(ScheduledExecutorService scheduledExecutorService0, frpj frpj0, Application application0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new aigg(this)));
        gfus.a(((gful_cronetEngineProvider)new aigh(this)));
        gfus.a(((gful_cronetEngineProvider)new aigi(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new aigj(this)));
        this.d = gfus.a(((gful_cronetEngineProvider)new aigk(this)));
        this.e = gfus.a(((gful_cronetEngineProvider)new aigl(this)));
        this.f = gfus.a(((gful_cronetEngineProvider)new aigm(this)));
        this.g = gfus.a(((gful_cronetEngineProvider)new aign(this)));
        frpi frpi0 = frpi.c("gmscore_auth_account");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.h = frpm.a(frpj0, scheduledExecutorService0, frpi0, application0);
            return;
        }
        this.h = frph0;
        ((frpm)frph0).b = frpj0;
    }
}

