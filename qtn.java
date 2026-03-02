import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class qtn extends ValueAnimator {
    public final Set a;
    public final Set b;
    private final Set c;

    public qtn() {
        this.c = new CopyOnWriteArraySet();
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
    }

    final void a(boolean z) {
        for(Object object0: this.a) {
            ((Animator.AnimatorListener)object0).onAnimationEnd(this, z);
        }
    }

    @Override  // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.a.add(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.b.add(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.c.add(valueAnimator$AnimatorUpdateListener0);
    }

    public final void b() {
        for(Object object0: this.c) {
            ((ValueAnimator.AnimatorUpdateListener)object0).onAnimationUpdate(this);
        }
    }

    @Override  // android.animation.ValueAnimator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override  // android.animation.Animator
    public final void removeAllListeners() {
        this.a.clear();
    }

    @Override  // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.c.clear();
    }

    @Override  // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.a.remove(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.b.remove(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.c.remove(valueAnimator$AnimatorUpdateListener0);
    }

    @Override  // android.animation.ValueAnimator
    public final Animator setDuration(long v) {
        return this.setDuration(v);
    }

    @Override  // android.animation.ValueAnimator
    public final ValueAnimator setDuration(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override  // android.animation.ValueAnimator
    public final void setInterpolator(TimeInterpolator timeInterpolator0) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override  // android.animation.ValueAnimator
    public final void setStartDelay(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}

