package com.google.android.gms.chimera.container;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import awik;
import awil;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager;
import ffrg;
import ffrh;
import ffri;
import ffrj;
import ffrk;
import ffrr;
import gged_interceptors;
import ggna;
import hriv;
import java.util.Collection;
import wyn;

public class AppModuleManagementOperation extends IntentOperation {
    private static final String a = "com.google.android.gms.chimera.container.AppModuleManagementOperation";
    private ModuleManager b;
    private wyn c;
    private awik d;
    private final ffrj e;

    static {
    }

    public AppModuleManagementOperation() {
        this.e = hriv.b();
    }

    AppModuleManagementOperation(ModuleManager moduleManager0, wyn wyn0, awik awik0) {
        this.b = moduleManager0;
        this.c = wyn0;
        this.d = awik0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        gged_interceptors gged1;
        ffrh ffrh2;
        PackageInfo packageInfo0;
        int v;
        Uri uri0 = intent0.getData();
        if(!TextUtils.isEmpty(intent0.getAction()) && uri0 != null && !TextUtils.isEmpty(uri0.getSchemeSpecificPart())) {
            String s = intent0.getAction();
            boolean z = false;
            if(TextUtils.isEmpty(s)) {
                v = 1;
            }
            else {
                boolean z1 = intent0.getBooleanExtra("android.intent.extra.REPLACING", false);
                if(!s.equals("android.intent.action.PACKAGE_ADDED")) {
                label_11:
                    if(s.equals("android.intent.action.PACKAGE_REPLACED")) {
                        v = 3;
                    }
                    else if(s.equals("android.intent.action.PACKAGE_REMOVED") && !z1) {
                        v = 4;
                    }
                    else {
                        v = 1;
                    }
                }
                else if(!z1) {
                    v = 2;
                }
                else {
                    z1 = true;
                    goto label_11;
                }
            }
            if(v != 1) {
                if(this.b == null) {
                    this.b = ModuleManager.get(this);
                }
                if(this.c == null) {
                    this.c = wyn.d();
                }
                if(this.d == null) {
                    this.d = new awik(this);
                }
                String s1 = uri0.getSchemeSpecificPart();
                if(s1 != null) {
                    if(v == 2 || v == 3) {
                        awik awik0 = this.d;
                        boolean z2 = awik0.c.g(s1);
                        ffrg ffrg0 = (ffrg)((ProtoLiteMessage)ffrh.a).v_newBuilder();
                        if(!ffrg0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)ffrg0).ensureMutable();
                        }
                        ffrh ffrh0 = (ffrh)ffrg0.b_message;
                        ffrh0.b |= 1;
                        ffrh0.c = s1;
                        if(!ffrg0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)ffrg0).ensureMutable();
                        }
                        ffrh ffrh1 = (ffrh)ffrg0.b_message;
                        ffrh1.b |= 4;
                        ffrh1.e = z2;
                        try {
                            packageInfo0 = null;
                            packageInfo0 = awik0.b.getPackageInfo(s1, 0x80);
                        }
                        catch(PackageManager.NameNotFoundException unused_ex) {
                        }
                        if(packageInfo0 == null) {
                            Log.w(awik.a, "Couldn\'t find application info for package " + s1);
                        }
                        else {
                            long v1 = (long)packageInfo0.versionCode;
                            if(!ffrg0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)ffrg0).ensureMutable();
                            }
                            ffrh ffrh3 = (ffrh)ffrg0.b_message;
                            ffrh3.b |= 2;
                            ffrh3.d = v1;
                            gged_interceptors gged0 = awik0.d;
                            int v2 = ((ggna)gged0).c;
                            for(int v3 = 0; v3 < v2; ++v3) {
                                awil awil0 = (awil)gged0.get(v3);
                                if(awil0.d() == 2) {
                                    ffrg0.a(awil0.a(packageInfo0));
                                }
                                else if(awil0.d() == 1) {
                                    ffrg0.a(awil0.c(s1, awik0.b));
                                }
                            }
                        }
                        ffrh2 = (ffrh)((ProtoLiteBuilder)ffrg0).N_build();
                        for(Object object0: this.e.b) {
                            ffri ffri0 = (ffri)object0;
                            if(!ffri0.b.equals(s1)) {
                                continue;
                            }
                            gged1 = ffri0.c;
                            goto label_79;
                        }
                        gged1 = ggna.a;
                    label_79:
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffrh2).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)ffrh2));
                        ((ffrg)hftp0).a(gged1);
                        ffrh ffrh4 = (ffrh)((ProtoLiteBuilder)(((ffrg)hftp0))).N_build();
                        Collection collection0 = this.d.a(ffrh4);
                        if(!collection0.isEmpty()) {
                            ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
                            moduleManager$FeatureRequest0.setRequesterAppPackage("manifest:" + s1);
                            ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
                            for(Object object1: collection0) {
                                moduleManager$FeatureRequest0.requestFeatureAtVersion(((ffrk)object1).c, ((ffrk)object1).d);
                                moduleManager$FeatureCheck0.checkFeatureAtVersion(((ffrk)object1).c, ((ffrk)object1).d);
                                int v4 = ((ffrk)object1).e;
                                if((ffrr.b(v4) == null ? ffrr.a : ffrr.b(v4)) == ffrr.b || (ffrr.b(v4) == null ? ffrr.a : ffrr.b(v4)) == ffrr.c) {
                                    z = true;
                                }
                            }
                            if(z && this.b.checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 2) {
                                moduleManager$FeatureRequest0.setUrgent();
                            }
                            if(!this.b.requestFeatures(moduleManager$FeatureRequest0)) {
                                Log.w("com.google.android.gms.chimera.container.AppModuleManagementOperation", a.q(s1, moduleManager$FeatureRequest0, "Couldn\'t perform feature dependency request for package ", ". Request: "));
                            }
                        }
                    }
                    else if(!this.c.i(s1)) {
                        Log.e(AppModuleManagementOperation.a, "Error removing all feature requests for package " + s1);
                        return;
                    }
                }
            }
            return;
        }
        Log.i("com.google.android.gms.chimera.container.AppModuleManagementOperation", "Required parameters weren\'t set in the received Intent. Ignoring.");
    }
}

