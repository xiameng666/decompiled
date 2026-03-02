import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j..util.Objects;

final class aajw extends AnimatorListenerAdapter {
    final aaka a;

    public aajw(aaka aaka0) {
        Objects.requireNonNull(aaka0);
        this.a = aaka0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        aaka.e(this.a);
        aakb aakb0 = this.a.c;
        if(aakb0.a.a() != aaqg.c && aakb0.a.a() != aaqg.d) {
            aakb0.c.q(0, 0x87);
            aakb0.c.hH(true);
            aakb0.c.i();
        }
    }
}

