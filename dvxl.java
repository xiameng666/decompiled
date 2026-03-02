import android.view.View.OnClickListener;
import android.view.View;

public final class dvxl implements View.OnClickListener {
    public final dvxp a;
    public final gtzc b;

    public dvxl(dvxp dvxp0, gtzc gtzc0) {
        this.a = dvxp0;
        this.b = gtzc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.c(view0, this.b, this.a.b, this.a.c, true);
    }
}

