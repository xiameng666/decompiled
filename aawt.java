import android.view.View;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import j..util.Objects;

public final class aawt extends kdl {
    final String a;

    public aawt(ProductLockupToolbar productLockupToolbar0, String s) {
        this.a = s;
        Objects.requireNonNull(productLockupToolbar0);
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        String s = this.a;
        if(s != null && !s.isEmpty()) {
            khb0.n(new kgx(kgx.e.a(), s));
        }
    }
}

