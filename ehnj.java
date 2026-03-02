import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.view.View;

public final class ehnj implements Animator.AnimatorListener {
    final View a;
    final ehnl b;
    final oij c;

    public ehnj(View view0, ehnl ehnl0, oij oij0) {
        this.a = view0;
        this.b = ehnl0;
        this.c = oij0;
        super();
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
        this.a.setBackgroundResource(this.b.a);
        this.c.n(true);
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
    }
}

