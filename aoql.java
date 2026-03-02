import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class aoql implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        view0.setPadding(0, 0, 0, windowInsets0.getSystemWindowInsetBottom());
        return WindowInsets.CONSUMED;
    }
}

