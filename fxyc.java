import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class fxyc implements View.OnApplyWindowInsetsListener {
    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        view0.setPadding(0, windowInsets0.getInsets(1).top, 0, windowInsets0.getInsets(2).bottom);
        return windowInsets0;
    }
}

