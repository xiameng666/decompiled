package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import ibpw;
import ibuq;
import ibwl;
import ibwt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;
import sjw;
import sku;

public final class ExpandablePreference extends PreferenceGroup {
    public boolean d;
    public boolean e;
    private ImageView f;

    public ExpandablePreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public ExpandablePreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public ExpandablePreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public ExpandablePreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.e = true;
        this.C = sku.a(context0) ? 0x7F0E095D : 0x7F0E0971;  // layout:settingslib_expressive_preference
        this.D = 0x7F0E0978;  // layout:settingslib_widget_expandable_icon
    }

    public ExpandablePreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
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

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        oij0.v = false;
        oij0.w = false;
        this.f = (ImageView)oij0.D(0x7F0B133E);  // id:expand_icon
        this.an();
        oij0.a.setOnClickListener(new sjw(this));
    }

    @Override  // androidx.preference.PreferenceGroup
    protected final void al(Preference preference0) {
        ibuq.f(preference0, "preference");
        preference0.T(this.d);
        super.al(preference0);
    }

    @Override  // androidx.preference.PreferenceGroup
    public final void am(Preference preference0) {
        ibuq.f(preference0, "preference");
        preference0.T(this.d);
        super.am(preference0);
    }

    public final void an() {
        ImageView imageView0 = this.f;
        if(imageView0 != null) {
            imageView0.setRotation((this.d ? 180.0f : 0.0f));
        }
        if(this.e) {
            ibpw ibpw0 = ibwt.q(0, this.k()).e();
            while(((ibwl)ibpw0).a) {
                this.o(ibpw0.a()).T(this.d);
            }
            this.e = false;
        }
    }
}

