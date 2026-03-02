package com.google.android.gms.pay.pass.common.template.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import dsme;
import hwev;

public class CardHeaderTemplate extends dsme {
    public final ImageView a;
    public static final int b;

    public CardHeaderTemplate(Context context0) {
        this(context0, null);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CardHeaderTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B01D7);  // id:CloseIcon
        this.a = imageView0;
        imageView0.setImageResource(0x7F080B26);  // drawable:quantum_gm_ic_close_vd_theme_24
        imageView0.setVisibility(8);
    }

    @Override  // dsme
    protected final int a() {
        return hwev.c() ? 0x7F0E0CA0 : 0x7F0E065F;  // layout:wallet_barcode_card_header_template
    }

    @Override  // dsme
    protected final View b() {
        return null;
    }

    @Override  // dsme
    protected final ImageView c() {
        return (ImageView)this.findViewById(0x7F0B04E1);  // id:IssuerLogo
    }

    @Override  // dsme
    protected final ImageView d() {
        return null;
    }

    @Override  // dsme
    protected final TextView e() {
        return null;
    }

    @Override  // dsme
    protected final TextView f() {
        return (TextView)this.findViewById(0x7F0B0857);  // id:SubtitleText
    }

    @Override  // dsme
    protected final TextView g() {
        return (TextView)this.findViewById(0x7F0B08C5);  // id:TitleText
    }

    @Override  // dsme
    protected final TextView h() {
        return (TextView)this.findViewById(0x7F0B08C1);  // id:TitleLabelText
    }
}

