package com.google.android.libraries.material.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import fixl;
import fixo;
import fixs;
import fixv;
import fixz;
import fiya;
import fiyb;

@Deprecated
public class MaterialProgressBar extends ProgressBar {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private fixs f;
    private Drawable g;

    static {
    }

    private MaterialProgressBar(Context context0) {
        super(context0, null, 0x1010078);
        super.getProgress();
    }

    public MaterialProgressBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        super.getProgress();
        this.l(context0, attributeSet0, 0);
        this.i();
    }

    public MaterialProgressBar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        super.getProgress();
        this.l(context0, attributeSet0, v);
        this.i();
    }

    public final void a() {
        if(!this.k()) {
            this.setVisibility(4);
            return;
        }
        Drawable drawable0 = this.e();
        if((drawable0 instanceof fixl)) {
            ((fixl)drawable0).a(new fiya(this));
            return;
        }
        this.setVisibility(4);
    }

    public final void b() {
        if(this.getVisibility() != 0) {
            this.setVisibility(0);
            return;
        }
        if(this.k()) {
            this.e().setVisible(true, false);
        }
    }

    private static int c(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                throw new IllegalArgumentException("Invalid attribute value for mtrlLinearGrowFrom: " + v);
            }
        }
    }

    private final int d() {
        return this.isIndeterminate() ? this.a : this.b;
    }

    private final Drawable e() {
        return this.isIndeterminate() ? this.getIndeterminateDrawable() : this.getProgressDrawable();
    }

    private final void f() {
        if(this.d() == 0 && this.isIndeterminate()) {
            Context context0 = this.getContext();
            if(!ValueAnimator.areAnimatorsEnabled() || ((PowerManager)context0.getSystemService("power")).isPowerSaveMode()) {
                if(this.e() != this.g) {
                    this.f.b();
                    this.f.setCallback(null);
                    this.unscheduleDrawable(this.f);
                    this.setIndeterminateDrawable(this.g);
                    this.onSizeChanged(this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight());
                }
            }
            else if(this.e() != this.f) {
                this.g.setVisible(false, false);
                this.g.setCallback(null);
                this.unscheduleDrawable(this.g);
                this.setIndeterminateDrawable(this.f);
                this.onSizeChanged(this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight());
            }
        }
        Drawable drawable0 = this.e();
        if(drawable0 == null) {
            return;
        }
        boolean z = this.k();
        if((drawable0 instanceof fixl) && !z) {
            ((fixl)drawable0).b();
            return;
        }
        drawable0.setVisible(z, true);
    }

    private final void g(TypedArray typedArray0, boolean z) {
        int v3;
        int v2;
        int v1;
        int[] arr_v;
        int v = typedArray0.getInt(7, 3);
        if(typedArray0.hasValue(1)) {
            arr_v = this.getResources().getIntArray(typedArray0.getResourceId(1, -1));
        }
        else {
            arr_v = typedArray0.hasValue(0) ? new int[]{typedArray0.getColor(0, 0)} : null;
        }
        if(arr_v == null) {
            arr_v = this.getResources().getIntArray(0x7F030032);  // array:material_google_colors
        }
        switch(v) {
            case 1: {
                v1 = this.getResources().getDimensionPixelSize(0x7F070BCA);  // dimen:material_progress_circle_size_small
                break;
            }
            case 2: {
                v1 = this.getResources().getDimensionPixelSize(0x7F070BC9);  // dimen:material_progress_circle_size_medium
                break;
            }
            case 3: {
                v1 = this.getResources().getDimensionPixelSize(0x7F070BC8);  // dimen:material_progress_circle_size_large
                break;
            }
            default: {
                throw new IllegalStateException("Invalid progress circle size");
            }
        }
        this.c = v1;
        switch(v) {
            case 1: {
                v2 = this.getResources().getDimensionPixelSize(0x7F070BCD);  // dimen:material_progress_circle_stroke_width_small
                break;
            }
            case 2: {
                v2 = this.getResources().getDimensionPixelSize(0x7F070BCC);  // dimen:material_progress_circle_stroke_width_medium
                break;
            }
            case 3: {
                v2 = this.getResources().getDimensionPixelSize(0x7F070BCB);  // dimen:material_progress_circle_stroke_width_large
                break;
            }
            default: {
                throw new IllegalStateException("Invalid progress circle size");
            }
        }
        switch(v) {
            case 1: {
                v3 = this.getResources().getDimensionPixelSize(0x7F070BC7);  // dimen:material_progress_circle_inset_small
                break;
            }
            case 2: {
                v3 = this.getResources().getDimensionPixelSize(0x7F070BC6);  // dimen:material_progress_circle_inset_medium
                break;
            }
            case 3: {
                v3 = this.getResources().getDimensionPixelSize(0x7F070BC5);  // dimen:material_progress_circle_inset_large
                break;
            }
            default: {
                throw new IllegalStateException("Invalid progress circle size");
            }
        }
        if(z) {
            this.g = this.getContext().getDrawable(0x7F080E05);
            fixs fixs0 = new fixs(v2, v3, arr_v);
            this.f = fixs0;
            this.setIndeterminateDrawable(fixs0);
            return;
        }
        this.setProgressDrawable(new fixo(v2, v3, arr_v[0]));
    }

    private final void h(TypedArray typedArray0, boolean z) {
        boolean z1 = false;
        int v = typedArray0.hasValue(0) ? typedArray0.getColor(0, -1) : this.getResources().getColor(0x7F060E76);  // color:quantum_googblue
        int v1 = typedArray0.getColor(8, -1);
        TypedArray typedArray1 = this.getContext().getTheme().obtainStyledAttributes(new int[]{0x1010033});
        float f = typedArray1.getFloat(0, 0.2f);
        typedArray1.recycle();
        int v2 = typedArray0.getInt(6, 0);
        if(v1 != -1) {
            f = 1.0f;
        }
        if(z) {
            int v3 = this.d;
            if(this.a == 2) {
                z1 = true;
            }
            this.setIndeterminateDrawable(new fixz(v3, v, v1, f, z1, MaterialProgressBar.c(v2)));
            return;
        }
        this.setProgressDrawable(new fixv(this.d, v, v1, f, MaterialProgressBar.c(v2)));
    }

    private final void i() {
        this.j();
        if(this.isIndeterminate()) {
            this.getProgressDrawable().setVisible(false, false);
            this.getIndeterminateDrawable().setVisible(this.k(), true);
            return;
        }
        this.getProgressDrawable().setVisible(this.k(), true);
        this.getIndeterminateDrawable().setVisible(false, false);
    }

    private final void j() {
        if(this.isIndeterminate()) {
            if(this.a != 0) {
                this.setMinimumHeight(this.d);
                return;
            }
            this.setMinimumHeight(0);
            return;
        }
        if(this.b != 0) {
            this.setMinimumHeight(this.d);
            return;
        }
        this.setMinimumHeight(0);
    }

    private final boolean k() {
        if(this.isAttachedToWindow() && this.getWindowVisibility() == 0) {
            View view0 = this;
            while(view0.getVisibility() == 0) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 == null) {
                    return this.getWindowVisibility() == 0;
                }
                if((viewParent0 instanceof View)) {
                    view0 = (View)viewParent0;
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    private final void l(Context context0, AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fiyb.a, v, 0x7F161190);  // style:Widget.GoogleLib.Progress.Circular.Indeterminate.Large
        this.d = typedArray0.getDimensionPixelSize(4, 0);
        this.e = typedArray0.getDimensionPixelSize(5, 0);
        int v1 = typedArray0.getInt(3, 0);
        this.a = v1;
        switch(v1) {
            case 0: {
                this.g(typedArray0, true);
                break;
            }
            case 1: 
            case 2: {
                this.h(typedArray0, true);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid determinate progress style");
            }
        }
        int v2 = typedArray0.getInt(2, 1);
        this.b = v2;
        switch(v2) {
            case 0: {
                this.g(typedArray0, false);
                break;
            }
            case 1: {
                this.h(typedArray0, false);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid determinate progress style");
            }
        }
        typedArray0.recycle();
    }

    @Override  // android.widget.ProgressBar
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.k()) {
            this.b();
        }
    }

    @Override  // android.widget.ProgressBar
    protected final void onDetachedFromWindow() {
        if((this.e() instanceof fixl)) {
            ((fixl)this.e()).b();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.ProgressBar
    protected final void onDraw(Canvas canvas0) {
        synchronized(this) {
            int v1 = canvas0.save();
            if(this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            if(this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas0.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.e().draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    @Override  // android.widget.ProgressBar
    protected final void onMeasure(int v, int v1) {
        synchronized(this) {
            super.onMeasure(v, v1);
            if(this.d() == 0) {
                this.setMeasuredDimension(this.c + this.getPaddingLeft() + this.getPaddingRight(), this.c + this.getPaddingTop() + this.getPaddingBottom());
                return;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), MaterialProgressBar.resolveSizeAndState(this.d + this.e + this.e + this.getPaddingTop() + this.getPaddingBottom(), v1, 0));
        }
    }

    @Override  // android.widget.ProgressBar
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        if(this.d() != 0) {
            int v4 = v - (this.getPaddingLeft() + this.getPaddingRight());
            int v5 = v1 - (this.getPaddingTop() + this.getPaddingBottom());
            Drawable drawable0 = this.getIndeterminateDrawable();
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, v4, v5);
            }
            Drawable drawable1 = this.getProgressDrawable();
            if(drawable1 != null) {
                drawable1.setBounds(0, 0, v4, v5);
            }
            return;
        }
        super.onSizeChanged(v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.f();
    }

    @Override  // android.view.View
    protected final void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.f();
    }

    @Override  // android.widget.ProgressBar
    public final void setIndeterminate(boolean z) {
        synchronized(this) {
            super.setIndeterminate(z);
            this.j();
            Drawable drawable0 = this.e();
            if(drawable0 != null) {
                drawable0.setVisible(this.k(), false);
            }
        }
    }
}

