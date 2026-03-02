import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

final class ck extends gr {
    public final ci a;
    private AnimatorSet b;

    public ck(ci ci0) {
        ibuq.f(ci0, "animatorInfo");
        super();
        this.a = ci0;
    }

    @Override  // gr
    public final void a(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        AnimatorSet animatorSet0 = this.b;
        if(animatorSet0 == null) {
            this.a.a.f(this);
            return;
        }
        gw gw0 = this.a.a;
        if(gw0.f) {
            animatorSet0.reverse();
        }
        else {
            animatorSet0.end();
        }
        if(fm.ar(2)) {
            Objects.toString(gw0);
        }
    }

    @Override  // gr
    public final void b(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        gw gw0 = this.a.a;
        AnimatorSet animatorSet0 = this.b;
        if(animatorSet0 == null) {
            gw0.f(this);
            return;
        }
        animatorSet0.start();
        if(fm.ar(2)) {
            Objects.toString(gw0);
        }
    }

    @Override  // gr
    public final void c(zu zu0, ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        gw gw0 = this.a.a;
        AnimatorSet animatorSet0 = this.b;
        if(animatorSet0 == null) {
            gw0.f(this);
            return;
        }
        if(Build.VERSION.SDK_INT >= 34 && gw0.c.s) {
            if(fm.ar(2)) {
                Objects.toString(gw0);
            }
            long v = animatorSet0.getTotalDuration();
            long v1 = ((long)(zu0.b * ((float)v))) == 0L ? 1L : ((long)(zu0.b * ((float)v)));
            if(v1 == v) {
                v1 = -1L + v;
            }
            if(fm.ar(2)) {
                Objects.toString(animatorSet0);
                Objects.toString(gw0);
            }
            animatorSet0.setCurrentPlayTime(v1);
        }
    }

    @Override  // gr
    public final void d(ViewGroup viewGroup0) {
        ck ck0;
        ibuq.f(viewGroup0, "container");
        ci ci0 = this.a;
        if(!ci0.b()) {
            Context context0 = viewGroup0.getContext();
            ibuq.c(context0);
            eb eb0 = ci0.a(context0);
            this.b = eb0 == null ? null : eb0.b;
            gw gw0 = ci0.a;
            boolean z = gw0.a == gv.c;
            View view0 = gw0.c.P;
            viewGroup0.startViewTransition(view0);
            AnimatorSet animatorSet0 = this.b;
            if(animatorSet0 == null) {
                ck0 = this;
            }
            else {
                ck0 = this;
                animatorSet0.addListener(new cj(viewGroup0, view0, z, gw0, ck0));
            }
            AnimatorSet animatorSet1 = ck0.b;
            if(animatorSet1 != null) {
                animatorSet1.setTarget(view0);
            }
        }
    }

    @Override  // gr
    public final boolean e() {
        return true;
    }
}

