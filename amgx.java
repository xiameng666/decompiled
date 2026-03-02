import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class amgx implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        if(hoxf.a.b().m()) {
            view0.setPadding(0, 0, 0, windowInsets0.getSystemWindowInsetBottom());
            return windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), 0);
        }
        view0.setPadding(windowInsets0.getSystemWindowInsetLeft(), 0, windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
        return windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), 0, 0);
    }
}

