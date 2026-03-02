import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class btze implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        view0.setPadding(windowInsets0.getSystemWindowInsetLeft(), 0, windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
        return windowInsets0;
    }
}

