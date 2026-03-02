package com.google.android.gms.auth.aang.impl.accountstate;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import addk;
import adga;
import android.content.Intent;
import android.os.Bundle;
import cljp;
import clkn;
import com.google.android.chimera.IntentOperation;
import ggfp;
import ggtj;
import ghxf;
import ghxh;
import ghxi;
import hpfy;

public class GcmIntentOperation extends IntentOperation {
    public static final ggfp a;

    static {
        GcmIntentOperation.a = ggfp.L("ACCOUNT_SYNC_ACTION", "CREDENTIAL_SYNC_ACTION", "ACCOUNT_SYNC_ACTION_ONETIME");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghxi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = 1;
        ((ghxi)hftp0.b_message).c = 1;
        ((ghxi)hftp0.b_message).b |= 1;
        try {
            String s = intent0.getStringExtra("EXTRA_ACTION");
            if(s != null && GcmIntentOperation.a.contains(s)) {
                String s1 = intent0.getStringExtra("EXTRA_GAIA_ID");
                if(s1 == null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ghxi)hftp0.b_message).d = 2;
                }
                else {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("EXTRA_GAIA_ID", s1);
                    bundle0.putString("EXTRA_ACTION", s);
                    cljp cljp0 = cljp.a(this);
                    clkn clkn0 = new clkn();
                    clkn0.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
                    clkn0.t(addk.a(s, s1));
                    clkn0.v(1);
                    clkn0.g(0);
                    clkn0.u = bundle0;
                    clkn0.e(0L, hpfy.b());
                    cljp0.f(clkn0.a());
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ghxi)hftp0.b_message).d = 1;
                }
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ghxi)hftp0.b_message).d = 4;
            }
            ((ghxi)hftp0.b_message).b |= 2;
        }
        finally {
            adga.p(((ghxi)hftp0.N_build()));
            ggtj ggtj0 = (ggtj)adga.a("GcmIntentOperation").h();
            ghxi ghxi0 = (ghxi)hftp0.b_message;
            int v2 = ghxh.b(ghxi0.c) == 0 ? 1 : ghxh.b(ghxi0.c);
            int v3 = ghxf.b(ghxi0.d);
            if(v3 != 0) {
                v = v3;
            }
            ggtj0.R("Sync reported at %s has status of %s.", ghxh.a(v2), ghxf.a(v));
        }
    }
}

