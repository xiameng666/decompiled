import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class dxuj implements AdapterView.OnItemClickListener {
    public final dxum a;
    public final dxtq b;

    public dxuj(dxum dxum0, dxtq dxtq0) {
        this.a = dxum0;
        this.b = dxtq0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a.J(v);
        this.b.e(v);
        this.a.al.K(this.b.b(v));
    }
}

