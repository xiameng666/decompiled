import android.animation.Animator;
import j..util.Objects;

public final class cabv extends cabw {
    final cabx a;

    public cabv(cabx cabx0) {
        Objects.requireNonNull(cabx0);
        this.a = cabx0;
        super();
    }

    @Override  // cabw
    public final void onAnimationEnd(Animator animator0) {
        this.a.f = 4;
        this.a.b.finish();
    }
}

