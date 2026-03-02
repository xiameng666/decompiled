package com.google.android.gms.instantapps.ui;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import avzc;
import awkv;
import bbdi;
import bztw;
import caaf;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import evql;
import evrg;
import hoju;
import hugt;
import java.util.concurrent.ExecutionException;

public class SettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!new caaf(this).a()) {
            Log.e("SettingsIntentOperation", String.format("Killed with a switch"));
            return null;
        }
        evql evql0 = new bztw(this).e();
        try {
            evrg.n(evql0);
        }
        catch(ExecutionException | InterruptedException exception0) {
            Log.e("SettingsIntentOperation", String.format("Cannot display Instant Apps settings."), exception0);
            return null;
        }
        Account[] arr_account = ((OptInInfo)evql0.j()).c;
        if(arr_account == null || arr_account.length == 0) {
            Log.w("SettingsIntentOperation", "No accounts");
        }
        if(arr_account != null && arr_account.length > 0) {
            Intent intent0 = new Intent("com.google.android.instantapps.supervisor.SETTINGS_ACTIVITY");
            String s = hugt.f();
            String s1 = hugt.e();
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                intent0.setClassName(s, s1);
                if(hoju.i()) {
                    intent0.addFlags(0x10000000);
                }
                GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 4, 0x7F1515D0, awkv.E, bbdi.el);  // string:instantapps_module_display_name "Google Play Instant"
                googleSettingsItem0.e = true;
                googleSettingsItem0.j = true;
                googleSettingsItem0.m = SettingsChimeraActivity.class.getName();
                googleSettingsItem0.l = true;
                return googleSettingsItem0;
            }
            Log.e("SettingsIntentOperation", String.format("Cannot find settings page in O+"));
            return null;
        }
        return null;
    }
}

