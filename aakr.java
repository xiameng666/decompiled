import com.google.android.material.appbar.AppBarLayout;

final class aakr implements ibum, lqj {
    final aakt a;

    public aakr(aakt aakt0) {
        this.a = aakt0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, aakt.class, "onActionFired", "onActionFired(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/WelcomeHeaderViewModel$WelcomeHeaderAction;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof lqj) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ibuq.f(((aari)object0), "p0");
        aakt aakt0 = this.a;
        if((((aari)object0) instanceof aarh)) {
            aakt0.startActivityForResult(cchk.b(aakt0.requireContext(), ((aarh)(((aari)object0))).a), 10);
            return;
        }
        if((((aari)object0) instanceof aarg)) {
            AppBarLayout appBarLayout0 = aakt0.ah;
            AppBarLayout appBarLayout1 = null;
            if(appBarLayout0 == null) {
                ibuq.j("appbarLayout");
                appBarLayout0 = null;
            }
            appBarLayout0.m(false, true);
            if(((aarg)(((aari)object0))).a) {
                AppBarLayout appBarLayout2 = aakt0.ah;
                if(appBarLayout2 == null) {
                    ibuq.j("appbarLayout");
                }
                else {
                    appBarLayout1 = appBarLayout2;
                }
                appBarLayout1.t(true);
            }
        }
    }
}

