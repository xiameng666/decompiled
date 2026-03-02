import android.accounts.Account;

public final class cqbb implements glzn {
    public final cqbd a;

    public cqbb(cqbd cqbd0) {
        this.a = cqbd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0;
        cqbd cqbd0 = this.a;
        if(((Account)object0) == null) {
            cmbk cmbk0 = new cmbk(cqgx.b, null, true, null);
            gmcd0 = gmbu.i(cqbd0.c.b(cmbk0));
        }
        else {
            gmcd0 = cqbd0.c.d(cqgx.b, ((Account)object0));
        }
        gmcd gmcd1 = glzd.g(gmbt.h(gmcd0), new cqay(), gmap.a);
        cqaz cqaz0 = new cqaz(cqbd0);
        return glyi.f(gmcd1, Exception.class, cqaz0, gmap.a);
    }
}

