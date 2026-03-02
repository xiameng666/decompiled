package com.google.android.gms.auth.authzen.transaction.secondscreen;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acsd;
import acso;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import batl;
import baun;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import hfsl;
import hfsm;
import hftc;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import hhqj;
import hhqu;
import hhqw;
import hhqx;
import hhqy;
import hhts;
import hhtt;
import hkxv;
import java.io.IOException;

public class SecondScreenIntentOperation extends IntentOperation {
    public static final baun a;
    private String b;
    private hhqx c;
    private byte[] d;
    private hkxv e;

    static {
        SecondScreenIntentOperation.a = new baun(new String[]{"SecondScreenIntentOperation"});
    }

    public SecondScreenIntentOperation() {
    }

    SecondScreenIntentOperation(Context context0, String s, hhqx hhqx0, byte[] arr_b, hkxv hkxv0) {
        this.attachBaseContext(context0);
        this.b = s;
        this.c = hhqx0;
        this.d = arr_b;
        this.e = hkxv0;
    }

    public static void a(Context context0, String s, byte[] arr_b, hhqx hhqx0, hhqj hhqj0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhqy.a).v_newBuilder();
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
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hhqx0.getClass();
        ((hhqu)hftv0).c = hhqx0;
        ((hhqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhqu hhqu0 = (hhqu)hftp1.b_message;
        hhqy1.getClass();
        hhqu0.d = hhqy1;
        hhqu0.b |= 2;
        byte[] arr_b1 = ((hhqu)hftp1.N_build()).toBytesArray();
        context0.startService(TransactionReplyIntentOperation.b(s, arr_b, hhqx0, new hhts(hhtt.d, arr_b1)));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        hkxv hkxv0;
        this.b = intent0.getStringExtra("account");
        this.d = intent0.getByteArrayExtra("encryption_key_handle");
        try {
            byte[] arr_b = intent0.getByteArrayExtra("tx_request");
            hftc hftc0 = hftc.a;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.c = (hhqx)hftv0;
            hhqw hhqw0 = ((hhqx)hftv0).e;
            if(hhqw0 == null) {
                hhqw0 = hhqw.b;
            }
            hfsl hfsl0 = hhqw0.p.k();
            ProtoLiteMessage hftv1 = ((ProtoLiteMessage)hkxv.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv1);
                hfwc0.l(hftv1, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv1);
            }
            catch(hfur hfur1) {
                hfur hfur2 = hfur1.b ? new hfur(hfur1) : hfur1;
                hfur2.a = hftv1;
                throw hfur2;
            }
            catch(hfwr hfwr0) {
                hfur hfur3 = hfwr0.a();
                hfur3.a = hftv1;
                throw hfur3;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur4 = new hfur(iOException0);
                hfur4.a = hftv1;
                throw hfur4;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            try {
                hfsl0.z(0);
            }
            catch(hfur hfur5) {
                hfur5.a = hftv1;
                throw hfur5;
            }
            ProtoLiteMessage.P_makeImmutable(hftv1);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            hkxv0 = (hkxv)hftv1;
            this.e = hkxv0;
        }
        catch(hfur hfur0) {
            SecondScreenIntentOperation.a.n("Unable to parse proto ", hfur0, new Object[0]);
            return;
        }
        String s = hkxv0.f;
        Account account0 = new Account(this.b, "com.google");
        ApplicationInformation applicationInformation0 = new ApplicationInformation(this.e.b, this.e.c, this.e.d, this.e.e, "");
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("keyApplicationInformationWrapperBundle", applicationInformation0);
        bundle0.putBundle("keyApplicationInformationAuthExtrasBundle", bundle1);
        Bundle bundle2 = new acsd(bundle0).a;
        if(!this.e.g.isEmpty()) {
            bundle2.putString("KEY_DEVICE_NAME", this.e.g);
        }
        if(!this.e.h.isEmpty()) {
            bundle2.putString("KEY_REMOTE_APP_LABEL", this.e.h);
        }
        bundle2.putBoolean("KEY_IS_REMOTE_APP", true);
        try {
            acso.g(this.getBaseContext(), account0, s, bundle2);
            SecondScreenIntentOperation.a(this, this.b, this.d, this.c, hhqj.b);
        }
        catch(UserRecoverableAuthException userRecoverableAuthException0) {
            hhqx hhqx0 = this.c;
            String s1 = this.b;
            byte[] arr_b1 = this.d;
            Intent intent1 = userRecoverableAuthException0.a();
            batl.s(hhqx0);
            batl.q(s1);
            Intent intent2 = new Intent();
            intent2.putExtra("token_intent", intent1);
            intent2.putExtra("account", s1);
            intent2.putExtra("tx_request", hhqx0.toBytesArray());
            intent2.putExtra("encryption_key_handle", arr_b1);
            intent2.addFlags(0x10000000).addFlags(0x8000000).addFlags(0x800000).addFlags(4).addFlags(0x10000).addFlags(0x40000);
            intent2.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity");
            this.getBaseContext().startActivity(intent2);
        }
        catch(Exception exception0) {
            SecondScreenIntentOperation.a.n("general get token exception: ", exception0, new Object[0]);
            SecondScreenIntentOperation.a(this, this.b, this.d, this.c, hhqj.a);
        }
    }
}

