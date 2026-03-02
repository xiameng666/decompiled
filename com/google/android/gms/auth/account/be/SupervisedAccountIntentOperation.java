package com.google.android.gms.auth.account.be;

import acso;
import adix;
import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import bbmn;
import bbqs;
import bxf;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import gfta;
import gftb;
import ggtj;
import hpgr;
import ibuq;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

public class SupervisedAccountIntentOperation extends IntentOperation {
    private final void a() {
        Boolean.valueOf(true).getClass();
        ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
        moduleManager$FeatureRequest0.requestFeatureAtAnyVersion("kids");
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Requesting feature: kids..."));
        ModuleManager.get(this).requestFeatures(moduleManager$FeatureRequest0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Set set0;
        hpgr hpgr0 = hpgr.a;
        if(hpgr0.b().h()) {
            ibuq.f(intent0, "intent");
            String s = intent0.getAction();
            ((ggtj)adix.a.h()).B("onHandleIntent: %s", s);
            if(s == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            switch(s.hashCode()) {
                case 0x1A29CB45: {
                    if(!s.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                        return;
                    }
                    break;
                }
                case 0x2F94F923: {
                    if(!s.equals("android.intent.action.BOOT_COMPLETED")) {
                        return;
                    }
                    break;
                }
                case 898290403: {
                    if(!s.equals("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED")) {
                        return;
                    }
                    break;
                }
                default: {
                    return;
                }
            }
            Context context0 = AppContextProvider.a();
            if(hpgr0.b().b() && bbqs.a(context0)) {
                return;
            }
            if(hpgr0.b().f()) {
                ibuq.c(context0);
                if(!adix.b(context0) && (!hpgr0.b().g() || !adix.c(context0))) {
                    return;
                }
                Object object0 = context0.getSystemService("device_policy");
                ibuq.d(object0, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                if(((DevicePolicyManager)object0).isProfileOwnerApp("com.google.android.gms.supervision")) {
                    return;
                }
                adix.a(context0, adix.d(context0, s));
                return;
            }
            ibuq.c(context0);
            if(!adix.b(context0) || adix.c(context0)) {
                return;
            }
            adix.a(context0, adix.d(context0, s));
            return;
        }
        String s1 = intent0.getAction();
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] onHandleIntent(): " + s1));
        if(hpgr0.b().e()) {
            this.getApplicationContext();
            this.getApplicationContext();
        }
        if(hpgr0.b().c()) {
            gftb.check(s1);
            switch(s1) {
                case "android.intent.action.PACKAGE_ADDED": {
                    goto label_52;
                }
                case "com.google.android.gms.chimera.container.CONTAINER_UPDATED": {
                    goto label_38;
                }
            }
            goto label_49;
        label_38:
            Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] onContainerUpdated"));
            if(hpgr0.b().d()) {
                for(Object object1: bbmn.h(this, "com.google.android.gms")) {
                    Account account0 = (Account)object1;
                    try {
                        acso.j(this, acso.g(this, account0, "ac2dm", Bundle.EMPTY));
                        acso.g(this, account0, "ac2dm", Bundle.EMPTY);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
            else {
                Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Skipping token refresh"));
            }
        label_49:
            if(bbmn.z(this).isEmpty()) {
                return;
            }
            this.a();
            return;
        label_52:
            Uri uri0 = intent0.getData();
            String s2 = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(!gfta.c(s2)) {
                String s3 = hpgr0.b().a();
                if(s3.isEmpty()) {
                    set0 = Collections.EMPTY_SET;
                }
                else {
                    bxf bxf0 = new bxf();
                    Collections.addAll(bxf0, s3.split(","));
                    set0 = bxf0;
                }
                if(set0.contains(s2)) {
                    this.a();
                    return;
                }
                return;
            }
            Log.w("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Dropping " + intent0.getAction() + " Intent with missing package name"));
            return;
        }
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] This operation is disabled"));
    }
}

