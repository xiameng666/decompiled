import android.view.View.OnClickListener;
import android.view.View;

public final class dmon implements View.OnClickListener {
    public final dmos a;

    public dmon(dmos dmos0) {
        this.a = dmos0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmos dmos0 = this.a;
        dmos0.y().d.a(hahw.i, 5);
        edon edon0 = dmos0.b;
        if(edon0 == null) {
            ibuq.j("networkAccessChecker");
            edon0 = null;
        }
        if(edon0.a()) {
            dmos0.y().f(dmov.h);
            dmpe dmpe0 = dmos0.y();
            icbb.b(lsc.a(dmpe0), null, null, new dmpc(dmpe0, null), 3);
            return;
        }
        dmos0.y().f(dmov.d);
    }
}

