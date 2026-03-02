import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.personalsafety.psa.CPMechanism.CPNetworkCallback;

public final class eicw {
    public final Context a;
    public final ConnectivityManager b;
    public final CPMechanism.CPNetworkCallback c;
    public boolean d;

    public eicw(Context context0) {
        this.d = false;
        this.a = context0;
        this.b = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
        this.c = new CPMechanism.CPNetworkCallback(context0);
    }

    public static gmcd a(Context context0) {
        return glzd.f(fzlr.b().b(), new eicv(context0), gmap.a);
    }

    public static boolean b(Context context0) {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
        Network network0 = connectivityManager0.getActiveNetwork();
        return network0 == null ? false : eicw.c(connectivityManager0.getNetworkCapabilities(network0));
    }

    public static boolean c(NetworkCapabilities networkCapabilities0) {
        return networkCapabilities0 == null ? false : networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16);
    }

    public static boolean d() {
        return hrtj.i();
    }

    public static boolean e(Context context0) {
        return eiby.b(context0) && hrtj.h();
    }
}

