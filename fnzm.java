import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class fnzm extends AnimatorListenerAdapter {
    final fnzu a;

    public fnzm(fnzu fnzu0) {
        Objects.requireNonNull(fnzu0);
        this.a = fnzu0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.n.setVisibility(4);
        this.a.m.setVisibility(4);
        this.a.y = null;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.o.setVisibility(0);
    }
}

