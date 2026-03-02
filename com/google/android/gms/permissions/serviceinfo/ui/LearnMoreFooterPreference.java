package com.google.android.gms.permissions.serviceinfo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import cmeb;
import cmec;
import com.android.settingslib.widget.FooterPreference;
import ibuq;
import oij;

public class LearnMoreFooterPreference extends FooterPreference {
    public cmeb c;
    public cmec d;

    public LearnMoreFooterPreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null);
    }

    public LearnMoreFooterPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
    }

    @Override  // com.android.settingslib.widget.FooterPreference
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.a.findViewById(0x7F0B1FEF);  // id:settingslib_learn_more
        ibuq.e(view0, "findViewById(...)");
        cmec cmec0 = this.d;
        if(cmec0 == null) {
            ibuq.j("gmsCoreMetrics");
            cmec0 = null;
        }
        cmeb cmeb0 = cmec0.b(view0, 0x26C6C);
        cmeb0.f();
        this.c = cmeb0;
    }
}

