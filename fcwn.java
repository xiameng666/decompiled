import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView;
import j..util.Objects;

public final class fcwn extends AnimatorListenerAdapter {
    final fcwp a;
    final LockPatternView b;

    public fcwn(LockPatternView lockPatternView0, fcwp fcwp0) {
        this.a = fcwp0;
        Objects.requireNonNull(lockPatternView0);
        this.b = lockPatternView0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.g = null;
        this.b.invalidate();
    }
}

