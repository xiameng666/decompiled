import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class aajy extends AnimatorListenerAdapter {
    final float a;
    final float b;
    final aaka c;

    public aajy(aaka aaka0, float f, float f1) {
        this.a = f;
        this.b = f1;
        Objects.requireNonNull(aaka0);
        this.c = aaka0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        aaka aaka0 = this.c;
        aaka0.b.setListener(null);
        aakb aakb0 = aaka0.c;
        if(!aabu.q(aakb0.requireContext())) {
            aakb0.a.b();
        }
        aakb0.c.setVisibility(8);
        aakb0.ah.setVisibility(0);
        aakb0.ah.setAlpha(1.0f);
        Resources resources0 = aakb0.requireContext().getResources();
        float f = (float)resources0.getDimensionPixelSize(0x7F0701D6);  // dimen:as_splash_screen_avatar_size
        float f1 = aakb0.ah.getY();
        float f2 = (float)resources0.getDimensionPixelSize(0x7F0701D6);  // dimen:as_splash_screen_avatar_size
        ViewPropertyAnimator viewPropertyAnimator0 = aakb0.ah.animate();
        float f3 = this.a / f;
        aaka0.b = viewPropertyAnimator0.translationY(this.b - f1 - f2 * (1.0f - f3) / 2.0f).scaleX(f3).scaleY(f3).setDuration(350L).setInterpolator(new lnu());
        aaka0.b.setListener(new aajz(aaka0));
    }
}

