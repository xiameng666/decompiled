package com.google.android.gms.pay.pass.valuable.view.detail.template;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.pay.pass.common.template.detail.DetailCardTemplate;
import com.google.android.material.card.MaterialCardView;
import dskk;
import fipx;
import fshg;
import gfqx;
import gubi;
import gucl;
import hwev;
import jxm;

public class ValuableDetailCardTemplate extends DetailCardTemplate {
    public ValuableDetailCardTemplate(Context context0) {
        this(context0, null);
    }

    public ValuableDetailCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ValuableDetailCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailCardTemplate
    protected final int a() {
        return hwev.c() ? 0x7F0E0DE4 : 0x7F0E0DE5;  // layout:wallet_valuable_detail_card_template
    }

    @Override  // dskr
    public final void p(gucl gucl0, gubi gubi0, fshg fshg0, dskk dskk0) {
        this.r(gucl0, gubi0, fshg0, dskk0, gfqx.a);
        Context context0 = this.getContext();
        if(context0 != null && hwev.c()) {
            ((MaterialCardView)this.findViewById(0x7F0B0276)).G(jxm.g(fipx.a(context0, 0x7F04030A), 0x80));  // id:DetailCard
        }
    }
}

