package com.google.android.gms.auth.authzen;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aild;
import ailf;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import batl;
import baun;
import cllr;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import hftc;
import hfur;
import hhqj;
import hhqu;
import hhqx;
import hhqy;
import hhts;
import hhtt;

public class AuthzenGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final int a;
    private static final baun b;

    static {
        AuthzenGcmTaskChimeraService.b = new baun(new String[]{"AuthzenGcmTaskChimeraService"});
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        if(s.startsWith("dismiss:")) {
            Bundle bundle0 = cllr0.b;
            if(bundle0 == null) {
                AuthzenGcmTaskChimeraService.b.f("Missing extras for task: " + s, new Object[0]);
                return 2;
            }
            String s1 = bundle0.getString("account");
            try {
                hhqx hhqx0 = null;
                byte[] arr_b = Base64.decode(bundle0.getString("encryption_key_handle"), 2);
                byte[] arr_b1 = Base64.decode(bundle0.getString("tx_request"), 2);
                if(arr_b1 != null) {
                    try {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b1, 0, arr_b1.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hhqx0 = (hhqx)hftv0;
                    }
                    catch(hfur hfur0) {
                        AuthzenGcmTaskChimeraService.b.f("Invalid protobuff: " + hfur0.toString(), new Object[0]);
                    }
                }
                batl.s(s1);
                batl.s(arr_b);
                batl.s(hhqx0);
                aild.h(hhqx0.c.toByteArray(), 11, this);
                ailf.b(this).e(ailf.d(hhqx0));
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).v_newBuilder();
                hhqj hhqj0 = hhqj.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hhqy)hftp0.b_message).c = hhqj0.j;
                ((hhqy)hftp0.b_message).b |= 1;
                long v = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhqy hhqy0 = (hhqy)hftp0.b_message;
                hhqy0.b |= 4;
                hhqy0.e = v;
                hhqy hhqy1 = (hhqy)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqu.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                hhqx0.getClass();
                ((hhqu)hftv1).c = hhqx0;
                ((hhqu)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hhqu hhqu0 = (hhqu)hftp1.b_message;
                hhqy1.getClass();
                hhqu0.d = hhqy1;
                hhqu0.b |= 2;
                byte[] arr_b2 = ((hhqu)hftp1.N_build()).toBytesArray();
                this.startService(TransactionReplyIntentOperation.b(s1, arr_b, hhqx0, new hhts(hhtt.d, arr_b2)));
                return 0;
            }
            catch(IllegalArgumentException | NullPointerException exception0) {
                AuthzenGcmTaskChimeraService.b.f("Extras parsing error: " + exception0.toString(), new Object[0]);
                return 2;
            }
        }
        if(s.startsWith("expired:")) {
            Bundle bundle1 = cllr0.b;
            if(bundle1 != null && bundle1.getLong("creation_elapsed_time") != 0L) {
                long v1 = bundle1.getLong("creation_elapsed_time");
                Intent intent0 = new Intent("AUTHZEN_ACTIVITY_EXPIRED");
                intent0.setPackage("com.google.android.gms");
                intent0.putExtra("creation_elapsed_time", v1);
                intent0.addCategory("creation_elapsed_time:" + v1);
                AppContextProvider.a().sendBroadcast(intent0);
                return 0;
            }
            AuthzenGcmTaskChimeraService.b.f("Missing extras for task: " + s, new Object[0]);
            return 2;
        }
        AuthzenGcmTaskChimeraService.b.f("Received unexpected task: " + s, new Object[0]);
        return 2;
    }
}

