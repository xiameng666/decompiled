import android.view.View.OnClickListener;

public final class dxaa implements ibth {
    public final View.OnClickListener a;
    public final dxab b;

    public dxaa(View.OnClickListener view$OnClickListener0, dxab dxab0) {
        this.a = view$OnClickListener0;
        this.b = dxab0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b.t);
        return ibom.a;
    }
}

