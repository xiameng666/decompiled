import com.google.android.material.appbar.AppBarLayout;

public final class dnbv implements ibts {
    public final dnci a;

    public dnbv(dnci dnci0) {
        this.a = dnci0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        dnci dnci0 = this.a;
        AppBarLayout appBarLayout0 = null;
        if(ibuq.m(dnci0.y().m.ij(), Boolean.valueOf(true))) {
            AppBarLayout appBarLayout1 = dnci0.d;
            if(appBarLayout1 == null) {
                ibuq.j("toolbarLayout");
            }
            else {
                appBarLayout0 = appBarLayout1;
            }
            appBarLayout0.t(true);
            return ibom.a;
        }
        AppBarLayout appBarLayout2 = dnci0.d;
        if(appBarLayout2 == null) {
            ibuq.j("toolbarLayout");
        }
        else {
            appBarLayout0 = appBarLayout2;
        }
        appBarLayout0.t(false);
        return ibom.a;
    }
}

