package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import bsog;
import bsvn;
import bsvo;
import bzoe;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import htgo;
import java.io.IOException;

public class GcmInGmsTaskChimeraService extends GmsTaskChimeraService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        switch(cllr0.a) {
            case "direct_boot_registration": {
                if(Log.isLoggable("GCM-GMS", 4)) {
                    Log.i("GCM-GMS", "Registering GMS for direct boot.");
                }
                try {
                    String s = bzoe.h(this).c(htgo.m(), htgo.a.k().ae());
                    if(TextUtils.isEmpty(s)) {
                        Log.w("GCM-GMS", "Failed to get direct boot token, it was empty");
                        return 1;
                    }
                    SharedPreferences.Editor sharedPreferences$Editor0 = bsvn.a(this).edit();
                    sharedPreferences$Editor0.putString("gcm_local_directboot_token", s);
                    sharedPreferences$Editor0.putLong("gcm_local_directboot_time", System.currentTimeMillis());
                    if(Log.isLoggable("GCM-GMS", 4)) {
                        Log.i("GCM-GMS", "Got GMS direct boot token.");
                    }
                    return !sharedPreferences$Editor0.commit() ? 1 : 0;
                }
                catch(IOException iOException0) {
                    if(!Log.isLoggable("GCM-GMS", 5)) {
                        return 1;
                    }
                    Log.w("GCM-GMS", "Failed to get direct boot token: " + iOException0.toString());
                    return 1;
                }
                return 1;
            }
            case "gms_registration": {
                String s1 = htgo.m();
                Log.i("GCM-GMS", "Registering GMS " + s1);
                try {
                    String s2 = bzoe.h(this).c(s1, "GCM");
                    Log.i("GCM-GMS", "Got GMS registration");
                    SharedPreferences sharedPreferences0 = bsog.b(this);
                    String s3 = sharedPreferences0.getString("regId", "");
                    SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences0.edit();
                    sharedPreferences$Editor1.putString("regId", s2);
                    sharedPreferences$Editor1.putString("sender", s1);
                    sharedPreferences$Editor1.putInt("GCM_V", 0xF1B18AD);
                    sharedPreferences$Editor1.putLong("reg_time", System.currentTimeMillis());
                    if(!sharedPreferences$Editor1.commit()) {
                        Log.w("GCM-GMS", "Failed to write GMS registration");
                        return 0;
                    }
                    if(!s2.equals(s3)) {
                        Intent intent0 = new Intent("com.google.android.gms.gcm.REGISTERED");
                        intent0.setPackage("com.google.android.gms");
                        this.sendBroadcast(intent0);
                    }
                    return 0;
                }
                catch(IOException iOException1) {
                    Log.w("GCM-GMS", "Failed to get registration: " + iOException1.toString());
                    return 1;
                }
            }
            case "groups_upload": {
                return bsvo.a(this).c() ? 0 : 1;
            }
            default: {
                Log.e("GCM-GMS", "Unknown task tag: " + cllr0.a);
                return 2;
            }
        }
    }
}

