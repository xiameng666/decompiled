package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import fnwi;
import fnxj;
import fnxo;
import fodo;
import fods;
import fohf;
import fohg;
import fohh;
import fohi;
import fohj;
import fohk;
import fohl;
import fohm;
import foin;
import foio;
import fycr;
import fyho;
import fyka;
import fykb;
import fynt;
import fyuj;
import fyus;
import fyut;
import gftb;
import jxm;
import kdq;
import kee;
import kef;
import lns;
import lnt;

public final class ExpandableDialogView extends ViewGroup implements fods, kee {
    private boolean A;
    private boolean B;
    private int C;
    private final Paint D;
    private final Paint E;
    private final Paint F;
    private final RectF G;
    private final ObjectAnimator H;
    private final ObjectAnimator I;
    private final int J;
    private final fyka K;
    private final Paint L;
    private final int M;
    private final boolean N;
    private final boolean O;
    private final kdq P;
    private OverScrollControlledNestedScrollView Q;
    private View R;
    private boolean S;
    private Configuration T;
    private boolean U;
    private boolean V;
    private boolean W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    public final float b;
    public final RectF c;
    public View d;
    public final fyuj e;
    public final float f;
    public float g;
    public View h;
    public int i;
    public Runnable j;
    public Window k;
    public int l;
    public static final int m;
    private static final TimeInterpolator n;
    private static final Property o;
    private static final Property p;
    private static final Property q;
    private final kef r;
    private final Rect s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private float z;

    static {
        ExpandableDialogView.n = new lns();
        ExpandableDialogView.o = new fohk(Integer.class);
        ExpandableDialogView.p = new fohl(RectF.class);
        ExpandableDialogView.q = new fohm(Integer.class);
    }

    public ExpandableDialogView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.r = new kef();
        this.s = new Rect();
        this.a = new Rect();
        Paint paint0 = new Paint(1);
        this.D = paint0;
        Paint paint1 = new Paint(1);
        this.E = paint1;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new RectF();
        RectF rectF0 = new RectF();
        this.c = rectF0;
        Paint paint3 = new Paint(1);
        this.L = paint3;
        this.t = this.getResources().getDimensionPixelSize(0x7F070D51);  // dimen:og_dialog_margin_horizontal
        this.v = this.getResources().getDimensionPixelSize(0x7F070D52);  // dimen:og_dialog_tablet_margin_bottom
        this.w = this.getResources().getDimensionPixelSize(0x7F070D55);  // dimen:og_dialog_tablet_width
        this.x = this.getResources().getDimensionPixelSize(0x7F070D53);  // dimen:og_dialog_tablet_max_height
        this.y = this.getResources().getDimensionPixelSize(0x7F070D54);  // dimen:og_dialog_tablet_min_scroll
        float f = fnwi.a(this.getContext(), 0x7F040937);  // attr:ogDialogCornerRadius
        this.b = f;
        this.f = fnwi.a(this.getContext(), 0x7F040938);  // attr:ogDialogHeaderElevation
        this.setWillNotDraw(false);
        paint3.setStyle(Paint.Style.FILL);
        int v = fykb.a(0x7F070B4A, this.getContext());  // dimen:m3_sys_elevation_level2
        this.J = v;
        this.K = new fyka(fnwi.e(context0, 0x7F0404AC).data != 0, fyho.c(context0, 0x7F0404AB, 0), fyho.c(context0, 0x7F0404AA, 0), v, context0.getResources().getDisplayMetrics().density);  // attr:elevationOverlayEnabled
        int v1 = fnwi.b(this.getContext(), 0x7F040945);  // attr:ogLightGrey
        this.M = v1;
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, foin.a, 0, 0);
        try {
            this.N = typedArray0.getBoolean(2, false);
            this.O = typedArray0.getBoolean(0, false);
            this.u = typedArray0.getDimensionPixelSize(1, this.getResources().getDimensionPixelSize(0x7F070D4F));  // dimen:og_dialog_default_margin_top
        }
        finally {
            typedArray0.recycle();
        }
        paint2.setColor(v);
        paint0.setColor(jxm.g(v, Math.round(204.0f)));
        paint1.setColor(v1);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(this, ExpandableDialogView.o, new int[]{0});
        this.I = objectAnimator0;
        objectAnimator0.setDuration(150L);
        objectAnimator0.setInterpolator(new lnt());
        objectAnimator0.addListener(new fohg(this));
        fyuj fyuj0 = fyuj.P(this.getContext());
        this.e = fyuj0;
        fyuj0.aa(ColorStateList.valueOf(v));
        fyus fyus0 = new fyus();
        fyus0.l(f);
        fyus0.m(f);
        fyuj0.mu(new fyut(fyus0));
        foio foio0 = new foio(new RectF());
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofObject(this, ExpandableDialogView.p, foio0, new RectF[]{rectF0});
        this.H = objectAnimator1;
        objectAnimator1.setDuration(300L);
        objectAnimator1.setInterpolator(new lnt());
        objectAnimator1.addListener(new fohh(this));
        this.setClipToOutline(true);
        this.setOutlineProvider(new fohi(this));
        this.setClipChildren(false);
        this.q(this.getResources().getConfiguration());
        fohj fohj0 = new fohj(this);
        kdq kdq0 = new kdq(this.getContext(), fohj0);
        this.P = kdq0;
        kdq0.a(false);
        this.l = 1;
    }

    public final float a() {
        if(this.U) {
            return 0.0f;
        }
        return this.v() ? 1.0f : this.z;
    }

    @Override  // fods
    public final void b(fodo fodo0) {
        fodo0.b(this.findViewById(0x7F0B1AE1), 93522);  // id:og_container_header
        fodo0.b(this.findViewById(0x7F0B1AF0), 93521);  // id:og_header_close_button
        View view0 = this.h;
        gftb.check(view0);
        fodo0.b(view0, 90573);
    }

    public final int c(float f) {
        float f1 = f + fynt.b(this);
        return this.K.b(this.J, f1);
    }

    public final void d(int v) {
        if(this.i != v) {
            this.r(Math.max(0.0f, ((float)v) / ((float)this.C)));
            this.Q.offsetTopAndBottom(this.i - v);
            this.i = v;
            this.H.cancel();
            this.o(this.getWidth());
            if(!this.A) {
                this.j(this.G);
            }
            this.c.set(this.G);
            this.k();
            this.invalidate();
            this.invalidateOutline();
            Rect rect0 = this.a;
            this.d.measure(View.MeasureSpec.makeMeasureSpec(rect0.width(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getHeight(), 0x80000000));
            this.d.layout(rect0.left, rect0.top, rect0.right, rect0.top + this.d.getMeasuredHeight());
            if(!this.N) {
                this.Q.layout(rect0.left, this.d.getBottom(), rect0.right, rect0.bottom);
            }
            if(v <= this.ad) {
                Runnable runnable0 = this.j;
                if(runnable0 != null) {
                    runnable0.run();
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas0) {
        int v = canvas0.save();
        canvas0.clipRect(((float)this.a.left), ((float)this.a.top), ((float)this.a.right), this.c.bottom);
        super.dispatchDraw(canvas0);
        canvas0.restoreToCount(v);
    }

    @Override  // ked
    public final void e(View view0, int v, int v1, int[] arr_v, int v2) {
        if(v1 > 0) {
            int v3 = this.i;
            int v4 = this.C;
            if(v3 < v4) {
                if(!this.A && !this.B) {
                    v4 = 0;
                }
                int v5 = Math.min(v1, v4 - v3);
                arr_v[1] = v5;
                this.d(this.i + v5);
            }
        }
    }

    @Override  // ked
    public final void f(View view0, int v, int v1, int v2, int v3, int v4) {
    }

    @Override  // android.view.View
    protected final boolean fitSystemWindows(Rect rect0) {
        this.s.set(rect0);
        return true;
    }

    @Override  // kee
    public final void g(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(v3 < 0 && (v4 == 0 || this.i < this.C)) {
            int v5 = Math.max(v3 + this.i, this.ae);
            arr_v[1] = v5 - this.i;
            this.d(v5);
        }
    }

    @Override  // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    @Override  // ked
    public final void h(View view0, View view1, int v, int v1) {
        this.r.b(v, v1);
    }

    @Override  // ked
    public final void i(View view0, int v) {
        this.r.c(v);
        if(v == 1) {
            this.S = false;
        }
        if(!this.S && !this.m()) {
            if(this.t()) {
                ObjectAnimator objectAnimator0 = this.I;
                objectAnimator0.setIntValues(new int[]{this.ad});
                AnimatorSet animatorSet0 = new AnimatorSet();
                animatorSet0.setDuration(50L);
                animatorSet0.setInterpolator(new AccelerateInterpolator());
                if(this.k == null) {
                    animatorSet0.playTogether(new Animator[]{objectAnimator0});
                }
                else {
                    int v1 = this.getContext().getColor(0x7F0607F3);  // color:google_scrim
                    View view1 = this.k.getDecorView();
                    fycr fycr0 = new fycr();
                    animatorSet0.playTogether(new Animator[]{objectAnimator0, ObjectAnimator.ofObject(view1, ExpandableDialogView.q, fycr0, new Integer[]{v1, jxm.g(v1, 0)})});
                }
                animatorSet0.start();
                return;
            }
            if(this.i >= 0x91) {
                this.I.setIntValues(new int[]{this.C});
            }
            else {
                this.I.setIntValues(new int[]{0});
            }
            this.I.start();
        }
    }

    public final void j(RectF rectF0) {
        this.c.set(rectF0);
        this.p(rectF0.bottom - ((float)this.Q.getTop()) - ((float)this.ac));
        this.k();
        this.invalidate();
        this.invalidateOutline();
    }

    public final void k() {
        boolean z = true;
        int v = 0;
        fnxo.b(this, Float.compare(this.c.top, ((float)this.s.top) / 2.0f) < 0, ((boolean)(this.l() ^ 1)));
        float f = this.c.bottom;
        int v1 = this.getHeight();
        Window window0 = this.k;
        if(f < ((float)(v1 - this.s.bottom))) {
            z = false;
        }
        if(window0 != null) {
            if(this.V || !z) {
            }
            window0.setNavigationBarColor(0);
        }
        if(!this.V || this.U) {
            if(!z) {
                this.setSystemUiVisibility(this.getSystemUiVisibility() & -17);
            }
            Window window1 = this.k;
            if(window1 != null) {
                if(z) {
                    v = this.M;
                }
                window1.setNavigationBarDividerColor(v);
            }
        }
    }

    public final boolean l() {
        return this.T != null && (this.T.uiMode & 0x30) == 0x20;
    }

    final boolean m() {
        return this.a() == 1.0f;
    }

    @Override  // fods
    public final void mn(fodo fodo0) {
        fodo0.e(this.findViewById(0x7F0B1AF0));  // id:og_header_close_button
        fodo0.e(this.findViewById(0x7F0B1AE1));  // id:og_container_header
        View view0 = this.h;
        gftb.check(view0);
        fodo0.e(view0);
    }

    public static void n(ExpandableDialogView expandableDialogView0) {
        expandableDialogView0.p(0.0f);
    }

    private final void o(int v) {
        Rect rect0 = this.a;
        int v1 = rect0.height();
        int v2 = Math.round(((float)this.t) * (1.0f - this.a()));
        if(this.U) {
            int v3 = this.w;
            if(v > v3) {
                Rect rect1 = this.s;
                rect0.top = this.C + rect1.top;
                int v4 = this.l - 1;
                if(this.l == 0) {
                    throw null;
                }
                if(v4 == 0) {
                    rect0.left = (v - rect1.left - rect1.right - v3) / 2 + rect1.left;
                }
                rect0.right = rect0.left + v3;
                rect0.bottom = rect0.top + v1;
                this.G.set(rect0);
                return;
            }
        }
        Rect rect2 = this.s;
        rect0.top = rect2.top + (this.m() ? 0 : this.C - this.i);
        rect0.left = rect2.left + v2;
        rect0.right = v - rect2.right - v2;
        if(this.A || this.v()) {
            rect0.bottom = rect0.top + v1;
        }
        else if(this.i <= 0) {
            rect0.bottom = rect0.top + this.d.getMeasuredHeight() + this.ab;
        }
        else {
            int v5 = rect2.top + this.C + this.d.getMeasuredHeight() + this.ab;
            rect0.bottom = v5 + Math.round(((float)(this.aa - v5)) * this.a());
        }
        if(this.m()) {
            this.G.set(0.0f, 0.0f, ((float)v), ((float)this.aa));
            return;
        }
        float f = Math.max(0.0f, (this.a() - 0.6f) / 0.4f);
        float f1 = ExpandableDialogView.n.getInterpolation(f);
        this.G.set(((float)rect0.left), ((float)rect0.top) - f1 * ((float)rect2.top), ((float)rect0.right), ((float)rect0.bottom));
    }

    @Override  // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        int v = windowInsets0.getSystemWindowInsetLeft();
        int v1 = windowInsets0.getSystemWindowInsetTop();
        int v2 = windowInsets0.getSystemWindowInsetRight();
        int v3 = windowInsets0.getSystemWindowInsetBottom();
        this.s.set(v, v1, v2, v3);
        return windowInsets0.consumeSystemWindowInsets();
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.post(new fohf(this));
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.q(configuration0);
        this.s();
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        RectF rectF0 = this.c;
        float f = this.b * (1.0f - this.a());
        canvas0.drawRoundRect(rectF0, f, f, this.F);
        fyus fyus0 = new fyus();
        fyus0.l(f);
        fyus0.m(f);
        fyut fyut0 = new fyut(fyus0);
        this.e.mu(fyut0);
        if(this.m()) {
            int v = this.c(this.d.getElevation());
            this.L.setColor(v);
            canvas0.drawRect(((float)this.s.left), ((float)(-this.s.top)), rectF0.right - ((float)this.s.right), ((float)this.d.getTop()), this.L);
        }
    }

    @Override  // android.view.View
    public final void onDrawForeground(Canvas canvas0) {
        float f = 1.0f - this.a();
        canvas0.save();
        Rect rect0 = this.s;
        canvas0.clipRect(0, this.getHeight() - rect0.bottom, this.getWidth(), this.getHeight());
        float f1 = this.b * f;
        canvas0.drawRoundRect(this.c, f1, f1, this.D);
        int v = this.getHeight() - rect0.bottom;
        float f2 = (float)this.getWidth();
        int v1 = this.getHeight();
        Paint paint0 = this.E;
        canvas0.drawRect(0.0f, ((float)v), f2, ((float)(v1 - rect0.bottom + 1)), paint0);
        canvas0.restore();
        if(this.m()) {
            if(rect0.left > 0) {
                canvas0.drawRect(((float)(rect0.left - 1)), 0.0f, ((float)rect0.left), ((float)this.getHeight()), paint0);
            }
            if(rect0.right > 0) {
                canvas0.drawRect(((float)(this.getWidth() - rect0.right)), 0.0f, ((float)(this.getWidth() - rect0.right + 1)), ((float)this.getHeight()), paint0);
            }
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View view0 = this.getChildAt(0);
        this.d = view0;
        view0.setBackground(this.e);
        this.d.setOutlineProvider(null);
        this.Q = (OverScrollControlledNestedScrollView)this.findViewById(0x7F0B1AE3);  // id:og_container_scroll_view
        this.R = this.findViewById(0x7F0B1AE0);  // id:og_container_footer
        this.h = this.findViewById(0x7F0B1AEB);  // id:og_dialog_scrim_ve
        this.findViewById(0x7F0B1ADF).setBackgroundColor(this.J);  // id:og_container_disable_content_view
        this.s();
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.d.layout(this.a.left, this.a.top, this.a.right, this.a.top + this.d.getMeasuredHeight());
        int v4 = this.U || !this.N ? this.a.left : this.s.left;
        this.Q.layout(v4, this.d.getBottom(), this.Q.getMeasuredWidth() + v4, this.a.bottom);
        if(this.i == 0) {
            this.Q.setScrollY(0);
        }
        this.k();
        if(this.getResources().getConfiguration().equals(this.T)) {
            RectF rectF0 = this.G;
            if(!this.c.equals(rectF0)) {
                this.H.setObjectValues(new Object[]{rectF0});
                this.H.start();
            }
            return;
        }
        this.T = this.getResources().getConfiguration();
        this.c.set(this.G);
        this.invalidateOutline();
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        int v9;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1);
        this.setMeasuredDimension(v2, v3);
        this.o(v2);
        Rect rect0 = this.s;
        int v4 = v3 - rect0.top - rect0.bottom;
        Rect rect1 = this.a;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(rect1.width(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v4, 0x80000000));
        int v5 = this.d.getMeasuredHeight();
        int v6 = this.U || !this.N ? rect1.width() : v2 - rect0.left - rect0.right;
        int v7 = v4 - v5;
        boolean z = this.U;
        int v8 = z ? v7 - this.u - this.v : v7 - this.u;
        boolean z1 = false;
        this.aa = v3 - rect0.bottom;
        this.Q.findViewById(0x7F0B1AE2).setMinimumHeight(0);  // id:og_container_scroll_root
        this.Q.measure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x80000000));
        this.ab = this.Q.getMeasuredHeight();
        if(this.Q.getMeasuredHeight() - v8 >= (z ? this.y : 0)) {
            z1 = true;
        }
        this.A = z1;
        if(this.m() || !this.U && z1 && this.Q.getMeasuredHeight() < v7) {
            this.Q.findViewById(0x7F0B1AE2).setMinimumHeight(v7);  // id:og_container_scroll_root
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
        }
        if(!this.m() && !this.A) {
            v9 = this.Q.getMeasuredHeight();
            this.r(0.0f);
        }
        else {
            v9 = this.U ? Math.min(this.x - v5, v8) : v7;
        }
        this.C = this.O && !this.m() && !this.U ? Math.max(this.u, (v7 - v9) / 2) : this.u;
        this.ad = rect0.top - v3 + this.C;
        this.ae = -v3 / 2 + rect0.top + this.C;
        rect1.bottom = rect1.top + v9 + v5;
        this.G.bottom = (float)(this.m() ? this.aa : rect1.bottom);
        this.ac = this.Q.findViewById(0x7F0B1AE2).getMeasuredHeight();  // id:og_container_scroll_root
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedFling(View view0, float f, float f1, boolean z) {
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedPreFling(View view0, float f, float f1) {
        return this.i < this.C;
    }

    @Override  // android.view.ViewGroup
    public final void onNestedScrollAccepted(View view0, View view1, int v) {
        this.r.d(v);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((ExpandableDialogView.State)parcelable0).a());
        this.r((((ExpandableDialogView.State)parcelable0).b() ? 1.0f : 0.0f));
        this.i = Math.round(this.z * ((float)this.u));
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        float f = this.z;
        Parcelable parcelable0 = super.onSaveInstanceState();
        if(parcelable0 != null) {
            return f == 1.0f ? new AutoValue_ExpandableDialogView_State(true, parcelable0) : new AutoValue_ExpandableDialogView_State(false, parcelable0);
        }
        throw new NullPointerException("Null parentState");
    }

    @Override  // android.view.ViewGroup
    public final void onStopNestedScroll(View view0) {
        this.r.e();
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.P.b(motionEvent0);
    }

    private final void p(float f) {
        this.R.setTranslationY(f);
    }

    private final void q(Configuration configuration0) {
        boolean z = true;
        this.U = configuration0.smallestScreenWidthDp >= 600;
        if(configuration0.orientation != 2) {
            z = false;
        }
        this.V = z;
        this.W = fnxj.a(this.getContext());
        this.requestLayout();
    }

    private final void r(float f) {
        this.z = f;
        this.s();
    }

    private final void s() {
        boolean z = true;
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView0 = this.Q;
        if(overScrollControlledNestedScrollView0 != null) {
            if(!this.m() && !this.U) {
                z = false;
            }
            overScrollControlledNestedScrollView0.h = z;
        }
    }

    private final boolean t() {
        return this.i < -290 || this.i <= this.ae;
    }

    @Override  // ked
    public final boolean u(View view0, View view1, int v, int v1) {
        if(!this.t()) {
            this.I.cancel();
            if(!this.U && !this.v()) {
                if(v1 == 1) {
                    this.S = true;
                }
                this.B = this.m();
                return true;
            }
        }
        return false;
    }

    private final boolean v() {
        return (this.V || this.W) && !this.U;
    }
}

