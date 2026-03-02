package com.google.android.gms.wallet.intentoperation.ib;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import azqk;
import batl;
import bauc;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fbes;
import fblq;
import fboa;
import fbqa;
import fbru;
import geoc;
import geod;
import hcdp;
import hzsb;
import java.util.Locale;

public class ReportErrorChimeraIntentOperation extends IntentOperation {
    public fbes a;
    private Context b;
    private fbqa c;
    private ModuleManager d;
    private fboa e;

    public ReportErrorChimeraIntentOperation() {
    }

    public ReportErrorChimeraIntentOperation(Context context0) {
        this.attachBaseContext(context0);
        this.b = this.getApplicationContext();
    }

    public static void a(BuyFlowConfig buyFlowConfig0, String s, int v, int v1, int v2, Context context0) {
        if(v1 != 7 && hzsb.a.b().e()) {
            batl.t(buyFlowConfig0, "buyFlowConfig is required");
            Intent intent0 = IntentOperation.getStartIntent(context0, ReportErrorChimeraIntentOperation.class, "com.google.android.gms.wallet.ib.REPORT_ERROR");
            bauc.l(buyFlowConfig0, intent0, "com.google.android.gms.wallet.buyFlowConfig");
            intent0.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.googleTransactionId", s);
            intent0.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", v - 1);
            intent0.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", v1);
            intent0.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", v2);
            context0.startService(intent0);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = this.getApplicationContext();
        fbqa fbqa0 = new fbqa(this.b);
        ModuleManager moduleManager0 = ModuleManager.get(this);
        fbes fbes0 = new fbes(this.b);
        this.e = new fboa(this, "ReportErrorIntentOp");
        this.c = fbqa0;
        this.d = moduleManager0;
        this.a = fbes0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)bauc.b(intent0, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geod.a).v_newBuilder();
        int v = geoc.a(intent0.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", 0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod0 = (geod)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        geod0.h = v - 1;
        geod0.b |= 0x20;
        int v1 = intent0.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", 13);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod1 = (geod)hftp0.b_message;
        geod1.b |= 16;
        geod1.g = v1;
        int v2 = intent0.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", 0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod2 = (geod)hftp0.b_message;
        geod2.b |= 8;
        geod2.f = v2;
        fbqa fbqa0 = this.c;
        String s = buyFlowConfig0.c;
        batl.s(s);
        hcdp hcdp0 = fbru.z(fbqa0.a(s));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod3 = (geod)hftp0.b_message;
        hcdp0.getClass();
        geod3.e = hcdp0;
        geod3.b |= 4;
        int v3 = azqk.a(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod4 = (geod)hftp0.b_message;
        int v4 = 1;
        geod4.b |= 1;
        geod4.c = v3;
        long v5 = (long)this.d.getCurrentModule().moduleVersion;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((geod)hftv0).b |= 2;
        ((geod)hftv0).d = v5;
        int v6 = buyFlowConfig0.b.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        geod geod5 = (geod)hftp0.b_message;
        geod5.b |= 0x80;
        geod5.i = v6;
        geod geod6 = (geod)hftp0.N_build();
        Account account0 = buyFlowConfig0.b.b;
        Locale locale0 = Locale.US;
        int v7 = geoc.a(geod6.h);
        if(v7 != 0) {
            v4 = v7;
        }
        Log.w("ReportErrorIntentOp", String.format(locale0, "Reported %d.%d.%d", ((int)(v4 - 1)), ((int)geod6.g), ((int)geod6.f)));
        this.e.a(new fblq(this, account0, buyFlowConfig0, geod6));
    }
}

