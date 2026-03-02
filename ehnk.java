import android.animation.Animator.AnimatorListener;
import android.animation.Animator;

public final class ehnk implements Animator.AnimatorListener {
    final ehnl a;

    public ehnk(ehnl ehnl0) {
        this.a = ehnl0;
        super();
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
        this.a.b = null;
    }
}

