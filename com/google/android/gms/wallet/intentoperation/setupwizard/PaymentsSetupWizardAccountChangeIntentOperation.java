package com.google.android.gms.wallet.intentoperation.setupwizard;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.provider.Settings.Global;
import android.util.Log;
import bbmq;
import cchj;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import fbbw;
import fbdo;
import fbes;
import fbox;
import fbuf;
import fbvw;
import fbxu;
import fbxw;
import fbxy;
import gamy;
import gbgs;
import gcuj;
import gcuk;
import gesx;
import hbzl;
import hcaq;
import hcdc;
import hcdf;
import hcdh;
import hcdi;
import hcdu;
import hzrg;
import java.util.Locale;

public class PaymentsSetupWizardAccountChangeIntentOperation extends IntentOperation {
    static final String[] a;
    fbuf b;
    fbxu c;
    private gamy d;

    static {
        PaymentsSetupWizardAccountChangeIntentOperation.a = new String[]{"com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardActivity", "com.google.android.gms.wallet.im.SetupWizardImRootActivity"};
    }

    private final void a(boolean z) {
        String[] arr_s = PaymentsSetupWizardAccountChangeIntentOperation.a;
        for(int v = 0; v < 2; ++v) {
            bbmq.G(this, arr_s[v], z);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context context0 = this.getApplicationContext();
        this.d = fbdo.a(context0);
        this.c = new fbxu(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Log.i("PaymentsSuwIntentOp", String.format(Locale.US, "Processing intent action = %s", intent0.getAction()));
        if(!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent0.getAction()) && (!"com.google.android.gms.wallet.TEST_SETUP_WIZARD".equals(intent0.getAction()) || !hzrg.a.d().f())) {
            Log.i("PaymentsSuwIntentOp", String.format(Locale.US, "Unsupported intent operation action=%s", intent0.getAction()));
            return;
        }
        hzrg hzrg0 = hzrg.a;
        if(!hzrg0.d().u() && this.c.a.getBoolean("accountAdded", false)) {
            Log.i("PaymentsSuwIntentOp", "Account added has already been processed");
            return;
        }
        if("android.intent.action.LOCALE_CHANGED".equals(intent0.getAction())) {
            Log.i("PaymentsSuwIntentOp", "Locale changed after device is provisioned or disabled");
            if(Settings.Global.getInt(this.getApplicationContext().getContentResolver(), "device_provisioned", 0) == 1 || !hzrg0.d().o()) {
                return;
            }
        }
        else if(!gcuk.b(this.getApplicationContext())) {
            return;
        }
        Account[] arr_account = cchj.b(this).p("com.google");
        if(arr_account.length == 0) {
            Log.i("PaymentsSuwIntentOp", "No eligible account is found.");
            return;
        }
        this.c.c();
        Account account0 = arr_account[0];
        fbxw fbxw0 = ApplicationParameters.a();
        fbxw0.f(((int)hzrg.b()));
        fbxw0.d(account0);
        if(!hzrg0.d().k()) {
            boolean z = gcuj.j(this.getApplicationContext());
            fbxw0.e(gcuj.d(gcuj.g(this.getApplicationContext()), z));
        }
        fbxy fbxy0 = BuyFlowConfig.a();
        fbxy0.b(fbxw0.a);
        fbxy0.d("com.google.android.gms");
        fbxy0.e("flow_setupwizard");
        BuyFlowConfig buyFlowConfig0 = fbxy0.a();
        fbbw fbbw0 = (fbbw)gbgs.b().N_build();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdf.a).v_newBuilder();
        gesx gesx0 = fbox.c(this.d, buyFlowConfig0, this, fbbw0, null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdf hcdf0 = (hcdf)hftp0.b_message;
        gesx0.getClass();
        hcdf0.c = gesx0;
        hcdf0.b |= 1;
        long v = gcuk.a(this.getApplicationContext());
        if(gcuk.c(v)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcdc.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcaq.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hbzl.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hbzl hbzl0 = (hbzl)hftp3.b_message;
            hbzl0.b |= 1;
            hbzl0.c = v;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hcaq hcaq0 = (hcaq)hftp2.b_message;
            hbzl hbzl1 = (hbzl)hftp3.N_build();
            hbzl1.getClass();
            hcaq0.f = hbzl1;
            hcaq0.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcdc hcdc0 = (hcdc)hftp1.b_message;
            hcaq hcaq1 = (hcaq)hftp2.N_build();
            hcaq1.getClass();
            hcdc0.c = hcaq1;
            hcdc0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdf hcdf1 = (hcdf)hftp0.b_message;
            hcdc hcdc1 = (hcdc)hftp1.N_build();
            hcdc1.getClass();
            hcdf1.d = hcdc1;
            hcdf1.b |= 4;
        }
        SetupWizardInitializeRequest setupWizardInitializeRequest0 = new SetupWizardInitializeRequest(account0, ((hcdf)hftp0.N_build()));
        try {
            if(this.b == null) {
                this.b = new fbvw(this, new fbes(this.getApplicationContext()), this.d);
            }
            ServerResponse serverResponse0 = this.b.v(buyFlowConfig0, setupWizardInitializeRequest0);
            if(serverResponse0.b() == 42) {
                hcdi hcdi0 = (hcdi)serverResponse0.c();
                int v1 = hcdi0.i;
                hcdu hcdu0 = hcdu.b;
                if((hcdu.b(v1) == null ? hcdu.a : hcdu.b(v1)) != hcdu0) {
                    this.c.b(account0);
                    hcdu hcdu1 = hcdu.b(hcdi0.i) == null ? hcdu.a : hcdu.b(hcdi0.i);
                    Log.i("PaymentsSuwIntentOp", String.format(Locale.US, "Unexpected flow instruction=%d", ((int)hcdu1.w)));
                    this.a(false);
                    return;
                }
                if(hcdh.a(hcdi0.f) != 2 && (hcdh.a(hcdi0.f) != 0 && hcdh.a(hcdi0.f) != 1)) {
                    if((hcdu.b(v1) == null ? hcdu.a : hcdu.b(v1)) == hcdu0 && (hcdi0.b & 16) == 0) {
                        this.c.b(account0);
                        bbmq.J("com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardActivity", false);
                        bbmq.J("com.google.android.gms.wallet.im.SetupWizardImRootActivity", true);
                        return;
                    }
                    this.c.d(this.getApplicationContext(), account0, hcdi0);
                    this.a(true);
                    return;
                }
                this.c.b(account0);
                Log.i("PaymentsSuwIntentOp", "No branding returned for SetupWizard InitializeRequest");
                this.a(false);
                return;
            }
            Log.i("PaymentsSuwIntentOp", String.format(Locale.US, "serverResponse with type=%d", serverResponse0.b()));
        }
        catch(RemoteException remoteException0) {
            Log.e("PaymentsSuwIntentOp", "Error when calling initialize", remoteException0);
        }
    }
}

