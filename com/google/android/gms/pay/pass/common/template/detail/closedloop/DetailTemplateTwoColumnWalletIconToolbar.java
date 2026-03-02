package com.google.android.gms.pay.pass.common.template.detail.closedloop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import dskk;
import dsrt;
import fshe;
import gucv;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DetailTemplateTwoColumnWalletIconToolbar extends DetailTemplate {
    public DetailTemplateTwoColumnWalletIconToolbar(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public DetailTemplateTwoColumnWalletIconToolbar(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public DetailTemplateTwoColumnWalletIconToolbar(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
    }

    public DetailTemplateTwoColumnWalletIconToolbar(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final int b() {
        return 0x7F0E0CF6;  // layout:wallet_detail_template_two_column_wallet_icon_toolbar
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final void d(boolean z) {
        View view0 = this.findViewById(0x7F0B029D);  // id:DetailItemTemplatesContainerAdditional
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final void q(gucv gucv0, dskk dskk0, fshe fshe0) {
        ibuq.f(gucv0, "templateInfo");
        ibuq.f(dskk0, "passTargetCallback");
        ibuq.f(fshe0, "dynamicFormattedValueCallback");
        View view0 = this.findViewById(0x7F0B09F1);  // id:WearOobeAppBar
        ibuq.e(view0, "findViewById(...)");
        view0.setVisibility(0);
        View view1 = this.findViewById(0x7F0B09F2);  // id:WearOobeBackButton
        ibuq.c(view1);
        view1.setVisibility(0);
        view1.setOnClickListener(new dsrt(this));
    }
}

