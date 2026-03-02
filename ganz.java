import android.content.Context;
import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class ganz implements gamu {
    private final Context a;

    public ganz(Context context0) {
        this.a = context0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Intent intent0 = (Intent)gano0.a.getParcelableExtra("launchingIntent");
        int v = gavk.a(((hdfh)gawi.d(gano0.a, "appInfo", ((MessageLite)hdfh.a))), intent0, this.a).h;
        if(v == 0) {
            return new ganp(ganp.e(0));
        }
        Intent intent1 = ganp.e(2);
        intent1.putExtra("errorType", v);
        return new ganp(intent1);
    }

    public static int b(ganp ganp0) {
        return ganp0.a.getIntExtra("errorType", 0);
    }

    public static gano c(Intent intent0, hdfh hdfh0, WidgetConfig widgetConfig0) {
        gftb.z(intent0, "Launching intent should be provided.");
        gftb.z(hdfh0, "App information should be provided.");
        gftb.r((hdfh0.b & 8) != 0, "App validation should be provided.");
        Intent intent1 = gano.b("appValidationAction", widgetConfig0);
        intent1.putExtra("launchingIntent", intent0);
        gawi.q(intent1, "appInfo", ((MessageLite)hdfh0));
        return new gano(intent1);
    }
}

