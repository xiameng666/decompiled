import android.graphics.Rect;
import android.view.View;

final class jnr extends ibur implements ibts {
    final jnt a;

    public jnr(jnt jnt0) {
        this.a = jnt0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Rect rect0;
        jnt jnt0 = this.a;
        View view0 = jnq.a(jnt0);
        if(!view0.isFocused() && !view0.hasFocus()) {
            hio hio0 = ((ili)ien.f(jnt0)).R;
            View view1 = ieo.a(jnt0);
            Integer integer0 = hie.d(((hhy)object0).a);
            int[] arr_v = new int[2];
            view1.getLocationOnScreen(arr_v);
            int[] arr_v1 = new int[2];
            view0.getLocationOnScreen(arr_v1);
            hka hka0 = hio0.c();
            if(hka0 == null) {
                rect0 = null;
            }
            else {
                int v = arr_v[0];
                int v1 = arr_v1[0];
                int v2 = arr_v[1];
                rect0 = new Rect(((int)hka0.b) + v - v1, ((int)hka0.c) + v2 - arr_v1[1], ((int)hka0.d) + v - v1, ((int)hka0.e) + v2 - arr_v1[1]);
            }
            if(!hie.e(view0, integer0, rect0)) {
                ((hhy)object0).b = true;
            }
        }
        return ibom.a;
    }
}

