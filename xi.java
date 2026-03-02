import android.animation.Animator;
import android.view.View;

final class xi extends xp {
    final int a;
    final uq b;
    final xr c;

    public xi(xr xr0, uq uq0, int v, float f, float f1, float f2, float f3, int v1, uq uq1) {
        this.c = xr0;
        this.a = v1;
        this.b = uq1;
        super(uq0, v, f, f1, f2, f3);
    }

    @Override  // xp
    public final void onAnimationEnd(Animator animator0) {
        super.onAnimationEnd(animator0);
        if(!this.n) {
            if(this.a <= 0) {
                this.c.j.e(this.c.m, this.b);
            }
            else {
                this.c.a.add(this.b.a);
                this.k = true;
                this.c.m.post(new xj(this.c, this));
            }
            xr xr0 = this.c;
            View view0 = this.b.a;
            if(xr0.p == view0) {
                xr0.k(view0);
            }
        }
    }
}

