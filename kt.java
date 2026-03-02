import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class kt extends im implements oe {
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    ks f;
    lz g;
    ly h;
    public int i;
    public boolean j;
    boolean k;
    public boolean l;
    public mi m;
    boolean n;
    final kft o;
    final kft p;
    ww q;
    final kr r;
    private static final Interpolator s;
    private static final Interpolator t;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    static {
        kt.s = new AccelerateInterpolator();
        kt.t = new DecelerateInterpolator();
    }

    public kt(Activity activity0, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.o = new kp(this);
        this.p = new kq(this);
        this.r = new kr(this);
        View view0 = activity0.getWindow().getDecorView();
        this.S(view0);
        if(!z) {
            this.e = view0.findViewById(0x1020002);
        }
    }

    public kt(Dialog dialog0) {
        new ArrayList();
        this.x = new ArrayList();
        this.i = 0;
        this.j = true;
        this.z = true;
        this.o = new kp(this);
        this.p = new kq(this);
        this.r = new kr(this);
        this.S(dialog0.getWindow().getDecorView());
    }

    @Override  // im
    public final void A(int v) {
        this.B(this.a.getString(v));
    }

    @Override  // im
    public final void B(CharSequence charSequence0) {
        this.q.o(charSequence0);
    }

    @Override  // im
    public final void C(CharSequence charSequence0) {
        this.q.q(charSequence0);
    }

    @Override  // im
    public final void D() {
        if(this.k) {
            this.k = false;
            this.Q(false);
        }
    }

    @Override  // im
    public final boolean F() {
        ww ww0 = this.q;
        if(ww0 != null && ww0.r()) {
            ww0.d();
            return true;
        }
        return false;
    }

    @Override  // im
    public final boolean H() {
        int v = this.c.getHeight();
        return this.z ? v == 0 || this.b.a() < v : false;
    }

    @Override  // im
    public final boolean I(int v, KeyEvent keyEvent0) {
        ks ks0 = this.f;
        if(ks0 == null) {
            return false;
        }
        boolean z = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
        ks0.a.setQwertyMode(z);
        return ks0.a.performShortcut(v, keyEvent0, 0);
    }

    @Override  // im
    public final void L() {
        lx.b(this.a);
        this.T();
    }

    @Override  // im
    public final void M() {
        this.q(16, 16);
    }

    @Override  // im
    public final void N() {
        this.q.h(null);
    }

    @Override  // im
    public final void O() {
    }

    public final void P(boolean z) {
        kfs kfs1;
        kfs kfs0;
        if(!z) {
            if(this.y) {
                this.y = false;
                this.Q(false);
            }
        }
        else if(!this.y) {
            this.y = true;
            this.Q(false);
        }
        if(this.c.isLaidOut()) {
            if(z) {
                kfs0 = this.q.b(4, 100L);
                kfs1 = this.d.b(0, 200L);
            }
            else {
                kfs kfs2 = this.q.b(0, 200L);
                kfs0 = this.d.b(8, 100L);
                kfs1 = kfs2;
            }
            mi mi0 = new mi();
            ArrayList arrayList0 = mi0.a;
            arrayList0.add(kfs0);
            View view0 = (View)kfs0.a.get();
            long v = view0 == null ? 0L : view0.animate().getDuration();
            View view1 = (View)kfs1.a.get();
            if(view1 != null) {
                view1.animate().setStartDelay(v);
            }
            arrayList0.add(kfs1);
            mi0.b();
            return;
        }
        if(z) {
            this.q.p(4);
            this.d.setVisibility(0);
            return;
        }
        this.q.p(0);
        this.d.setVisibility(8);
    }

    public final void Q(boolean z) {
        if(kt.R(this.k, this.l, this.y)) {
            if(!this.z) {
                this.z = true;
                mi mi0 = this.m;
                if(mi0 != null) {
                    mi0.a();
                }
                this.c.setVisibility(0);
                if(this.i != 0) {
                label_36:
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if(this.j) {
                        View view1 = this.e;
                        if(view1 != null) {
                            view1.setTranslationY(0.0f);
                        }
                    }
                    this.p.a(null);
                }
                else if(this.A) {
                label_11:
                    this.c.setTranslationY(0.0f);
                    float f = (float)(-this.c.getHeight());
                    if(z) {
                        int[] arr_v = {0, 0};
                        this.c.getLocationInWindow(arr_v);
                        f -= (float)arr_v[1];
                    }
                    this.c.setTranslationY(f);
                    mi mi1 = new mi();
                    kfs kfs0 = kfe.c(this.c);
                    kfs0.j(0.0f);
                    kfs0.i(this.r);
                    mi1.c(kfs0);
                    if(this.j) {
                        View view0 = this.e;
                        if(view0 != null) {
                            view0.setTranslationY(f);
                            kfs kfs1 = kfe.c(this.e);
                            kfs1.j(0.0f);
                            mi1.c(kfs1);
                        }
                    }
                    mi1.e(kt.t);
                    mi1.d();
                    mi1.f(this.p);
                    this.m = mi1;
                    mi1.b();
                }
                else if(z) {
                    z = true;
                    goto label_11;
                }
                else {
                    goto label_36;
                }
                ActionBarOverlayLayout actionBarOverlayLayout0 = this.b;
                if(actionBarOverlayLayout0 != null) {
                    actionBarOverlayLayout0.requestApplyInsets();
                }
            }
        }
        else if(this.z) {
            this.z = false;
            mi mi2 = this.m;
            if(mi2 != null) {
                mi2.a();
            }
            if(this.i == 0) {
                if(this.A) {
                    goto label_56;
                }
                if(z) {
                    z = true;
                label_56:
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    mi mi3 = new mi();
                    float f1 = (float)(-this.c.getHeight());
                    if(z) {
                        int[] arr_v1 = {0, 0};
                        this.c.getLocationInWindow(arr_v1);
                        f1 -= (float)arr_v1[1];
                    }
                    kfs kfs2 = kfe.c(this.c);
                    kfs2.j(f1);
                    kfs2.i(this.r);
                    mi3.c(kfs2);
                    if(this.j) {
                        View view2 = this.e;
                        if(view2 != null) {
                            kfs kfs3 = kfe.c(view2);
                            kfs3.j(f1);
                            mi3.c(kfs3);
                        }
                    }
                    mi3.e(kt.s);
                    mi3.d();
                    mi3.f(this.o);
                    this.m = mi3;
                    mi3.b();
                    return;
                }
            }
            this.o.a(null);
        }
    }

    static boolean R(boolean z, boolean z1, boolean z2) {
        return z2 ? true : !z && !z1;
    }

    private final void S(View view0) {
        ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)view0.findViewById(0x7F0B10BE);  // id:decor_content_parent
        this.b = actionBarOverlayLayout0;
        if(actionBarOverlayLayout0 != null) {
            actionBarOverlayLayout0.h = this;
            if(actionBarOverlayLayout0.getWindowToken() != null) {
                ((kt)actionBarOverlayLayout0.h).i = actionBarOverlayLayout0.b;
                int v = actionBarOverlayLayout0.g;
                if(v != 0) {
                    actionBarOverlayLayout0.onWindowSystemUiVisibilityChanged(v);
                    actionBarOverlayLayout0.requestApplyInsets();
                }
            }
        }
        View view1 = view0.findViewById(0x7F0B0ABF);  // id:action_bar
        if(!(view1 instanceof Toolbar)) {
            throw new IllegalStateException("Can\'t make a decor toolbar out of " + (view1 == null ? "null" : view1.getClass().getSimpleName()));
        }
        this.q = ((Toolbar)view1).M();
        this.d = (ActionBarContextView)view0.findViewById(0x7F0B0ACE);  // id:action_context_bar
        ActionBarContainer actionBarContainer0 = (ActionBarContainer)view0.findViewById(0x7F0B0AC2);  // id:action_bar_container
        this.c = actionBarContainer0;
        ww ww0 = this.q;
        if(ww0 == null || this.d == null || actionBarContainer0 == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = ww0.a();
        if((this.q.b & 4) != 0) {
            this.v = true;
        }
        Context context0 = this.a;
        context0.getApplicationInfo();
        lx.b(context0);
        this.T();
        TypedArray typedArray0 = this.a.obtainStyledAttributes(null, ku.a, 0x7F04007D, 0);  // attr:actionBarStyle
        if(typedArray0.getBoolean(19, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout1 = this.b;
            if(!actionBarOverlayLayout1.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.n = true;
            actionBarOverlayLayout1.l(true);
        }
        int v1 = typedArray0.getDimensionPixelSize(17, 0);
        if(v1 != 0) {
            this.t(((float)v1));
        }
        typedArray0.recycle();
    }

    private final void T() {
        this.q.a.requestLayout();
        this.b.e = false;
    }

    @Override  // im
    public final float a() {
        return this.c.getElevation();
    }

    @Override  // im
    public final int b() {
        return this.q.b;
    }

    @Override  // im
    public final Context c() {
        if(this.u == null) {
            TypedValue typedValue0 = new TypedValue();
            this.a.getTheme().resolveAttribute(0x7F040084, typedValue0, true);  // attr:actionBarWidgetTheme
            int v = typedValue0.resourceId;
            if(v != 0) {
                this.u = new ContextThemeWrapper(this.a, v);
                return this.u;
            }
            this.u = this.a;
        }
        return this.u;
    }

    @Override  // im
    public final lz d(ly ly0) {
        ks ks0 = this.f;
        if(ks0 != null) {
            ks0.f();
        }
        this.b.l(false);
        this.d.i();
        ks ks1 = new ks(this, this.d.getContext(), ly0);
        ks1.a.u();
        try {
            boolean z = ks1.b.c(ks1, ks1.a);
        }
        catch(Throwable throwable0) {
            ks1.a.t();
            throw throwable0;
        }
        ks1.a.t();
        if(z) {
            this.f = ks1;
            ks1.g();
            this.d.h(ks1);
            this.P(true);
            return ks1;
        }
        return null;
    }

    @Override  // im
    public final View e() {
        return this.q.c;
    }

    @Override  // im
    public final CharSequence f() {
        return this.q.c();
    }

    @Override  // im
    public final void g(boolean z) {
        if(z != this.w) {
            this.w = z;
            ArrayList arrayList0 = this.x;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((il)arrayList0.get(v1)).a();
            }
        }
    }

    @Override  // im
    public final void h() {
        if(!this.k) {
            this.k = true;
            this.Q(false);
        }
    }

    @Override  // im
    public final void j(Drawable drawable0) {
        ActionBarContainer actionBarContainer0 = this.c;
        Drawable drawable1 = actionBarContainer0.b;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            actionBarContainer0.unscheduleDrawable(actionBarContainer0.b);
        }
        actionBarContainer0.b = drawable0;
        boolean z = false;
        if(drawable0 != null) {
            drawable0.setCallback(actionBarContainer0);
            if(actionBarContainer0.a != null) {
                drawable0.setBounds(0, 0, actionBarContainer0.getMeasuredWidth(), actionBarContainer0.getMeasuredHeight());
            }
        }
        if(!actionBarContainer0.e) {
            if(actionBarContainer0.b == null && actionBarContainer0.c == null) {
                z = true;
            }
        }
        else if(actionBarContainer0.d == null) {
            z = true;
        }
        actionBarContainer0.setWillNotDraw(z);
        actionBarContainer0.invalidate();
        actionBarContainer0.invalidateOutline();
    }

    @Override  // im
    public final void k(int v) {
        this.l(LayoutInflater.from(this.c()).inflate(v, this.q.a, false));
    }

    @Override  // im
    public final void l(View view0) {
        this.q.f(view0);
    }

    @Override  // im
    public final void m(View view0, ik ik0) {
        view0.setLayoutParams(ik0);
        this.q.f(view0);
    }

    @Override  // im
    public final void n(boolean z) {
        if(!this.v) {
            this.o(z);
        }
    }

    @Override  // im
    public final void o(boolean z) {
        this.q((z ? 4 : 0), 4);
    }

    @Override  // im
    public final void p(int v) {
        if((v & 4) != 0) {
            this.v = true;
        }
        this.q.g(v);
    }

    @Override  // im
    public final void q(int v, int v1) {
        ww ww0 = this.q;
        int v2 = ww0.b;
        if((v1 & 4) != 0) {
            this.v = true;
        }
        ww0.g(v & v1 | ~v1 & v2);
    }

    @Override  // im
    public final void r(boolean z) {
        this.q((z ? 2 : 0), 2);
    }

    @Override  // im
    public final void s(boolean z) {
        this.q((z ? 8 : 0), 8);
    }

    @Override  // im
    public final void t(float f) {
        this.c.setElevation(f);
    }

    @Override  // im
    public final void u(int v) {
        this.q.j(v);
    }

    @Override  // im
    public final void v(CharSequence charSequence0) {
        this.q.k(charSequence0);
    }

    @Override  // im
    public final void w(int v) {
        this.q.l(v);
    }

    @Override  // im
    public final void x(Drawable drawable0) {
        this.q.m(drawable0);
    }

    @Override  // im
    public final void y(boolean z) {
        this.A = z;
        if(!z) {
            mi mi0 = this.m;
            if(mi0 != null) {
                mi0.a();
            }
        }
    }

    @Override  // im
    public final void z(CharSequence charSequence0) {
        this.q.n(charSequence0);
    }
}

