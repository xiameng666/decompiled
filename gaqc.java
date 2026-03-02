import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gaqc {
    public static String a(ganp ganp0) {
        return gfta.b(ganp0.a.getStringExtra("resultUrl"));
    }

    public static void b(Intent intent0, ganv ganv0, WidgetConfig widgetConfig0) {
        Intent intent1 = gano.b("RedirectAction", widgetConfig0);
        intent1.putExtra("redirectIntent", intent0);
        ganv0.f(1002, new gano(intent1));
    }
}

