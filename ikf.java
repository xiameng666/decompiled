import android.view.MotionEvent;

public final class ikf implements Runnable {
    public final ili a;

    public ikf(ili ili0) {
        this.a = ili0;
    }

    @Override
    public final void run() {
        ili ili0 = this.a;
        ili0.O = false;
        MotionEvent motionEvent0 = ili0.K;
        ibuq.c(motionEvent0);
        if(motionEvent0.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        ili0.B(motionEvent0);
    }
}

