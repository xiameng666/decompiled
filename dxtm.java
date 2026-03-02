import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import j..util.Objects;

final class dxtm implements AdapterView.OnItemSelectedListener {
    final int a;
    final dxuu b;
    final dxtn c;
    private int d;

    public dxtm(dxtn dxtn0, int v, dxuu dxuu0) {
        this.a = v;
        this.b = dxuu0;
        Objects.requireNonNull(dxtn0);
        this.c = dxtn0;
        super();
        this.d = v;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        if(this.b.b(v)) {
            this.c.a.setSelection(this.d);
            this.c.a.performClick();
        }
        this.d = v;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

