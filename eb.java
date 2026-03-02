import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

final class eb {
    public final Animation a;
    public final AnimatorSet b;

    public eb(Animator animator0) {
        this.a = null;
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.b = animatorSet0;
        animatorSet0.play(animator0);
    }

    public eb(Animation animation0) {
        this.a = animation0;
        this.b = null;
    }
}

