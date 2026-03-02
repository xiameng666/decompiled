package com.google.android.gms.trustagent.trustlet;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ezch;
import ezcm;
import ezfc;
import ezfe;
import ghyk;
import ghyl;
import j..util.Objects;

public class TrustletManager.TrustletManagerBroadcastReceiver extends TracingBroadcastReceiver {
    final ezfe a;

    public TrustletManager.TrustletManagerBroadcastReceiver(ezfe ezfe0) {
        Objects.requireNonNull(ezfe0);
        this.a = ezfe0;
        super("trustagent");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.intent.action.USER_PRESENT")) {
            ezfe ezfe0 = this.a;
            for(Object object0: ezfe0.i) {
                ezfc ezfc0 = (ezfc)object0;
                if(ezfc0.a() && ezfc0.c()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghyl.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ghyl)hftp0.b_message).d = 1;
                    ((ghyl)hftp0.b_message).b |= 2;
                    ghyk ghyk0 = (ghyk)ezcm.a.getOrDefault(ezfc0.b, ghyk.a);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ghyl)hftp0.b_message).c = ghyk0.g;
                    ((ghyl)hftp0.b_message).b |= 1;
                    ezch.a(((ghyl)hftp0.N_build()));
                }
            }
            Object object1 = ezfe0.e;
            synchronized(object1) {
                if(ezfe0.q) {
                    ezfe0.q = false;
                    ezfe0.k("User present with authentication");
                    ezfe0.i();
                    ezfe0.h();
                }
            }
        }
    }
}

