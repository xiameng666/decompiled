import com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.material.appbar.AppBarLayout;

final class aafs extends ibuo implements ibts {
    public aafs(Object object0) {
        super(1, object0, aafw.class, "onToolbarApdStateChanged", "onToolbarApdStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/appbar/ToolbarParticleDiscState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((aasf)object0), "p0");
        aafw aafw0 = (aafw)this.e;
        AppBarLayout appBarLayout0 = null;
        if(((aasf)object0) == aasf.c) {
            ProductLockupToolbar productLockupToolbar0 = aafw0.ai;
            if(productLockupToolbar0 == null) {
                ibuq.j("toolbar");
                productLockupToolbar0 = null;
            }
            productLockupToolbar0.O();
        }
        else {
            ProductLockupToolbar productLockupToolbar1 = aafw0.ai;
            if(productLockupToolbar1 == null) {
                ibuq.j("toolbar");
                productLockupToolbar1 = null;
            }
            productLockupToolbar1.U();
        }
        AppBarBehavior appBarBehavior0 = aafw0.al;
        if(appBarBehavior0 == null) {
            ibuq.j("appBarBehavior");
            appBarBehavior0 = null;
        }
        AppBarLayout appBarLayout1 = aafw0.ah;
        if(appBarLayout1 == null) {
            ibuq.j("appbarLayout");
        }
        else {
            appBarLayout0 = appBarLayout1;
        }
        ibuq.f(appBarLayout0, "appBarLayout");
        appBarBehavior0.a = ((aasf)object0) == aasf.b;
        if(((aasf)object0) == aasf.b) {
            appBarBehavior0.s(appBarLayout0, false);
            return ibom.a;
        }
        appBarBehavior0.u(appBarLayout0, false);
        return ibom.a;
    }
}

