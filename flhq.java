import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flhq implements glzn {
    public final flit a;
    public final AccountContext b;
    public final fmga c;
    public final int d;
    public final gfsx e;

    public flhq(flit flit0, AccountContext accountContext0, fmga fmga0, int v, gfsx gfsx0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmga0;
        this.d = v;
        this.e = gfsx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd1;
        if(Boolean.TRUE.equals(((Boolean)object0))) {
            fmga fmga0 = this.c;
            AccountContext accountContext0 = this.b;
            flit flit0 = this.a;
            fmfr fmfr0 = fmga0.f;
            gmcd gmcd0 = flit0.t(accountContext0, fmga0, false);
            if(fmfr0.a() == 3) {
                String s = fmfr0.b().a;
                gmcd1 = flit0.n.containsKey(s) ? glzd.g(gmcd0, new flhr(flit0, fmga0, accountContext0), gmap.a) : gmcd0;
            }
            else {
                gmcd1 = gmcd0;
            }
            gmcd gmcd2 = glzd.g(glzd.g(gmcd1, new flhs(flit0, accountContext0), flit0.b), new flht(flit0, accountContext0, this.e), gmap.a);
            flhu flhu0 = new flhu(flit0, accountContext0, fmga0);
            flit0.b.d(flhu0);
            flhv flhv0 = new flhv(fmga0);
            gmcd gmcd3 = glyi.f(gmcd1, Throwable.class, flhv0, gmap.a);
            gmcd gmcd4 = gmbu.b(new gmcd[]{gmcd0, gmcd2, gmcd3}).a(new flhw(flit0, gmcd3, gmcd2, accountContext0, fmga0, this.d), gmap.a);
            return gmbu.d(new gmcd[]{gmcd4}).a(new flhy(gmcd4), gmap.a);
        }
        return gmbu.i(null);
    }
}

