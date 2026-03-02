package com.google.android.gms.backup.settings.devicedata.intropreference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.preference.Preference;
import com.android.settingslib.widget.CollapsableTextView;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;
import sjy;

public final class IntroPreference extends Preference implements sjy {
    public View.OnClickListener a;
    public CharSequence b;
    private boolean c;
    private int d;

    public IntroPreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public IntroPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public IntroPreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public IntroPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.c = true;
        this.d = 1;
        this.C = 0x7F0E017F;  // layout:backup_settings_devicedata_preference_intro
        this.N(false);
    }

    public IntroPreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
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
        int v = 0;
        oij0.w = false;
        oij0.v = false;
        View view0 = oij0.D(0x7F0B0F27);  // id:collapsable_summary
        CollapsableTextView collapsableTextView0 = (view0 instanceof CollapsableTextView) ? ((CollapsableTextView)view0) : null;
        if(collapsableTextView0 != null) {
            collapsableTextView0.g(this.c);
            collapsableTextView0.j(this.d);
            CharSequence charSequence0 = this.m();
            if(charSequence0 == null || charSequence0.length() == 0) {
                v = 8;
            }
            collapsableTextView0.setVisibility(v);
            collapsableTextView0.k(String.valueOf(this.m()));
            if(this.a != null) {
                collapsableTextView0.i(this.b);
                collapsableTextView0.h(this.a);
            }
        }
    }

    public final void k() {
        this.c = false;
        this.d = 10;
        this.d();
    }
}

