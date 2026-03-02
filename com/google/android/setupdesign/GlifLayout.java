package com.google.android.setupdesign;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import gacu;
import gadx;
import gaea;
import gaec;
import gaff;
import gafn;
import gafo;
import gafq;
import gafs;
import gagb;
import gage;
import gagf;
import gagg;
import gagp;
import gagq;
import gagt;
import gahu;
import gahv;
import gahw;
import gahy;
import gahz;
import gaib;
import gaif;
import gaig;
import gaiu;
import gaiw;
import gaix;
import gajb;
import gajg;
import gaji;
import gajm;
import gajn;
import gajo;
import java.util.ArrayList;
import khr;
import qaa;

public class GlifLayout extends gacu {
    private static final gafs a;
    private boolean b;
    private boolean c;
    private ColorStateList d;
    public ColorStateList n;
    ViewTreeObserver.OnScrollChangedListener o;
    public static final int p;

    static {
        GlifLayout.a = new gafs(GlifLayout.class);
    }

    public GlifLayout(Context context0) {
        this(context0, 0, 0);
    }

    public GlifLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public GlifLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.b = true;
        this.c = false;
        this.o = new gagg(this);
        this.c(null, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public GlifLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = true;
        this.c = false;
        this.o = new gagg(this);
        this.c(attributeSet0, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public GlifLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = true;
        this.c = false;
        this.o = new gagg(this);
        this.c(attributeSet0, v);
    }

    public final ScrollView A() {
        View view0 = this.r(0x7F0B2147);  // id:sud_header_scroll_view
        return (view0 instanceof ScrollView) ? ((ScrollView)view0) : null;
    }

    public final ScrollView B() {
        View view0 = this.r(0x7F0B2185);  // id:sud_scroll_view
        return (view0 instanceof ScrollView) ? ((ScrollView)view0) : null;
    }

    public final TextView C() {
        return ((gahu)this.t(gahu.class)).a();
    }

    public final TextView D() {
        return ((gahy)this.t(gahy.class)).a();
    }

    public final CharSequence E() {
        TextView textView0 = ((gahy)this.t(gahy.class)).a();
        return textView0 == null ? null : textView0.getText();
    }

    protected final void F() {
        if(gaec.t(this.getContext())) {
            Activity activity0 = gaec.e(this.getContext());
            gahw gahw0 = (gahw)this.t(gahw.class);
            if(gahw0 == null) {
                GlifLayout.a.d("FloatingBackButtonMixin button is null");
            }
            else {
                gahw0.c(0);
                gagf gagf0 = new gagf(activity0);
                Button button0 = gahw0.a();
                if(button0 != null) {
                    button0.setOnClickListener(new gahv(gahw0, gagf0));
                }
            }
        }
    }

    protected void G() {
        ScrollView scrollView0 = this.B();
        if(scrollView0 != null) {
            scrollView0.getViewTreeObserver().addOnScrollChangedListener(this.o);
        }
        ScrollView scrollView1 = this.A();
        if(scrollView1 != null) {
            scrollView1.getViewTreeObserver().addOnScrollChangedListener(this.o);
        }
        if(scrollView0 == null && scrollView1 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new gage(this, scrollView0, scrollView1), 100L);
    }

    public final void H(boolean z) {
        gaff gaff0 = (gaff)this.t(gaff.class);
        gafo gafo0 = (gafo)this.t(gafo.class);
        if(gaff0 != null) {
            LinearLayout linearLayout0 = gaff0.j;
            if(linearLayout0 != null) {
                if(z) {
                    int v = this.w();
                    linearLayout0.setBackgroundColor(v);
                    if(gafo0 != null) {
                        gafo0.a(v);
                    }
                }
                else {
                    linearLayout0.setBackgroundColor(this.x());
                    if(gafo0 != null) {
                        gafo0.a(this.x());
                    }
                }
            }
        }
    }

    public final void I(boolean z) {
        this.b = z;
        this.d();
    }

    public final void J(int v) {
        gahu gahu0 = (gahu)this.t(gahu.class);
        TextView textView0 = gahu0.a();
        if(textView0 != null) {
            textView0.setText(v);
            gahu0.d(0);
            return;
        }
        Log.w("DescriptionMixin", "Fail to set text due to either invalid resource id or text view not found.");
    }

    public final void K(CharSequence charSequence0) {
        ((gahu)this.t(gahu.class)).b(charSequence0);
    }

    public final void L(int v) {
        ((gahy)this.t(gahy.class)).c(v);
    }

    public final void M(Drawable drawable0) {
        ((gahz)this.t(gahz.class)).e(drawable0);
    }

    public final void N(boolean z) {
        View view0 = this.r(0x7F0B2164);  // id:sud_landscape_header_area
        if(view0 == null) {
            return;
        }
        if(z) {
            view0.setVisibility(0);
        }
        else {
            view0.setVisibility(8);
        }
        this.Q();
    }

    public final void O(boolean z) {
        ((gaig)this.t(gaig.class)).c(z);
    }

    protected void P(View view0) {
        Context context0 = view0.getContext();
        gaec gaec0 = gaec.h(context0);
        gaea gaea0 = gaea.aE;
        boolean z = gaec0.w(gaea0);
        if(this.gU() && z) {
            int v = (int)gaec.h(context0).a(context0, gaea0);
            if(v != view0.getPaddingTop()) {
                view0.setPadding(view0.getPaddingStart(), v, view0.getPaddingEnd(), view0.getPaddingBottom());
            }
        }
    }

    protected final void Q() {
        int v4;
        int v2;
        int v = this.getResources().getDimensionPixelSize(0x7F07122E);  // dimen:sud_glif_land_middle_horizontal_spacing
        if(this.gU()) {
            gaec gaec0 = gaec.h(this.getContext());
            gaea gaea0 = gaea.Q;
            if(gaec0.w(gaea0)) {
                v = (int)gaec.h(this.getContext()).a(this.getContext(), gaea0);
            }
        }
        View view0 = this.r(0x7F0B2164);  // id:sud_landscape_header_area
        int v1 = 0;
        if(view0 != null) {
            if(this.gU()) {
                gaec gaec1 = gaec.h(this.getContext());
                gaea gaea1 = gaea.P;
                if(gaec1.w(gaea1)) {
                    v2 = (int)gaec.h(this.getContext()).a(this.getContext(), gaea1);
                    goto label_19;
                }
                goto label_15;
            }
            else {
            label_15:
                TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F040C26});  // attr:sudMarginEnd
                int v3 = typedArray0.getDimensionPixelSize(0, 0);
                typedArray0.recycle();
                v2 = v3;
            }
        label_19:
            view0.setPaddingRelative(view0.getPaddingStart(), view0.getPaddingTop(), v / 2 - v2, view0.getPaddingBottom());
        }
        View view1 = this.r(0x7F0B2163);  // id:sud_landscape_content_area
        if(view1 != null) {
            if(this.gU()) {
                gaec gaec2 = gaec.h(this.getContext());
                gaea gaea2 = gaea.O;
                if(gaec2.w(gaea2)) {
                    v4 = (int)gaec.h(this.getContext()).a(this.getContext(), gaea2);
                    goto label_32;
                }
                goto label_28;
            }
            else {
            label_28:
                TypedArray typedArray1 = this.getContext().obtainStyledAttributes(new int[]{0x7F040C27});  // attr:sudMarginStart
                int v5 = typedArray1.getDimensionPixelSize(0, 0);
                typedArray1.recycle();
                v4 = v5;
            }
        label_32:
            if(view0 != null) {
                v1 = v / 2 - v4;
            }
            view1.setPaddingRelative(v1, view1.getPaddingTop(), view1.getPaddingEnd(), view1.getPaddingBottom());
        }
    }

    protected final boolean R() {
        return gaec.t(this.getContext()) && Build.VERSION.SDK_INT >= 35;
    }

    public final boolean S() {
        return ((gaig)this.t(gaig.class)).d();
    }

    public final boolean T() {
        return this.c ? true : this.gU() && gaec.A(this.getContext());
    }

    public static final boolean U(ScrollView scrollView0) {
        return scrollView0 == null ? false : scrollView0.canScrollVertically(1);
    }

    protected static final boolean V(Context context0) {
        return gaec.p(context0) && qaa.a(context0).a(gaec.e(context0));
    }

    public static final boolean W(ScrollView scrollView0) {
        if(scrollView0 == null) {
            return false;
        }
        View view0 = scrollView0.getChildAt(0);
        return view0 != null && view0.getHeight() > scrollView0.getHeight();
    }

    public final void b(CharSequence charSequence0) {
        ((gahy)this.t(gahy.class)).d(charSequence0);
    }

    private void c(AttributeSet attributeSet0, int v) {
        if(this.isInEditMode()) {
            return;
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, gagt.i, v, 0);
        boolean z = typedArray0.getBoolean(4, false);
        this.c = this.gU() && z;
        gahy gahy0 = new gahy(this, attributeSet0, v);
        this.v(gahy.class, gahy0);
        gahu gahu0 = new gahu(this, attributeSet0, v);
        this.v(gahu.class, gahu0);
        gahz gahz0 = new gahz(this, attributeSet0, v);
        this.v(gahz.class, gahz0);
        gaif gaif0 = new gaif(this);
        this.v(gaif.class, gaif0);
        gaig gaig0 = new gaig(this, attributeSet0, v);
        this.v(gaig.class, gaig0);
        gaib gaib0 = new gaib(this);
        this.v(gaib.class, gaib0);
        gahw gahw0 = new gahw(this);
        this.v(gahw.class, gahw0);
        gaiw gaiw0 = new gaiw(this);
        this.v(gaiw.class, gaiw0);
        ScrollView scrollView0 = this.B();
        if(scrollView0 != null) {
            gaiw0.c = new gaix(gaiw0, scrollView0);
        }
        ColorStateList colorStateList0 = typedArray0.getColorStateList(2);
        if(colorStateList0 != null) {
            this.n = colorStateList0;
            this.d();
            ((gaig)this.t(gaig.class)).b(colorStateList0);
        }
        if(this.T() && !this.p()) {
            int v1 = gaec.h(this.getContext()).c(this.getContext(), gaea.N);
            this.getRootView().setBackgroundColor(v1);
            View view0 = this.r(0x7F0B212F);  // id:suc_intrinsic_size_layout
            if(view0 != null) {
                view0.setBackgroundColor(v1);
            }
        }
        View view1 = this.r(0x7F0B2167);  // id:sud_layout_content
        if(view1 != null) {
            if(this.gU()) {
                gaji.a(view1);
            }
            if(!(this instanceof gagq)) {
                this.P(view1);
            }
        }
        this.Q();
        if(gaec.v(this.getContext())) {
            View view2 = this.r(0x7F0B2147);  // id:sud_header_scroll_view
            if(view2 != null) {
                view2.setFocusable(false);
            }
            View view3 = this.r(0x7F0B2185);  // id:sud_scroll_view
            if(view3 != null) {
                view3.setFocusable(false);
            }
        }
        this.d = typedArray0.getColorStateList(0);
        this.d();
        this.I(typedArray0.getBoolean(1, true));
        int v2 = typedArray0.getResourceId(3, 0);
        if(v2 != 0) {
            ViewStub viewStub0 = (ViewStub)this.r(0x7F0B2178);  // id:sud_layout_sticky_header
            viewStub0.setLayoutResource(v2);
            viewStub0.inflate();
        }
        if(gaec.t(this.getContext())) {
            this.G();
            View view4 = this.findViewById(0x7F0B2177);  // id:sud_layout_protection
            if(view4 != null && (view4 instanceof ProtectionLayout) && this.d != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(new khr(this.d.getDefaultColor()));
                ((ProtectionLayout)view4).a(arrayList0);
            }
        }
        this.F();
        if(this.h == null) {
            Class class1 = this.getClass();
            GlifLayout.a.a("Using setup design " + class1.getSimpleName() + " to init for null activity");
        }
        else {
            Class class0 = this.getClass();
            String s = this.h.getClass().getSimpleName();
            GlifLayout.a.a("Using setup design " + class0.getSimpleName() + " to init for " + s);
        }
        typedArray0.recycle();
    }

    private final void d() {
        int v;
        if(this.r(0x7F0B2132) != null) {  // id:suc_layout_status
            ColorStateList colorStateList0 = this.d;
            if(colorStateList0 == null) {
                v = this.n == null ? 0 : this.n.getDefaultColor();
            }
            else {
                v = colorStateList0.getDefaultColor();
            }
            gagp gagp0 = this.b ? new gagp(v) : new ColorDrawable(v);
            ((gafn)this.t(gafn.class)).a(gagp0);
        }
    }

    public final void f() {
        gahz gahz0 = (gahz)this.t(gahz.class);
        ImageView imageView0 = gahz0.b();
        if(imageView0 != null) {
            imageView0.setVisibility(4);
            gahz0.f(4);
        }
    }

    @Override  // gacu
    protected View l(LayoutInflater layoutInflater0, int v) {
        if(v == 0) {
            if(GlifLayout.V(this.getContext())) {
                return this.R() ? this.s(layoutInflater0, 0x7F160953, 0x7F0E0A2F) : this.s(layoutInflater0, 0x7F160953, 0x7F0E0A25);  // style:SudThemeGlif.Light
            }
            if(this.R()) {
                return this.s(layoutInflater0, 0x7F160953, 0x7F0E0A53);  // style:SudThemeGlif.Light
            }
            if(gafq.a(this.getContext())) {
                return this.s(layoutInflater0, 0x7F160953, 0x7F0E0A99);  // style:SudThemeGlif.Light
            }
            v = 0x7F0E0A93;  // layout:sud_glif_template
        }
        return this.s(layoutInflater0, 0x7F160953, v);  // style:SudThemeGlif.Light
    }

    @Override  // gacu
    protected ViewGroup m(int v) {
        if(v == 0) {
            v = 0x7F0B2167;  // id:sud_layout_content
        }
        return super.m(v);
    }

    @Override  // gacu
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        if(this.R()) {
            View view0 = this.r(0x7F0B2166);  // id:sud_layout_container
            if(view0 != null) {
                view0.setPadding(windowInsets0.getSystemWindowInsetLeft(), view0.getPaddingTop(), windowInsets0.getSystemWindowInsetRight(), view0.getPaddingBottom());
            }
            gaff gaff0 = (gaff)this.t(gaff.class);
            if(gaff0 != null) {
                int v = windowInsets0.getSystemWindowInsetLeft();
                int v1 = windowInsets0.getSystemWindowInsetRight();
                if(gaff0.j != null && gaff0.j.getLayoutDirection() == 1) {
                    int v2 = v1;
                    v1 = v;
                    v = v2;
                }
                if(gaec.t(gaff0.e) && (gaff0.s != v || gaff0.t != v1)) {
                    gaff0.s = v;
                    gaff0.t = v1;
                    if(gaff0.G) {
                        gaff0.u();
                        return super.onApplyWindowInsets(windowInsets0);
                    }
                    gaff0.y(gaff0.j, v + gaff0.u, gaff0.q, gaff0.v + v1, gaff0.r);
                }
            }
        }
        return super.onApplyWindowInsets(windowInsets0);
    }

    @Override  // gacu
    protected void onDetachedFromWindow() {
        PersistableBundle persistableBundle0;
        super.onDetachedFromWindow();
        if(gagb.b(this.h.getIntent()) && gaec.t(this.getContext())) {
            gahw gahw0 = (gahw)this.t(gahw.class);
            if(gahw0 == null) {
                persistableBundle0 = PersistableBundle.EMPTY;
            }
            else {
                persistableBundle0 = new PersistableBundle();
                persistableBundle0.putInt("BackButton_onClickCount", gahw0.c);
            }
            CustomEvent customEvent0 = CustomEvent.b(MetricKey.b("SetupDesignMetrics", this.h), persistableBundle0);
            gadx.b(this.getContext(), customEvent0);
            CustomEvent.a(customEvent0);
        }
        ScrollView scrollView0 = this.B();
        if(scrollView0 != null) {
            scrollView0.getViewTreeObserver().removeOnScrollChangedListener(this.o);
        }
        ScrollView scrollView1 = this.A();
        if(scrollView1 != null) {
            scrollView1.getViewTreeObserver().removeOnScrollChangedListener(this.o);
        }
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ((gahz)this.t(gahz.class)).h();
        gahy gahy0 = (gahy)this.t(gahy.class);
        TemplateLayout templateLayout0 = gahy0.a;
        TextView textView0 = (TextView)templateLayout0.r(0x7F0B2133);  // id:suc_layout_title
        if(gajm.e(templateLayout0)) {
            View view0 = templateLayout0.r(0x7F0B216B);  // id:sud_layout_header
            gaji.a(view0);
            if(textView0 != null) {
                int v = gajm.a(textView0.getContext());
                gajo.a(textView0, new gajn(gaea.R, gaea.S, gaea.T, gaea.U, gaea.W, gaea.X, gaea.V, v));
            }
            if(((ViewGroup)view0) != null) {
                Context context0 = ((ViewGroup)view0).getContext();
                ((ViewGroup)view0).setBackgroundColor(gaec.h(context0).c(context0, gaea.ad));
                gaec gaec0 = gaec.h(context0);
                gaea gaea0 = gaea.ae;
                if(gaec0.w(gaea0)) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((ViewGroup)view0).getLayoutParams();
                    if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                        int v1 = (int)gaec.h(context0).a(context0, gaea0);
                        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin, v1);
                        ((ViewGroup)view0).setLayoutParams(viewGroup$LayoutParams0);
                    }
                }
            }
        }
        gahy0.f();
        if(gahy0.b) {
            gahy0.b(textView0);
        }
        TemplateLayout templateLayout1 = ((gahu)this.t(gahu.class)).a;
        TextView textView1 = (TextView)templateLayout1.r(0x7F0B2179);  // id:sud_layout_subtitle
        if(textView1 != null && gajm.e(templateLayout1)) {
            int v2 = gajm.a(textView1.getContext());
            gajo.a(textView1, new gajn(gaea.am, gaea.an, gaea.al, gaea.ao, gaea.ap, gaea.aq, gaea.ar, gaea.as, v2));
        }
        gaig gaig0 = (gaig)this.t(gaig.class);
        ProgressBar progressBar0 = gaig0.a();
        if(gaig0.b && progressBar0 != null) {
            if(gajm.c(gaig0.a)) {
                Context context1 = progressBar0.getContext();
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = progressBar0.getLayoutParams();
                if((viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams)) {
                    int v3 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).topMargin;
                    gaec gaec1 = gaec.h(context1);
                    gaea gaea1 = gaea.bC;
                    if(gaec1.w(gaea1)) {
                        v3 = (int)gaec.h(context1).b(context1, gaea1, (gaec.t(context1) ? context1.getResources().getDimension(0x7F071204) : context1.getResources().getDimension(0x7F07128B)));  // dimen:sud_glif_expressive_progress_bar_margin_top
                    }
                    int v4 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).bottomMargin;
                    gaec gaec2 = gaec.h(context1);
                    gaea gaea2 = gaea.bD;
                    if(gaec2.w(gaea2)) {
                        v4 = (int)gaec.h(context1).b(context1, gaea2, (gaec.t(context1) ? context1.getResources().getDimension(0x7F071203) : context1.getResources().getDimension(0x7F071289)));  // dimen:sud_glif_expressive_progress_bar_margin_bottom
                    }
                    if(v3 != ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).topMargin || v4 != ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).bottomMargin) {
                        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).leftMargin, v3, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).rightMargin, v4);
                    }
                }
            }
            else {
                ViewGroup.LayoutParams viewGroup$LayoutParams2 = progressBar0.getLayoutParams();
                if((viewGroup$LayoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    int v5 = (int)gaig0.c.getResources().getDimension(0x7F07128B);  // dimen:sud_progress_bar_margin_top
                    int v6 = (int)gaig0.c.getResources().getDimension(0x7F071289);  // dimen:sud_progress_bar_margin_bottom
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).leftMargin, v5, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams2).rightMargin, v6);
                }
            }
        }
        gaif gaif0 = (gaif)this.t(gaif.class);
        TemplateLayout templateLayout2 = gaif0.a;
        int v7 = 0;
        if(gajm.e(templateLayout2)) {
            ImageView imageView0 = gaif0.a();
            TextView textView2 = gaif0.c();
            LinearLayout linearLayout0 = gaif0.b();
            gaji.a(templateLayout2.r(0x7F0B216B));  // id:sud_layout_header
            if(imageView0 != null && textView2 != null) {
                Context context2 = imageView0.getContext();
                ViewGroup.LayoutParams viewGroup$LayoutParams3 = imageView0.getLayoutParams();
                if((viewGroup$LayoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    int v8 = gaec.h(context2).w(gaea.av) ? ((int)gaec.h(context2).a(context2, gaea.av)) : ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).rightMargin;
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).leftMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).topMargin, v8, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams3).bottomMargin);
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams4 = linearLayout0.getLayoutParams();
                if((viewGroup$LayoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    int v9 = gaec.h(context2).w(gaea.ax) ? ((int)gaec.h(context2).a(context2, gaea.ax)) : ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams4).topMargin;
                    int v10 = gaec.h(context2).w(gaea.ay) ? ((int)gaec.h(context2).a(context2, gaea.ay)) : ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams4).bottomMargin;
                    ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams4).setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams4).leftMargin, v9, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams4).rightMargin, v10);
                }
                gaec gaec3 = gaec.h(context2);
                float f = context2.getResources().getDimension(0x7F07116A);  // dimen:sud_account_avatar_max_height
                imageView0.setMaxHeight(((int)gaec3.b(context2, gaea.aw, f)));
                gaec gaec4 = gaec.h(context2);
                float f1 = context2.getResources().getDimension(0x7F07116B);  // dimen:sud_account_name_text_size
                textView2.setTextSize(0, ((float)(((int)gaec4.b(context2, gaea.at, f1)))));
                Typeface typeface0 = Typeface.create(gaec.h(context2).k(context2, gaea.au), 0);
                if(typeface0 != null) {
                    textView2.setTypeface(typeface0);
                }
                linearLayout0.setGravity(gajm.a(linearLayout0.getContext()));
            }
        }
        gahw gahw0 = (gahw)this.t(gahw.class);
        if(gajm.e(gahw0.a) && gahw0.b() != null) {
            FrameLayout frameLayout0 = gahw0.b();
            if(frameLayout0 != null) {
                Context context3 = frameLayout0.getContext();
                ViewGroup.LayoutParams viewGroup$LayoutParams5 = frameLayout0.getLayoutParams();
                int v11 = (int)context3.getResources().getDimension(0x7F0711D5);  // dimen:sud_glif_expressive_back_button_height
                int v12 = gajg.a(context3, gaea.aa, 0);
                if(v12 > v11) {
                    v7 = v12 - v11;
                }
                int v13 = gajg.a(context3, gaea.Z, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).topMargin);
                if(v7 != 0) {
                    v13 += v7 / 2;
                }
                int v14 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).leftMargin;
                gaec gaec5 = gaec.h(context3);
                gaea gaea3 = gaea.O;
                if(gaec5.w(gaea3)) {
                    v14 = gajg.a(context3, gaea3, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).leftMargin) - ((int)context3.getResources().getDimension(0x7F0711D9));  // dimen:sud_glif_expressive_back_button_padding_start
                }
                if(v13 != ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).topMargin || v14 != ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).leftMargin) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
                    frameLayout$LayoutParams0.setMargins(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).leftMargin, v13, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).rightMargin, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams5).bottomMargin);
                    frameLayout$LayoutParams0.setMarginStart(v14);
                    frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
                }
            }
        }
        TextView textView3 = (TextView)this.r(0x7F0B2169);  // id:sud_layout_description
        if(textView3 != null) {
            if(this.c) {
                gajb.a(textView3);
                return;
            }
            if(this.gU()) {
                gajb.b(textView3);
            }
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof GlifLayout.GlifSavedState)) {
            super.onRestoreInstanceState(((GlifLayout.GlifSavedState)parcelable0).getSuperState());
            gaiw gaiw0 = (gaiw)this.t(gaiw.class);
            if(((GlifLayout.GlifSavedState)parcelable0).a) {
                gaiw0.h();
                gaiu gaiu0 = gaiw0.e;
                if(gaiu0 != null) {
                    gaiu0.a(true);
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new GlifLayout.GlifSavedState(super.onSaveInstanceState());
        parcelable0.a = ((gaiw)this.t(gaiw.class)).b;
        return parcelable0;
    }

    public final int w() {
        if(!this.gU()) {
            return 0;
        }
        if(this.p()) {
            TypedValue typedValue0 = new TypedValue();
            this.getContext().getTheme().resolveAttribute(0x1010031, typedValue0, true);
            return typedValue0.data;
        }
        return gaec.h(this.getContext()).c(this.getContext(), gaea.e);
    }

    public final int x() {
        TypedValue typedValue0 = new TypedValue();
        this.getContext().getTheme().resolveAttribute(0x7F040BE2, typedValue0, true);  // attr:sudFooterBackgroundColor
        return typedValue0.data;
    }

    public final Drawable y() {
        ImageView imageView0 = ((gahz)this.t(gahz.class)).b();
        return imageView0 == null ? null : imageView0.getDrawable();
    }

    public final ProgressBar z() {
        return ((gaig)this.t(gaig.class)).a();
    }
}

