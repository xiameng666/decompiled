package com.google.android.gms.ads.identifier.settings;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.view.MotionEvent;
import gmiv;
import gmiw;
import gmja;
import gmjg;

public final class x implements ab {
    public final ac a;
    public final String b;
    public final MotionEvent c;
    public final MotionEvent d;

    public x(ac ac0, String s, MotionEvent motionEvent0, MotionEvent motionEvent1) {
        this.a = ac0;
        this.b = s;
        this.c = motionEvent0;
        this.d = motionEvent1;
    }

    @Override  // com.google.android.gms.ads.identifier.settings.ab
    public final void a(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmiv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = this.a.g(this.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmiv gmiv0 = (gmiv)hftp1.b_message;
        gmiw gmiw0 = (gmiw)hftp2.N_build();
        gmiw0.getClass();
        gmiv0.c = gmiw0;
        gmiv0.b |= 1;
        ProtoLiteBuilder hftp3 = ac.h(this.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmiv gmiv1 = (gmiv)hftp1.b_message;
        gmjg gmjg0 = (gmjg)hftp3.N_build();
        gmjg0.getClass();
        gmiv1.e = gmjg0;
        gmiv1.b |= 4;
        ProtoLiteBuilder hftp4 = ac.h(this.d);
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
        ((gmiv)hftp1.b_message).f = 2;
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

