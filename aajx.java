import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class aajx extends AnimatorListenerAdapter {
    final float a;
    final float b;
    final aaka c;

    public aajx(aaka aaka0, float f, float f1) {
        this.a = f;
        this.b = f1;
        Objects.requireNonNull(aaka0);
        this.c = aaka0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.c.c.c.q(0x9B, 180);
        aaka.e(this.c);
        this.c.c.c.k();
        this.c.c.ah.setVisibility(0);
        this.c.b = this.c.c.ah.animate().alpha(1.0f).setDuration(300L);
        this.c.b.setListener(new aajy(this.c, this.a, this.b));
    }
}

