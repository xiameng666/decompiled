import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import com.google.android.chimera.android.Activity;

final class desw extends ibsl implements ibtw {
    final Activity a;

    public desw(Activity activity0, ibrl ibrl0) {
        this.a = activity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((desw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new desw(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Activity activity0 = this.a;
        if(activity0 != null) {
            djbz.e(((WifiManager)activity0.getSystemService(WifiManager.class)), ((ConnectivityManager)activity0.getSystemService(ConnectivityManager.class)));
        }
        return ibom.a;
    }
}

