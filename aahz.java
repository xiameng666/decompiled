import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.ViewPropertyAnimator;
import j..util.Objects;

final class aahz extends AnimatorListenerAdapter {
    final aaif a;

    public aahz(aaif aaif0) {
        Objects.requireNonNull(aaif0);
        this.a = aaif0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        aaid aaid0 = this.a.d;
        aaif aaif0 = aaid0.a;
        if(!aabu.q(aaif0.requireContext())) {
            aaif0.a.a();
            return;
        }
        Resources resources0 = aaif0.requireContext().getResources();
        float f = (float)resources0.getDimensionPixelSize(0x7F07019D);  // dimen:as_expanded_avatar_size
        float f1 = (float)resources0.getDimensionPixelSize(0x7F070172);  // dimen:as_appbar_expanded_avatar_top_margin_plus_ring
        float f2 = (float)resources0.getDimensionPixelSize(0x7F0701AB);  // dimen:as_ob_avatar_size
        float f3 = f1 - aaif0.ah.getY();
        float f4 = (float)resources0.getDimensionPixelSize(0x7F0701AB);  // dimen:as_ob_avatar_size
        ViewPropertyAnimator viewPropertyAnimator0 = aaif0.ah.animate();
        float f5 = f / f2;
        viewPropertyAnimator0.translationY(f3 - f4 * (1.0f - f5) / 2.0f).scaleX(f5).scaleY(f5).setDuration(0xFAL).setInterpolator(new lnu()).setListener(new aaic(aaid0));
    }
}

