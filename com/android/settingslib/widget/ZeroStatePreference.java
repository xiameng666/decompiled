package com.android.settingslib.widget;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.preference.Preference;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;
import sjy;

public final class ZeroStatePreference extends Preference implements sjy {
    private final int a;
    private Drawable b;
    private int c;

    public ZeroStatePreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public ZeroStatePreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public ZeroStatePreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public ZeroStatePreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.a = context0.getColor(0x7F061061);  // color:settingslib_materialColorOnSurface
        this.c = -2;
        this.N(false);
        this.C = 0x7F0E0967;  // layout:settingslib_expressive_preference_zerostate
        this.k();
    }

    public ZeroStatePreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
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
    public final void I(int v) {
        super.I(v);
        this.k();
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.a;
        view0.setFocusable(false);
        view0.setClickable(false);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        viewGroup$LayoutParams0.height = this.c;
        View view1 = oij0.D(0x1020006);
        ImageView imageView0 = (view1 instanceof ImageView) ? ((ImageView)view1) : null;
        if(imageView0 != null) {
            imageView0.setImageDrawable((this.b == null ? this.q() : this.b));
        }
    }

    private final void k() {
        Drawable drawable0 = this.q();
        if(drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            drawable1.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.SRC_IN));
            this.b = drawable1;
        }
    }
}

