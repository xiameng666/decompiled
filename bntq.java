import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executor;

public final class bntq implements bnzk {
    public static final bboh a;
    public final bntx b;
    public final Executor c;
    public final Account d;
    public final Context e;
    private final bodd f;

    static {
        bntq.a = bboh.b("GmsSpotOwnerKeySyncer", bbcu.eD);
    }

    public bntq(bntx bntx0, bodd bodd0, Executor executor0, Account account0, Context context0) {
        this.b = bntx0;
        this.f = bodd0;
        this.c = executor0;
        this.d = account0;
        this.e = context0;
    }

    public final bnzp a(bnzj bnzj0, boolean z) {
        return this.f.a(bnzj0, bnzl.a(bnzj0, z), false);
    }

    public final gmcd b(gmcd gmcd0, bnzj bnzj0, gfsx gfsx0, gfsx gfsx1, boolean z) {
        return gdta.g(gmcd0).i(new bntn(this, bnzj0, gfsx0, z, gfsx1), gmap.a);
    }

    @Override  // bnzk
    public final gmcd c(bnzj bnzj0, boolean z) {
        gftb.checkTrue(((boolean)(bnzj0.h ^ 1)));
        return this.b(this.a(bnzj0, z).j(), bnzj0, gfqx.a, gfqx.a, z);
    }

    @Override  // bnzk
    public final gmcd d(bnzi bnzi0, boolean z) {
        bnzp bnzp0 = this.a(bnzj.a, z);
        gftb.q(((bodi)bnzp0).d.equals(bnzj.a));
        return ((bodi)bnzp0).B() ? gdta.g(gdta.g(((bodi)bnzp0).h.b()).i(new bnzx(((bodi)bnzp0)), ((bodi)bnzp0).n).i(new bnzy(((bodi)bnzp0)), ((bodi)bnzp0).n)).i(new bntm(this, bnzi0, z, bnzp0), this.c) : gdta.g(gdta.g(gmbx.a).i(new bnzx(((bodi)bnzp0)), ((bodi)bnzp0).n).i(new bnzy(((bodi)bnzp0)), ((bodi)bnzp0).n)).i(new bntm(this, bnzi0, z, bnzp0), this.c);
    }

    @Override  // fqwl
    public final gmcd e(int v) {
        switch(v - 1) {
            case 0: {
                return this.c(bnzj.c, false);
            }
            case 1: {
                return this.c(bnzj.d, false);
            }
            case 2: {
                return this.c(bnzj.e, false);
            }
            case 3: {
                return this.c(bnzj.f, false);
            }
            default: {
                return this.c(bnzj.g, false);
            }
        }
    }
}

