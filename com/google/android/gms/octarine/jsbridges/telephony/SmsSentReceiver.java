package com.google.android.gms.octarine.jsbridges.telephony;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dkui;
import dkup;
import dkuq;
import gqrk;
import gqsc;
import hfuo;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SmsSentReceiver extends TracingBroadcastReceiver {
    private final String a;
    private final dkui b;

    public SmsSentReceiver(IntentFilter intentFilter0, dkui dkui0) {
        super("octarine-smssent-receiver");
        this.a = intentFilter0.getAction(0);
        this.b = dkui0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null && s.equals(this.a)) {
                int v = this.getResultCode();
                int v1 = intent0.getIntExtra("callbackId", 0);
                intent0.getStringExtra("messagePart");
                String s1 = intent0.getStringExtra("requestId");
                int v2 = intent0.getIntExtra("numberOfMessageParts", 1);
                Map map0 = this.b.a.d;
                Integer integer0 = v1;
                if(map0.containsKey(integer0)) {
                    dkup dkup0 = null;
                    dkuq dkuq0 = (dkuq)map0.get(integer0);
                    if(dkuq0 != null) {
                        if(s1 != null) {
                            for(Object object0: dkuq0.e) {
                                dkup dkup1 = (dkup)object0;
                                if(dkup1.a.equals(s1)) {
                                    dkup0 = dkup1;
                                    break;
                                }
                            }
                        }
                        if(dkup0 == null) {
                            dkuq0.a(dkuq.b(dkuq0.b));
                        }
                        else {
                            if(v == -1) {
                                ++dkup0.b;
                            }
                            else {
                                ++dkup0.c;
                            }
                            if(dkup0.b + dkup0.c == v2) {
                                dkup0.d = true;
                            }
                            List list0 = dkuq0.e;
                            if(!list0.isEmpty()) {
                                for(Object object1: list0) {
                                    if(!((dkup)object1).d) {
                                        return;
                                    }
                                }
                            }
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqsc.a).v_newBuilder();
                            for(Object object2: list0) {
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqrk.a).v_newBuilder();
                                String s2 = ((dkup)object2).a;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp1.b_message;
                                s2.getClass();
                                ((gqrk)hftv0).b |= 1;
                                ((gqrk)hftv0).c = s2;
                                int v3 = ((dkup)object2).c == 0 ? 2 : 3;
                                if(!hftv0.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((gqrk)hftp1.b_message).d = v3 - 1;
                                ((gqrk)hftp1.b_message).b |= 2;
                                gqrk gqrk0 = (gqrk)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gqsc gqsc0 = (gqsc)hftp0.b_message;
                                gqrk0.getClass();
                                hfuo hfuo0 = gqsc0.b;
                                if(!hfuo0.c()) {
                                    gqsc0.b = ProtoLiteMessage.E(hfuo0);
                                }
                                gqsc0.b.add(gqrk0);
                            }
                            String s3 = String.format("\"%s\"", Base64.encodeToString(((gqsc)hftp0.N_build()).toBytesArray(), 2));
                            dkuq0.a(String.format(Locale.ROOT, "window.ocTelephonyCallback(%s, %s, %s)", ((int)dkuq0.b), s3, Boolean.valueOf(false)));
                        }
                        map0.remove(integer0);
                    }
                }
            }
        }
    }
}

