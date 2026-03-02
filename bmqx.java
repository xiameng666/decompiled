import android.view.View.OnClickListener;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class bmqx implements View.OnClickListener {
    public final bmqz a;
    public final int b;

    public bmqx(bmqz bmqz0, int v) {
        this.a = bmqz0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = this.b;
        foec foec0 = (foec)this.a.a.get(v);
        bmrl bmrl0 = this.a.e.a;
        List list0 = (List)bmrl0.a.e.ij();
        if(list0 != null && v <= list0.size() && v != 0) {
            ArrayList arrayList0 = new ArrayList(list0);
            arrayList0.set(0, ((foec)list0.get(v)));
            arrayList0.set(v, ((foec)list0.get(0)));
            bmrl0.a.p(arrayList0);
        }
        bmrl0.a.l(blhf.f);
        bmrl0.a.y(5);
    }
}

