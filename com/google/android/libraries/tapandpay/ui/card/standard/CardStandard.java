package com.google.android.libraries.tapandpay.ui.card.standard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import fttm;
import ftto;
import ggsc;
import ggsf;
import ibni;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class CardStandard extends fttm {
    public final ImageView g;
    private final ggsf h;

    public CardStandard(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public CardStandard(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public CardStandard(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.h = ggsf.b("com.google.android.libraries.tapandpay.ui.card.standard.CardStandard");
        MaterialCardView.inflate(context0, 0x7F0E01CB, this);  // layout:card_standard
        View view0 = this.findViewById(0x7F0B014E);  // id:CardBackground
        ibuq.e(view0, "findViewById(...)");
        this.g = (ImageView)view0;
        Drawable drawable0 = context0.getTheme().obtainStyledAttributes(attributeSet0, ftto.a, 0, 0).getDrawable(0);
        if(drawable0 != null) {
            super.i(drawable0);
        }
    }

    public CardStandard(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // fttm
    public final ImageView h() {
        return this.g;
    }

    public final void j(Drawable drawable0) {
        super.i(drawable0);
    }

    @Override  // com.google.android.material.card.MaterialCardView
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence charSequence0 = this.getContentDescription();
        if((charSequence0 == null || charSequence0.length() == 0) && this.isImportantForAccessibility()) {
            ((ggsc)this.h.i().ar(19009)).x("Setting a content description is required for CardStandard.");
        }
    }
}

