import android.content.Context;

final class eabr extends eabu {
    @Override  // eabu
    public final gfsx a(eagu eagu0, Context context0) {
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        if(dzau.k(dyna0)) {
            return gfsx.m(eaca.c(eagu0, context0, 1, gfqx.a, false));
        }
        return dylv.c.contains(dyna0) ? gfsx.m(dlnf.aC(context0, eagu0, this.a, this.c())) : gfqx.a;
    }
}

