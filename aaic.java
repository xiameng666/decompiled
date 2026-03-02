import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class aaic extends AnimatorListenerAdapter {
    final aaid a;

    public aaic(aaid aaid0) {
        Objects.requireNonNull(aaid0);
        this.a = aaid0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.a.a.a();
    }
}

