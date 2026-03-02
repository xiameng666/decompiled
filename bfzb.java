import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class bfzb implements View.OnClickListener {
    public final betf a;

    public bfzb(betf betf0) {
        this.a = betf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        betf betf0 = this.a;
        List list0 = betf0.a.a();
        if(list0.size() == 1) {
            Object object0 = ibpo.R(list0);
            betf0.g.l(object0);
            return;
        }
        betf0.e.l(Boolean.valueOf(true));
    }
}

