import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.TextView;
import j..util.Objects;

final class dxuz implements AdapterView.OnItemSelectedListener {
    final int a;
    final View b;
    final dxuu c;
    final dxva d;
    private int e;

    public dxuz(dxva dxva0, int v, View view0, dxuu dxuu0) {
        this.a = v;
        this.b = view0;
        this.c = dxuu0;
        Objects.requireNonNull(dxva0);
        this.d = dxva0;
        super();
        this.e = v;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        dxva dxva0 = this.d;
        if(dxva0.ag) {
            ((TextView)this.b.findViewById(0x7F0B0252)).setText(dxva0.A());  // id:CurrentBalance
        }
        if(this.c.b(v)) {
            dxva0.ak.setSelection(this.e);
            dxva0.ak.performClick();
        }
        dxva0.H((dxva0.ak.getSelectedItem() == null ? 0L : ((long)(((Long)dxva0.ak.getSelectedItem())))));
        this.e = v;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

