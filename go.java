import android.view.View;

public final class go implements Runnable {
    public final gx a;
    public final gs b;

    public go(gx gx0, gs gs0) {
        this.a = gx0;
        this.b = gs0;
    }

    @Override
    public final void run() {
        gx gx0 = this.a;
        gs gs0 = this.b;
        if(gx0.b.contains(gs0)) {
            gv gv0 = gs0.a;
            View view0 = gs0.c.P;
            ibuq.e(view0, "mView");
            gv0.a(view0, gx0.a);
        }
    }
}

