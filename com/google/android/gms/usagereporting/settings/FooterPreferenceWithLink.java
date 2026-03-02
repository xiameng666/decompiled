package com.google.android.gms.usagereporting.settings;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.settingslib.widget.FooterPreference;
import oij;

public final class FooterPreferenceWithLink extends FooterPreference {
    public FooterPreferenceWithLink(Context context0) {
        super(context0);
    }

    public FooterPreferenceWithLink(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // com.android.settingslib.widget.FooterPreference
    public final void a(oij oij0) {
        super.a(oij0);
        ((TextView)oij0.a.findViewById(0x1020016)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}

