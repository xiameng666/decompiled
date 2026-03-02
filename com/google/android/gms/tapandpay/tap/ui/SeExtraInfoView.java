package com.google.android.gms.tapandpay.tap.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SeExtraInfoView extends ScrollView {
    public SeExtraInfoView(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public SeExtraInfoView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public SeExtraInfoView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(0x7F0E0BBF, this, true);  // layout:tp_tap_se_extra_info_view
    }

    public SeExtraInfoView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }
}

