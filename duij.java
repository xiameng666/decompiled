import android.view.View.OnClickListener;
import android.view.View;

public final class duij implements ibth {
    public final View.OnClickListener a;
    public final View b;

    public duij(View.OnClickListener view$OnClickListener0, View view0) {
        this.a = view$OnClickListener0;
        this.b = view0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

