package com.google.android.gms.libs.layoutpreference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.preference.Preference;
import cjcl;
import oij;

public final class LayoutPreference extends Preference {
    private boolean a;
    private boolean b;
    private final View c;

    public LayoutPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LayoutPreference(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, cjcl.a);
        this.a = typedArray0.getBoolean(16, false);
        this.b = typedArray0.getBoolean(17, false);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, cjcl.a, v, 0);
        int v1 = typedArray1.getResourceId(3, 0);
        if(v1 == 0) {
            throw new IllegalArgumentException("LayoutPreference requires a layout to be defined");
        }
        typedArray1.recycle();
        View view0 = LayoutInflater.from(context0).inflate(v1, null, false);
        this.C = 0x7F0E0511;  // layout:layout_preference_frame
        this.c = view0;
        this.O(false);
    }

    LayoutPreference(Context context0, View view0) {
        super(context0);
        this.C = 0x7F0E0511;  // layout:layout_preference_frame
        this.c = view0;
        this.O(false);
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        boolean z = this.v;
        View view0 = oij0.a;
        view0.setFocusable(z);
        view0.setClickable(z);
        oij0.v = this.a;
        oij0.w = this.b;
        ((FrameLayout)view0).removeAllViews();
        View view1 = this.c;
        ViewGroup viewGroup0 = (ViewGroup)view1.getParent();
        if(viewGroup0 != null) {
            viewGroup0.removeView(view1);
        }
        ((FrameLayout)view0).addView(view1);
    }

    public final View k(int v) {
        return this.c.getId() == v ? this.c : this.c.findViewById(v);
    }
}

