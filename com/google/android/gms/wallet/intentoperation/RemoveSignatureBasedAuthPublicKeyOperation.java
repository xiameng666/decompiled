package com.google.android.gms.wallet.intentoperation;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import bauc;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fbdw;
import fbwk;
import geuv;
import gevm;
import hfvv;
import hfyz;
import hfzc;
import j..util.DesugarCollections;
import java.util.ArrayList;

public class RemoveSignatureBasedAuthPublicKeyOperation extends IntentOperation {
    private fbwk a;

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new fbwk(this.getApplicationContext());
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        try {
            BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)bauc.b(intent0, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            int v = geuv.a(intent0.getIntExtra("EXTRA_AUTHENTICATOR", 0));
            int v1 = buyFlowConfig0.b.a;
            Account account0 = buyFlowConfig0.b.b;
            hfzc hfzc0 = this.a.c(v1, account0);
            if(hfzc0 != null) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfzc0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hfzc0));
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: DesugarCollections.unmodifiableList(((hfzc)((hfyz)hftp0).b_message).g)) {
                    gevm gevm0 = (gevm)object0;
                    if((geuv.a(gevm0.f) == 0 ? 1 : geuv.a(gevm0.f)) != v) {
                        arrayList0.add(gevm0);
                    }
                }
                if(!((hfyz)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((hfyz)hftp0))).ensureMutable();
                }
                ((hfzc)((hfyz)hftp0).b_message).g = hfvv.a;
                ((hfyz)hftp0).a(arrayList0);
                this.a.f(v1, account0, ((hfzc)((ProtoLiteBuilder)(((hfyz)hftp0))).N_build()));
            }
            fbdw.a(this.getApplicationContext(), buyFlowConfig0).i(v);
        }
        catch(Exception unused_ex) {
            this.getApplicationContext();
        }
    }
}

