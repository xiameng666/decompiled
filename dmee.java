import android.view.View.OnClickListener;
import android.view.View;

public final class dmee implements ibth {
    public final dmel a;
    public final View.OnClickListener b;

    public dmee(dmel dmel0, View.OnClickListener view$OnClickListener0) {
        this.a = dmel0;
        this.b = view$OnClickListener0;
    }

    @Override  // ibth
    public final Object a() {
        View view0 = (View)this.a.aj.get();
        this.b.onClick(view0);
        return ibom.a;
    }
}

