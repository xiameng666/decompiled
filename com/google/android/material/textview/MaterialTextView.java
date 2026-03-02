package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import fyse;
import fysf;
import fzap;
import fzaq;
import kim;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context0) {
        this(context0, null);
    }

    public MaterialTextView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public MaterialTextView(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0), attributeSet0, v);
        this.c(attributeSet0, v, 0);
    }

    @Deprecated
    public MaterialTextView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(fzaq.a(context0, attributeSet0, v, v1), attributeSet0, v);
        this.c(attributeSet0, v, v1);
    }

    private static int a(Context context0, TypedArray typedArray0, int[] arr_v) {
        int v1 = -1;
        for(int v = 0; v < 2 && v1 < 0; ++v) {
            v1 = fysf.b(context0, typedArray0, arr_v[v], -1);
        }
        return v1;
    }

    private final void b(Resources.Theme resources$Theme0, int v) {
        TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(v, fzap.a);
        int v1 = MaterialTextView.a(this.getContext(), typedArray0, new int[]{2, 4});
        typedArray0.recycle();
        if(v1 >= 0) {
            kim.c(this, v1);
        }
    }

    private final void c(AttributeSet attributeSet0, int v, int v1) {
        Context context0 = this.getContext();
        if(MaterialTextView.d(context0)) {
            Resources.Theme resources$Theme0 = context0.getTheme();
            int[] arr_v = fzap.b;
            TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
            int v2 = MaterialTextView.a(context0, typedArray0, new int[]{1, 2});
            typedArray0.recycle();
            if(v2 == -1) {
                TypedArray typedArray1 = resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
                int v3 = typedArray1.getResourceId(0, -1);
                typedArray1.recycle();
                if(v3 != -1) {
                    this.b(resources$Theme0, v3);
                }
            }
        }
    }

    private static boolean d(Context context0) {
        return fyse.g(context0, 0x7F040D0B, true);  // attr:textAppearanceLineHeightEnabled
    }

    @Override  // android.support.v7.widget.AppCompatTextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        if(MaterialTextView.d(context0)) {
            this.b(context0.getTheme(), v);
        }
    }
}

