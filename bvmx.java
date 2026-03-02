import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class bvmx {
    public final frpi a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    private final frph d;

    public bvmx(ScheduledExecutorService scheduledExecutorService0, frpj frpj0, Application application0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new bvmv(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new bvmw(this)));
        frpi frpi0 = frpi.c("gmscore_growth");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.d = frpm.a(frpj0, scheduledExecutorService0, frpi0, application0);
            return;
        }
        this.d = frph0;
        ((frpm)frph0).b = frpj0;
    }
}

