import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.List;

final class mp implements ViewTreeObserver.OnGlobalLayoutListener {
    final mu a;

    public mp(mu mu0) {
        this.a = mu0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        mu mu0 = this.a;
        if(mu0.x()) {
            List list0 = mu0.b;
            if(list0.size() > 0 && !((mt)list0.get(0)).a.q) {
                if(mu0.d != null && mu0.d.isShown()) {
                    for(Object object0: list0) {
                        ((mt)object0).a.v();
                    }
                    return;
                }
                mu0.m();
            }
        }
    }
}

