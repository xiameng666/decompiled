package com.google.android.gms.pay.pass.idcard.model.template.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.google.android.gms.pay.pass.common.template.detail.CardHeaderTemplate;
import jsr;

public final class MdocCardHeaderTemplate extends CardHeaderTemplate {
    public MdocCardHeaderTemplate(Context context0) {
        this(context0, null);
    }

    public MdocCardHeaderTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MdocCardHeaderTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.CardHeaderTemplate
    protected final int a() {
        return 0x7F0E0709;  // layout:pay_mdoc_card_header_template
    }

    public final void m() {
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(0x7F0B029C);  // id:DetailCardTitleContainer
        jsr jsr0 = (jsr)linearLayout0.getLayoutParams();
        if(jsr0 == null) {
            return;
        }
        int v = (int)TypedValue.applyDimension(1, 24.0f, this.getResources().getDisplayMetrics());
        jsr0.setMargins(jsr0.leftMargin, v, jsr0.rightMargin, v);
        linearLayout0.setLayoutParams(jsr0);
    }
}

