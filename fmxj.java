import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class fmxj extends AnimatorListenerAdapter {
    final uq a;
    final int b;
    final View c;
    final int d;
    final ViewPropertyAnimator e;
    final fmxo f;

    public fmxj(fmxo fmxo0, uq uq0, int v, View view0, int v1, ViewPropertyAnimator viewPropertyAnimator0) {
        this.a = uq0;
        this.b = v;
        this.c = view0;
        this.d = v1;
        this.e = viewPropertyAnimator0;
        Objects.requireNonNull(fmxo0);
        this.f = fmxo0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        if(this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if(this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.e.setListener(null);
        this.f.l(this.a);
        this.f.b.remove(this.a);
        this.f.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

