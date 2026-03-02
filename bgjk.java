import java.nio.charset.StandardCharsets;
import java.util.concurrent.ScheduledExecutorService;

public final class bgjk {
    public static final bboh a;
    public final gfsi b;
    public final bdva c;
    public final String d;
    public final gfvb e;
    private final ScheduledExecutorService f;
    private final bglw g;

    static {
        bgjk.a = bboh.b("WeakRunner", bbcu.cX);
    }

    public bgjk(String s, bglw bglw0, gfsi gfsi0, ScheduledExecutorService scheduledExecutorService0, bdva bdva0) {
        gfvh gfvh0 = new gfvh();
        gfvh0.h(10000L);
        this.e = gfvh0.b();
        this.d = s;
        this.g = bglw0;
        this.f = scheduledExecutorService0;
        this.b = gfsi0;
        this.c = bdva0;
    }

    public final evql a(gged_interceptors gged0) {
        if(gged0.isEmpty()) {
            gged_interceptors gged1 = gged_interceptors.l(new bgiw(ggna.a, ggna.a));
            return evrg.d(new bggc(graz.c, gged1));
        }
        String s = hsab.e();
        evqp evqp0 = new evqp();
        bdwg bdwg0 = new bdwg(((bgjl)this.g.a).a.a, evqp0, s);
        this.f.execute(bdwg0);
        bdwi bdwi0 = new bdwi();
        evql evql0 = evqp0.a.h(this.f, bdwi0);
        bglu bglu0 = new bglu(this.g, this.f, s);
        evql evql1 = evql0.h(this.f, bglu0);
        bgje bgje0 = new bgje();
        evql1.v(this.f, bgje0);
        bgjf bgjf0 = new bgjf(this, gged0);
        return evql1.h(this.f, bgjf0);
    }

    public static final ByteString b() {
        return ByteString.copyFrom(ghgf.e().c(hsab.e(), StandardCharsets.UTF_8).e());
    }
}

