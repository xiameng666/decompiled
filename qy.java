import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class qy extends AnimatorListenerAdapter {
    final uq a;
    final View b;
    final ViewPropertyAnimator c;
    final re d;

    public qy(re re0, uq uq0, View view0, ViewPropertyAnimator viewPropertyAnimator0) {
        this.d = re0;
        this.a = uq0;
        this.b = view0;
        this.c = viewPropertyAnimator0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.b.setAlpha(1.0f);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.c.setListener(null);
        this.d.l(this.a);
        this.d.d.remove(this.a);
        this.d.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

