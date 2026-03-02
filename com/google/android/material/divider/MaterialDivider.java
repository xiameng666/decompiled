package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import fyjx;
import fynk;
import fysf;
import fyuj;
import fzaq;

public class MaterialDivider extends View {
    private final fyuj a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context0) {
        this(context0, null);
    }

    public MaterialDivider(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F04086E);  // attr:materialDividerStyle
    }

    public MaterialDivider(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F1614BF), attributeSet0, v);  // style:Widget.MaterialComponents.MaterialDivider
        Context context1 = this.getContext();
        this.a = new fyuj();
        TypedArray typedArray0 = fynk.a(context1, attributeSet0, fyjx.a, v, 0x7F1614BF, new int[0]);  // style:Widget.MaterialComponents.MaterialDivider
        this.b = typedArray0.getDimensionPixelSize(3, this.getResources().getDimensionPixelSize(0x7F070BB6));  // dimen:material_divider_thickness
        this.d = typedArray0.getDimensionPixelOffset(2, 0);
        this.e = typedArray0.getDimensionPixelOffset(1, 0);
        this.a(fysf.d(context1, typedArray0, 0).getDefaultColor());
        typedArray0.recycle();
    }

    public final void a(int v) {
        if(this.c != v) {
            this.c = v;
            ColorStateList colorStateList0 = ColorStateList.valueOf(v);
            this.a.aa(colorStateList0);
            this.invalidate();
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        int v2;
        int v1;
        super.onDraw(canvas0);
        boolean z = this.getLayoutDirection() == 1;
        int v = z ? this.e : this.d;
        if(z) {
            v1 = this.getWidth();
            v2 = this.d;
        }
        else {
            v1 = this.getWidth();
            v2 = this.e;
        }
        int v3 = this.getBottom() - this.getTop();
        this.a.setBounds(v, 0, v1 - v2, v3);
        this.a.draw(canvas0);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = this.getMeasuredHeight();
        if(v2 != 0x80000000 && v2 != 0) {
            return;
        }
        int v4 = this.b;
        if(v4 > 0 && v3 != v4) {
            v3 = v4;
        }
        this.setMeasuredDimension(this.getMeasuredWidth(), v3);
    }
}

