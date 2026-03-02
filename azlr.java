import java.util.concurrent.ScheduledExecutorService;

public final class azlr {
    public final frpi a;
    private final frph b;
    private final gful_cronetEngineProvider c;
    private final gful_cronetEngineProvider d;
    private final gful_cronetEngineProvider e;

    public azlr(ScheduledExecutorService scheduledExecutorService0, frpj frpj0) {
        this.c = gfus.a(((gful_cronetEngineProvider)new azlo(this)));
        this.d = gfus.a(((gful_cronetEngineProvider)new azlp(this)));
        this.e = gfus.a(((gful_cronetEngineProvider)new azlq(this)));
        frpi frpi0 = frpi.c("gmscore_cobalt");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.b = frpm.a(frpj0, scheduledExecutorService0, frpi0, null);
            return;
        }
        this.b = frph0;
        ((frpm)frph0).b = frpj0;
    }

    public final void a(String s) {
        ((frpe)this.e.mr()).b(new Object[]{s});
    }

    public final void b(String s, int v, int v1) {
        ((frpe)this.c.mr()).b(new Object[]{s, v, v1});
    }

    public final void c(String s, int v, int v1) {
        ((frpe)this.d.mr()).b(new Object[]{s, v, v1});
    }
}

