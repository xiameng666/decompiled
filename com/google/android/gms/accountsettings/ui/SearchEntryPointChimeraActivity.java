package com.google.android.gms.accountsettings.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aatw;
import android.net.Uri;
import android.os.Bundle;
import grxu;
import grxw;

public class SearchEntryPointChimeraActivity extends aatw {
    @Override  // aatw
    protected final int C() {
        return 3;
    }

    @Override  // aatw
    protected final Bundle g() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("extra.utmSource", "android-settings");
        bundle0.putString("extra.utmMedium", "search");
        return bundle0;
    }

    @Override  // aatw
    public final grxw l() {
        grxw grxw0 = super.l();
        Integer integer0 = null;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grxw0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)grxw0));
        String s = this.getIntent().getStringExtra(":settings:fragment_args_key");
        if(s != null) {
            String s1 = Uri.parse(s).getQueryParameter("resourceId");
            try {
                integer0 = Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        if(integer0 != null) {
            int v = (int)integer0;
            if(!((grxu)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((grxu)hftp0))).ensureMutable();
            }
            grxw grxw1 = (grxw)((grxu)hftp0).b_message;
            grxw1.b |= 1;
            grxw1.c = v;
        }
        return (grxw)((ProtoLiteBuilder)(((grxu)hftp0))).N_build();
    }

    @Override  // aatw
    public final String m() {
        return "com.google.android.gms";
    }

    @Override  // aatw
    protected final void r() {
    }

    @Override  // aatw
    protected final boolean x() {
        return true;
    }

    @Override  // aatw
    protected final boolean y() {
        return true;
    }
}

