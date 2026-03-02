import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class bdch implements View.OnClickListener {
    public final bddc a;

    public bdch(bddc bddc0) {
        this.a = bddc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bddm bddm0 = this.a.y();
        List list0 = bddm0.e;
        switch(list0.size()) {
            case 0: {
                bddm0.t.l(ibom.a);
                bddm0.x.l(ibom.a);
                return;
            }
            case 1: {
                bddm0.a(((String)ibpo.R(list0)));
                return;
            }
            default: {
                bddm0.b.c(gqsm.NW);
                bddm0.j.l(list0);
            }
        }
    }
}

