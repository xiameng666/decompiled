import java.util.Set;
import java.util.concurrent.Executor;

public final class cjkb implements ymu {
    private static final ggfp a;
    private final clbs b;
    private final Executor c;
    private final cjjd d;

    static {
        ggfp ggfp0 = ggfp.K("http", "https");
        ibuq.e(ggfp0, "of(...)");
        cjkb.a = ggfp0;
    }

    public cjkb(clbs clbs0, Executor executor0, cjjd cjjd0) {
        ibuq.f(clbs0, "gmsNetworkEngine");
        ibuq.f(executor0, "callbackExecutor");
        super();
        this.b = clbs0;
        this.c = executor0;
        this.d = cjjd0;
    }

    @Override  // ymu
    public final ymv a(String s) {
        ibuq.f(s, "url");
        gmcu gmcu0 = new gmcu();
        cjjw cjjw0 = new cjjw(gmcu0);
        ckcq ckcq0 = this.d.a(s);
        if(ckcq0 == null) {
            ckcq0 = ckkp.a;
        }
        clcf clcf0 = clcg.f(s, ckcq0, clbk.a, clbj.a);
        return new cjjz(this.b.e(clcf0, cjjw0, this.c, 0, 0), gmcu0);
    }

    @Override  // ymu
    public final Set b() {
        return cjkb.a;
    }
}

