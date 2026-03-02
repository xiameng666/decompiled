import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public final class cabx {
    public static final ggfp a;
    public final xob b;
    public final View c;
    public final View d;
    public final View e;
    public int f;
    private final int g;

    static {
        cabx.a = ggfp.K(Integer.valueOf(3), Integer.valueOf(4));
    }

    public cabx(xob xob0, View view0, View view1) {
        this.f = 0;
        this.b = xob0;
        View view2 = xob0.findViewById(0x1020002);
        this.c = view2;
        view2.setVisibility(4);
        this.d = view0;
        this.e = view1;
        this.g = xob0.getResources().getInteger(0x10E0001);
    }

    public final void a(ObjectAnimator objectAnimator0, ObjectAnimator objectAnimator1, Animator.AnimatorListener animator$AnimatorListener0) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.play(objectAnimator0).with(objectAnimator1);
        animatorSet0.setInterpolator(new lnt());
        animatorSet0.setDuration(((long)this.g));
        animatorSet0.addListener(animator$AnimatorListener0);
        animatorSet0.start();
    }
}

