package com.google.android.gms.pay.pass.common.template.getpass;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import dskr;
import dsme;
import dsmx;
import dsmz;
import dssw;
import dssx;

public final class GetPassCardTemplate extends dskr {
    public GetPassCardTemplate(Context context0) {
        this(context0, null);
    }

    public GetPassCardTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public GetPassCardTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        CardHeaderTemplate cardHeaderTemplate0 = (CardHeaderTemplate)this.findViewById(0x7F0B0415);  // id:GetPassCardHeaderTemplate
    }

    @Override  // dskr
    protected final int a() {
        return 0x7F0E06EB;  // layout:pay_get_pass_card_template
    }

    @Override  // dskr
    protected final View b() {
        return this.findViewById(0x7F0B0279);  // id:DetailCardContents
    }

    @Override  // dskr
    protected final ImageView c() {
        return null;
    }

    @Override  // dskr
    protected final LinearLayout d() {
        return (LinearLayout)this.findViewById(0x7F0B0421);  // id:GetPassCardRowTemplatesContainer
    }

    @Override  // dskr
    protected final CardView e() {
        return (CardView)this.findViewById(0x7F0B0413);  // id:GetPassCard
    }

    @Override  // dskr
    protected final dsme f() {
        return (dsme)this.findViewById(0x7F0B0415);  // id:GetPassCardHeaderTemplate
    }

    @Override  // dskr
    protected final dsmx g(Context context0) {
        return new dssw(context0);
    }

    @Override  // dskr
    protected final dsmz h(Context context0) {
        return new dssx(context0);
    }
}

