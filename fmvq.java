import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;

public final class fmvq implements View.OnClickListener {
    public final gfsx a;
    public final fmqf b;
    public final OverlayView c;

    public fmvq(gfsx gfsx0, fmqf fmqf0, OverlayView overlayView0) {
        this.a = gfsx0;
        this.b = fmqf0;
        this.c = overlayView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gfsx gfsx0 = this.a;
        if(((fmfw)gfsx0.d()).a.i()) {
            fmbi fmbi0 = (fmbi)((fmfw)gfsx0.d()).a.d();
            this.b.a(fmbi0);
        }
        this.c.setVisibility(8);
    }
}

