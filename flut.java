import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flut implements glzm {
    public final flvd a;
    public final gmcd b;
    public final AccountContext c;

    public flut(flvd flvd0, gmcd gmcd0, AccountContext accountContext0) {
        this.a = flvd0;
        this.b = gmcd0;
        this.c = accountContext0;
    }

    @Override  // glzm
    public final gmcd a() {
        try {
            gmbu.r(this.b);
            return gmbu.i(null);
        }
        catch(Throwable throwable0) {
            return iapk.d(throwable0).t == iapk.j.t ? this.a.g.d(this.c, true) : gmbu.i(null);
        }
    }
}

