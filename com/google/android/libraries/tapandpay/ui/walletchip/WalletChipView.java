package com.google.android.libraries.tapandpay.ui.walletchip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fujt;
import funm;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class WalletChipView extends ConstraintLayout {
    public final ComposeView h;

    public WalletChipView(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public WalletChipView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public WalletChipView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E0CB0, this);  // layout:wallet_chip_container
        View view0 = this.findViewById(0x7F0B09A3);  // id:WalletChipContainer
        ibuq.e(view0, "findViewById(...)");
        this.h = (ComposeView)view0;
        new fujt(new funm());
    }

    public WalletChipView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }
}

