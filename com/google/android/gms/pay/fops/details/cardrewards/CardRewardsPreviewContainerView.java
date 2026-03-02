package com.google.android.gms.pay.fops.details.cardrewards;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CardRewardsPreviewContainerView extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final ComposeCardRewardsPreview c;
    public final TextView d;

    public CardRewardsPreviewContainerView(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public CardRewardsPreviewContainerView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public CardRewardsPreviewContainerView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        View view0 = LinearLayout.inflate(context0, 0x7F0E01CA, this);  // layout:card_rewards_preview
        View view1 = view0.findViewById(0x7F0B0182);  // id:CardRewardsPreviewTitle
        ibuq.e(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0183);  // id:CardRewardsPreviewTitleNonBc25
        ibuq.e(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0181);  // id:CardRewardsPreviewTip
        ibuq.e(view3, "findViewById(...)");
        this.c = (ComposeCardRewardsPreview)view3;
        View view4 = view0.findViewById(0x7F0B0180);  // id:CardRewardsPreviewFooter
        ibuq.e(view4, "findViewById(...)");
        TextView textView0 = (TextView)view4;
        this.d = textView0;
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public CardRewardsPreviewContainerView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }
}

