package com.google.android.gms.ads.nonagon.clearcut;

import ProtoLiteBuilder;
import com.google.android.gms.ads.internal.clearcut.a;
import com.google.android.gms.ads.internal.clearcut.i;

public final class k implements a {
    public final String a;

    public k(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.ads.internal.clearcut.a
    public final void a(ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        i i0 = (i)hftp0.b_message;
        i0.b |= 2;
        i0.c = this.a;
    }
}

