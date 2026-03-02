package com.google.android.personalsafety.settings.autolock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import ibuq;
import jxk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;

public final class MultilineSummaryPreferenceCategory extends PreferenceCategory {
    public MultilineSummaryPreferenceCategory(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public MultilineSummaryPreferenceCategory(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public MultilineSummaryPreferenceCategory(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public MultilineSummaryPreferenceCategory(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
    }

    public MultilineSummaryPreferenceCategory(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            v = jxk.b(context0, 0x7F0409D8, 0x101008C);  // attr:preferenceCategoryStyle
        }
        if((v2 & 2) != 0) {
            attributeSet0 = null;
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
        View view0 = oij0.D(0x1020010);
        TextView textView0 = (view0 instanceof TextView) ? ((TextView)view0) : null;
        if(textView0 == null) {
            return;
        }
        textView0.setSingleLine(false);
    }
}

