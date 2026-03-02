import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public final class ljq extends kzw {
    public final int a;
    public kzx b;
    final DrawerLayout c;
    private final Runnable d;

    public ljq(DrawerLayout drawerLayout0, int v) {
        this.c = drawerLayout0;
        super();
        this.d = new ljp(this);
        this.a = v;
    }

    @Override  // kzw
    public final int a(View view0) {
        return DrawerLayout.t(view0) ? view0.getWidth() : 0;
    }

    @Override  // kzw
    public final void b(int v, int v1) {
        View view0 = (v & 1) == 1 ? this.c.c(3) : this.c.c(5);
        if(view0 != null && this.c.a(view0) == 0) {
            this.b.f(view0, v1);
        }
    }

    @Override  // kzw
    public final void c(View view0, int v) {
        ((ljm)view0.getLayoutParams()).c = false;
        this.m();
    }

    @Override  // kzw
    public final void d(int v) {
        this.c.o(v, this.b.k);
    }

    @Override  // kzw
    public final void e(View view0, float f, float f1) {
        int v2;
        float f2 = DrawerLayout.r(view0);
        DrawerLayout drawerLayout0 = this.c;
        int v = view0.getWidth();
        if(drawerLayout0.p(view0, 3)) {
            int v1 = Float.compare(f, 0.0f);
            v2 = 0;
            if(v1 <= 0 && (v1 != 0 || f2 <= 0.5f)) {
                v2 = -v;
            }
        }
        else {
            v2 = drawerLayout0.getWidth();
            if((f < 0.0f) || f == 0.0f && (f2 > 0.5f)) {
                v2 -= v;
            }
        }
        this.b.k(v2, view0.getTop());
        drawerLayout0.invalidate();
    }

    @Override  // kzw
    public final int h(View view0, int v) {
        return view0.getTop();
    }

    @Override  // kzw
    public final void j() {
    }

    @Override  // kzw
    public final void k(int v) {
        this.c.postDelayed(this.d, 0xA0L);
    }

    @Override  // kzw
    public final void l(View view0, int v, int v1) {
        int v2 = view0.getWidth();
        float f = ((float)(this.c.p(view0, 3) ? v2 + v : this.c.getWidth() - v)) / ((float)v2);
        this.c.l(view0, f);
        view0.setVisibility((f == 0.0f ? 4 : 0));
        this.c.invalidate();
    }

    public final void m() {
        DrawerLayout drawerLayout0 = this.c;
        View view0 = drawerLayout0.c((this.a == 3 ? 5 : 3));
        if(view0 != null) {
            drawerLayout0.g(view0);
        }
    }

    public final void n() {
        this.c.removeCallbacks(this.d);
    }

    @Override  // kzw
    public final boolean o(View view0, int v) {
        return DrawerLayout.t(view0) && (this.c.p(view0, this.a) && this.c.a(view0) == 0);
    }

    @Override  // kzw
    public final int p(View view0, int v) {
        DrawerLayout drawerLayout0 = this.c;
        if(drawerLayout0.p(view0, 3)) {
            return Math.max(-view0.getWidth(), Math.min(v, 0));
        }
        int v1 = drawerLayout0.getWidth();
        return Math.max(v1 - view0.getWidth(), Math.min(v, v1));
    }
}

