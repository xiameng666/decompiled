import android.graphics.Rect;
import android.view.ViewGroup;

public final class inv extends hfb implements isf {
    public ViewGroup a;

    public inv(ViewGroup viewGroup0) {
        this.a = viewGroup0;
    }

    @Override  // isf
    public final Object e(hzk hzk0, ibth ibth0, ibrl ibrl0) {
        long v = hzl.a(hzk0);
        Object object0 = ibth0.a();
        hka hka0 = object0 == null ? null : ((hka)object0).f(v);
        if(hka0 != null) {
            this.a.requestRectangleOnScreen(new Rect(((int)hka0.b), ((int)hka0.c), ((int)hka0.d), ((int)hka0.e)), false);
        }
        return ibom.a;
    }
}

