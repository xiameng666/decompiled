package com.google.android.gms.ads.internal.webview;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import com.google.android.gms.ads.internal.clearcut.a;
import com.google.android.gms.ads.internal.clearcut.i;
import com.google.android.gms.ads.internal.clearcut.j;

public final class u implements a {
    public final boolean a;
    public final int b;

    public u(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    @Override  // com.google.android.gms.ads.internal.clearcut.a
    public final void a(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)j.a).v_newBuilder();
        ProtoLiteMessage hftv0 = hftp1.b_message;
        boolean z = this.a;
        if(((j)hftv0).c != z) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            j j0 = (j)hftp1.b_message;
            j0.b |= 1;
            j0.c = z;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        j j1 = (j)hftp1.b_message;
        j1.b |= 2;
        j1.d = this.b;
        j j2 = (j)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        i i0 = (i)hftp0.b_message;
        j2.getClass();
        i0.e = j2;
        i0.b |= 0x400;
    }
}

