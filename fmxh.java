import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class fmxh extends AnimatorListenerAdapter {
    final uq a;
    final ViewPropertyAnimator b;
    final View c;
    final fmxo d;

    public fmxh(fmxo fmxo0, uq uq0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
        this.a = uq0;
        this.b = viewPropertyAnimator0;
        this.c = view0;
        Objects.requireNonNull(fmxo0);
        this.d = fmxo0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.l(this.a);
        this.d.c.remove(this.a);
        this.d.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

