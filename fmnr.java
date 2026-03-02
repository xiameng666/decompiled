import android.view.View;

public final class fmnr {
    public final fmwl a;
    public fmwd b;
    private figm c;

    public fmnr(fmwl fmwl0) {
        fmwl0.c(this);
        this.a = fmwl0;
    }

    public final void a() {
        fmwd fmwd0 = this.b;
        if(fmwd0 != null) {
            gfsx gfsx0 = fmwd0.a;
            if(gfsx0.i()) {
                figm figm0 = this.c;
                if(figm0 != null) {
                    Object object0 = gfsx0.d();
                    figm0.a.o(((fmga)object0));
                }
            }
        }
    }

    public final void b() {
        boolean z = this.b != null && this.b.a.i() && ((fmga)this.b.a.d()).g.equals(fmft.g) && this.c != null;
        fmwl fmwl0 = this.a;
        if((fmwl0 instanceof View)) {
            ((View)fmwl0).setClickable(z);
        }
    }

    public final void c(figm figm0) {
        this.c = figm0;
        this.b();
    }
}

