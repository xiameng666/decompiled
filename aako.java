import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import java.util.List;

final class aako extends ibuo implements ibts {
    public aako(Object object0) {
        super(1, object0, aakt.class, "onToolbarMenuStateChanged", "onToolbarMenuStateChanged(Ljava/util/List;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((List)object0), "p0");
        ProductLockupToolbar productLockupToolbar0 = ((aakt)this.e).ai;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        productLockupToolbar0.S(((List)object0));
        return ibom.a;
    }
}

