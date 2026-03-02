import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public final class ww {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    public oo g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public ww(Toolbar toolbar0, boolean z) {
        this.n = 0;
        this.a = toolbar0;
        this.d = toolbar0.k();
        this.l = toolbar0.j();
        this.k = this.d != null;
        this.j = toolbar0.e();
        wi wi0 = wi.l(toolbar0.getContext(), null, ku.a, 0x7F04007D, 0);  // attr:actionBarStyle
        this.o = wi0.h(20);
        int v = 15;
        if(z) {
            CharSequence charSequence0 = wi0.m(0x20);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.o(charSequence0);
            }
            CharSequence charSequence1 = wi0.m(30);
            if(!TextUtils.isEmpty(charSequence1)) {
                this.n(charSequence1);
            }
            Drawable drawable0 = wi0.h(25);
            if(drawable0 != null) {
                this.i = drawable0;
                this.y();
            }
            Drawable drawable1 = wi0.h(22);
            if(drawable1 != null) {
                this.h(drawable1);
            }
            if(this.j == null) {
                Drawable drawable2 = this.o;
                if(drawable2 != null) {
                    this.m(drawable2);
                }
            }
            this.g(wi0.c(15, 0));
            int v1 = wi0.f(14, 0);
            if(v1 != 0) {
                this.f(LayoutInflater.from(toolbar0.getContext()).inflate(v1, toolbar0, false));
                this.g(this.b | 16);
            }
            int v2 = wi0.e(18, 0);
            if(v2 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = toolbar0.getLayoutParams();
                viewGroup$LayoutParams0.height = v2;
                toolbar0.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v3 = wi0.a(12, -1);
            int v4 = wi0.a(8, -1);
            if(v3 >= 0 || v4 >= 0) {
                toolbar0.r(Math.max(v3, 0), Math.max(v4, 0));
            }
            int v5 = wi0.f(33, 0);
            if(v5 != 0) {
                toolbar0.E(toolbar0.getContext(), v5);
            }
            int v6 = wi0.f(0x1F, 0);
            if(v6 != 0) {
                toolbar0.B(toolbar0.getContext(), v6);
            }
            int v7 = wi0.f(27, 0);
            if(v7 != 0) {
                toolbar0.z(v7);
            }
        }
        else {
            if(toolbar0.e() == null) {
                v = 11;
            }
            else {
                this.o = toolbar0.e();
            }
            this.b = v;
        }
        wi0.o();
        if(this.n != 0x7F150086) {  // string:abc_action_bar_up_description "Navigate up"
            this.n = 0x7F150086;  // string:abc_action_bar_up_description "Navigate up"
            if(TextUtils.isEmpty(toolbar0.i())) {
                this.j(this.n);
            }
        }
        this.m = toolbar0.i();
        toolbar0.x(new wu(this));
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final kfs b(int v, long v1) {
        kfs kfs0 = kfe.c(this.a);
        kfs0.c((v == 0 ? 1.0f : 0.0f));
        kfs0.f(v1);
        kfs0.h(new wv(this, v));
        return kfs0;
    }

    public final CharSequence c() {
        return this.a.k();
    }

    public final void d() {
        this.a.n();
    }

    public final void e() {
        ActionMenuView actionMenuView0 = this.a.a;
        if(actionMenuView0 != null) {
            actionMenuView0.h();
        }
    }

    public final void f(View view0) {
        View view1 = this.c;
        if(view1 != null && (this.b & 16) != 0) {
            this.a.removeView(view1);
        }
        this.c = view0;
        if(view0 != null && (this.b & 16) != 0) {
            this.a.addView(view0);
        }
    }

    public final void g(int v) {
        int v1 = this.b ^ v;
        this.b = v;
        if(v1 != 0) {
            if((v1 & 4) != 0) {
                if((v & 4) != 0) {
                    this.w();
                }
                this.x();
            }
            if((v1 & 3) != 0) {
                this.y();
            }
            if((v1 & 8) != 0) {
                if((v & 8) == 0) {
                    this.a.D(null);
                    this.a.A(null);
                }
                else {
                    this.a.D(this.d);
                    this.a.A(this.l);
                }
            }
            if((v1 & 16) != 0) {
                View view0 = this.c;
                if(view0 != null) {
                    if((v & 16) != 0) {
                        this.a.addView(view0);
                        return;
                    }
                    this.a.removeView(view0);
                }
            }
        }
    }

    public final void h(Drawable drawable0) {
        this.h = drawable0;
        this.y();
    }

    public final void i() {
        this.f = true;
    }

    public final void j(int v) {
        this.k((v == 0 ? null : this.a().getString(v)));
    }

    public final void k(CharSequence charSequence0) {
        this.m = charSequence0;
        this.w();
    }

    public final void l(int v) {
        this.m((v == 0 ? null : kv.a(this.a(), v)));
    }

    public final void m(Drawable drawable0) {
        this.j = drawable0;
        this.x();
    }

    public final void n(CharSequence charSequence0) {
        this.l = charSequence0;
        if((this.b & 8) != 0) {
            this.a.A(charSequence0);
        }
    }

    public final void o(CharSequence charSequence0) {
        this.k = true;
        this.v(charSequence0);
    }

    public final void p(int v) {
        this.a.setVisibility(v);
    }

    public final void q(CharSequence charSequence0) {
        if(!this.k) {
            this.v(charSequence0);
        }
    }

    public final boolean r() {
        return this.a.I();
    }

    public final boolean s() {
        return this.a.J();
    }

    public final boolean t() {
        return this.a.K();
    }

    public final boolean u() {
        return this.a.L();
    }

    private final void v(CharSequence charSequence0) {
        this.d = charSequence0;
        if((this.b & 8) != 0) {
            Toolbar toolbar0 = this.a;
            toolbar0.D(charSequence0);
            if(this.k) {
                kfe.l(toolbar0.getRootView(), charSequence0);
            }
        }
    }

    private final void w() {
        if((this.b & 4) != 0) {
            if(TextUtils.isEmpty(this.m)) {
                this.a.t(this.n);
                return;
            }
            this.a.u(this.m);
        }
    }

    private final void x() {
        if((this.b & 4) != 0) {
            this.a.w((this.j == null ? this.o : this.j));
            return;
        }
        this.a.w(null);
    }

    private final void y() {
        Drawable drawable0;
        int v = this.b;
        if((v & 2) == 0) {
            drawable0 = null;
        }
        else if((v & 1) != 0) {
            drawable0 = this.i;
            if(drawable0 == null) {
                drawable0 = this.h;
            }
        }
        else {
            drawable0 = this.h;
        }
        this.a.s(drawable0);
    }
}

