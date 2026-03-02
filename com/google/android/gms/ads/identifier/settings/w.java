package com.google.android.gms.ads.identifier.settings;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import gmiw;
import gmja;
import gmje;
import hfrj;
import hftc;

public final class w implements ab {
    public final ac a;
    public final String b;
    public final int c;
    public final byte[] d;

    public w(ac ac0, String s, int v, byte[] arr_b) {
        this.a = ac0;
        this.b = s;
        this.c = v;
        this.d = arr_b;
    }

    @Override  // com.google.android.gms.ads.identifier.settings.ab
    public final void a(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmje.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = this.a.f(this.b, this.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmje gmje0 = (gmje)hftp1.b_message;
        gmiw gmiw0 = (gmiw)hftp2.N_build();
        gmiw0.getClass();
        gmje0.c = gmiw0;
        gmje0.b |= 1;
        hftc hftc0 = hftc.a();
        hfrj hfrj0 = hftp1.A(this.d, hftc0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmja gmja0 = (gmja)hftp0.b_message;
        gmje gmje1 = (gmje)((ProtoLiteBuilder)hfrj0).N_build();
        gmje1.getClass();
        gmja0.d = gmje1;
        gmja0.c = 11;
    }
}

