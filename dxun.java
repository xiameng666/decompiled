import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.TextView;
import j..util.Objects;

final class dxun implements AdapterView.OnItemClickListener {
    final View a;
    final dxuu b;
    final dxuo c;

    public dxun(dxuo dxuo0, View view0, dxuu dxuu0) {
        this.a = view0;
        this.b = dxuu0;
        Objects.requireNonNull(dxuo0);
        this.c = dxuo0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        dxuo dxuo0 = this.c;
        if(dxuo0.ag) {
            ((TextView)this.a.findViewById(0x7F0B0252)).setText(dxuo0.A());  // id:CurrentBalance
        }
        dxuu dxuu0 = this.b;
        if(!dxuu0.b(v)) {
            dxuo0.b = v;
        }
        dxuo0.H(dxuu0.a(v).longValue());
        dxuo0.a.setText(dxuo0.F(dxuu0.a(dxuo0.b).longValue()), false);
    }
}

