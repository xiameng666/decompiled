package com.google.android.setupdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gaic;
import gaid;
import gaiw;

public class SetupWizardListLayout extends SetupWizardLayout {
    private gaic a;

    public SetupWizardListLayout(Context context0) {
        this(context0, 0, 0);
    }

    public SetupWizardListLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public SetupWizardListLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.a(null, 0);
    }

    public SetupWizardListLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a(attributeSet0, 0);
    }

    public SetupWizardListLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a(attributeSet0, v);
    }

    private final void a(AttributeSet attributeSet0, int v) {
        if(this.isInEditMode()) {
            return;
        }
        gaic gaic0 = new gaic(this, attributeSet0, v);
        this.a = gaic0;
        this.v(gaic.class, gaic0);
        gaiw gaiw0 = (gaiw)this.t(gaiw.class);
        gaiw0.c = new gaid(gaiw0, this.a.a());
    }

    @Override  // com.google.android.setupdesign.SetupWizardLayout
    protected final View l(LayoutInflater layoutInflater0, int v) {
        if(v == 0) {
            v = 0x7F0E0AAB;  // layout:sud_list_template
        }
        return super.l(layoutInflater0, v);
    }

    @Override  // com.google.android.setupdesign.SetupWizardLayout
    protected final ViewGroup m(int v) {
        if(v == 0) {
            v = 0x102000A;
        }
        return super.m(v);
    }

    @Override  // android.widget.FrameLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a.b();
    }
}

