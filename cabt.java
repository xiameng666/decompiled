import android.animation.Animator;
import j..util.Objects;

final class cabt extends cabw {
    final cabu a;

    public cabt(cabu cabu0) {
        Objects.requireNonNull(cabu0);
        this.a = cabu0;
        super();
    }

    @Override  // cabw
    public final void onAnimationStart(Animator animator0) {
        this.a.a.c.setVisibility(0);
        this.a.a.f = 2;
    }
}

