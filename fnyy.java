import android.animation.AnimatorSet;

public final class fnyy implements Runnable {
    public final fnzu a;

    public fnyy(fnzu fnzu0) {
        this.a = fnzu0;
    }

    @Override
    public final void run() {
        fnzu fnzu0 = this.a;
        AnimatorSet animatorSet0 = fnzu0.y;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        fnzu0.g(true);
    }
}

