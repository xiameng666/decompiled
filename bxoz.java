import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j..util.Objects;

final class bxoz implements Animator.AnimatorListener {
    final du a;
    final bxpb b;

    public bxoz(bxpb bxpb0, du du0) {
        this.a = du0;
        Objects.requireNonNull(bxpb0);
        this.b = bxpb0;
        super();
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationCancel(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationEnd(Animator animator0) {
        bxpb bxpb0 = this.b;
        fm fm0 = bxpb0.a;
        if(!fm0.B) {
            ca ca0 = new ca(fm0);
            ca0.o(this.a);
            ca0.g();
        }
        BottomSheetBehavior bottomSheetBehavior0 = bxpb0.b;
        if(bottomSheetBehavior0 != null) {
            bxpb0.d = bottomSheetBehavior0.t();
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public final void onAnimationStart(Animator animator0) {
    }
}

