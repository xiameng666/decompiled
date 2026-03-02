package com.google.android.gms.pay.pass.common.template.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import dsme;
import dtms;
import hwev;

public class CardHeaderTemplate extends dsme {
    public CardHeaderTemplate(Context context0) {
        this(context0, null);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        dtms.b(((ImageView)this.findViewById(0x7F0B027C)), context0.getResources().getDimensionPixelSize(0x7F070E05));  // id:DetailCardHeaderLogo
    }

    @Override  // dsme
    protected int a() {
        return hwev.c() ? 0x7F0E0CBD : 0x7F0E0CBE;  // layout:wallet_detail_card_header_template
    }

    @Override  // dsme
    protected final View b() {
        return this.findViewById(0x7F0B027A);  // id:DetailCardHeaderDivider
    }

    @Override  // dsme
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B027C);  // id:DetailCardHeaderLogo
    }

    @Override  // dsme
    protected final ImageView d() {
        return (ImageView)this.findViewById(0x7F0B0282);  // id:DetailCardHeaderWideLogo
    }

    @Override  // dsme
    protected final TextView e() {
        return (TextView)this.findViewById(0x7F0B027B);  // id:DetailCardHeaderEndTitleLabel
    }

    @Override  // dsme
    protected final TextView f() {
        return (TextView)this.findViewById(0x7F0B027D);  // id:DetailCardHeaderSubtitle
    }

    @Override  // dsme
    protected final TextView g() {
        return (TextView)this.findViewById(0x7F0B0280);  // id:DetailCardHeaderTitle
    }

    @Override  // dsme
    protected final TextView h() {
        return (TextView)this.findViewById(0x7F0B0281);  // id:DetailCardHeaderTitleLabel
    }
}

