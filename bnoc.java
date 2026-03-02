import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class bnoc implements fqsy {
    public final fqfk a;
    public final ibnf b;
    public final bnor c;
    public final Context d;
    public final ScheduledExecutorService e;
    private final fqxe f;
    private final ccmg g;

    public bnoc(fqfk fqfk0, ibnf ibnf0, bnor bnor0, fqxe fqxe0, Context context0, ScheduledExecutorService scheduledExecutorService0, ccmg ccmg0) {
        this.a = fqfk0;
        this.b = ibnf0;
        this.c = bnor0;
        this.f = fqxe0;
        this.d = context0;
        this.e = scheduledExecutorService0;
        this.g = ccmg0;
    }

    @Override  // fqsy
    public final gmcd a(gszb gszb0, fqsz fqsz0, fquk fquk0) {
        gftb.check(gszb0);
        gftb.checkTrue(gszb0.b == 3);
        this.g.a(bbdg.iP);
        return glzd.g(this.f.f(), new bnob(this, gszb0, fqsz0, fquk0), this.e);
    }

    public static long b(gszb gszb0) {
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        int v = (gszb0.b == 3 ? ((gtbw)gszb0.c) : gtbw.a).f;
        return gszb0.b == 3 ? timeUnit0.toMillis(((long)(v + ((gtbw)gszb0.c).b * 10)) + hsxv.a.y().ai()) : timeUnit0.toMillis(((long)(v + gtbw.a.b * 10)) + hsxv.a.y().ai());
    }
}

