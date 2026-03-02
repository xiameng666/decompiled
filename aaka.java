import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;

final class aaka {
    public Animation a;
    ViewPropertyAnimator b;
    public final aakb c;
    public final aaub d;
    private AnimatorListenerAdapter e;

    public aaka(aakb aakb0) {
        this.c = aakb0;
        this.d = aaub.a;
    }

    public final void a(AnimatorListenerAdapter animatorListenerAdapter0) {
        AnimatorListenerAdapter animatorListenerAdapter1 = this.e;
        if(animatorListenerAdapter1 != null) {
            this.c.c.j(animatorListenerAdapter1);
        }
        this.e = animatorListenerAdapter0;
        if(animatorListenerAdapter0 != null) {
            this.c.c.b(animatorListenerAdapter0);
        }
    }

    final void b(float f, float f1) {
        this.c();
        this.c.c.hI();
        this.c.c.q(0, 0x9A);
        this.c.c.hH(false);
        this.a(new aajx(this, f, f1));
        this.c.d.setVisibility(8);
        this.c.c.setVisibility(0);
        this.c.c.k();
    }

    final void c() {
        Animation animation0 = this.a;
        if(animation0 != null) {
            animation0.setAnimationListener(null);
            this.a.cancel();
        }
    }

    public final void d() {
        this.a(null);
        this.c.c.hI();
    }

    static void e(aaka aaka0) {
        aaka0.a(null);
    }
}

