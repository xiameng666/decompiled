import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;

public final class aaws implements MenuItem.OnMenuItemClickListener {
    public final ProductLockupToolbar a;
    public final gruj b;

    public aaws(ProductLockupToolbar productLockupToolbar0, gruj gruj0) {
        this.a = productLockupToolbar0;
        this.b = gruj0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        aawv aawv0 = this.a.z;
        if(aawv0 == null) {
            return false;
        }
        aawv0.a(this.b);
        return true;
    }
}

