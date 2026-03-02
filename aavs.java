import android.content.Context;
import java.util.concurrent.RejectedExecutionException;

public final class aavs implements zem {
    public final Context a;
    private static final baun b;
    private final gmcg c;
    private gmcd d;

    static {
        aavs.b = new baun("AccountSettings", new String[]{"GlideImageFetcher"});
    }

    public aavs(Context context0, gmcg gmcg0) {
        this.a = context0;
        this.c = gmcg0;
    }

    @Override  // zem
    public final void a() {
        try {
            gmcd gmcd0 = this.d;
            if(gmcd0 != null) {
                gmcd0.cancel(true);
            }
            aavq aavq0 = new aavq(this);
            this.d = this.c.d(aavq0);
        }
        catch(RejectedExecutionException unused_ex) {
            aavs.b.f("clearCache() execution rejected.", new Object[0]);
        }
    }

    @Override  // zem
    public final void b(String s, zel zel0) {
        ibuq.f(s, "url");
        clgp.a(this.a).a().b(clcg.f(s, cjxp.b, clbk.a, clbj.a)).f(new aavr(zel0));
    }
}

