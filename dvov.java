import android.graphics.Bitmap;
import android.view.View.OnClickListener;
import android.view.View;

public final class dvov implements View.OnClickListener {
    public final dvpa a;
    public final Bitmap b;

    public dvov(dvpa dvpa0, Bitmap bitmap0) {
        this.a = dvpa0;
        this.b = bitmap0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvpd dvpd0 = dvpc.a(this.b, this.a.c, null);
        this.a.au(dvpd0);
    }
}

