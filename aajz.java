import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class aajz extends AnimatorListenerAdapter {
    final aaka a;

    public aajz(aaka aaka0) {
        Objects.requireNonNull(aaka0);
        this.a = aaka0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.b.setListener(null);
        this.a.c.a.b();
    }
}

