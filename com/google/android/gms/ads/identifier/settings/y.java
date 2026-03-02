package com.google.android.gms.ads.identifier.settings;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.view.VerifiedMotionEvent;
import gmiv;
import gmiw;
import gmja;
import gmjg;

public final class y implements ab {
    public final ac a;
    public final String b;
    public final int c;
    public final VerifiedMotionEvent d;
    public final VerifiedMotionEvent e;

    public y(ac ac0, String s, int v, VerifiedMotionEvent verifiedMotionEvent0, VerifiedMotionEvent verifiedMotionEvent1) {
        this.a = ac0;
        this.b = s;
        this.c = v;
        this.d = verifiedMotionEvent0;
        this.e = verifiedMotionEvent1;
    }

    @Override  // com.google.android.gms.ads.identifier.settings.ab
    public final void a(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmiv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = this.a.f(this.b, this.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmiv gmiv0 = (gmiv)hftp1.b_message;
        gmiw gmiw0 = (gmiw)hftp2.N_build();
        gmiw0.getClass();
        gmiv0.c = gmiw0;
        gmiv0.b |= 1;
        ProtoLiteBuilder hftp3 = ac.i(this.d);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmiv gmiv1 = (gmiv)hftp1.b_message;
        gmjg gmjg0 = (gmjg)hftp3.N_build();
        gmjg0.getClass();
        gmiv1.e = gmjg0;
        gmiv1.b |= 4;
        ProtoLiteBuilder hftp4 = ac.i(this.e);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmiv gmiv2 = (gmiv)hftp1.b_message;
        gmjg gmjg1 = (gmjg)hftp4.N_build();
        gmjg1.getClass();
        gmiv2.d = gmjg1;
        gmiv2.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gmiv)hftp1.b_message).f = 1;
        ((gmiv)hftp1.b_message).b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmja gmja0 = (gmja)hftp0.b_message;
        gmiv gmiv3 = (gmiv)hftp1.N_build();
        gmiv3.getClass();
        gmja0.d = gmiv3;
        gmja0.c = 10;
    }
}

