import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

public final class cj extends AnimatorListenerAdapter {
    final ViewGroup a;
    final View b;
    final boolean c;
    final gw d;
    final ck e;

    public cj(ViewGroup viewGroup0, View view0, boolean z, gw gw0, ck ck0) {
        this.a = viewGroup0;
        this.b = view0;
        this.c = z;
        this.d = gw0;
        this.e = ck0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        ibuq.f(animator0, "anim");
        View view0 = this.b;
        ViewGroup viewGroup0 = this.a;
        viewGroup0.endViewTransition(view0);
        if(this.c || this.d.a == gv.c) {
            gv gv0 = this.d.a;
            ibuq.c(view0);
            gv0.a(view0, viewGroup0);
        }
        this.e.a.a.f(this.e);
        if(fm.ar(2)) {
            Objects.toString(this.d);
        }
    }
}

