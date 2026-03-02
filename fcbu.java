import android.view.View;

public final class fcbu implements Runnable {
    public final fcbx a;

    public fcbu(fcbx fcbx0) {
        this.a = fcbx0;
    }

    @Override
    public final void run() {
        fcbx fcbx0 = this.a;
        int v = fcbx0.ai.getWidth();
        int v1 = fcbx0.a.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = fcbx0.a.getChildAt(v2);
            if((view0 instanceof fcby)) {
                ((fcby)view0).h = true;
                ((fcby)view0).j = Math.max(((fcby)view0).i, v);
            }
        }
        fcbx0.a.n();
    }
}

