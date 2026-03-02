package com.google.android.gms.pay.pass.common.template.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bbcu;
import bboh;
import dokz;
import dspp;

public final class DialogTemplate extends FrameLayout {
    public static final bboh a;
    public final LinearLayout b;
    public dspp c;
    public dokz d;

    static {
        DialogTemplate.a = bboh.b("Pay", bbcu.cZ);
    }

    public DialogTemplate(Context context0) {
        this(context0, null);
    }

    public DialogTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public DialogTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        DialogTemplate.inflate(context0, 0x7F0E06BC, this);  // layout:pay_dialog_template
        this.b = (LinearLayout)this.findViewById(0x7F0B0351);  // id:DialogTemplatesContainer
    }
}

