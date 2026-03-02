import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class kfs {
    public final WeakReference a;

    public kfs(View view0) {
        this.a = new WeakReference(view0);
    }

    public final void a() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().cancel();
        }
    }

    public final void b() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().start();
        }
    }

    public final void c(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alpha(f);
        }
    }

    public final void d(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleX(f);
        }
    }

    public final void e(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleY(f);
        }
    }

    public final void f(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setDuration(v);
        }
    }

    public final void g(Interpolator interpolator0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setInterpolator(interpolator0);
        }
    }

    public final void h(kft kft0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            if(kft0 != null) {
                view0.animate().setListener(new kfr(kft0, view0));
                return;
            }
            view0.animate().setListener(null);
        }
    }

    public final void i(kr kr0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            kfq kfq0 = kr0 == null ? null : new kfq(kr0);
            view0.animate().setUpdateListener(kfq0);
        }
    }

    public final void j(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationY(f);
        }
    }
}

