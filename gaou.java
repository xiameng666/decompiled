import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gaou {
    public static final String a(gano gano0) {
        ibuq.f(gano0, "<this>");
        String s = gano0.a.getStringExtra("extra_callback_service_package_name");
        return s == null ? "" : s;
    }

    public static final gano b(fbyf fbyf0, String s, WidgetConfig widgetConfig0) {
        ibuq.f(fbyf0, "callbackInput");
        ibuq.f(s, "packageName");
        ibuq.f(widgetConfig0, "widgetConfig");
        gano gano0 = new gano(gano.b("Bender3IntegratorCallbackAction", widgetConfig0));
        gawi.q(gano0.a, "extra_callback_input", ((MessageLite)fbyf0));
        ibuq.f(s, "value");
        gano0.a.putExtra("extra_callback_service_package_name", s);
        return gano0;
    }

    public static final boolean c(WidgetConfig widgetConfig0) {
        ibuq.f(widgetConfig0, "widgetConfig");
        gaxl.a();
        return widgetConfig0.E;
    }
}

