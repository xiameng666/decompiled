import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gatf {
    public static boolean a(Context context0, WidgetConfig widgetConfig0) {
        return gcuu.a(context0, widgetConfig0.k);
    }

    public static void b(ContextWrapper contextWrapper0, WidgetConfig widgetConfig0) {
        contextWrapper0.getTheme().applyStyle(widgetConfig0.e, true);
    }
}

