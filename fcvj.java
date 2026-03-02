import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;

public final class fcvj {
    public static final baun a;
    public final ConnectivityManager b;
    public ConnectivityManager.NetworkCallback c;

    static {
        fcvj.a = new fcgf(new String[]{"WifiConnectionHelper"});
    }

    public fcvj(Context context0) {
        Object object0 = context0.getSystemService("connectivity");
        gftb.check(object0);
        this.b = (ConnectivityManager)object0;
        this.c = null;
    }
}

