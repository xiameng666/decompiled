import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class aair extends AnimatorListenerAdapter {
    final aaiu a;

    public aair(aaiu aaiu0) {
        Objects.requireNonNull(aaiu0);
        this.a = aaiu0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a.ah.c(2);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.ah.c(2);
    }
}

