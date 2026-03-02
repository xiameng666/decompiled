package com.google.android.gms.pay.pass.idcard.model.template.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.pay.pass.common.template.detail.DetailCardTemplate;

public final class MdocCardTemplate extends DetailCardTemplate {
    public MdocCardTemplate(Context context0) {
        this(context0, null);
    }

    public MdocCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MdocCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailCardTemplate
    protected final int a() {
        return 0x7F0E070A;  // layout:pay_mdoc_card_template
    }

    public final MdocCardHeaderTemplate u() {
        return (MdocCardHeaderTemplate)this.f;
    }
}

