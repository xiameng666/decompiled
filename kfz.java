import android.view.View;
import android.view.WindowInsetsAnimation;

public final class kfz {
    public final WindowInsetsAnimation a;

    public kfz() {
    }

    public kfz(WindowInsetsAnimation windowInsetsAnimation0) {
        this.a = windowInsetsAnimation0;
    }

    public static void a(View view0, kfx kfx0) {
        view0.setWindowInsetsAnimationCallback((kfx0 == null ? null : new kfy(kfx0)));
    }
}

