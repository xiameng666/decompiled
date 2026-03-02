package com.google.android.gms.pay.widget.componentlayouts;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DropdownIcon extends AppCompatImageView {
    public boolean a;

    public DropdownIcon(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public DropdownIcon(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public DropdownIcon(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.setBackgroundResource(0x7F080D29);  // drawable:quantum_ic_expand_more_vd_theme_24
    }

    public DropdownIcon(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a() {
        this.a = false;
        this.setBackgroundResource(0x7F080D29);  // drawable:quantum_ic_expand_more_vd_theme_24
    }

    public final void b() {
        this.a = true;
        this.setBackgroundResource(0x7F080D27);  // drawable:quantum_ic_expand_less_vd_theme_24
    }
}

