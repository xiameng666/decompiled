package com.google.android.gms.udc.intentoperation;

import a;
import acse;
import acso;
import adqe;
import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import bbmn;
import com.google.android.chimera.IntentOperation;
import ezmk;
import ezmv;
import ezpg;
import ezph;
import ezpi;
import ezpj;
import eztb;
import fktv;
import flan;
import gful_cronetEngineProvider;
import glyq;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

public class UdcAccountChangedIntentOperation extends IntentOperation {
    private final gful_cronetEngineProvider a;
    private final gful_cronetEngineProvider b;

    public UdcAccountChangedIntentOperation() {
        this.a = new ezpg(this);
        this.b = new ezph(this);
    }

    UdcAccountChangedIntentOperation(flan flan0, fktv fktv0) {
        this.a = new ezpi(flan0);
        this.b = new ezpj(fktv0);
    }

    private final void a(Account account0) {
        ((flan)this.a.mr()).a(account0).b(ezmk.d);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        for(Object object0: adqe.a(intent0)) {
            this.a(((Account)object0));
        }
        for(Object object1: adqe.b(intent0)) {
            this.a(((Account)object1));
        }
        try {
            ((glyq)((fktv)this.b.mr()).e(ezmv.b)).u();
        }
        catch(ExecutionException | InterruptedException exception0) {
            throw new RuntimeException(exception0);
        }
        HashSet hashSet0 = new HashSet();
        for(Object object2: this.getSharedPreferences("UdcConsistencyTokenPrefs", 0).getAll().keySet()) {
            String[] arr_s = ((String)object2).split(":");
            if(arr_s.length == 2 && !TextUtils.isEmpty(arr_s[0])) {
                hashSet0.add(arr_s[0]);
            }
        }
        for(Object object3: bbmn.h(this, "com.google.android.gms")) {
            Account account0 = (Account)object3;
            try {
                String s = eztb.b(this, acso.e(this, account0.name));
                if(TextUtils.isEmpty(s)) {
                    continue;
                }
                hashSet0.remove(s);
            }
            catch(acse | IOException exception1) {
                a.ae(eztb.a.j(), "Could not retrieve accountId", exception1);
            }
        }
        for(Object object4: hashSet0) {
            eztb.c(this, ((String)object4));
        }
    }
}

