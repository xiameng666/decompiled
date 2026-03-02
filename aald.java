import android.content.Context;
import android.graphics.Insets;
import android.view.WindowManager;
import android.view.WindowMetrics;

public final class aald {
    public static final int a(Context context0) {
        context0.getResources();
        Object object0 = context0.getSystemService("window");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.WindowManager");
        WindowMetrics windowMetrics0 = ((WindowManager)object0).getCurrentWindowMetrics();
        ibuq.e(windowMetrics0, "getCurrentWindowMetrics(...)");
        Insets insets0 = windowMetrics0.getWindowInsets().getInsetsIgnoringVisibility(0x207);
        ibuq.e(insets0, "getInsetsIgnoringVisibility(...)");
        return windowMetrics0.getBounds().width() - insets0.left - insets0.right;
    }

    public static final boolean b(Context context0) {
        ibuq.f(context0, "context");
        int v = aabu.b(((int)hojn.a.g().i()), context0);
        return aald.a(context0) >= v;
    }
}

