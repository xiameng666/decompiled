import android.view.View.OnClickListener;
import android.view.View;
import java.util.ArrayList;

public final class zrw implements View.OnClickListener {
    public final zry a;
    public final aaem b;

    public zrw(zry zry0, aaem aaem0) {
        this.a = zry0;
        this.b = aaem0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArrayList arrayList0 = new ArrayList(ibpo.q(((zno)this.b).a, 10));
        for(Object object0: ((zno)this.b).a) {
            arrayList0.add(((znm)object0).h);
        }
        gged_interceptors gged0 = ggdx.a(arrayList0);
        this.a.t.a(gged0);
    }
}

