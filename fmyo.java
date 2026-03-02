import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;

public final class fmyo {
    public final OverlayView a;
    public final AccountContext b;
    public final Handler c;
    public final Runnable d;
    public fmyj e;
    public final flit f;
    private static final fmyj g;
    private final fmqf h;

    static {
        fmyo.g = new fmyk();
    }

    public fmyo(flit flit0, OverlayView overlayView0, fmqf fmqf0, AccountContext accountContext0) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new fmyn(this);
        this.e = fmyo.g;
        this.h = fmqf0;
        this.f = flit0;
        this.a = overlayView0;
        this.b = accountContext0;
    }

    public final void a() {
        this.a.setVisibility(8);
        this.e.a();
    }

    public final void b(fmfw fmfw0) {
        gfsx gfsx0 = fmfw0.a;
        if(gfsx0.i()) {
            fmbi fmbi0 = (fmbi)gfsx0.d();
            this.h.a(fmbi0);
        }
    }
}

