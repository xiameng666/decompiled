import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;
import java.util.List;

final class bmrk implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmrl a;

    public bmrk(bmrl bmrl0) {
        Objects.requireNonNull(bmrl0);
        this.a = bmrl0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int v;
        bmrl bmrl0 = this.a;
        bmrl0.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        List list0 = (List)bmrl0.a.e.ij();
        if(list0 != null) {
            if(list0.size() < 3) {
                v = bmrl0.c.getBottom();
                bmrl0.a.n(v);
                return;
            }
            uq uq0 = bmrl0.b.m(2);
            if(uq0 != null) {
                int v1 = (uq0.a.getBottom() + uq0.a.getTop()) / 2;
                v = bmrl0.b.getTop() + v1;
                bmrl0.a.n(v);
            }
        }
    }
}

