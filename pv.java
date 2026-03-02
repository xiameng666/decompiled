import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

final class pv implements AdapterView.OnItemClickListener {
    final py a;

    public pv(py py0) {
        this.a = py0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        py py0 = this.a;
        AppCompatSpinner appCompatSpinner0 = py0.d;
        appCompatSpinner0.setSelection(v);
        if(appCompatSpinner0.getOnItemClickListener() != null) {
            appCompatSpinner0.performItemClick(view0, v, py0.b.getItemId(v));
        }
        py0.m();
    }
}

