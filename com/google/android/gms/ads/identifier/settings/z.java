package com.google.android.gms.ads.identifier.settings;

import ProtoLiteBuilder;
import gmja;
import gmjd;

public final class z implements ab {
    public final ProtoLiteBuilder a;

    public z(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // com.google.android.gms.ads.identifier.settings.ab
    public final void a(ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmja gmja0 = (gmja)hftp0.b_message;
        gmjd gmjd0 = (gmjd)this.a.N_build();
        gmjd0.getClass();
        gmja0.d = gmjd0;
        gmja0.c = 9;
    }
}

