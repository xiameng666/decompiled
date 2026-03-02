import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;

final class aakp extends ibuo implements ibts {
    public aakp(Object object0) {
        super(1, object0, aakt.class, "onToolbarApdStateChanged", "onToolbarApdStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/WelcomeHeaderViewModel$ToolbarParticleDiscState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((aara)object0), "p0");
        aakt aakt0 = (aakt)this.e;
        ProductLockupToolbar productLockupToolbar0 = null;
        if(((aara)object0) == aara.b) {
            ProductLockupToolbar productLockupToolbar1 = aakt0.ai;
            if(productLockupToolbar1 == null) {
                ibuq.j("toolbar");
            }
            else {
                productLockupToolbar0 = productLockupToolbar1;
            }
            productLockupToolbar0.O();
            return ibom.a;
        }
        ProductLockupToolbar productLockupToolbar2 = aakt0.ai;
        if(productLockupToolbar2 == null) {
            ibuq.j("toolbar");
        }
        else {
            productLockupToolbar0 = productLockupToolbar2;
        }
        productLockupToolbar0.U();
        return ibom.a;
    }
}

