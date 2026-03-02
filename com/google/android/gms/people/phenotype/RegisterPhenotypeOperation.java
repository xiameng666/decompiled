package com.google.android.gms.people.phenotype;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import bbqr;
import bbrc;
import com.google.android.chimera.IntentOperation;
import efnt;
import egig;
import egiw;
import egix;
import einq;
import evql;
import evrg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RegisterPhenotypeOperation extends IntentOperation {
    public static int a(Context context0, Intent intent0) {
        return intent0 == null || !intent0.hasExtra("first_sdk_extra") ? egiw.a(context0) : intent0.getIntExtra("first_sdk_extra", -1);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        byte[] arr_b;
        String s = intent0.hasExtra("mendel_package_name") ? bbqr.c(intent0.getStringExtra("mendel_package_name")) : "com.google.android.gms.people";
        einq einq0 = new einq(this);
        int v = bbrc.f();
        if(s.equals("com.google.android.gms.people.ui")) {
            arr_b = null;
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)efnt.a).v_newBuilder();
            int v1 = RegisterPhenotypeOperation.a(this, intent0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            efnt efnt0 = (efnt)hftp0.b_message;
            efnt0.b |= 1;
            efnt0.c = v1;
            arr_b = ((efnt)hftp0.N_build()).toBytesArray();
        }
        evql evql0 = einq0.cz(s, v, new String[]{"GMS_CORE_PEOPLE", "CHIPS"}, arr_b);
        evql0.s(Executors.newCachedThreadPool(), new egix(this, this, s, intent0));
        try {
            evrg.o(evql0, 10L, TimeUnit.SECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
            egig.k("PeopleGmsPhenoRgstrIntentOp", "Google Api connection failed");
        }
    }
}

