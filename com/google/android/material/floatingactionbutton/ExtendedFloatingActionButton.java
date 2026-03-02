package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup.LayoutParams;
import com.google.android.material.button.MaterialButton;
import fycu;
import fykd;
import fyki;
import fykj;
import fykk;
import fykl;
import fykm;
import fykn;
import fyko;
import fykp;
import fykq;
import fykr;
import fyks;
import fykt;
import fyld;
import fyle;
import fynk;
import fyut;
import fzaq;
import jtk;
import jtl;

public class ExtendedFloatingActionButton extends MaterialButton implements jtk {
    public ColorStateList A;
    public int B;
    public int C;
    public static final int D;
    private boolean E;
    private final fykd F;
    private final fyld G;
    private final fyld H;
    private final fyld I;
    private final fyld J;
    private final int K;
    private final jtl L;
    private final int M;
    public static final Property b;
    public static final Property c;
    public static final Property d;
    public static final Property e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean z;

    static {
        ExtendedFloatingActionButton.b = new fykn(Float.class);
        ExtendedFloatingActionButton.c = new fyko(Float.class);
        ExtendedFloatingActionButton.d = new fykp(Float.class);
        ExtendedFloatingActionButton.e = new fykq(Float.class);
    }

    public ExtendedFloatingActionButton(Context context0) {
        this(context0, null);
    }

    public ExtendedFloatingActionButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040500);  // attr:extendedFloatingActionButtonStyle
    }

    public ExtendedFloatingActionButton(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F1614A2), attributeSet0, v);  // style:Widget.MaterialComponents.ExtendedFloatingActionButton.Icon
        this.f = 0;
        this.E = true;
        fykd fykd0 = new fykd();
        this.F = fykd0;
        fykt fykt0 = new fykt(this, fykd0);
        this.I = fykt0;
        fyks fyks0 = new fyks(this, fykd0);
        this.J = fyks0;
        this.i = true;
        this.z = false;
        Context context1 = this.getContext();
        this.L = new ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior(context1, attributeSet0);
        TypedArray typedArray0 = fynk.a(context1, attributeSet0, fyle.a, v, 0x7F1614A2, new int[0]);  // style:Widget.MaterialComponents.ExtendedFloatingActionButton.Icon
        fycu fycu0 = fycu.b(context1, typedArray0, 5);
        fycu fycu1 = fycu.b(context1, typedArray0, 4);
        fycu fycu2 = fycu.b(context1, typedArray0, 2);
        fycu fycu3 = fycu.b(context1, typedArray0, 6);
        this.K = typedArray0.getDimensionPixelSize(0, -1);
        int v1 = typedArray0.getInt(3, 1);
        this.M = v1;
        this.g = this.getPaddingStart();
        this.h = this.getPaddingEnd();
        fykd fykd1 = new fykd();
        fykj fykj0 = new fykj(this);
        fykk fykk0 = new fykk(this, fykj0);
        fykl fykl0 = new fykl(this, fykk0, fykj0);
        switch(v1) {
            case 1: {
                break;
            }
            case 2: {
                fykj0 = fykk0;
                break;
            }
            default: {
                fykj0 = fykl0;
            }
        }
        fykr fykr0 = new fykr(this, fykd1, fykj0, true);
        this.H = fykr0;
        fykr fykr1 = new fykr(this, fykd1, new fyki(this), false);
        this.G = fykr1;
        fykt0.a = fycu0;
        fyks0.a = fycu1;
        fykr0.a = fycu2;
        fykr1.a = fycu3;
        typedArray0.recycle();
        this.mu(new fyut(fyut.j(context1, attributeSet0, v, 0x7F1614A2, fyut.a)));  // style:Widget.MaterialComponents.ExtendedFloatingActionButton.Icon
        this.k();
    }

    @Override  // jtk
    public final jtl a() {
        return this.L;
    }

    public final int c() {
        return (this.d() - this.m) / 2;
    }

    public final int d() {
        int v = this.K;
        if(v < 0) {
            int v1 = Math.min(this.getPaddingStart(), this.getPaddingEnd());
            return v1 + v1 + this.m;
        }
        return v;
    }

    public final int e() {
        return this.A.getColorForState(this.getDrawableState(), 0);
    }

    public final void f() {
        this.j(3);
    }

    public final void g() {
        this.j(2);
    }

    @Override  // android.widget.Button
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public final void h(ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
    }

    public final boolean i() {
        return this.getVisibility() == 0 ? this.f != 1 : this.f == 2;
    }

    public final void j(int v) {
        fyld fyld0;
        if(v == 0) {
            fyld0 = this.I;
        }
        else {
            switch(v) {
                case 1: {
                    fyld0 = this.J;
                    break;
                }
                case 2: {
                    fyld0 = this.G;
                    break;
                }
                default: {
                    fyld0 = this.H;
                }
            }
        }
        if(!fyld0.j()) {
            if(this.E) {
                if(!this.isLaidOut()) {
                    this.i();
                }
                else if(!this.isInEditMode()) {
                    if(v == 2) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
                        if(viewGroup$LayoutParams0 == null) {
                            this.B = this.getWidth();
                            this.C = this.getHeight();
                        }
                        else {
                            this.B = viewGroup$LayoutParams0.width;
                            this.C = viewGroup$LayoutParams0.height;
                        }
                    }
                    this.measure(0, 0);
                    AnimatorSet animatorSet0 = fyld0.a();
                    animatorSet0.addListener(new fykm(this, fyld0));
                    for(Object object0: fyld0.d()) {
                        animatorSet0.addListener(((Animator.AnimatorListener)object0));
                    }
                    animatorSet0.start();
                    return;
                }
            }
            fyld0.i();
            fyld0.k();
        }
    }

    private final void k() {
        this.A = this.getTextColors();
    }

    @Override  // com.google.android.material.button.MaterialButton
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.i && TextUtils.isEmpty(this.getText()) && this.k != null) {
            this.i = false;
            this.G.i();
        }
    }

    @Override  // android.widget.TextView
    public final void setPadding(int v, int v1, int v2, int v3) {
        super.setPadding(v, v1, v2, v3);
        if(this.i && !this.z) {
            this.g = this.getPaddingStart();
            this.h = this.getPaddingEnd();
        }
    }

    @Override  // android.widget.TextView
    public final void setPaddingRelative(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
        if(this.i && !this.z) {
            this.g = v;
            this.h = v2;
        }
    }

    @Override  // android.widget.TextView
    public final void setTextColor(int v) {
        super.setTextColor(v);
        this.k();
    }

    @Override  // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
        this.k();
    }
}

