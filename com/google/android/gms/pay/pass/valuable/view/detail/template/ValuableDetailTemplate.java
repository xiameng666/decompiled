package com.google.android.gms.pay.pass.valuable.view.detail.template;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import dskr;
import dtec;
import dvye;

public final class ValuableDetailTemplate extends DetailTemplate {
    public ValuableDetailTemplate(Context context0) {
        this(context0, null);
    }

    public ValuableDetailTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ValuableDetailTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final dskr a() {
        return new ValuableDetailCardTemplate(this.getContext());
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final dtec c() {
        return new dvye(this.getContext());
    }
}

