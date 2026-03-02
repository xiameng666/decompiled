import android.view.View.OnClickListener;
import android.view.View;

public final class dvxz implements View.OnClickListener {
    public final dvyb a;
    public final gfsx b;

    public dvxz(dvyb dvyb0, gfsx gfsx0) {
        this.a = dvyb0;
        this.b = gfsx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gfsx gfsx0 = this.b;
        dvyb dvyb0 = this.a;
        dsnx dsnx0 = dvyb0.c;
        gtzc gtzc0 = ((gujs)gfsx0.d()).e;
        if(gtzc0 == null) {
            gtzc0 = gtzc.a;
        }
        if(dsnx0.b(gtzc0)) {
            dsnx dsnx1 = dvyb0.c;
            gtzc gtzc1 = ((gujs)gfsx0.d()).e;
            if(gtzc1 == null) {
                gtzc1 = gtzc.a;
            }
            dsnx1.a(view0, gtzc1, dvyb0.ag, dvyb0.ah);
        }
    }
}

