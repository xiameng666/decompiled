import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Map;

@ibnh
public final class aaui {
    public final Context a;
    public final clht b;
    public final Map c;
    public final Map d;
    public final ConnectivityManager e;
    private final aavz f;

    public aaui(Context context0, aavz aavz0, ConnectivityManager connectivityManager0) {
        this.b = new clht();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context0;
        this.f = aavz0;
        this.e = connectivityManager0;
        aavz0.a(new aauh(this));
    }

    public final boolean a() {
        return bbpr.c(this.a);
    }
}

