import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class rbn {
    public volatile String a;
    public volatile rct b;
    public final Context c;
    public volatile rdd d;
    public volatile rcs e;
    public volatile rck f;
    public volatile rbj g;
    public volatile rdf h;
    public volatile ExecutorService i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile boolean m;
    volatile boolean n;
    volatile gfuv o;
    private volatile boolean p;

    public rbn(Context context0) {
        this.c = context0;
    }

    public final boolean a() {
        try {
            return this.c.getPackageManager().getApplicationInfo("com.google.android.gms", 0x80).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        }
        catch(Exception exception0) {
            rdk.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", exception0);
            return false;
        }
    }
}

