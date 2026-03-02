import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.common.LockableNestedScrollView;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.material.card.MaterialCardView;

public final class fnzu extends FrameLayout implements fods {
    public foaq A;
    private static final Property B = null;
    private static final Property C = null;
    private static final Interpolator D = null;
    private boolean E;
    private int F;
    private final boolean G;
    private final boolean H;
    private final float I;
    private final float J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final View P;
    private final ViewGroup Q;
    private final ViewGroup R;
    private final LockableNestedScrollView S;
    private final View T;
    private final OverScrollControlledNestedScrollView U;
    private final View V;
    private final View W;
    public static final String a = "fnzu";
    private final View aa;
    private final View ab;
    private final View ac;
    private final fyuj ad;
    private final fyuj ae;
    private final fyuj af;
    private final gfsx ag;
    private final FrameLayout ah;
    private final fyka ai;
    private final TextView aj;
    private final Rect ak;
    private final boolean al;
    private gfsx am;
    private int an;
    public boolean b;
    public boolean c;
    public boolean d;
    public foam e;
    public fnzx f;
    public final fnxu g;
    public final View h;
    public final RecyclerView i;
    public final RecyclerView j;
    public final SelectedAccountView k;
    public final Button l;
    public final ViewGroup m;
    public final MaterialCardView n;
    public final ViewGroup o;
    public final aaw p;
    public final TextView q;
    public Button r;
    public Button s;
    public fnxm t;
    public fnxm u;
    public Runnable v;
    public foaj w;
    public abf x;
    public AnimatorSet y;
    public final fnjf z;

    static {
        fnzu.B = Property.of(View.class, Float.class, "alpha");
        fnzu.C = Property.of(fyuj.class, Integer.class, "alpha");
        fnzu.D = new PathInterpolator(0.54f, 0.01f, 0.61f, 0.99f);
    }

    public fnzu(Context context0, foar foar0) {
        super(foar0.f(context0), null, 0);
        this.p = new fnzh(this);
        this.ak = new Rect();
        this.am = gfqx.a;
        this.an = 0;
        this.z = new fnzq(this);
        this.setId(0x7F0B1374);  // id:express_sign_in_layout_internal
        this.G = true;
        if(!fnxg.c(this.getContext())) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(this.getContext()).inflate(0x7F0E0359, this);  // layout:express_sign_in_layout
        boolean z = fnxe.d(this.getContext());
        this.al = z;
        gfsx gfsx0 = foar0.e(this.getContext());
        this.ag = gfsx0;
        this.ai = new fyka(this.getContext());
        Context context1 = this.getContext();
        fnxu fnxu0 = new fnxu(fnwi.c(context1, 0x7F040933), fnwi.c(context1, 0x7F040931), fnwi.c(context1, 0x7F040932), fnwi.a(context1, 0x7F040937), fnwi.b(context1, 0x7F04093F), ((float)fnwi.c(context1, 0x7F040940)), fnwi.c(context1, 0x7F040941), fnwi.c(context1, 0x7F040939), fnwi.c(context1, 0x7F040943), fnwi.c(context1, 0x7F040944), fnwi.c(context1, 0x7F04094E));  // attr:ogContentContainerPaddingTop
        this.g = fnxu0;
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.N = this.getResources().getColor((z ? 0x7F060D82 : 0x7F060D81));  // color:og_elevation_shadow_color_light
        this.I = fnxg.a(displayMetrics0, (z ? 8 : 5));
        float f = fnxg.a(displayMetrics0, (z ? 8 : 3));
        this.J = f;
        this.K = fnxg.b(displayMetrics0, 20);
        this.L = fnxg.b(displayMetrics0, 8);
        this.M = fnxg.b(displayMetrics0, 6);
        boolean z1 = foar0.g();
        this.H = z1;
        this.h = this.findViewById(0x7F0B1F35);  // id:scrim_view
        View view0 = this.findViewById(0x7F0B1383);  // id:fake_scrim_view
        this.P = view0;
        SelectedAccountView selectedAccountView0 = (SelectedAccountView)this.findViewById(0x7F0B1F9C);  // id:selected_account
        this.k = selectedAccountView0;
        this.n = (MaterialCardView)this.findViewById(0x7F0B16FB);  // id:important_box_card_view
        selectedAccountView0.n(150L);
        Interpolator interpolator0 = fnzu.D;
        selectedAccountView0.o(interpolator0);
        this.i = (RecyclerView)this.findViewById(0x7F0B0AA8);  // id:accounts_list
        this.j = (RecyclerView)this.findViewById(0x7F0B0A7D);  // id:account_management_actions_list
        View view1 = this.findViewById(0x7F0B1B02);  // id:og_selected_account_to_account_management_divider
        this.ac = view1;
        int v = z1 ? 0 : fnjv.f(this.getContext()) + fnxu0.c;
        this.O = v;
        this.G(v);
        this.l = (Button)this.findViewById(0x7F0B2048);  // id:sign_in_button
        this.r = (Button)this.findViewById(0x7F0B0FF0);  // id:continue_as_button
        this.s = (Button)this.findViewById(0x7F0B1F68);  // id:secondary_action_button
        this.Q = (ViewGroup)this.findViewById(0x7F0B1889);  // id:main_container
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x7F0B0FE3);  // id:content_container
        this.R = viewGroup0;
        LockableNestedScrollView lockableNestedScrollView0 = (LockableNestedScrollView)this.findViewById(0x7F0B1F45);  // id:scrollable_container
        this.S = lockableNestedScrollView0;
        ViewGroup viewGroup1 = (ViewGroup)this.findViewById(0x7F0B14B1);  // id:footer_container
        this.m = viewGroup1;
        this.T = this.findViewById(0x7F0B164F);  // id:header_container
        View view2 = this.findViewById(0x7F0B1F9D);  // id:selected_account_container
        this.V = view2;
        this.W = this.findViewById(0x7F0B1FA2);  // id:selected_account_top_inset_spacing
        this.aa = this.findViewById(0x7F0B0AA7);  // id:accounts_content_container
        this.o = (ViewGroup)this.findViewById(0x7F0B1D42);  // id:progress_container
        TextView textView0 = (TextView)this.findViewById(0x7F0B0EFA);  // id:choose_an_account_a11y
        this.aj = textView0;
        this.q = (TextView)this.findViewById(0x7F0B116B);  // id:disclaimer_text
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView0 = (OverScrollControlledNestedScrollView)this.findViewById(0x7F0B1A7D);  // id:og_account_management_container
        this.U = overScrollControlledNestedScrollView0;
        View view3 = this.findViewById(0x7F0B0A80);  // id:account_management_list_container
        this.ab = view3;
        fyuj fyuj0 = this.A();
        fyuj0.Z(f);
        fyuj0.mu(this.B(fnxu0.a(), true));
        if(!fnxu0.a()) {
            fyuj0.an();
        }
        this.ae = fyuj0;
        lockableNestedScrollView0.setBackgroundDrawable(fyuj0);
        viewGroup0.setLayoutTransition(fnzu.v());
        ViewGroup viewGroup2 = (ViewGroup)view3.getParent();
        LayoutTransition layoutTransition0 = new LayoutTransition();
        layoutTransition0.setDuration(150L);
        layoutTransition0.setInterpolator(1, interpolator0);
        layoutTransition0.setInterpolator(0, interpolator0);
        layoutTransition0.setAnimator(2, null);
        layoutTransition0.setAnimator(3, ValueAnimator.ofInt(new int[]{0}));
        fnzu.N(layoutTransition0);
        viewGroup2.setLayoutTransition(layoutTransition0);
        ((ViewGroup)view2).setLayoutTransition(fnzu.v());
        fyuj fyuj1 = this.A();
        this.ad = fyuj1;
        fyuj1.mu(this.B(false, true));
        view2.setBackgroundDrawable(fyuj1);
        if(gfsx0.i()) {
            fyuj1.setAlpha(0);
            view1.setBackgroundColor(((Integer)gfsx0.d()).intValue());
        }
        fyuj fyuj2 = this.A();
        this.af = fyuj2;
        fyuj2.an();
        viewGroup1.setBackgroundDrawable(fyuj2);
        fyuj1.ad(f);
        fyuj2.ad(f);
        overScrollControlledNestedScrollView0.e = (/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            this.J(Math.min(1.0f, ((float)this.U.getScrollY()) / ((float)this.K)), this.ad, this.V);
            float f = (float)this.U.getScrollY();
            float f1 = (float)(this.U.getChildAt(0).getMeasuredHeight() - this.U.getMeasuredHeight());
            this.J((f >= f1 ? 0.0f : Math.min((f1 - f) / ((float)this.K), 1.0f)), this.af, this.m);
        };
        overScrollControlledNestedScrollView0.getViewTreeObserver().addOnGlobalLayoutListener(() -> {
            this.J(Math.min(1.0f, ((float)this.U.getScrollY()) / ((float)this.K)), this.ad, this.V);
            float f = (float)this.U.getScrollY();
            float f1 = (float)(this.U.getChildAt(0).getMeasuredHeight() - this.U.getMeasuredHeight());
            this.J((f >= f1 ? 0.0f : Math.min((f1 - f) / ((float)this.K), 1.0f)), this.af, this.m);
        });
        FrameLayout frameLayout0 = new FrameLayout(this.getContext());
        this.ah = frameLayout0;
        int v1 = 0;
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        view0.setVisibility(0);
        View view4 = this.findViewById(0x7F0B12AE);  // id:esi_custom_header_separator
        if(z1) {
            v1 = 8;
        }
        view4.setVisibility(v1);
        fnft.a(textView0);
        kfe.l(textView0, "Account picker dialog.");
        if(this.M()) {
            fnxo.a(this);
        }
        this.L(this.getResources().getConfiguration());
    }

    private final fyuj A() {
        fyuj fyuj0 = fyuj.P(this.getContext());
        fyuj0.af(2);
        fyuj0.ae(this.N);
        gfsx gfsx0 = this.ag;
        if(gfsx0.i()) {
            fyuj0.aa(ColorStateList.valueOf(((Integer)gfsx0.d()).intValue()));
        }
        return fyuj0;
    }

    private final fyut B(boolean z, boolean z1) {
        fyus fyus0 = new fyus();
        if(z1) {
            fyus0.l(this.g.d);
            fyus0.m(this.g.d);
        }
        if(z) {
            fyus0.j(this.g.d);
            fyus0.k(this.g.d);
        }
        return new fyut(fyus0);
    }

    private final void C() {
        this.n.setVisibility(8);
        this.l.setVisibility(0);
        this.r.setVisibility(8);
        this.I(false, false);
        this.j(false);
        this.O();
        this.K(true);
    }

    private final void D() {
        this.n.setVisibility(0);
        this.l.setVisibility(8);
        this.r.setVisibility(0);
        this.I(this.b, true);
        this.O();
        this.K(false);
    }

    private final void E(boolean z) {
        if(this.E == ((int)z)) {
            return;
        }
        this.E = (int)z;
        fyuj fyuj0 = this.ae;
        float f = 0.0f;
        int v = 0;
        if(Float.compare(fyuj0.H(), 0.0f) > 0) {
            ggdy ggdy0 = new ggdy();
            fyuj fyuj1 = this.ad;
            Animator[] arr_animator = new Animator[2];
            int v1 = ((int)z) ? 0xFF : 0;
            arr_animator[0] = ObjectAnimator.ofInt(fyuj1, fnzu.C, new int[]{0xFF - v1, v1}).setDuration(150L);
            float f1 = ((int)z) ? 0.0f : this.g.f;
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{this.g.f - f1, f1});
            valueAnimator0.setDuration(150L);
            valueAnimator0.addUpdateListener(new fnyp(this.n));
            arr_animator[1] = valueAnimator0;
            ggdy0.j(arr_animator);
            if(!this.g.a()) {
                if(1 != ((int)z)) {
                    f = 1.0f;
                }
                ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f});
                valueAnimator1.setDuration(100L);
                valueAnimator1.setStartDelay((1 == ((int)z) ? 50L : 0L));
                valueAnimator1.addUpdateListener(new fnyv(fyuj0, fyuj1));
                ggdy0.i(valueAnimator1);
            }
            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.playTogether(ggdy0.h());
            animatorSet0.addListener(new fnzs(this, ((boolean)(((int)z)))));
            animatorSet0.start();
        }
        int v2 = 8;
        if(((ViewGroup.MarginLayoutParams)this.Q.getLayoutParams()).topMargin == 0) {
            this.W.setVisibility((((int)z) ? 0 : 8));
            fnxo.b(this, ((boolean)(((int)z))), this.al);
        }
        ViewGroup viewGroup0 = this.R;
        int v3 = ((int)z) ? -1 : -2;
        viewGroup0.getLayoutParams().height = v3;
        this.S.getLayoutParams().height = v3;
        this.S.h = ((int)z) ^ 1;
        View view0 = this.T;
        if(1 != ((int)z)) {
            v2 = 0;
        }
        view0.setVisibility(v2);
        if(this.ag.i()) {
            this.ac.setVisibility(v2);
        }
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
        viewGroup$MarginLayoutParams0.topMargin = ((int)z) == 0 ? this.g.g : 0;
        this.G((((int)z) == 0 ? this.O : 0));
        if(((int)z) == 0) {
            v = this.g.a;
        }
        fnzu.m(viewGroup0, v);
    }

    private static void F(View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        if(viewGroup$MarginLayoutParams0 == null) {
            viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        viewGroup$MarginLayoutParams0.setMarginEnd(v);
        view0.setLayoutParams(viewGroup$MarginLayoutParams0);
    }

    private final void G(int v) {
        if(this.H) {
            return;
        }
        View view0 = this.ac;
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        if(viewGroup$MarginLayoutParams0 == null) {
            viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        view0.setLayoutParams(viewGroup$MarginLayoutParams0);
    }

    private final void H() {
        if(this.n.getVisibility() == 0) {
            this.C();
            return;
        }
        this.D();
    }

    private final void I(boolean z, boolean z1) {
        int v = 0;
        int v1 = !fnxj.a(this.getContext()) || z || !z1 ? 0 : 1;
        TextView textView0 = this.aj;
        if(1 != v1) {
            v = 8;
        }
        textView0.setVisibility(v);
    }

    private final void J(float f, fyuj fyuj0, View view0) {
        if(this.ab.getVisibility() == 8) {
            f = 0.0f;
        }
        float f1 = this.I * f;
        view0.setElevation(f1);
        gfsx gfsx0 = this.ag;
        if(gfsx0.i()) {
            int v = (int)(((Integer)gfsx0.d()));
            fyuj0.aa(ColorStateList.valueOf(this.ai.a(v, f)));
            return;
        }
        fyuj0.Z(f1);
    }

    private final void K(boolean z) {
        fyut fyut0 = this.B(this.g.a(), z);
        this.af.mu(fyut0);
    }

    private final void L(Configuration configuration0) {
        ViewGroup viewGroup0 = this.Q;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = viewGroup0.getLayoutParams();
        if(configuration0 != null && viewGroup$LayoutParams0 != null) {
            viewGroup$LayoutParams0.width = configuration0.smallestScreenWidthDp >= 600 ? fnxg.b(this.getResources().getDisplayMetrics(), 540) : -1;
            viewGroup0.setLayoutParams(viewGroup$LayoutParams0);
        }
    }

    private final boolean M() {
        return !this.g.a();
    }

    private static void N(LayoutTransition layoutTransition0) {
        layoutTransition0.setStartDelay(1, 0L);
    }

    private final void O() {
        this.q.setVisibility(8);
        this.findViewById(0x7F0B116A).setVisibility(8);  // id:disclaimer_separator
        this.findViewById(0x7F0B14AD).setVisibility(0);  // id:footer_bottom_padding
    }

    static hhce a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhce.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hhce)hftv0).d = 9;
        ((hhce)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hhce)hftv1).f = 2;
        ((hhce)hftv1).b |= 0x20;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhce)hftp0.b_message).e = 3;
        ((hhce)hftp0.b_message).b |= 8;
        return (hhce)hftp0.N_build();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        int v1 = this.getChildCount();
        boolean z = true;
        if(v1 == 0) {
            if(view0.getId() != 0x7F0B1373) {  // id:express_sign_in_internal_view
                z = false;
            }
            gftb.r(z, "express_sign_in_internal_view must be added first");
            super.addView(view0, -1, viewGroup$LayoutParams0);
            return;
        }
        if(v1 != 1) {
            z = false;
        }
        gftb.r(z, "ExpressSignInLayoutInternal must contain a single content view.");
        this.ah.addView(view0, 0, viewGroup$LayoutParams0);
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.ah.getLayoutParams();
        super.addView(this.ah, 0, viewGroup$LayoutParams1);
    }

    @Override  // fods
    public final void b(fodo fodo0) {
        fodo0.b(this.k, 90572);
        fodo0.b(this.z(), 90573);
        fodo0.b(this.i, 90574);
        fodo0.b(this.r, 90570);
        fodo0.b(this.l, 90771);
        fodo0.b(this.s, 90571);
    }

    public final void c() {
        Runnable runnable0 = this.v;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    public final void d(fnjv fnjv0, fnxr fnxr0) {
        int v = 1;
        boolean z = fnjv0.b() + fnxr0.b() > 0 && this.d;
        SelectedAccountView selectedAccountView0 = this.k;
        if(!z) {
            v = 3;
        }
        selectedAccountView0.p(v);
        selectedAccountView0.setOnClickListener((z ? new fnyr(this) : null));
        selectedAccountView0.setClickable(z);
        if(!z) {
            this.k(false);
        }
    }

    public final void f(foaf foaf0, Object object0) {
        frbi.c();
        this.s((object0 == null ? 0x1F : 52));
        this.s(38);
        gfsx gfsx0 = gfsx.l(object0);
        foaf0.b.a.a(gfsx0);
        frbi.c();
        AnimatorSet animatorSet0 = fnzu.u(new fnzm(this));
        animatorSet0.playTogether(new Animator[]{fnzu.w(this.o), fnzu.x(this.n), fnzu.x(this.m)});
        this.y = animatorSet0;
        animatorSet0.start();
        fnzt fnzt0 = new fnzt(this);
        gmbu.t(gmbu.i(Boolean.valueOf(true)), fnzt0, gmap.a);
    }

    @Override  // android.view.View
    protected final boolean fitSystemWindows(Rect rect0) {
        super.fitSystemWindows(rect0);
        return this.M();
    }

    public final void g(boolean z) {
        frbi.c();
        fnzr fnzr0 = new fnzr(this);
        if(z) {
            AnimatorSet animatorSet0 = fnzu.u(fnzr0);
            animatorSet0.playTogether(new Animator[]{fnzu.x(this.o), fnzu.w(this.n), fnzu.w(this.m)});
            animatorSet0.start();
            return;
        }
        fnzr0.onAnimationStart(null);
        fnzr0.onAnimationEnd(null);
    }

    final void h() {
        if(this.isAttachedToWindow()) {
            this.f.e.f(new fhvt(gltz.e), this.z());
        }
    }

    public final void i(View view0) {
        this.s(11);
        this.f.f.c.onClick(view0);
    }

    public final void j(boolean z) {
        this.b = z;
        this.ab.setVisibility((z ? 0 : 8));
        this.k.k(z);
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
        viewGroup$MarginLayoutParams0.bottomMargin = z ? this.g.k : 0;
        this.k.requestLayout();
        if(!this.H) {
            fnzu.m(this.m, (z ? this.L : 0));
        }
        View view0 = this.findViewById(0x7F0B116A);  // id:disclaimer_separator
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        viewGroup$MarginLayoutParams1.topMargin = this.M;
        view0.requestLayout();
        if(!this.G) {
            fnzu.y(z, this.h, 150).start();
        }
        this.I(z, this.f != null && !this.f.b.f().isEmpty());
        if(fnxj.a(this.getContext())) {
            this.E(z);
            this.ah.setVisibility((z ? 4 : 0));
        }
        if(z) {
            this.x.getOnBackPressedDispatcher().c(this.x, this.p);
            return;
        }
        this.p.f();
        this.E(false);
        this.i.al(0);
    }

    public final void k(boolean z) {
        if(this.b != z) {
            this.j(z);
        }
    }

    public static void l(View view0, int v) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), v);
    }

    public static void m(View view0, int v) {
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), view0.getPaddingBottom());
    }

    @Override  // fods
    public final void mn(fodo fodo0) {
        fodo0.e(this.k);
        fodo0.e(this.z());
        fodo0.e(this.i);
        fodo0.e(this.r);
        fodo0.e(this.l);
        fodo0.e(this.s);
    }

    public static void n(RecyclerView recyclerView0, tk tk0) {
        recyclerView0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        fnxi.a(recyclerView0, tk0);
    }

    public final void o(gged_interceptors gged0, Object object0) {
        if(gged0.isEmpty()) {
            this.C();
            return;
        }
        if(object0 != null) {
            this.k.m(object0);
            this.D();
            String s = this.f.f.a.h(object0);
            fnxm fnxm0 = this.u;
            foam foam0 = this.e;
            gfsx gfsx0 = gfta.b(s).trim().isEmpty() ? gfqx.a : gfsx.m(s);
            fnxm0.a(foam0.a(gfsx0, this.getContext()));
        }
    }

    @Override  // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        Rect rect0 = new Rect(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
        if(this.M()) {
            this.ak.set(rect0);
            int v = rect0.left;
            int v1 = this.Q.getPaddingTop();
            int v2 = rect0.right;
            int v3 = this.Q.getPaddingBottom();
            this.Q.setPadding(v, v1, v2, v3);
            int v4 = rect0.left;
            int v5 = rect0.top;
            int v6 = rect0.right;
            int v7 = this.ah.getPaddingBottom();
            this.ah.setPadding(v4, v5, v6, v7);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.W.getLayoutParams();
            viewGroup$LayoutParams0.height = rect0.top;
            fnzu.l(this.m, rect0.bottom);
        }
        return windowInsets0.consumeSystemWindowInsets();
    }

    @Override  // android.view.View
    protected final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.ah.getLayoutParams().height = 0;
        this.F = 0;
        this.L(configuration0);
    }

    @Override  // android.widget.FrameLayout
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        fnxm fnxm0 = this.t;
        if(fnxm0 != null) {
            fnxm0.b(this.m.getMeasuredWidth());
        }
        fnxm fnxm1 = this.u;
        if(fnxm1 != null) {
            fnxm1.b(this.m.getMeasuredWidth());
        }
        int v2 = this.m.getVisibility() == 8 ? 0 : this.m.getMeasuredHeight();
        View view0 = this.aa;
        if(view0.getPaddingBottom() != v2) {
            fnzu.l(view0, v2);
            super.onMeasure(v, v1);
        }
        if(this.b) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.Q.getLayoutParams();
            if(this.R.getMeasuredHeight() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + this.ak.top + this.ak.bottom >= this.getHeight() && this.getHeight() > 0 && this.T.getVisibility() == 0) {
                this.E(true);
                super.onMeasure(v, v1);
            }
        }
        FrameLayout frameLayout0 = this.ah;
        if(!frameLayout0.isAttachedToWindow()) {
            return;
        }
        if(this.an == 0) {
            this.H();
            int v3 = this.t();
            this.H();
            this.an = Math.max(v3, this.t());
        }
        int v4 = this.R.getMeasuredHeight();
        if(!this.b && v4 > this.an) {
            this.an = v4;
        }
        int v5 = this.getMeasuredHeight();
        int v6 = v5 - this.an;
        if(!this.am.i() || !this.b && (((int)(((Integer)this.am.d()))) > v6 || v5 != this.F)) {
            this.am = gfsx.m(Integer.valueOf(v6));
            frameLayout0.getLayoutParams().height = v6;
            frameLayout0.measure(View.MeasureSpec.makeMeasureSpec(frameLayout0.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v6, 0x40000000));
        }
        this.F = v5;
    }

    // Detected as a lambda impl.
    public final void p() {
        this.J(Math.min(1.0f, ((float)this.U.getScrollY()) / ((float)this.K)), this.ad, this.V);
        float f = (float)this.U.getScrollY();
        float f1 = (float)(this.U.getChildAt(0).getMeasuredHeight() - this.U.getMeasuredHeight());
        this.J((f >= f1 ? 0.0f : Math.min((f1 - f) / ((float)this.K), 1.0f)), this.af, this.m);
    }

    public final void q(boolean z) {
        int v = 0;
        this.n.d((z ? 0 : this.g.e));
        View view0 = this.ab;
        if(z) {
            v = this.g.e;
        }
        view0.setBackgroundColor(v);
    }

    public final void r(boolean z) {
        int v = 0;
        fnzu.F(this.n, (z ? 0 : this.g.b));
        fnzu.F(this.ab, (z ? this.g.b : 0));
        SelectedAccountView selectedAccountView0 = this.k;
        fnxu fnxu0 = this.g;
        if(z) {
            v = fnxu0.b;
        }
        int v1 = fnxu0.c + v;
        selectedAccountView0.setPadding(v1, selectedAccountView0.getPaddingTop(), v1, selectedAccountView0.getPaddingBottom());
    }

    public final void s(int v) {
        hhce hhce0 = fnzu.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hhce0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hhce0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhce)hftp0.b_message).c = v - 1;
        ((hhce)hftp0.b_message).b |= 1;
        hhce hhce1 = (hhce)hftp0.N_build();
        this.f.d.a(this.f.b.a(), hhce1);
    }

    private final int t() {
        int v = View.MeasureSpec.makeMeasureSpec(this.m.getMeasuredWidth(), 0x40000000);
        this.m.measure(v, 0);
        int v1 = this.m.getMeasuredHeight();
        fnzu.l(this.aa, v1);
        int v2 = View.MeasureSpec.makeMeasureSpec(this.R.getMeasuredWidth(), 0x40000000);
        this.R.measure(v2, 0);
        return this.R.getMeasuredHeight() + this.g.h;
    }

    private static AnimatorSet u(Animator.AnimatorListener animator$AnimatorListener0) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.setDuration(200L);
        animatorSet0.addListener(animator$AnimatorListener0);
        return animatorSet0;
    }

    private static LayoutTransition v() {
        LayoutTransition layoutTransition0 = new LayoutTransition();
        layoutTransition0.setDuration(150L);
        layoutTransition0.setInterpolator(2, fnzu.D);
        layoutTransition0.setInterpolator(3, fnzu.D);
        layoutTransition0.setInterpolator(1, fnzu.D);
        layoutTransition0.setInterpolator(0, fnzu.D);
        layoutTransition0.setInterpolator(4, fnzu.D);
        layoutTransition0.enableTransitionType(4);
        fnzu.N(layoutTransition0);
        return layoutTransition0;
    }

    private static ObjectAnimator w(View view0) {
        return ObjectAnimator.ofFloat(view0, fnzu.B, new float[]{0.0f, 1.0f});
    }

    private static ObjectAnimator x(View view0) {
        return ObjectAnimator.ofFloat(view0, fnzu.B, new float[]{1.0f, 0.0f});
    }

    private static ObjectAnimator y(boolean z, View view0, int v) {
        if(z) {
            ObjectAnimator objectAnimator0 = fnzu.w(view0).setDuration(150L);
            objectAnimator0.addListener(new fnzf(view0));
            return objectAnimator0;
        }
        ObjectAnimator objectAnimator1 = fnzu.x(view0).setDuration(150L);
        objectAnimator1.addListener(new fnzg(view0));
        return objectAnimator1;
    }

    private final View z() {
        return this.G ? this.P : this.h;
    }
}

