import android.view.View;
import android.view.animation.AlphaAnimation;

public final class dogg extends re {
    @Override  // vl
    public final boolean n(uq uq0, tq tq0, tq tq1) {
        View view0 = uq0.a;
        if(uq0 != null) {
            AlphaAnimation alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation0.setAnimationListener(new dogf(this, uq0));
            alphaAnimation0.setDuration(300L);
            view0.startAnimation(alphaAnimation0);
        }
        return false;
    }
}

