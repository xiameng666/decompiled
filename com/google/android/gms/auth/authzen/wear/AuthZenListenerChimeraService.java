package com.google.android.gms.auth.authzen.wear;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aiip;
import ailf;
import aztt;
import baun;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import fcez;
import fcfo;
import fczm;
import hftc;
import hfur;
import hhqu;
import hhqx;
import hhqy;
import hhts;
import hhtt;

public class AuthZenListenerChimeraService extends fczm {
    aiip a;
    private static final baun b;

    static {
        AuthZenListenerChimeraService.b = new baun(new String[]{"AuthZenListenerService"});
    }

    @Override  // fczm
    public final void a(MessageEventParcelable messageEventParcelable0) {
        hhqy hhqy0;
        hhqx hhqx0;
        AuthZenListenerChimeraService.b.d("onMessageReceived: %s, Path: %s", new Object[]{messageEventParcelable0, messageEventParcelable0.b});
        if("/send-tx-response".equals(messageEventParcelable0.b)) {
            fcez fcez0 = fcez.b(messageEventParcelable0.c);
            try {
                byte[] arr_b = fcez0.x("tx_request");
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hhqx0 = (hhqx)hftv0;
                byte[] arr_b1 = fcez0.x("tx_response");
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqy.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hhqy0 = (hhqy)hftv1;
            }
            catch(hfur hfur0) {
                AuthZenListenerChimeraService.b.g("Received a malformed TxRequest or TxResponse", hfur0, new Object[0]);
                return;
            }
            ailf.b(this).e(ailf.d(hhqx0));
            String s = fcez0.d("email");
            byte[] arr_b2 = fcez0.x("key_handle");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            hhqx0.getClass();
            ((hhqu)hftv2).c = hhqx0;
            ((hhqu)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhqu hhqu0 = (hhqu)hftp0.b_message;
            hhqy0.getClass();
            hhqu0.d = hhqy0;
            hhqu0.b |= 2;
            byte[] arr_b3 = ((hhqu)hftp0.N_build()).toBytesArray();
            this.startService(TransactionReplyIntentOperation.b(s, arr_b2, hhqx0, new hhts(hhtt.d, arr_b3)));
            fcez fcez1 = new fcez();
            fcez1.k("tx_request", hhqx0.toBytesArray());
            fcez1.k("tx_response", hhqy0.toBytesArray());
            this.a.b("/send-tx-response-ack", fcez1.y()).a();
        }
    }

    @Override  // fczm
    public final void onCreate() {
        super.onCreate();
        aztt aztt0 = new aztt(this);
        aztt0.c(fcfo.a);
        this.a = new aiip(this, aztt0.a(), fcfo.b, fcfo.c);
    }
}

