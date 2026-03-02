import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class nu extends nj implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, nn {
    final sq a;
    final ViewTreeObserver.OnGlobalLayoutListener b;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final na f;
    private final mx h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final View.OnAttachStateChangeListener m;
    private PopupWindow.OnDismissListener n;
    private View o;
    private nm p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;

    public nu(Context context0, na na0, View view0, int v, int v1, boolean z) {
        this.b = new ns(this);
        this.m = new nt(this);
        this.t = 0;
        this.e = context0;
        this.f = na0;
        this.i = z;
        this.h = new mx(na0, LayoutInflater.from(context0), z, 0x7F0E0017);  // layout:abc_popup_menu_item_layout
        this.k = v;
        this.l = v1;
        Resources resources0 = context0.getResources();
        this.j = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(0x7F07001B));  // dimen:abc_config_prefDialogWidth
        this.o = view0;
        this.a = new sq(context0, v, v1);
        na0.h(this, context0);
    }

    @Override  // nn
    public final void d(na na0, boolean z) {
        if(na0 == this.f) {
            this.m();
            nm nm0 = this.p;
            if(nm0 != null) {
                nm0.a(na0, z);
            }
        }
    }

    @Override  // nn
    public final Parcelable dA() {
        return null;
    }

    @Override  // nr
    public final ListView dB() {
        return this.a.e;
    }

    @Override  // nn
    public final void e(nm nm0) {
        this.p = nm0;
    }

    @Override  // nn
    public final void f(boolean z) {
        this.r = false;
        mx mx0 = this.h;
        if(mx0 != null) {
            mx0.notifyDataSetChanged();
        }
    }

    @Override  // nn
    public final boolean g() {
        return false;
    }

    @Override  // nn
    public final boolean h(nv nv0) {
        if(nv0.hasVisibleItems()) {
            nl nl0 = new nl(this.e, nv0, this.c, this.i, this.k, this.l);
            nl0.e(this.p);
            nl0.d(nj.z(nv0));
            nl0.c = this.n;
            this.n = null;
            this.f.i(false);
            int v = this.a.g;
            int v1 = this.a.b();
            if((Gravity.getAbsoluteGravity(this.t, this.o.getLayoutDirection()) & 7) == 5) {
                v += this.o.getWidth();
            }
            if(nl0.h()) {
                goto label_14;
            }
            if(nl0.a != null) {
                nl0.g(v, v1, true, true);
            label_14:
                nm nm0 = this.p;
                if(nm0 != null) {
                    nm0.b(nv0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // nj
    public final void l(na na0) {
    }

    @Override  // nr
    public final void m() {
        if(this.x()) {
            this.a.m();
        }
    }

    @Override  // nn
    public final void n(Parcelable parcelable0) {
    }

    @Override  // nj
    public final void o(View view0) {
        this.o = view0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver0 = this.d;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.n;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
        }
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.m();
            return true;
        }
        return false;
    }

    @Override  // nj
    public final void p(boolean z) {
        this.h.b = z;
    }

    @Override  // nj
    public final void q(int v) {
        this.t = v;
    }

    @Override  // nj
    public final void r(int v) {
        this.a.g = v;
    }

    @Override  // nj
    public final void s(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.n = popupWindow$OnDismissListener0;
    }

    @Override  // nj
    public final void t(boolean z) {
        this.u = z;
    }

    @Override  // nj
    public final void u(int v) {
        this.a.j(v);
    }

    @Override  // nr
    public final void v() {
        if(this.x()) {
            return;
        }
        if(!this.q) {
            View view0 = this.o;
            if(view0 != null) {
                this.c = view0;
                sq sq0 = this.a;
                sq0.t(this);
                sq0.m = this;
                sq0.y();
                View view1 = this.c;
                ViewTreeObserver viewTreeObserver0 = this.d;
                ViewTreeObserver viewTreeObserver1 = view1.getViewTreeObserver();
                this.d = viewTreeObserver1;
                if(viewTreeObserver0 == null) {
                    viewTreeObserver1.addOnGlobalLayoutListener(this.b);
                }
                view1.addOnAttachStateChangeListener(this.m);
                sq0.l = view1;
                sq0.j = this.t;
                if(!this.r) {
                    this.s = nu.A(this.h, this.e, this.j);
                    this.r = true;
                }
                sq0.r(this.s);
                sq0.w();
                sq0.s(this.g);
                sq0.v();
                rl rl0 = sq0.e;
                rl0.setOnKeyListener(this);
                if(this.u) {
                    na na0 = this.f;
                    if(na0.e != null) {
                        FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(this.e).inflate(0x7F0E0016, rl0, false);  // layout:abc_popup_menu_header_item_layout
                        TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
                        if(textView0 != null) {
                            textView0.setText(na0.e);
                        }
                        frameLayout0.setEnabled(false);
                        rl0.addHeaderView(frameLayout0, null, false);
                    }
                }
                sq0.e(this.h);
                sq0.v();
                return;
            }
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override  // nr
    public final boolean x() {
        return !this.q && this.a.x();
    }
}

