package com.google.android.gms.auth.uiflows.common;

import ajcc;
import ajcd;
import ajcg;
import ameh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.google.android.setupdesign.SetupWizardLayout;
import gafo;

public class SetupWizardAuthAccountLayout extends SetupWizardLayout implements ajcd, ajcg {
    public SetupWizardAuthAccountLayout(Context context0) {
        this(context0, null);
    }

    public SetupWizardAuthAccountLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SetupWizardAuthAccountLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater.from(this.getContext()).inflate(0x7F0E012C, this);  // layout:auth_setup_wizard_auth_account_layout
    }

    @Override  // ajcd
    public final void a(boolean z) {
        this.p().b.setVisibility((z ? 0 : 8));
    }

    @Override  // ajcd
    public final void c(int v) {
    }

    @Override  // ajcd
    public final void d(ajcc ajcc0) {
        this.p().a(new ameh(this, ajcc0));
    }

    @Override  // ajcd
    public final void e(CharSequence charSequence0) {
        ((TextView)this.findViewById(0x7F0B18F0)).setText(charSequence0);  // id:message
    }

    @Override  // ajcd
    public final void f() {
    }

    @Override  // ajcd
    public final void g() {
        this.p().a.setEnabled(false);
    }

    @Override  // ajcd
    public final void h() {
        this.w(true);
    }

    @Override  // ajcg
    public final void i(Window window0, Context context0) {
        ((gafo)this.t(gafo.class)).b(window0, context0);
    }

    @Override  // ajcg
    public final void j(Window window0) {
        gafo gafo0 = (gafo)this.t(gafo.class);
        gafo.c(window0);
    }

    @Override  // ajcg
    public final void k(Window window0) {
        this.j(window0);
    }
}

