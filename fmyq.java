import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import j..util.Objects;

public final class fmyq extends ViewOutlineProvider {
    final int a;
    final OverlayView b;

    public fmyq(OverlayView overlayView0, int v) {
        this.a = v;
        Objects.requireNonNull(overlayView0);
        this.b = overlayView0;
        super();
    }

    @Override  // android.view.ViewOutlineProvider
    public final void getOutline(View view0, Outline outline0) {
        outline0.setRoundRect(0, 0, view0.getWidth(), view0.getHeight() + this.a, ((float)this.b.e));
    }
}

