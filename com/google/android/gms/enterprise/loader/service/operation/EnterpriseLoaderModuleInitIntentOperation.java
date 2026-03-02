package com.google.android.gms.enterprise.loader.service.operation;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import bbmn;
import bboh;
import bbsq;
import bjlt;
import bjnb;
import bjne;
import bjnf;
import bjnk;
import bjns;
import bjob;
import bjoc;
import bjod;
import bjof;
import bjoi;
import ccmf;
import com.google.android.chimera.IntentOperation;
import gftb;
import gful_cronetEngineProvider;
import ggtj;
import hsgz;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;

public class EnterpriseLoaderModuleInitIntentOperation extends IntentOperation implements bjnk {
    private static final bboh a;
    private static final Lock b;
    private bjod c;
    private bjne d;
    private bjoi e;
    private bjob f;

    static {
        EnterpriseLoaderModuleInitIntentOperation.a = bjof.a("ModuleInit");
        EnterpriseLoaderModuleInitIntentOperation.b = new ReentrantLock();
    }

    @Override  // bjnk
    public final void a(int v) {
    }

    private final bjoi b() {
        if(this.e == null) {
            this.e = new bjoi(this);
        }
        return this.e;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        int v;
        boolean z1;
        EnterpriseLoaderModuleInitIntentOperation enterpriseLoaderModuleInitIntentOperation0;
        if((TextUtils.equals(intent0.getAction(), "com.google.android.gms.chimera.container.CONTAINER_UPDATED") || TextUtils.equals(intent0.getAction(), "com.google.android.chimera.IntentOperation.NEW_MODULE")) && ccmf.a(((gful_cronetEngineProvider)new bjns()), "work:zero_touch_config_present", this.getContentResolver())) {
            Intent intent1 = IntentOperation.getStartIntent(this, ConsentedLoggingUploadIntentOperation.class, "com.google.android.gms.enterprise.loader.service.operation.ACTION_SUW_FINISHED");
            if(intent1 == null) {
                ((ggtj)EnterpriseLoaderModuleInitIntentOperation.a.j()).x("Logs upload intent is null");
            }
            else {
                this.startService(intent1);
            }
        }
        if(this.c == null) {
            enterpriseLoaderModuleInitIntentOperation0 = this;
            enterpriseLoaderModuleInitIntentOperation0.c = new bjod(enterpriseLoaderModuleInitIntentOperation0, new bbsq(this), ((DevicePolicyManager)this.getSystemService("device_policy")), new bjnf(this).b(), new bjnb(this));
        }
        else {
            enterpriseLoaderModuleInitIntentOperation0 = this;
        }
        bjod bjod0 = enterpriseLoaderModuleInitIntentOperation0.c;
        boolean z = false;
        if(bjod0.e.a()) {
            z1 = false;
        }
        else {
            bjoc bjoc0 = new bjoc();
            Context context0 = bjod0.b;
            if(!ccmf.a(((gful_cronetEngineProvider)bjoc0), "work:zero_touch_config_present", context0.getContentResolver())) {
                ((ggtj)bjod.a.h()).x("ZT config not present.");
                z1 = false;
            }
            else if(!bjlt.a(context0)) {
                ((ggtj)bjod.a.h()).x("Device not provisioned yet.");
                z1 = false;
            }
            else if(hsgz.a.c().k() && !bbmn.s(context0)) {
                ((ggtj)bjod.a.h()).x("This is not the main user.");
                z1 = false;
            }
            else if(bjod0.d.isDeviceProvisioningConfigApplied()) {
                ((ggtj)bjod.a.h()).x("Device already provisioned by ZT.");
                z1 = false;
            }
            else if(hsgz.e()) {
                z1 = true;
            }
            else if(!bjod0.f.a(bjod0.c)) {
                ((ggtj)bjod.a.h()).x("Device conditions not met.");
                z1 = false;
            }
            else {
                z1 = true;
            }
        }
        if(z1) {
            if(enterpriseLoaderModuleInitIntentOperation0.d == null) {
                enterpriseLoaderModuleInitIntentOperation0.d = new bjnf(enterpriseLoaderModuleInitIntentOperation0).a();
            }
            bjne bjne0 = enterpriseLoaderModuleInitIntentOperation0.d;
            boolean z2 = bjlt.a(enterpriseLoaderModuleInitIntentOperation0);
            if(intent0.getAction() == null) {
                ((ggtj)EnterpriseLoaderModuleInitIntentOperation.a.i()).x("Intent action is null.");
                v = 1;
            }
            else {
                String s = intent0.getAction();
                gftb.check(s);
                switch(s) {
                    case "android.intent.action.BOOT_COMPLETED": {
                        v = 3;
                        break;
                    }
                    case "com.google.android.checkin.CHECKIN_COMPLETE": {
                        v = 8;
                        break;
                    }
                    case "com.google.android.chimera.IntentOperation.NEW_MODULE": {
                        v = 6;
                        break;
                    }
                    case "com.google.android.gms.chimera.container.CONTAINER_UPDATED": {
                        v = 4;
                        break;
                    }
                    case "com.google.android.gms.phenotype.com.google.android.gms.enterprise.COMMITTED": {
                        v = 7;
                        break;
                    }
                    default: {
                        v = 1;
                    }
                }
            }
            bjne0.a(enterpriseLoaderModuleInitIntentOperation0, z2, v);
        }
        if(TextUtils.equals(intent0.getAction(), "android.intent.action.BOOT_COMPLETED") && !bjlt.a(enterpriseLoaderModuleInitIntentOperation0)) {
            z = true;
        }
        if((z1 || z) && hsgz.f()) {
            EnterpriseLoaderModuleInitIntentOperation.b.lock();
            int v1 = FIN.finallyOpen$NT();
        }
    }
}

