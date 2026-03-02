package com.google.android.libraries.tapandpay.ui.objecteducation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fryh;
import fryk;
import fryu;
import fryv;
import ftxr;
import fulr;
import gze;
import ibni;
import ibth;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ObjectEducation extends ConstraintLayout {
    private final ComposeView h;
    private ftxr i;

    public ObjectEducation(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ObjectEducation(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ObjectEducation(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E0612, this);  // layout:object_education_container
        View view0 = this.findViewById(0x7F0B060A);  // id:ObjectEducationContainer
        ibuq.e(view0, "findViewById(...)");
        this.h = (ComposeView)view0;
        this.i = new ftxr(new fryh(0), new fryu(""), new fryu(""), new fryu(""), null);
    }

    public ObjectEducation(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void g(ftxr ftxr0) {
        this.i = ftxr0;
        gze gze0 = new gze(0xBE03AC80, true, new fulr(ftxr0));
        this.h.a(gze0);
    }

    @ibni
    public final void h(fryv fryv0) {
        this.g(ftxr.a(this.i, null, null, null, fryv0, null, 0x6F));
    }

    @ibni
    public final void i(fryk fryk0) {
        this.g(ftxr.a(this.i, fryk0, null, null, null, null, 0x7C));
    }

    public final void j(ibth ibth0) {
        this.g(ftxr.a(this.i, null, null, null, null, ibth0, 0x3F));
    }

    @ibni
    public final void k(fryv fryv0) {
        this.g(ftxr.a(this.i, null, null, fryv0, null, null, 0x77));
    }

    @ibni
    public final void l(fryv fryv0) {
        this.g(ftxr.a(this.i, null, fryv0, null, null, null, 0x7B));
    }
}

