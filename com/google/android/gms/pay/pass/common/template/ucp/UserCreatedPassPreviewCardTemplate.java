package com.google.android.gms.pay.pass.common.template.ucp;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.pay.pass.valuable.view.detail.template.ValuableDetailCardTemplate;
import ibuq;

public final class UserCreatedPassPreviewCardTemplate extends ValuableDetailCardTemplate {
    public UserCreatedPassPreviewCardTemplate(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null);
    }

    public UserCreatedPassPreviewCardTemplate(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0);
    }

    public UserCreatedPassPreviewCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
    }
}

