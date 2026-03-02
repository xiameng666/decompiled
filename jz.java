import android.view.Window.Callback;

final class jz implements nm {
    final ka a;

    public jz(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override  // nm
    public final void a(na na0, boolean z) {
        na na1 = na0.a();
        ka ka0 = this.a;
        jy jy0 = ka0.G((na1 == na0 ? na0 : na1));
        if(jy0 != null) {
            if(na1 != na0) {
                ka0.K(jy0.a, jy0, na1);
                ka0.M(jy0, true);
                return;
            }
            ka0.M(jy0, z);
        }
    }

    @Override  // nm
    public final boolean b(na na0) {
        if(na0 == na0.a()) {
            ka ka0 = this.a;
            if(ka0.v) {
                Window.Callback window$Callback0 = ka0.H();
                if(window$Callback0 != null && !ka0.C) {
                    window$Callback0.onMenuOpened(108, na0);
                }
            }
        }
        return true;
    }
}

