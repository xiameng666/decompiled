import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;

public final class fcgm implements AdapterView.OnItemClickListener {
    public final iw a;
    public final ArrayList b;
    public final evqf c;

    public fcgm(iw iw0, ArrayList arrayList0, evqf evqf0) {
        this.a = iw0;
        this.b = arrayList0;
        this.c = evqf0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a.dismiss();
        Object[] arr_object = {baun.q(((fexs)this.b.get(v)).c)};
        fcgp.a.h("Account selected: %s", arr_object);
        fexs fexs0 = (fexs)this.b.get(v);
        this.c.gw(fexs0);
    }
}

