import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import j..util.Objects;

final class aahx extends AnimatorListenerAdapter {
    final aaif a;

    public aahx(aaif aaif0) {
        Objects.requireNonNull(aaif0);
        this.a = aaif0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.aj.j(this);
        this.a.al = true;
        this.a.aj.r(0.0f, 1.0f);
        LottieAnimationView lottieAnimationView0 = this.a.aj;
        aaid aaid0 = this.a.d;
        grus grus0 = ((grwz)this.a.c.d.get(0)).d;
        if(grus0 == null) {
            grus0 = grus.a;
        }
        lottieAnimationView0.s(aaid0.a(grus0.c));
    }
}

