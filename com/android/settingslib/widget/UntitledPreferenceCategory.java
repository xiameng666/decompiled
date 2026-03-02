package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceCategory;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;
import sku;

public final class UntitledPreferenceCategory extends PreferenceCategory {
    public UntitledPreferenceCategory(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public UntitledPreferenceCategory(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public UntitledPreferenceCategory(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public UntitledPreferenceCategory(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.C = sku.a(context0) ? 0x7F0E096C : 0x7F0E0977;  // layout:settingslib_expressive_untitled_preference_category
    }

    public UntitledPreferenceCategory(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.preference.PreferenceCategory
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        oij0.v = false;
        oij0.w = false;
    }
}

