package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import androidx.preference.Preference;
import ibuq;
import jxk;
import oij;

public final class SpacePreference extends Preference {
    private final int a;

    public SpacePreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        int v = jxk.b(context0, 0x7F0409E0, 0x101008E);  // attr:preferenceStyle
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, 0);
        this.C = 0x7F0E0A03;  // layout:space_preference
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100F5}, v, 0);
        this.a = typedArray0.getDimensionPixelSize(0, 0);
        typedArray0.recycle();
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ibuq.f(oij0, "view");
        super.a(oij0);
        oij0.w = false;
        oij0.v = false;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, this.a);
        oij0.a.setLayoutParams(viewGroup$LayoutParams0);
    }
}

