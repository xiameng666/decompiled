import android.view.View;
import android.view.ViewGroup;

public final class cw implements Runnable {
    public final cx a;
    public final ViewGroup b;

    public cw(cx cx0, ViewGroup viewGroup0) {
        this.a = cx0;
        this.b = viewGroup0;
    }

    @Override
    public final void run() {
        for(Object object0: this.a.a) {
            gw gw0 = ((cy)object0).a;
            View view0 = gw0.c.getView();
            if(view0 != null) {
                gw0.a.a(view0, this.b);
            }
        }
    }
}

