import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import j..util.Objects;

final class aajv implements Animation.AnimationListener {
    final aaka a;

    public aajv(aaka aaka0) {
        Objects.requireNonNull(aaka0);
        this.a = aaka0;
        super();
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        aaqh aaqh0 = this.a.c.a;
        aaqh0.c(aaqg.b);
        aaqf aaqf0 = new aaqf(aaqh0);
        aaqh0.c.o(aaqh0.b.c, aaqf0);
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
    }
}

