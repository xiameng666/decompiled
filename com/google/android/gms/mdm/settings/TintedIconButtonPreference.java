package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.android.settingslib.widget.ButtonPreference;
import oij;

public final class TintedIconButtonPreference extends ButtonPreference {
    private Drawable b;

    public TintedIconButtonPreference(Context context0) {
        super(context0);
    }

    public TintedIconButtonPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public TintedIconButtonPreference(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public TintedIconButtonPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this(context0, attributeSet0, v);
    }

    @Override  // com.android.settingslib.widget.ButtonPreference
    public final void J(Drawable drawable0) {
        super.J(drawable0);
        this.b = drawable0;
    }

    @Override  // com.android.settingslib.widget.ButtonPreference
    public final void a(oij oij0) {
        super.a(oij0);
        Drawable drawable0 = this.b;
        Button button0 = this.a;
        if(drawable0 != null && button0 != null) {
            drawable0.setTint(button0.getCurrentTextColor());
        }
    }
}

