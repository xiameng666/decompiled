package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import bbml;
import zdd;

public class IndeterminateMultiColorSpinner extends ViewGroup {
    ImageView a;
    bbml b;
    private int c;
    private int d;

    public IndeterminateMultiColorSpinner(Context context0) {
        this(context0, null);
    }

    public IndeterminateMultiColorSpinner(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        int v = 0;
        this.setWillNotDraw(false);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x101000E});
        this.setEnabled(typedArray0.getBoolean(0, true));
        typedArray0.recycle();
        ImageView imageView0 = new ImageView(this.getContext());
        this.a = imageView0;
        imageView0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bbml bbml0 = new bbml(this.getContext(), this);
        this.b = bbml0;
        bbml0.setAlpha(0xFF);
        this.a.setImageDrawable(this.b);
        this.a.setVisibility(8);
        this.addView(this.a);
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, zdd.f);
        switch(typedArray1.getInt(2, 0)) {
            case 0: {
                this.a(1);
                break;
            }
            case 1: {
                this.a(0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown size for IndeterminateMulticolorSpinner");
            }
        }
        int v1 = typedArray1.getResourceId(1, -1);
        if(v1 != -1) {
            int[] arr_v = context0.getResources().getIntArray(v1);
            this.b.a(arr_v);
        }
        switch(typedArray1.getInt(0, 0)) {
            case 0: {
                break;
            }
            case 1: {
                v = 4;
                break;
            }
            default: {
                v = 8;
            }
        }
        this.setVisibility(v);
        typedArray1.recycle();
    }

    private final void a(int v) {
        if(v != 0) {
            v = 1;
        }
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        if(v == 0) {
            int v1 = (int)(displayMetrics0.density * 56.0f);
            this.c = v1;
            this.d = v1;
        }
        else {
            int v2 = (int)(displayMetrics0.density * 40.0f);
            this.c = v2;
            this.d = v2;
        }
        this.a.setImageDrawable(null);
        this.b.c(v);
        this.a.setImageDrawable(this.b);
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getMeasuredWidth();
        int v5 = this.getMeasuredHeight();
        int v6 = v4 / 2;
        int v7 = this.a.getMeasuredWidth() / 2;
        int v8 = v5 / 2;
        int v9 = this.a.getMeasuredHeight() / 2;
        this.a.layout(v6 - v7, v8 - v9, v6 + v7, v8 + v9);
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0x40000000), View.MeasureSpec.makeMeasureSpec(this.d, 0x40000000));
        this.setMeasuredDimension(this.c + this.getPaddingStart() + this.getPaddingEnd(), this.d + this.getPaddingTop() + this.getPaddingBottom());
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        int v1 = 0;
        if(v != 0) {
        label_6:
            if(v != 0 && this.b.isRunning()) {
                this.b.stop();
            }
            v1 = v;
        }
        else if(!this.b.isRunning()) {
            this.b.start();
        }
        else {
            v = 0;
            goto label_6;
        }
        super.setVisibility(v1);
        this.a.setVisibility(v1);
    }
}

