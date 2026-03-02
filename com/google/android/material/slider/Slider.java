package com.google.android.material.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import fywn;

public class Slider extends fywn {
    public Slider(Context context0) {
        this(context0, null);
    }

    public Slider(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040B12);  // attr:sliderStyle
    }

    public Slider(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x1010024});
        if(typedArray0.hasValue(0)) {
            this.G(typedArray0.getFloat(0, 0.0f));
        }
        typedArray0.recycle();
    }

    @Override  // fywn
    protected final void E() {
        if(this.i != -1) {
            return;
        }
        this.i = 0;
    }

    public final float F() {
        return (float)(((Float)this.d().get(0)));
    }

    public final void G(float f) {
        this.v(new Float[]{f});
    }
}

