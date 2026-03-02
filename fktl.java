import java.util.List;
import java.util.concurrent.Executor;

public final class fktl implements fjag {
    public final fjag a;
    public final fkkg b;
    public final fkjt c;
    public final String d;
    public final Executor e;
    public final ggtl f;
    public final gfsx g;
    private final fkjj h;
    private final gmba i;

    public fktl(fktk fktk0) {
        this.i = new gmba();
        this.a = fktk0.a;
        this.b = fktk0.b;
        this.h = fktk0.c;
        this.c = fktk0.d;
        this.d = fktk0.e;
        this.e = fktk0.f;
        this.f = fktk0.g;
        this.g = fktk0.h;
    }

    @Override  // fjag
    public final gmcd a(fjcv fjcv0) {
        fkti fkti0 = new fkti(this, fjcv0);
        return this.i.b(fkti0, this.e);
    }

    public final gmcd b(long v, String s, fkjt fkjt0) {
        fkjm fkjm0 = fkjn.a();
        fkjm0.b(v);
        fkjm0.c(s);
        fkjn fkjn0 = fkjm0.a();
        return this.b.h(fkjn0, fkjt0);
    }

    public static gmcd c(fjcv fjcv0, String s, Boolean boolean0) {
        gfsx gfsx0 = gfsx.m(s);
        gfsx gfsx1 = gfsx.m(boolean0);
        fjgi fjgi0 = new fjgi(gfsx0, gfqx.a, gfqx.a, gfsx1);
        fjgi0.a.i();
        return fjcv0.j(fjgi0);
    }

    public final gmcd d(gged_interceptors gged0, fkjn fkjn0) {
        if(gged0.isEmpty()) {
            return gmbx.a;
        }
        List list0 = ggia.h(gged0, new fktd());
        fkjo fkjo0 = fkjp.a();
        fkjo0.a = 1;
        fkjo0.d(this.c);
        fkjo0.c(fkjn0);
        fkjp fkjp0 = fkjo0.a();
        return glzd.g(gmbt.h(this.h.a(list0, fkjp0)), new fkte(this, gged0, list0, fkjn0), this.e);
    }
}

