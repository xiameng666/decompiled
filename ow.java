import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class ow {
    public wg a;
    private final View b;
    private final pc c;
    private int d;
    private wg e;
    private wg f;

    public ow(View view0) {
        this.d = -1;
        this.b = view0;
        this.c = pc.d();
    }

    public final void a() {
        View view0 = this.b;
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            if(this.e != null) {
                if(this.f == null) {
                    this.f = new wg();
                }
                wg wg0 = this.f;
                wg0.a = null;
                wg0.d = false;
                wg0.b = null;
                wg0.c = false;
                ColorStateList colorStateList0 = view0.getBackgroundTintList();
                if(colorStateList0 != null) {
                    wg0.d = true;
                    wg0.a = colorStateList0;
                }
                PorterDuff.Mode porterDuff$Mode0 = view0.getBackgroundTintMode();
                if(porterDuff$Mode0 != null) {
                    wg0.c = true;
                    wg0.b = porterDuff$Mode0;
                }
                if(wg0.d || wg0.c) {
                    ut.g(drawable0, wg0, view0.getDrawableState());
                    return;
                }
            }
            wg wg1 = this.a;
            if(wg1 != null) {
                ut.g(drawable0, wg1, view0.getDrawableState());
                return;
            }
            wg wg2 = this.e;
            if(wg2 != null) {
                ut.g(drawable0, wg2, view0.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet0, int v) {
        View view0 = this.b;
        wi wi0 = wi.l(view0.getContext(), attributeSet0, ku.B, v, 0);
        kfc.b(view0, view0.getContext(), ku.B, attributeSet0, wi0.b, v, 0);
        try {
            if(wi0.q(0)) {
                this.d = wi0.f(0, -1);
                Context context0 = view0.getContext();
                ColorStateList colorStateList0 = this.c.a(context0, this.d);
                if(colorStateList0 != null) {
                    this.d(colorStateList0);
                }
            }
            if(wi0.q(1)) {
                view0.setBackgroundTintList(wi0.g(1));
            }
            if(wi0.q(2)) {
                view0.setBackgroundTintMode(rg.a(wi0.c(2, -1), null));
            }
        }
        finally {
            wi0.o();
        }
    }

    public final void c(int v) {
        this.d = v;
        this.d((this.c == null ? null : this.c.a(this.b.getContext(), v)));
        this.a();
    }

    final void d(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.e = null;
        }
        else {
            if(this.e == null) {
                this.e = new wg();
            }
            this.e.a = colorStateList0;
            this.e.d = true;
        }
        this.a();
    }

    public final void e() {
        this.d = -1;
        this.d(null);
        this.a();
    }
}

