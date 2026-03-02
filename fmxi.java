import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class fmxi extends AnimatorListenerAdapter {
    final uq a;
    final View b;
    final ViewPropertyAnimator c;
    final fmxo d;

    public fmxi(fmxo fmxo0, uq uq0, View view0, ViewPropertyAnimator viewPropertyAnimator0) {
        this.a = uq0;
        this.b = view0;
        this.c = viewPropertyAnimator0;
        Objects.requireNonNull(fmxo0);
        this.d = fmxo0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.b.setTranslationX(0.0f);
        this.b.setTranslationY(0.0f);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.c.setListener(null);
        this.d.l(this.a);
        this.d.a.remove(this.a);
        this.d.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

