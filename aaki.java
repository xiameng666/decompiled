import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.material.appbar.AppBarLayout;

public final class aaki implements fydh {
    public final aakt a;

    public aaki(aakt aakt0) {
        this.a = aakt0;
    }

    @Override  // fydh
    public final void a(int v) {
        aakt aakt0 = this.a;
        ProductLockupToolbar productLockupToolbar0 = aakt0.ai;
        AppBarLayout appBarLayout0 = null;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        AppBarLayout appBarLayout1 = aakt0.ah;
        if(appBarLayout1 == null) {
            ibuq.j("appbarLayout");
        }
        else {
            appBarLayout0 = appBarLayout1;
        }
        productLockupToolbar0.V(appBarLayout0.f, false);
    }
}

