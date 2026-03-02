import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;

final class aakn extends ibuo implements ibts {
    public aakn(Object object0) {
        super(1, object0, aakt.class, "onToolbarTitleStateChanged", "onToolbarTitleStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/WelcomeHeaderViewModel$ToolbarTitleState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((aarf)object0), "p0");
        ProductLockupToolbar productLockupToolbar0 = ((aakt)this.e).ai;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        if(ibuq.m(((aarf)object0), aarb.a)) {
            productLockupToolbar0.T(8);
            productLockupToolbar0.D("Google Account");
            return ibom.a;
        }
        if((((aarf)object0) instanceof aarc)) {
            productLockupToolbar0.T(8);
            productLockupToolbar0.D(((aarc)(((aarf)object0))).a);
            return ibom.a;
        }
        if(ibuq.m(((aarf)object0), aare.a)) {
            productLockupToolbar0.T(0);
            return ibom.a;
        }
        if(!ibuq.m(((aarf)object0), aard.a)) {
            throw new ibnq();
        }
        productLockupToolbar0.T(8);
        productLockupToolbar0.D("");
        return ibom.a;
    }
}

