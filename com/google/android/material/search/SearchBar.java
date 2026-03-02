package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import fydg;
import fydi;
import fyho;
import fynk;
import fynm;
import fysf;
import fyso;
import fysq;
import fyuj;
import fyuk;
import fyut;
import fzaq;
import kv;

public class SearchBar extends Toolbar {
    public final int A;
    public final ColorStateList B;
    public final fysq C;
    public View D;
    public int E;
    public fyuj F;
    private final FrameLayout G;
    private boolean H;
    private final boolean I;
    private final boolean J;
    private final Drawable K;
    private final boolean L;
    private final boolean M;
    private Integer N;
    private Drawable O;
    private boolean P;
    private boolean Q;
    private int R;
    private final boolean S;
    private final int T;
    private ActionMenuView U;
    private ImageButton V;
    private final fydi W;
    public final TextView y;
    public final TextView z;

    public SearchBar(Context context0) {
        this(context0, null);
    }

    public SearchBar(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040873);  // attr:materialSearchBarStyle
    }

    public SearchBar(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F161415), attributeSet0, v);  // style:Widget.Material3.SearchBar
        this.E = -1;
        this.W = new fydi(this);
        Context context1 = this.getContext();
        if(attributeSet0 != null) {
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        this.T = this.getResources().getDimensionPixelSize(0x7F070B36);  // dimen:m3_searchbar_parent_width_breakpoint
        Drawable drawable0 = kv.a(context1, 0x7F08083B);  // drawable:ic_search_black_24
        this.K = drawable0;
        this.C = new fysq();
        TypedArray typedArray0 = fynk.a(context1, attributeSet0, fyso.a, v, 0x7F161415, new int[0]);  // style:Widget.Material3.SearchBar
        fyut fyut0 = new fyut(fyut.i(context1, attributeSet0, v, 0x7F161415));  // style:Widget.Material3.SearchBar
        int v1 = typedArray0.getColor(5, 0);
        this.A = v1;
        this.B = fysf.d(context1, typedArray0, 12);
        float f = typedArray0.getDimension(8, 0.0f);
        this.J = typedArray0.getBoolean(6, true);
        this.P = typedArray0.getBoolean(7, true);
        boolean z = typedArray0.getBoolean(10, false);
        this.M = typedArray0.getBoolean(9, false);
        this.L = typedArray0.getBoolean(17, true);
        if(typedArray0.hasValue(13)) {
            this.N = typedArray0.getColor(13, -1);
        }
        int v2 = typedArray0.getResourceId(0, -1);
        String s = typedArray0.getString(2);
        String s1 = typedArray0.getString(3);
        float f1 = typedArray0.getDimension(15, -1.0f);
        int v3 = typedArray0.getColor(14, 0);
        this.Q = typedArray0.getBoolean(16, false);
        this.H = typedArray0.getBoolean(11, false);
        this.R = typedArray0.getDimensionPixelSize(1, -1);
        this.S = typedArray0.getBoolean(4, false);
        typedArray0.recycle();
        if(!z) {
            if(this.e() != null) {
                drawable0 = this.e();
            }
            this.w(drawable0);
            this.V(true);
        }
        this.setClickable(true);
        this.setFocusable(true);
        LayoutInflater.from(context1).inflate(0x7F0E05EA, this);  // layout:mtrl_search_bar
        this.I = true;
        TextView textView0 = (TextView)this.findViewById(0x7F0B1B47);  // id:open_search_bar_text_view
        this.y = textView0;
        TextView textView1 = (TextView)this.findViewById(0x7F0B1B46);  // id:open_search_bar_placeholder_text_view
        this.z = textView1;
        this.G = (FrameLayout)this.findViewById(0x7F0B1B48);  // id:open_search_bar_text_view_container
        this.setElevation(f);
        if(v2 != -1) {
            textView0.setTextAppearance(v2);
            textView1.setTextAppearance(v2);
        }
        this.S(s);
        textView0.setHint(s1);
        boolean z1 = this.Q;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)textView0.getLayoutParams();
        if(z1) {
            frameLayout$LayoutParams0.gravity = 1;
            textView0.setGravity(1);
        }
        else {
            frameLayout$LayoutParams0.gravity = 0;
            textView0.setGravity(0);
        }
        textView0.setLayoutParams(frameLayout$LayoutParams0);
        textView1.setLayoutParams(frameLayout$LayoutParams0);
        fyuj fyuj0 = new fyuj(fyut0);
        this.F = fyuj0;
        fyuj0.W(this.getContext());
        this.F.Z(f);
        if((f1 >= 0.0f)) {
            this.F.ah(f1, v3);
        }
        int v4 = fyho.b(this, 0x7F0402BE);  // attr:colorControlHighlight
        this.F.aa(ColorStateList.valueOf(v1));
        this.setBackground(new RippleDrawable(ColorStateList.valueOf(v4), this.F, this.F));
    }

    @Override  // android.support.v7.widget.Toolbar
    public final void A(CharSequence charSequence0) {
    }

    @Override  // android.support.v7.widget.Toolbar
    public final void D(CharSequence charSequence0) {
    }

    public final float O() {
        return this.F.H();
    }

    public final CharSequence P() {
        return this.y.getHint();
    }

    public final CharSequence Q() {
        return this.y.getText();
    }

    public final void R(String s) {
        this.z.setText(s);
    }

    public final void S(CharSequence charSequence0) {
        this.y.setText(charSequence0);
        this.z.setText(charSequence0);
    }

    private final AppBarLayout T() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if((viewParent0 instanceof AppBarLayout)) {
                return (AppBarLayout)viewParent0;
            }
        }
        return null;
    }

    private final void U() {
        int v2;
        int v = 0;
        if(Build.VERSION.SDK_INT < 34) {
            return;
        }
        int v1 = this.getLayoutDirection() == 1 ? 1 : 0;
        ImageButton imageButton0 = fynm.b(this);
        if(imageButton0 == null || !imageButton0.isClickable()) {
            v2 = 0;
        }
        else if(v1 != 0) {
            v2 = this.getWidth() - imageButton0.getLeft();
        }
        else {
            v2 = imageButton0.getRight();
        }
        ActionMenuView actionMenuView0 = fynm.a(this);
        if(actionMenuView0 != null) {
            v = v1 == 0 ? this.getWidth() - actionMenuView0.getLeft() : actionMenuView0.getRight();
        }
        int v3 = 1 == v1 ? v : v2;
        if(1 != v1) {
            v2 = v;
        }
        this.setHandwritingBoundsOffsets(((float)(-v3)), 0.0f, ((float)(-v2)), 0.0f);
    }

    private final void V(boolean z) {
        ImageButton imageButton0 = fynm.b(this);
        if(imageButton0 == null) {
            return;
        }
        imageButton0.setClickable(((boolean)(((int)z) ^ 1)));
        imageButton0.setFocusable(((boolean)(((int)z) ^ 1)));
        Drawable drawable0 = imageButton0.getBackground();
        if(drawable0 != null) {
            this.O = drawable0;
        }
        imageButton0.setBackgroundDrawable((((int)z) == 0 ? this.O : null));
        this.U();
    }

    private static final int W(int v, int v1) {
        return v == 0 ? v1 : v;
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.I && this.D == null && !(view0 instanceof ActionMenuView)) {
            this.D = view0;
            view0.setAlpha(0.0f);
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fyuk.d(this, this.F);
        if(this.J && (this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources0 = this.getResources();
            int v = resources0.getDimensionPixelSize(0x7F070B32);  // dimen:m3_searchbar_margin_horizontal
            int v1 = resources0.getDimensionPixelSize(0x7F070B33);  // dimen:m3_searchbar_margin_vertical
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
            viewGroup$MarginLayoutParams0.leftMargin = SearchBar.W(viewGroup$MarginLayoutParams0.leftMargin, v);
            viewGroup$MarginLayoutParams0.topMargin = SearchBar.W(viewGroup$MarginLayoutParams0.topMargin, v1);
            viewGroup$MarginLayoutParams0.rightMargin = SearchBar.W(viewGroup$MarginLayoutParams0.rightMargin, v);
            viewGroup$MarginLayoutParams0.bottomMargin = SearchBar.W(viewGroup$MarginLayoutParams0.bottomMargin, v1);
        }
        if((this.getLayoutParams() instanceof fydg)) {
            fydg fydg0 = (fydg)this.getLayoutParams();
            if(!this.P) {
                if(fydg0.a == 53) {
                    fydg0.a = 0;
                }
            }
            else if(fydg0.a == 0) {
                fydg0.a = 53;
            }
        }
        if(this.H) {
            AppBarLayout appBarLayout0 = this.T();
            if(appBarLayout0 != null && this.B != null) {
                appBarLayout0.k.add(this.W);
            }
        }
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayout0 = this.T();
        if(appBarLayout0 != null) {
            appBarLayout0.k.remove(this.W);
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo0.setEditable(this.isEnabled());
        CharSequence charSequence0 = this.Q();
        boolean z = TextUtils.isEmpty(charSequence0);
        accessibilityNodeInfo0.setHintText(this.P());
        accessibilityNodeInfo0.setShowingHintText(z);
        if(z) {
            charSequence0 = this.P();
        }
        accessibilityNodeInfo0.setText(charSequence0);
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        View view0 = this.D;
        if(view0 != null) {
            int v4 = view0.getMeasuredWidth();
            int v5 = this.getMeasuredWidth() / 2 - v4 / 2;
            int v6 = v4 + v5;
            int v7 = view0.getMeasuredHeight();
            int v8 = this.getMeasuredHeight() / 2 - v7 / 2;
            int v9 = v7 + v8;
            if(this.getLayoutDirection() == 1) {
                view0.layout(this.getMeasuredWidth() - v6, v8, this.getMeasuredWidth() - v5, v9);
            }
            else {
                view0.layout(v5, v8, v6, v9);
            }
        }
        this.U();
        TextView textView0 = this.y;
        if(textView0 != null && this.Q) {
            int v10 = this.getMeasuredWidth() / 2;
            FrameLayout frameLayout0 = this.G;
            int v11 = v10 - frameLayout0.getMeasuredWidth() / 2;
            int v12 = frameLayout0.getMeasuredWidth() + v11;
            int v13 = this.getMeasuredHeight() / 2 - frameLayout0.getMeasuredHeight() / 2;
            int v14 = frameLayout0.getMeasuredHeight() + v13;
            int v15 = this.getLayoutDirection();
            if(this.U == null) {
                this.U = fynm.a(this);
            }
            ActionMenuView actionMenuView0 = this.U;
            if(this.V == null) {
                this.V = fynm.b(this);
            }
            ImageButton imageButton0 = this.V;
            int v16 = frameLayout0.getMeasuredWidth() / 2 - textView0.getMeasuredWidth() / 2;
            int v17 = v16 + v11;
            int v18 = textView0.getMeasuredWidth() + v16 + v11;
            ActionMenuView actionMenuView1 = v15 == 1 ? actionMenuView0 : imageButton0;
            if(v15 == 1) {
                actionMenuView0 = imageButton0;
            }
            int v19 = actionMenuView1 == null ? 0 : Math.max(actionMenuView1.getRight() - v17, 0);
            int v20 = v18 + v19;
            int v21 = actionMenuView0 == null ? 0 : Math.max(v20 - actionMenuView0.getLeft(), 0);
            int v22 = v17 + v19 - v21;
            int v23 = v20 - v21;
            int v24 = v19 - v21 + Math.max(Math.max(this.getPaddingLeft() - v22, (this.n == null ? 0 : this.n.a) - v22), 0) - Math.max(Math.max(v23 - (this.getMeasuredWidth() - this.getPaddingRight()), v23 - (this.getMeasuredWidth() - (this.n == null ? 0 : this.n.b))), 0);
            frameLayout0.layout(v11 + v24, v13, v12 + v24, v14);
        }
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = this.R;
        if(v4 >= 0 && v2 > v4) {
            v = View.MeasureSpec.makeMeasureSpec(v4, v3);
        }
        else if(this.S) {
            int v5 = this.T;
            if(v2 > v5) {
                v = View.MeasureSpec.makeMeasureSpec(Math.max(v5, Math.round(((float)v2) * 0.5f)), v3);
            }
        }
        super.onMeasure(v, v1);
        View view0 = this.D;
        if(view0 != null) {
            view0.measure(v, v1);
        }
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SearchBar.SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SearchBar.SavedState)parcelable0).d);
        this.S(((SearchBar.SavedState)parcelable0).a);
    }

    @Override  // android.support.v7.widget.Toolbar
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SearchBar.SavedState(super.onSaveInstanceState());
        CharSequence charSequence0 = this.Q();
        parcelable0.a = charSequence0 == null ? null : charSequence0.toString();
        return parcelable0;
    }

    @Override  // android.support.v7.widget.Toolbar
    public final void q(int v) {
        super.q(v);
        this.E = v;
    }

    @Override  // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fyuj fyuj0 = this.F;
        if(fyuj0 != null) {
            fyuj0.Z(f);
        }
    }

    @Override  // android.support.v7.widget.Toolbar
    public final void w(Drawable drawable0) {
        if(this.L && drawable0 != null) {
            Integer integer0 = this.N;
            int v = integer0 == null ? fyho.b(this, (drawable0 == this.K ? 0x7F0402FC : 0x7F0402F7)) : ((int)integer0);  // attr:colorOnSurfaceVariant
            drawable0 = drawable0.mutate();
            drawable0.setTint(v);
        }
        super.w(drawable0);
    }

    @Override  // android.support.v7.widget.Toolbar
    public final void x(View.OnClickListener view$OnClickListener0) {
        if(this.M) {
            return;
        }
        super.x(view$OnClickListener0);
        this.V(false);
    }
}

