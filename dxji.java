import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class dxji extends AnimatorListenerAdapter {
    final dxjk a;

    public dxji(dxjk dxjk0) {
        this.a = dxjk0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        ibuq.f(animator0, "animation");
        View view0 = this.a.ar;
        if(view0 == null) {
            ibuq.j("hiddenViewLayout");
            view0 = null;
        }
        view0.setVisibility(8);
    }
}

