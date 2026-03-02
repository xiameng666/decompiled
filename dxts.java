import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class dxts implements AdapterView.OnItemClickListener {
    public final dxuc a;
    public final dxtq b;

    public dxts(dxuc dxuc0, dxtq dxtq0) {
        this.a = dxuc0;
        this.b = dxtq0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.b.e(v);
        this.a.al.K(this.b.b(v));
    }
}

