import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import java.util.concurrent.TimeUnit;

public final class fmvs implements Runnable {
    public final LighterWebView a;
    public final fmqf b;
    public final View c;
    public final gfsx d;
    public final boolean e;
    public final OverlayView f;
    public final fmre g;

    public fmvs(LighterWebView lighterWebView0, fmqf fmqf0, View view0, gfsx gfsx0, boolean z, OverlayView overlayView0, fmre fmre0) {
        this.a = lighterWebView0;
        this.b = fmqf0;
        this.c = view0;
        this.d = gfsx0;
        this.e = z;
        this.f = overlayView0;
        this.g = fmre0;
    }

    @Override
    public final void run() {
        this.a.b(gfqx.a, this.c);
        gfsx gfsx0 = this.d;
        if(gfsx0.i()) {
            fmfw fmfw0 = (fmfw)gfsx0.d();
            this.f.d(fmfw0, this.e);
            Object object0 = gfsx0.d();
            fmvq fmvq0 = new fmvq(gfsx0, this.b, this.f);
            this.f.c(((fmfw)object0), fmvq0);
            fmfw fmfw1 = (fmfw)gfsx0.d();
            this.f.b(fmfw1);
            fmvr fmvr0 = new fmvr(this.f);
            long v = TimeUnit.SECONDS.toMillis(((long)((fmfw)gfsx0.d()).e));
            this.f.postDelayed(fmvr0, v);
        }
        fmre fmre0 = this.g;
        if(fmre0 != null) {
            ((fmuw)fmre0).h(0x7E);
        }
    }
}

