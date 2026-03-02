import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class fmxl extends AnimatorListenerAdapter {
    final fmxm a;
    final ViewPropertyAnimator b;
    final View c;
    final fmxo d;

    public fmxl(fmxo fmxo0, fmxm fmxm0, ViewPropertyAnimator viewPropertyAnimator0, View view0) {
        this.a = fmxm0;
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
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.l(this.a.b);
        this.d.d.remove(this.a.b);
        this.d.a();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
    }
}

