package com.google.android.gms.pay.pass.common.template.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bbcu;
import bboh;
import dokz;
import dsnx;
import dspp;
import fhwk;
import gfqx;
import gfsx;

public final class PreviewListTemplate extends FrameLayout {
    public static final bboh a;
    public final LinearLayout b;
    public dspp c;
    public dokz d;
    public gfsx e;
    public gfsx f;
    public dsnx g;
    public fhwk h;

    static {
        PreviewListTemplate.a = bboh.b("Pay", bbcu.cZ);
    }

    public PreviewListTemplate(Context context0) {
        this(context0, null);
    }

    public PreviewListTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PreviewListTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = gfqx.a;
        this.f = gfqx.a;
        PreviewListTemplate.inflate(context0, 0x7F0E0719, this);  // layout:pay_preview_list_template
        this.b = (LinearLayout)this.findViewById(0x7F0B06AC);  // id:PreviewListItemTemplatesContainer
    }
}

