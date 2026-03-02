import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public final class gbmj extends pbg {
    private final gbmd z;

    public gbmj(gbmd gbmd0) {
        this.z = gbmd0;
    }

    @Override  // pbg
    public final Animator V(ViewGroup viewGroup0, pav pav0, pav pav1) {
        return (this.y & 1) != 1 || pav1 == null ? null : this.f(viewGroup0, pav1.b, pav0, pav1);
    }

    @Override  // pbg
    public final Animator f(ViewGroup viewGroup0, View view0, pav pav0, pav pav1) {
        hdzs hdzs0 = this.z.m(view0, 2);
        return hdzs0 == null ? null : gbmi.b(this.z, hdzs0, view0, true);
    }

    @Override  // pbg
    public final Animator g(ViewGroup viewGroup0, View view0, pav pav0, pav pav1) {
        hdzs hdzs0 = this.z.m(view0, 3);
        return hdzs0 == null ? null : gbmi.b(this.z, hdzs0, view0, false);
    }
}

