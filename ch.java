import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

final class ch extends gr {
    public final ci a;

    public ch(ci ci0) {
        ibuq.f(ci0, "animationInfo");
        super();
        this.a = ci0;
    }

    @Override  // gr
    public final void a(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        gw gw0 = this.a.a;
        View view0 = gw0.c.P;
        view0.clearAnimation();
        viewGroup0.endViewTransition(view0);
        gw0.f(this);
        if(fm.ar(2)) {
            Objects.toString(gw0);
        }
    }

    @Override  // gr
    public final void b(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        ci ci0 = this.a;
        if(ci0.b()) {
            ci0.a.f(this);
            return;
        }
        Context context0 = viewGroup0.getContext();
        gw gw0 = ci0.a;
        View view0 = gw0.c.P;
        ibuq.c(context0);
        eb eb0 = ci0.a(context0);
        if(eb0 != null) {
            Animation animation0 = eb0.a;
            if(animation0 != null) {
                if(gw0.a != gv.a) {
                    view0.startAnimation(animation0);
                    gw0.f(this);
                    return;
                }
                viewGroup0.startViewTransition(view0);
                ec ec0 = new ec(animation0, viewGroup0, view0);
                ec0.setAnimationListener(new cg(gw0, viewGroup0, view0, this));
                view0.startAnimation(ec0);
                if(fm.ar(2)) {
                    Objects.toString(gw0);
                }
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}

