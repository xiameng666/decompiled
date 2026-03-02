package com.google.android.gms.cast.devicesuggestions.liaclient;

import android.content.Context;
import android.content.Intent;
import auej;
import auel;
import auem;
import auez;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import ggtj;
import ibuq;
import java.util.concurrent.Executor;

public final class LiaSettingStateIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        LiaSettingStateIntentOperation.a = bboh.b("device_suggestions", bbcu.gU);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && ibuq.m(intent0.getAction(), "com.google.android.gms.actionlearner.settings.LIA_SETTINGS_CHANGED")) {
            ((ggtj)LiaSettingStateIntentOperation.a.h()).x("Intent engine setting state changed.");
            Context context0 = AppContextProvider.a();
            Intent intent1 = new Intent().setClassName(this, "com.google.android.gms.cast.devicesuggestions.SuggestionsProviderChimeraService");
            ibuq.e(intent1, "setClassName(...)");
            ibuq.e("com.google.android.gms", "getPackageName(...)");
            auez auez0 = auej.a("com.google.android.gms");
            Executor executor0 = context0.getMainExecutor();
            ibuq.e(executor0, "getMainExecutor(...)");
            auez0.b(executor0, new auel(this, intent1), new auem(this, intent1));
        }
    }
}

