package com.google.android.gms.pay.secard.view.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import bbcu;
import bboh;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import dskr;
import dsmi;
import eapb;
import eapc;
import eapd;
import eape;
import eapm;
import ggtj;
import gupr;
import gups;
import j..util.Objects;
import j..util.Optional;

public final class SePrepaidDetailTemplate extends DetailTemplate {
    public Optional a;
    public Optional e;
    public Optional f;
    private static final bboh g;

    static {
        SePrepaidDetailTemplate.g = bboh.b("Pay", bbcu.cZ);
    }

    public SePrepaidDetailTemplate(Context context0) {
        this(context0, null);
    }

    public SePrepaidDetailTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SePrepaidDetailTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final dskr a() {
        dskr dskr0 = new eapb(this.getContext());
        if(this.a.isPresent()) {
            ((eapb)dskr0).setOnClickListener(((View.OnClickListener)this.a.get()));
        }
        if(this.f.isPresent()) {
            ((eapb)dskr0).setContentDescription(((CharSequence)this.f.get()));
        }
        if(this.e.isPresent()) {
            dskr0.a = Optional.of(this.e.get());
        }
        return dskr0;
    }

    @Override  // com.google.android.gms.pay.pass.common.template.detail.DetailTemplate
    protected final dsmi e(gups gups0) {
        int v = gups0.c;
        if(gupr.a(v) != gupr.a) {
            ((ggtj)SePrepaidDetailTemplate.g.j()).B("Creating WalletCardTemplate with unsupported card content case: %s, using default version.", gupr.a(v));
        }
        dsmi dsmi0 = new eapm(this.getContext());
        Optional optional0 = this.a;
        Objects.requireNonNull(dsmi0);
        optional0.ifPresent(new eapc(((eapm)dsmi0)));
        Optional optional1 = this.f;
        Objects.requireNonNull(dsmi0);
        optional1.ifPresent(new eapd(((eapm)dsmi0)));
        Optional optional2 = this.e;
        Objects.requireNonNull(dsmi0);
        optional2.ifPresent(new eape(((eapm)dsmi0)));
        return dsmi0;
    }
}

