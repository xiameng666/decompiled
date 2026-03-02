package com.google.android.gms.gservices.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import bbqa;
import com.google.android.chimera.BroadcastReceiver;

public class GservicesChimeraProvider.OverrideReceiver extends BroadcastReceiver {
    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(!bbqa.d()) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                contentValues0.put(((String)object0), bundle0.getString(((String)object0)));
            }
        }
        try {
            context0.getContentResolver().update(GservicesChimeraProvider.a, contentValues0, null, null);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("GservicesProvider", "Failed to update Gservices overrides; caller package: " + this.getSentFromPackage(), illegalArgumentException0);
        }
    }
}

