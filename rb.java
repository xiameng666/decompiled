import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class rb extends AnimatorListenerAdapter {
    final rc a;
    final ViewPropertyAnimator b;
    final View c;
    final re d;

    public rb(re re0, rc rc0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
        this.d = re0;
        this.a = rc0;
        this.b = viewPropertyAnimator0;
        this.c = view0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.l(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

