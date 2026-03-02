import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import j..util.Objects;

final class dxuh implements AdapterView.OnItemClickListener {
    final dxuu a;
    final dxui b;

    public dxuh(dxui dxui0, dxuu dxuu0) {
        this.a = dxuu0;
        Objects.requireNonNull(dxui0);
        this.b = dxui0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        dxuu dxuu0 = this.a;
        if(!dxuu0.b(v)) {
            this.b.c = v;
        }
        AutoCompleteTextView autoCompleteTextView0 = this.b.b;
        long v2 = (long)dxuu0.a(this.b.c);
        autoCompleteTextView0.setText(this.b.B(v2), false);
    }
}

