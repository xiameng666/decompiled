package com.google.android.libraries.tapandpay.ui.rowsecondary.icon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import fryk;
import fryl;
import fuml;
import fump;
import fumq;
import ibni;
import ibtw;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class RowSecondaryIcon extends fuml {
    public final ImageView h;
    public final ImageView k;

    public RowSecondaryIcon(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public RowSecondaryIcon(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public RowSecondaryIcon(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        View view0 = this.findViewById(0x7F0B0823);  // id:StartIcon
        ibuq.e(view0, "findViewById(...)");
        this.h = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B0399);  // id:EndIcon
        ibuq.e(view1, "findViewById(...)");
        this.k = (ImageView)view1;
        new fumq(null, null, null, null, null, 0x3F);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, fump.a, 0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        if(drawable0 != null) {
            this.s(drawable0);
        }
        Drawable drawable1 = typedArray0.getDrawable(0);
        if(drawable1 != null) {
            this.q(drawable1);
        }
        this.setClipChildren(false);
        this.setClipToPadding(false);
    }

    public RowSecondaryIcon(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void g(fumq fumq0) {
        ibuq.f(fumq0.a, "state");
        this.setOnClickListener(fumq0.a.c);
        Context context0 = this.getContext();
        ibuq.e(context0, "getContext(...)");
        this.o(fumq0.a.a.a(context0));
        Context context1 = this.getContext();
        ibuq.e(context1, "getContext(...)");
        this.m(fumq0.a.b.a(context1).toString(), "null", false);
        RowSecondaryIcon.t(this.h, fumq0.b, fumq0.c, fumq0.e);
        RowSecondaryIcon.t(this.k, fumq0.d, null, fumq0.e);
    }

    public final void q(Drawable drawable0) {
        ibuq.f(drawable0, "icon");
        this.k.setVisibility(0);
        this.k.setImageDrawable(drawable0);
    }

    public final void r(int v) {
        Drawable drawable0 = this.getContext().getResources().getDrawable(v, this.getContext().getTheme());
        ibuq.e(drawable0, "getDrawable(...)");
        this.s(drawable0);
    }

    public final void s(Drawable drawable0) {
        ibuq.f(drawable0, "icon");
        this.h.setVisibility(0);
        this.h.setImageDrawable(drawable0);
    }

    private static final void t(ImageView imageView0, fryk fryk0, ColorStateList colorStateList0, ibtw ibtw0) {
        if(fryk0 == null) {
            imageView0.setVisibility(8);
            return;
        }
        if(colorStateList0 != null) {
            imageView0.setImageTintList(colorStateList0);
        }
        imageView0.setVisibility(0);
        fryl.a(imageView0, fryk0, ibtw0);
    }
}

