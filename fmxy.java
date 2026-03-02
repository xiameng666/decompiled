import android.view.ViewTreeObserver.OnPreDrawListener;
import j..util.Objects;

public final class fmxy implements ViewTreeObserver.OnPreDrawListener {
    final fmya a;

    public fmxy(fmya fmya0) {
        Objects.requireNonNull(fmya0);
        this.a = fmya0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        fmya fmya0 = this.a;
        if(fmya0.w) {
            fmam.a().e("MessageListPresenter::start", fmya0.v);
            fmtx fmtx0 = fmya0.D;
            if(fmtx0 != null) {
                fmtx0.a.W.set(true);
                fmtx0.a.e();
            }
            fmya0.x.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}

