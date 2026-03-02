import java.util.concurrent.ScheduledExecutorService;

public final class ezqg {
    public final frpi a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final gful_cronetEngineProvider d;
    private final frph e;
    private final gful_cronetEngineProvider f;

    public ezqg(ScheduledExecutorService scheduledExecutorService0, frpj frpj0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new ezqa(this)));
        this.c = gfus.a(((gful_cronetEngineProvider)new ezqb(this)));
        gfus.a(((gful_cronetEngineProvider)new ezqc(this)));
        this.d = gfus.a(((gful_cronetEngineProvider)new ezqd(this)));
        this.f = gfus.a(((gful_cronetEngineProvider)new ezqe(this)));
        gfus.a(((gful_cronetEngineProvider)new ezqf(this)));
        frpi frpi0 = frpi.c("STREAMZ_UDC");
        this.a = frpi0;
        frph frph0 = frpi0.a;
        if(frph0 == null) {
            this.e = frpm.a(frpj0, scheduledExecutorService0, frpi0, null);
            return;
        }
        this.e = frph0;
        ((frpm)frph0).b = frpj0;
    }

    public final void a() {
        ((frpe)this.f.mr()).b(new Object[]{Boolean.valueOf(true)});
    }
}

