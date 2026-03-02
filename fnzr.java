import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class fnzr extends AnimatorListenerAdapter {
    final fnzu a;

    public fnzr(fnzu fnzu0) {
        Objects.requireNonNull(fnzu0);
        this.a = fnzu0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.o.setVisibility(8);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.n.setVisibility(0);
        this.a.m.setVisibility(0);
    }
}

