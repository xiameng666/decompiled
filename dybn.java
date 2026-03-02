import android.accounts.Account;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dybn {
    public final dyav a;

    public dybn(Account account0, String s) {
        this.a = new dyav(account0, s);
    }

    public static gfsx a(List list0, String s) {
        for(Object object0: list0) {
            dydu dydu0 = (dydu)object0;
            if(dydt.b(dydu0.d) == 6 && (dydu0.b == 5 ? ((dydn)dydu0.c) : dydn.a).c.equals(s)) {
                return gfsx.m(dydu0);
            }
        }
        return gfqx.a;
    }

    public final gged_interceptors b() {
        try {
            return dyav.a(((dydv)this.a.b().a().get(10L, TimeUnit.SECONDS)).b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return ggna.a;
        }
    }

    public final gmcd c(String s, String s1) {
        return this.a.b().b(new dybg(s, s1), new bblp(1, 10));
    }

    public final gmcd d(String s, gged_interceptors gged0) {
        return this.a.b().b(new dyaz(s, gged0), new bblp(1, 10));
    }

    public final gmcd e(gftc gftc0, Executor executor0) {
        return this.a.b().b(new dybf(gftc0), executor0);
    }

    public static boolean f(ggeo ggeo0, dydu dydu0) {
        return ((dydu0.b == 4 ? ((dydo)dydu0.c) : dydo.a).b & 1) == 0 || !ggeo0.containsKey((dydu0.b == 4 ? ((dydo)dydu0.c) : dydo.a).c) ? false : ggia.i(((gged_interceptors)ggeo0.getOrDefault((dydu0.b == 4 ? ((dydo)dydu0.c) : dydo.a).c, ggna.a)), (dydu0.b == 4 ? ((dydo)dydu0.c) : dydo.a).d);
    }

    public final void g(String s, kar kar0) {
        glzd.f(this.a.b().a(), new dyax(kar0, s), gmap.a);
    }
}

