import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class acen extends AnimatorListenerAdapter {
    final aces a;

    public acen(aces aces0) {
        Objects.requireNonNull(aces0);
        this.a = aces0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.b ^= 1;
    }
}

