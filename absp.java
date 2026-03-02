import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;

public final class absp {
    public final Handler a;
    public final Context b;
    private static Boolean c;

    public absp(Context context0) {
        this.b = context0;
        this.a = new clht();
    }

    public final void a() {
        abpi.e(this.b).h().y("Device AnalyticsService is starting up");
    }

    public final void b() {
        abpi.e(this.b).h().y("Device AnalyticsService is shutting down");
    }

    public final void c(Runnable runnable0) {
        abpi.e(this.b).d().c(new absn(this, runnable0));
    }

    public static boolean d(Context context0) {
        boolean z;
        batl.s(context0);
        Boolean boolean0 = absp.c;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        try {
            z = false;
            ServiceInfo serviceInfo0 = context0.getPackageManager().getServiceInfo(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if(serviceInfo0 != null && serviceInfo0.enabled) {
                z = true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        absp.c = Boolean.valueOf(z);
        return z;
    }
}

