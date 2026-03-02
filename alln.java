import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import j..util.Objects;

final class alln implements AdapterView.OnItemSelectedListener {
    final allq a;

    public alln(allq allq0) {
        Objects.requireNonNull(allq0);
        this.a = allq0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        String s = (String)this.a.ah.get(v);
        this.a.K(s);
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

