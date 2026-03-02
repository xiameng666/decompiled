import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;

final class aaft extends ibuo implements ibts {
    public aaft(Object object0) {
        super(1, object0, aafw.class, "onContentStateChanged", "onContentStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/appbar/ContentState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((aasa)object0), "p0");
        aafw aafw0 = (aafw)this.e;
        if(!(((aasa)object0) instanceof aasa)) {
            throw new ibnq();
        }
        ProductLockupToolbar productLockupToolbar0 = aafw0.ai;
        ProductLockupToolbar productLockupToolbar1 = null;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        productLockupToolbar0.P(((aasa)object0).b);
        ProductLockupToolbar productLockupToolbar2 = aafw0.ai;
        if(productLockupToolbar2 == null) {
            ibuq.j("toolbar");
        }
        else {
            productLockupToolbar1 = productLockupToolbar2;
        }
        productLockupToolbar1.Q(((aasa)object0).a);
        return ibom.a;
    }
}

