import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gare {
    public static final String a(gano gano0) {
        ibuq.f(gano0, "<this>");
        return gano0.a.getStringExtra("sessionId");
    }

    public static final void b(ganv ganv0, WidgetConfig widgetConfig0, long v, byte[] arr_b, String s) {
        ibuq.f(ganv0, "<this>");
        ibuq.f(widgetConfig0, "config");
        ibuq.f(arr_b, "tokenizationParams");
        ibuq.f(widgetConfig0, "config");
        ibuq.f(arr_b, "tokenizationParams");
        gano gano0 = new gano(gano.b("tokenizeAccount", widgetConfig0));
        Intent intent0 = gano0.a;
        intent0.putExtra("instrumentId", v);
        if(arr_b != null) {
            intent0.putExtra("tokenizationParams", arr_b);
        }
        if(s != null) {
            intent0.putExtra("sessionId", s);
        }
        ganv0.f(2001, gano0);
    }
}

