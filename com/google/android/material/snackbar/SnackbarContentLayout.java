package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import fycp;
import fyoy;
import fyxl;

public class SnackbarContentLayout extends LinearLayout implements fyxl {
    public TextView a;
    public Button b;
    public int c;
    private final TimeInterpolator d;

    public SnackbarContentLayout(Context context0) {
        this(context0, null);
    }

    public SnackbarContentLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = fyoy.a(context0, 0x7F0408DD, fycp.b);  // attr:motionEasingEmphasizedInterpolator
    }

    @Override  // fyxl
    public final void a(int v, int v1) {
        this.a.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimator0 = this.a.animate().alpha(1.0f).setDuration(((long)v1));
        TimeInterpolator timeInterpolator0 = this.d;
        viewPropertyAnimator0.setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(((long)v1)).setInterpolator(timeInterpolator0).setStartDelay(((long)v)).start();
        }
    }

    @Override  // fyxl
    public final void b(int v) {
        this.a.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimator0 = this.a.animate().alpha(0.0f).setDuration(((long)v));
        TimeInterpolator timeInterpolator0 = this.d;
        viewPropertyAnimator0.setInterpolator(timeInterpolator0).setStartDelay(0L).start();
        if(this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(((long)v)).setInterpolator(timeInterpolator0).setStartDelay(0L).start();
        }
    }

    private final boolean c(int v, int v1, int v2) {
        boolean z;
        if(v == this.getOrientation()) {
            z = false;
        }
        else {
            this.setOrientation(v);
            z = true;
        }
        if(this.a.getPaddingTop() == v1 && this.a.getPaddingBottom() == v2) {
            return z;
        }
        TextView textView0 = this.a;
        if(textView0.isPaddingRelative()) {
            textView0.setPaddingRelative(textView0.getPaddingStart(), v1, textView0.getPaddingEnd(), v2);
            return true;
        }
        textView0.setPadding(textView0.getPaddingLeft(), v1, textView0.getPaddingRight(), v2);
        return true;
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(0x7F0B2078);  // id:snackbar_text
        this.b = (Button)this.findViewById(0x7F0B2074);  // id:snackbar_action
    }

    @Override  // android.widget.LinearLayout
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.getOrientation() != 1) {
            int v2 = this.getResources().getDimensionPixelSize(0x7F070514);  // dimen:design_snackbar_padding_vertical_2lines
            int v3 = this.getResources().getDimensionPixelSize(0x7F070513);  // dimen:design_snackbar_padding_vertical
            Layout layout0 = this.a.getLayout();
            int v4 = layout0 == null || layout0.getLineCount() <= 1 ? 0 : 1;
            if(v4 == 0 || this.c <= 0 || this.b.getMeasuredWidth() <= this.c) {
                if(1 != v4) {
                    v2 = v3;
                }
                if(this.c(0, v2, v2)) {
                    super.onMeasure(v, v1);
                }
            }
            else if(this.c(1, v2, v2 - v3)) {
                super.onMeasure(v, v1);
            }
        }
    }
}

