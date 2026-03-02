package com.google.android.gms.people.database;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import efpp;
import efpr;
import efpt;
import egfk;
import egig;
import egiv;
import gfug;
import giqi;
import gisr;
import hxgf;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DatabaseUpdateOperation extends IntentOperation {
    private final efpp a;
    private gfug b;

    public DatabaseUpdateOperation() {
        this.a = new efpp();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        int v1;
        egiv.R();
        boolean z = egiv.B().booleanValue();
        if(z) {
            this.b = gfug.b();
        }
        String s = intent0.getAction();
        egfk.b(this);
        if("com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC".equals(s)) {
            egfk egfk0 = egfk.b(this);
            CountDownLatch countDownLatch0 = egfk0.g;
            if(countDownLatch0 != null) {
                countDownLatch0.countDown();
            }
            egfk0.g = null;
        }
        else {
            egig.m("DatabaseUpdateOperation", "Unknown action: %s!", new Object[]{intent0.getAction()});
        }
        if(z) {
            gfug gfug0 = this.b;
            if(gfug0 != null) {
                this.a.b = gfug0.a(TimeUnit.MICROSECONDS);
                this.b.g();
            }
        }
        String s1 = intent0.getStringExtra("account_name");
        long v = this.a.b;
        egiv.R();
        double f = efpr.a.nextDouble();
        hxgf hxgf0 = hxgf.a;
        double f1 = hxgf0.j().d();
        Double.valueOf(f1).getClass();
        if((f >= f1)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqi.a).v_newBuilder();
        egiv.R();
        switch(s) {
            case "android.intent.action.LOCALE_CHANGED": {
                egiv.R();
                v1 = egiv.A().booleanValue() ? 8 : 1;
                break;
            }
            case "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE": {
                egiv.R();
                if(egiv.A().booleanValue()) {
                    v1 = 7;
                    break;
                }
                egiv.R();
                v1 = egiv.A().booleanValue() ? 8 : 1;
                break;
            }
            case "com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC": {
                v1 = 6;
                break;
            }
            case "com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS": {
                v1 = 3;
                break;
            }
            case "com.google.android.gms.people.api.operations.UPDATE_LOCALE": {
                v1 = 4;
                break;
            }
            case "com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX": {
                v1 = 5;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqi)hftv0).c = v1 - 1;
        ((giqi)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giqi)hftv1).b |= 2;
        ((giqi)hftv1).d = 0;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        giqi giqi0 = (giqi)hftp0.b_message;
        giqi0.b |= 4;
        giqi0.e = 0;
        egiv.R();
        boolean z1 = hxgf0.j().aU();
        Boolean.valueOf(z1).getClass();
        if(z1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((giqi)hftv2).b |= 16;
            ((giqi)hftv2).g = 0;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((giqi)hftv3).b |= 8;
            ((giqi)hftv3).f = 0;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((giqi)hftv4).b |= 0x20;
            ((giqi)hftv4).h = 0;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqi giqi1 = (giqi)hftp0.b_message;
            giqi1.b |= 0x40;
            giqi1.i = 0;
        }
        if(egiv.B().booleanValue()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqi giqi2 = (giqi)hftp0.b_message;
            giqi2.b |= 0x100;
            giqi2.j = v;
        }
        boolean z2 = hxgf0.j().aR();
        Boolean.valueOf(z2).getClass();
        if(z2) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giqi giqi3 = (giqi)hftp0.b_message;
            giqi3.b |= 0x200;
            giqi3.k = 0L;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gisr gisr0 = (gisr)hftp1.b_message;
        giqi giqi4 = (giqi)hftp0.N_build();
        giqi4.getClass();
        gisr0.p = giqi4;
        gisr0.b |= 0x800;
        efpt.b(s1, hftp1);
    }
}

