import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class btqf implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        view0.setPadding(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), 0);
        return windowInsets0;
    }
}

