import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

final class ip implements AdapterView.OnItemClickListener {
    final iu a;
    final ir b;

    public ip(ir ir0, iu iu0) {
        this.b = ir0;
        this.a = iu0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        kc kc0 = this.a.b;
        this.b.t.onClick(kc0, v);
        if(!this.b.y) {
            kc0.dismiss();
        }
    }
}

