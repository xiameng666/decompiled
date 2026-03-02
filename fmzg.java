import android.view.View;
import android.widget.PopupWindow;

public final class fmzg {
    public final fmzf a;

    public fmzg(View view0, View view1) {
        gftb.check(view0);
        gftb.check(view1);
        fmzf fmzf0 = new fmzf(fmrf.b(view1.getContext(), iaea.j()));
        fmzf0.setWillNotDraw(false);
        fmzf0.setLayerType(1, fmzf0.a);
        fmzf0.setOnClickListener(new fmzd());
        this.a = fmzf0;
        fmzf0.d = view0;
        fmzf0.b = new PopupWindow(fmzf0);
        fmzf0.addView(view0);
        fmzf0.f = view1;
        fmzf0.d();
        fmzf0.e = 1;
        fmzf0.g = 2;
    }
}

