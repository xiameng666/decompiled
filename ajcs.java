import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class ajcs {
    private final ConnectivityManager a;

    public ajcs(Context context0) {
        this.a = (ConnectivityManager)context0.getSystemService("connectivity");
    }

    public final boolean a() {
        NetworkInfo networkInfo0 = this.a.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }
}

