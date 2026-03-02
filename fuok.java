import android.view.View;
import android.view.Window;

public final class fuok {
    public static final void a(Window window0) {
        ibuq.f(window0, "window");
        window0.setNavigationBarContrastEnforced(true);
        kfv.a(window0, false);
    }

    public static final void b(View view0, ibts ibts0) {
        ibuq.f(view0, "view");
        kex.b(view0, new fuoi(ibts0));
        if(view0.isAttachedToWindow()) {
            view0.requestApplyInsets();
        }
        view0.addOnAttachStateChangeListener(new fuoj(view0));
    }
}

