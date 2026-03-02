package com.google.android.gms.clearcut.init;

import android.content.Intent;
import azbu;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import hram;

public class ClearcutBootCompleteIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0xF9F2210E: {
                    if(s.equals("android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED") && !hram.g()) {
                        azbu azbu0 = new azbu();
                        ClearcutLoggerChimeraService.a.execute(azbu0);
                        return;
                    }
                    break;
                }
                case -60251293: {
                    if(s.equals("android.intent.action.CLEARCUT_BOOT_COMPLETED")) {
                        return;
                    }
                    break;
                }
            }
        }
    }
}

