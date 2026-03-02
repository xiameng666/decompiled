import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnip implements View.OnClickListener {
    public final dnjs a;
    public final dxev b;

    public dnip(dnjs dnjs0, dxev dxev0) {
        this.a = dnjs0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0;
        this.a.i.d(hami.N);
        du du0 = this.a.e;
        if(dnpx.r(this.b)) {
            intent0 = dlnf.bH(du0.getContext(), 7);
        }
        else {
            intent0 = !hwwk.c() || !bbpr.c(du0.getContext()) ? dlnf.bH(du0.getContext(), 3) : dlnf.bk(du0.getContext());
        }
        du0.startActivity(intent0);
    }
}

