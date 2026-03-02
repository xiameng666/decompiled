import android.view.MotionEvent;

public final class ilb implements Runnable {
    final ili a;

    public ilb(ili ili0) {
        this.a = ili0;
        super();
    }

    @Override
    public final void run() {
        ili ili0 = this.a;
        ili0.removeCallbacks(this);
        MotionEvent motionEvent0 = ili0.K;
        if(motionEvent0 != null) {
            int v = motionEvent0.getToolType(0);
            int v1 = motionEvent0.getActionMasked();
            if(v == 3) {
                if(v1 != 1 && v1 != 10) {
                    ili0.H(motionEvent0, (v1 == 7 || v1 == 9 ? 7 : 2), ili0.L, false);
                }
            }
            else if(v1 != 1) {
                ili0.H(motionEvent0, (v1 == 7 || v1 == 9 ? 7 : 2), ili0.L, false);
            }
        }
    }
}

