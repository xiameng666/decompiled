import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;

final class sh implements AdapterView.OnItemSelectedListener {
    final sn a;

    public sh(sn sn0) {
        this.a = sn0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        if(v != -1) {
            rl rl0 = this.a.e;
            if(rl0 != null) {
                rl0.a = false;
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

