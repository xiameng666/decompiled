import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class nl {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final na e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private nm j;
    private nj k;
    private final PopupWindow.OnDismissListener l;

    public nl(Context context0, na na0, View view0, boolean z) {
        this(context0, na0, view0, z, 0x7F04009C, 0);  // attr:actionOverflowMenuStyle
    }

    public nl(Context context0, na na0, View view0, boolean z, int v, int v1) {
        this.b = 0x800003;
        this.l = new nk(this);
        this.d = context0;
        this.e = na0;
        this.a = view0;
        this.f = z;
        this.g = v;
        this.h = v1;
    }

    public final nj a() {
        if(this.k == null) {
            Context context0 = this.d;
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            Point point0 = new Point();
            display0.getRealSize(point0);
            mu mu0 = Math.min(point0.x, point0.y) >= context0.getResources().getDimensionPixelSize(0x7F07001A) ? new mu(context0, this.a, this.g, this.h, this.f) : new nu(context0, this.e, this.a, this.g, this.h, this.f);  // dimen:abc_cascading_menus_min_smallest_width
            mu0.l(this.e);
            mu0.s(this.l);
            mu0.o(this.a);
            mu0.e(this.j);
            mu0.p(this.i);
            mu0.q(this.b);
            this.k = mu0;
        }
        return this.k;
    }

    public final void b() {
        if(this.h()) {
            this.k.m();
        }
    }

    protected void c() {
        this.k = null;
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.c;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.i = z;
        nj nj0 = this.k;
        if(nj0 != null) {
            nj0.p(z);
        }
    }

    public final void e(nm nm0) {
        this.j = nm0;
        nj nj0 = this.k;
        if(nj0 != null) {
            nj0.e(nm0);
        }
    }

    public final void f() {
        if(this.i()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void g(int v, int v1, boolean z, boolean z1) {
        nj nj0 = this.a();
        nj0.t(z1);
        if(z) {
            if((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                v -= this.a.getWidth();
            }
            nj0.r(v);
            nj0.u(v1);
            int v2 = (int)(this.d.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            nj0.g = new Rect(v - v2, v1 - v2, v + v2, v1 + v2);
        }
        nj0.v();
    }

    public final boolean h() {
        return this.k != null && this.k.x();
    }

    public final boolean i() {
        if(this.h()) {
            return true;
        }
        if(this.a == null) {
            return false;
        }
        this.g(0, 0, false, false);
        return true;
    }
}

