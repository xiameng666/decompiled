package com.google.android.libraries.tapandpay.ui.card.untokenized;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import fttm;
import fttp;
import funx;
import ibni;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class CardUntokenized extends fttm {
    public final TextView g;
    public final TextView h;
    private final ImageView i;
    private final ImageView j;
    private final ImageView k;

    public CardUntokenized(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public CardUntokenized(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public CardUntokenized(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        MaterialCardView.inflate(context0, 0x7F0E01CC, this);  // layout:card_untokenized
        View view0 = this.findViewById(0x7F0B014E);  // id:CardBackground
        ibuq.e(view0, "findViewById(...)");
        this.i = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B094E);  // id:UntokenizedCardTitle
        ibuq.e(view1, "findViewById(...)");
        this.g = (TextView)view1;
        View view2 = this.findViewById(0x7F0B094D);  // id:UntokenizedCardSubtitle
        ibuq.e(view2, "findViewById(...)");
        this.h = (TextView)view2;
        View view3 = this.findViewById(0x7F0B0551);  // id:LogoImage
        ibuq.e(view3, "findViewById(...)");
        this.j = (ImageView)view3;
        View view4 = this.findViewById(0x7F0B049C);  // id:IconImage
        ibuq.e(view4, "findViewById(...)");
        this.k = (ImageView)view4;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, fttp.a, 0, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        if(drawable0 != null) {
            super.i(drawable0);
        }
        Drawable drawable1 = typedArray0.getDrawable(2);
        if(drawable1 != null) {
            this.l(drawable1);
        }
        Drawable drawable2 = typedArray0.getDrawable(1);
        if(drawable2 != null) {
            ((ImageView)view4).setVisibility(0);
            ((ImageView)view4).setImageDrawable(drawable2);
            ((ImageView)view3).setVisibility(8);
        }
        String s = typedArray0.getString(4);
        if(s != null) {
            this.n(s);
        }
        String s1 = typedArray0.getString(3);
        if(s1 != null) {
            this.m(s1);
        }
    }

    public CardUntokenized(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
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
        return this.i;
    }

    public final void j() {
        this.j.setVisibility(8);
    }

    public final void k(Drawable drawable0) {
        super.i(drawable0);
    }

    public final void l(Drawable drawable0) {
        this.j.setVisibility(0);
        this.j.setImageDrawable(drawable0);
        this.k.setVisibility(8);
    }

    public final void m(String s) {
        ibuq.f(s, "cardString");
        funx.e(this.h, s);
    }

    public final void n(String s) {
        ibuq.f(s, "cardString");
        funx.e(this.g, s);
    }

    @Override  // android.view.View
    protected final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        float f = (float)(((double)v) * 0.046 / ((double)this.getResources().getDisplayMetrics().density));
        this.g.setTextSize(f);
        this.h.setTextSize(f);
    }
}

