import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;

class xp implements Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    final uq h;
    final int i;
    final ValueAnimator j;
    boolean k;
    float l;
    float m;
    boolean n;
    boolean o;
    public float p;

    public xp(uq uq0, int v, float f, float f1, float f2, float f3) {
        this.n = false;
        this.o = false;
        this.i = v;
        this.h = uq0;
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.j = valueAnimator0;
        valueAnimator0.addUpdateListener(new xo(this));
        valueAnimator0.setTarget(uq0.a);
        valueAnimator0.addListener(this);
        this.p = 0.0f;
    }

    public final void a() {
        this.j.cancel();
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
        this.p = 1.0f;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationEnd(Animator animator0) {
        if(!this.o) {
            this.h.n(true);
        }
        this.o = true;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
    }
}

