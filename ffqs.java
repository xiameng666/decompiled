import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class ffqs {
    public final frpi a;
    public final gful_cronetEngineProvider b;
    private final frph c;
    private final gful_cronetEngineProvider d;
    private final gful_cronetEngineProvider e;

    public ffqs(ScheduledExecutorService scheduledExecutorService0, frpj frpj0, Application application0) {
        this.d = gfus.a(((gful_cronetEngineProvider)new ffqp(this)));
        this.b = gfus.a(((gful_cronetEngineProvider)new ffqq(this)));
        this.e = gfus.a(((gful_cronetEngineProvider)new ffqr(this)));
        frpi frpi0 = frpi.c("gmscore_auth_api_account_transfer");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.c = frpm.a(frpj0, scheduledExecutorService0, frpi0, application0);
            return;
        }
        this.c = frph0;
        ((frpm)frph0).b = frpj0;
    }

    public final void a(String s, String s1) {
        ((frpe)this.e.mr()).b(new Object[]{s, s1});
    }

    public final void b(String s, String s1, int v) {
        ((frpe)this.d.mr()).b(new Object[]{s, s1, v});
    }
}

