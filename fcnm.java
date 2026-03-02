import android.accounts.Account;
import android.content.Context;
import j..util.Objects;
import java.util.concurrent.Callable;
import java.util.function.Function;

public final class fcnm implements fcml {
    public static final baun a;
    public final Context b;
    public final gmcg c;
    public final aqjk d;
    public final aqee e;
    public final aqfs f;
    public final gful_cronetEngineProvider g;
    public final fcmk h;
    public final fcru i;
    private static final ggeo j;
    private final aqld k;
    private final Function l;

    static {
        fcnm.a = new fcgf(new String[]{"BackupController"});
        ggek ggek0 = new ggek();
        ggek0.i(gqtz.WF, gico.l);
        ggek0.i(gqtz.WG, gico.n);
        ggek0.i(gqtz.WH, gico.n);
        ggek0.i(gqtz.WC, gico.m);
        ggek0.i(gqtz.WD, gico.o);
        ggek0.i(gqtz.WE, gico.p);
        fcnm.j = ggek0.b();
    }

    public fcnm(Context context0, gmcg gmcg0, aqjk aqjk0, aqee aqee0, aqfs aqfs0, gful_cronetEngineProvider gful0, aqld aqld0, Function function0, fcmk fcmk0, fcru fcru0) {
        this.b = context0;
        this.c = gmcg0;
        this.d = aqjk0;
        this.e = aqee0;
        this.f = aqfs0;
        this.g = gful0;
        this.k = aqld0;
        this.l = function0;
        this.h = fcmk0;
        this.i = fcru0;
    }

    @Override  // fcml
    public final gmcd a(gqtz gqtz0, grnw grnw0, Integer integer0) {
        Objects.requireNonNull(this.e);
        fcnf fcnf0 = new fcnf(this.e);
        return glzd.f(glzd.g(gmbt.h(this.c.e(fcnf0)), new fcmv(this, gqtz0, grnw0, integer0), gmap.a), new fcmw(this, gqtz0), this.c);
    }

    @Override  // fcml
    public final gmcd b(String s, boolean z, gqtz gqtz0, grnv grnv0, Integer integer0) {
        gmbt gmbt0 = gmbt.h(this.k(s));
        fcnh fcnh0 = new fcnh(this, gqtz0);
        gmcd gmcd0 = glzd.f(glzd.g(glyi.g(gmbt0, Throwable.class, fcnh0, gmap.a), new fcni(this, gqtz0, grnv0, integer0), gmap.a), new fcnj(this, s, gqtz0), this.c);
        fcnk fcnk0 = new fcnk(this, z);
        return glzd.f(glzd.g(glyi.g(gmcd0, Throwable.class, fcnk0, gmap.a), (Account account0) -> {
            if(!this.k.b()) {
                fcnm.a.h("No need to prepare secondary key.", new Object[0]);
                return gmbx.a;
            }
            fcnm.a.h("Preparing secondary key.", new Object[0]);
            Callable callable0 = (Callable)this.l.apply(account0);
            return glzd.f(this.c.e(callable0), new fcmt(), gmap.a);
        }, gmap.a), new fcmn(this, z), gmap.a);
    }

    @Override  // fcml
    public final gmcd c() {
        fcne fcne0 = new fcne(this);
        return this.c.e(fcne0);
    }

    @Override  // fcml
    public final gmcd d(String s) {
        return glzd.f(this.k(s), new fcnd(this, s), this.c);
    }

    @Override  // fcml
    public final gmcd e() {
        return gmbu.n(new fcna(this), this.c);
    }

    public static fcml f(Context context0) {
        return new fcnm(context0, new bblp(3, 9), new aqjk(context0), new aqee(context0), new aqfs(context0), gfus.a(((gful_cronetEngineProvider)new fcmo(context0))), new aqld(context0), new fcmp(context0), new fcmk(context0), new fcru(context0));
    }

    public static gico g(gqtz gqtz0) {
        gftb.d(fcnm.j.containsKey(gqtz0), "Can\'t find FragmentType for ContextId: %s", gqtz0.a());
        gico gico0 = (gico)fcnm.j.get(gqtz0);
        gftb.check(gico0);
        return gico0;
    }

    public final gmcd h() {
        fcmm fcmm0 = new fcmm(this);
        return this.c.e(fcmm0);
    }

    // Detected as a lambda impl.
    public final gmcd i(Account account0) {
        if(!this.k.b()) {
            fcnm.a.h("No need to prepare secondary key.", new Object[0]);
            return gmbx.a;
        }
        fcnm.a.h("Preparing secondary key.", new Object[0]);
        Callable callable0 = (Callable)this.l.apply(account0);
        return glzd.f(this.c.e(callable0), new fcmt(), gmap.a);
    }

    public final void j(int v, gqtz gqtz0) {
        gico gico0 = fcnm.g(gqtz0);
        this.i.b(v, gico0);
    }

    private final gmcd k(String s) {
        return glzd.f(this.h(), new fcnc(s), gmap.a);
    }
}

