import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gaqt {
    public static int a(ganp ganp0) {
        return ganp0.a.getIntExtra("resultCode", -1);
    }

    public static bzs b(ganp ganp0) {
        bzs bzs0 = new bzs();
        if(gaqt.a(ganp0) == -1) {
            String[] arr_s = ganp0.a.getStringArrayExtra("permissionsRequested");
            int[] arr_v = ganp0.a.getIntArrayExtra("requestedPermissionsGrantResults");
            if(arr_s != null && arr_v != null) {
                for(int v = 0; v < arr_v.length; ++v) {
                    bzs0.put(arr_s[v], Integer.valueOf(arr_v[v]));
                }
            }
        }
        return bzs0;
    }

    public static gano c(WidgetConfig widgetConfig0, String[] arr_s) {
        Intent intent0 = gano.b("RequestPermissionsAction", widgetConfig0);
        intent0.putExtra("permissionsRequested", arr_s);
        return new gano(intent0);
    }
}

