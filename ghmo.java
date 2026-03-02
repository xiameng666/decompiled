import j..time.Duration;
import java.util.concurrent.TimeUnit;

public final class ghmo implements glzn {
    public final ghmx a;
    public final gmcd b;

    public ghmo(ghmx ghmx0, gmcd gmcd0) {
        this.a = ghmx0;
        this.b = gmcd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0 = this.b;
        if(gmcd0.isCancelled()) {
            return gmcd0;
        }
        ghmx ghmx0 = this.a;
        int v = ghmx0.j;
        Duration duration0 = ghmx0.g.d();
        long v1 = ghmx0.e.c(v, duration0).toMillis();
        if(v1 >= 0L && ghmx0.f.a(((Exception)object0))) {
            ghmx0.i.c(((Exception)object0));
            ghmx0.f(v1, TimeUnit.MILLISECONDS);
            return gmbu.i(ghmx.b);
        }
        ghmx0.i.d(((Exception)object0));
        throw new ghmb(((Exception)object0));
    }
}

