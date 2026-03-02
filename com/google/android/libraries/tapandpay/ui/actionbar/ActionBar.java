package com.google.android.libraries.tapandpay.ui.actionbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import fipw;
import ftrz;
import ftsk;
import funy;
import ibni;
import ibuq;
import jtc;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class ActionBar extends ConstraintLayout {
    private final Button h;
    private final Button i;
    private int j;

    public ActionBar(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ActionBar(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ActionBar(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E0043, this);  // layout:action_bar
        int v1 = context0.getResources().getDimensionPixelSize(0x7F0700C1);  // dimen:action_bar_small_spacing
        int v2 = context0.getResources().getDimensionPixelSize(0x7F0700BD);  // dimen:action_bar_large_spacing
        int v3 = context0.getResources().getDimensionPixelSize(0x7F0700BD);  // dimen:action_bar_large_spacing
        funy.b(this, Integer.valueOf(v2), Integer.valueOf(context0.getResources().getDimensionPixelSize(0x7F0700C1)), Integer.valueOf(v3), Integer.valueOf(v1));  // dimen:action_bar_small_spacing
        this.c(context0.getResources().getDimensionPixelSize(0x7F0700BA));  // dimen:action_bar_button_height
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, ftsk.a, 0, 0);
        int v4 = typedArray0.getInteger(2, 2);
        View view0 = this.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        ibuq.e(view0, "findViewById(...)");
        Button button0 = ActionBar.t(((ViewStub)view0), v4, 0x7F0B06B2);  // id:PrimaryActionButton
        this.h = button0;
        int v5 = typedArray0.getInteger(3, 0);
        View view1 = this.findViewById(0x7F0B07C8);  // id:SecondaryActionButton
        ibuq.e(view1, "findViewById(...)");
        Button button1 = ActionBar.t(((ViewStub)view1), v5, 0x7F0B07C8);  // id:SecondaryActionButton
        this.i = button1;
        switch(typedArray0.getInteger(1, -1)) {
            case 0: {
                this.p();
                jtc jtc0 = new jtc();
                jtc0.e(this);
                jtc0.q(0x7F0B06B2, 2);  // id:PrimaryActionButton
                jtc0.q(0x7F0B07C8, 2);  // id:SecondaryActionButton
                jtc0.p(0x7F0B06B2, 0.0f);  // id:PrimaryActionButton
                jtc0.p(0x7F0B07C8, 0.0f);  // id:SecondaryActionButton
                jtc0.c(this);
                break;
            }
            case 1: {
                this.h();
                break;
            }
            case 2: {
                this.o();
            }
        }
        this.j = typedArray0.getResourceId(4, -1);
        button0.setAccessibilityTraversalBefore(0x7F0B07C8);  // id:SecondaryActionButton
        button1.setAccessibilityTraversalAfter(0x7F0B06B2);  // id:PrimaryActionButton
    }

    public ActionBar(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final View g(View view0) {
        if(this.j != -1 && view0 != null) {
            return view0.getId() == this.j ? view0 : view0.findViewById(this.j);
        }
        return null;
    }

    public final void h() {
        this.p();
        jtc jtc0 = new jtc();
        jtc0.e(this);
        jtc0.q(0x7F0B06B2, 2);  // id:PrimaryActionButton
        jtc0.q(0x7F0B07C8, 2);  // id:SecondaryActionButton
        jtc0.p(0x7F0B06B2, 1.0f);  // id:PrimaryActionButton
        jtc0.p(0x7F0B07C8, 1.0f);  // id:SecondaryActionButton
        jtc0.c(this);
    }

    public final void i() {
        jtc jtc0 = new jtc();
        jtc0.e(this);
        jtc0.r(0x7F0B06B2, 3, 0);  // id:PrimaryActionButton
        jtc0.i(0x7F0B06B2, 6, 0, 6, 0);  // id:PrimaryActionButton
        jtc0.h(0x7F0B06B2, 7, 0, 7);  // id:PrimaryActionButton
        jtc0.h(0x7F0B06B2, 3, 0, 3);  // id:PrimaryActionButton
        jtc0.i(0x7F0B06B2, 4, 0x7F0B07C8, 3, this.getContext().getResources().getDimensionPixelSize(0x7F0700C1));  // id:PrimaryActionButton
        jtc0.h(0x7F0B07C8, 6, 0, 6);  // id:SecondaryActionButton
        jtc0.h(0x7F0B07C8, 7, 0, 7);  // id:SecondaryActionButton
        jtc0.h(0x7F0B07C8, 3, 0x7F0B06B2, 4);  // id:SecondaryActionButton
        jtc0.h(0x7F0B07C8, 4, 0, 4);  // id:SecondaryActionButton
        jtc0.c(this);
    }

    public final void j() {
        Context context0 = this.getContext();
        this.setBackgroundColor(fipw.c.a(context0));
    }

    public final void k() {
        Context context0 = this.getContext();
        this.setBackgroundColor(fipw.a.a(context0));
    }

    public final void l(ftrz ftrz0, ftrz ftrz1) {
        if(ftrz1 == null) {
            this.q();
        }
        else {
            Button button0 = this.h;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = button0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(this.getResources().getDimensionPixelSize(0x7F0700C1));  // dimen:action_bar_small_spacing
            button0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
        }
        ActionBar.s(this.h, ftrz0);
        ActionBar.s(this.i, ftrz1);
    }

    public final void m(ftrz ftrz0) {
        ActionBar.s(this.h, ftrz0);
    }

    public final void n(ftrz ftrz0) {
        ActionBar.s(this.i, ftrz0);
        if(ftrz0 == null) {
            this.q();
        }
    }

    public final void o() {
        this.p();
        jtc jtc0 = new jtc();
        jtc0.e(this);
        jtc0.q(0x7F0B06B2, 1);  // id:PrimaryActionButton
        jtc0.q(0x7F0B07C8, 1);  // id:SecondaryActionButton
        jtc0.i(0x7F0B06B2, 7, 0, 7, 0);  // id:PrimaryActionButton
        jtc0.i(0x7F0B07C8, 6, 0, 6, 0);  // id:SecondaryActionButton
        jtc0.c(this);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(ActionBar.r(this.h) + ActionBar.r(this.i) > this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) {
            this.i();
        }
    }

    public final void p() {
        this.h.setMinWidth(0);
        this.i.setMinWidth(0);
        this.i.getLayoutParams().width = -2;
        this.h.getLayoutParams().width = -2;
    }

    private final void q() {
        Button button0 = this.h;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = button0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(0);
        button0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
    }

    private static final int r(View view0) {
        int v = view0.getWidth();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v1 = 0;
        int v2 = (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart() : 0;
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
        if((viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams)) {
            v1 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).getMarginEnd();
        }
        return v + v2 + v1;
    }

    private static final void s(Button button0, ftrz ftrz0) {
        button0.setVisibility((ftrz0 == null ? 8 : 0));
        if(ftrz0 != null) {
            button0.setText(ftrz0.a);
            button0.setOnClickListener(ftrz0.b);
        }
    }

    private static final Button t(ViewStub viewStub0, int v, int v1) {
        int v2;
        viewStub0.setInflatedId(v1);
        switch(v) {
            case 0: {
                v2 = 0x7F0E01A9;  // layout:button_outline
                break;
            }
            case 1: {
                v2 = 0x7F0E01AA;  // layout:button_text
                break;
            }
            default: {
                v2 = 0x7F0E01A8;  // layout:button_fill
            }
        }
        viewStub0.setLayoutResource(v2);
        View view0 = viewStub0.inflate();
        ibuq.d(view0, "null cannot be cast to non-null type android.widget.Button");
        return (Button)view0;
    }
}

