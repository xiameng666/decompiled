import android.graphics.drawable.Drawable;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;

final class aakm extends ibuo implements ibts {
    public aakm(Object object0) {
        super(1, object0, aakt.class, "onToolbarNavigationStateChanged", "onToolbarNavigationStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/WelcomeHeaderViewModel$ToolbarNavigationState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibns ibns0;
        ibuq.f(((aaqz)object0), "p0");
        aakt aakt0 = (aakt)this.e;
        switch(((aaqz)object0).ordinal()) {
            case 0: {
                ibns0 = new ibns(((int)0x7F080CD9), ((int)0x7F150783));  // drawable:quantum_ic_close_vd_theme_24
                break;
            }
            case 1: {
                ibns0 = new ibns(((int)0x7F080C89), ((int)0x7F150086));  // drawable:quantum_ic_arrow_back_vd_theme_24
                break;
            }
            case 2: {
                ibns0 = new ibns(((int)0x7F080C8B), ((int)0x7F150086));  // string:abc_action_bar_up_description "Navigate up"
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        int v = ((Number)ibns0.a).intValue();
        int v1 = ((Number)ibns0.b).intValue();
        ProductLockupToolbar productLockupToolbar0 = aakt0.ai;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        productLockupToolbar0.v(v);
        Drawable drawable0 = productLockupToolbar0.e();
        if(drawable0 != null) {
            drawable0.setAutoMirrored(true);
        }
        productLockupToolbar0.t(v1);
        productLockupToolbar0.x(new aakc(aakt0));
        return ibom.a;
    }
}

