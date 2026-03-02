package com.google.android.libraries.tapandpay.ui.card.credit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import fipx;
import fttm;
import fttn;
import ibni;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class CardCredit extends fttm {
    public final ImageView g;
    public final TextView h;

    public CardCredit(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public CardCredit(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public CardCredit(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        MaterialCardView.inflate(context0, 0x7F0E01C6, this);  // layout:card_credit
        View view0 = this.findViewById(0x7F0B014E);  // id:CardBackground
        ibuq.e(view0, "findViewById(...)");
        this.g = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B024C);  // id:CreditCardText
        ibuq.e(view1, "findViewById(...)");
        this.h = (TextView)view1;
        ((TextView)view1).setShadowLayer(1.0f, 0.0f, 1.0f, fipx.a(context0, 0x7F040A8F));  // attr:scrimBackground
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, fttn.a, 0, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        if(drawable0 != null) {
            super.i(drawable0);
        }
        String s = typedArray0.getString(1);
        if(s != null) {
            this.j(s);
        }
    }

    public CardCredit(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // fttm
    @ibni
    public final ImageView h() {
        return this.g;
    }

    public final void j(String s) {
        ibuq.f(s, "cardString");
        this.h.setText(s);
        this.h.setVisibility(0);
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        double f = ((double)v) * 0.046 / ((double)this.getResources().getDisplayMetrics().density);
        this.h.setTextSize(((float)f));
    }
}

