import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class garf {
    public static final String a(gano gano0) {
        ibuq.f(gano0, "<this>");
        return gano0.a.getStringExtra("sessionId");
    }

    public static final void b(ganv ganv0, WidgetConfig widgetConfig0, byte[] arr_b, String s, String s1, boolean z, hdaa hdaa0) {
        ibuq.f(ganv0, "<this>");
        ibuq.f(widgetConfig0, "config");
        ibuq.f(arr_b, "actionToken");
        ibuq.f(hdaa0, "flowCustomizations");
        ibuq.f(widgetConfig0, "config");
        ibuq.f(arr_b, "actionToken");
        ibuq.f(hdaa0, "flowCustomizations");
        gano gano0 = new gano(gano.b("TokenizeCardWithToken", widgetConfig0));
        if(arr_b != null) {
            gano0.a.putExtra("actionToken", arr_b);
        }
        if(s != null) {
            gano0.a.putExtra("sessionId", s);
        }
        if(s1 != null) {
            gano0.a.putExtra("flowType", s1);
        }
        gano0.a.putExtra("isExistingCard", z);
        ibuq.f(hdaa0, "value");
        gawi.q(gano0.a, "flowCustomizations", ((MessageLite)hdaa0));
        ganv0.f(2002, gano0);
    }
}

