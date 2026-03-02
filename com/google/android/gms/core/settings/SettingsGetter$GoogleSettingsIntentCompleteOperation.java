package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Bundle;
import avzc;
import bcxv;
import cjah;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import ggtj;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SettingsGetter.GoogleSettingsIntentCompleteOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        return null;
    }

    @Override  // avzc
    public final void onHandleIntent(Intent intent0) {
        if("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent0.getAction()) && !SettingsGetter.GoogleSettingsIntentCompleteOperation.j(intent0, "GmscoreSettingsApiService")) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 == null) {
                throw new IllegalArgumentException("Bundle must not be null.");
            }
            List list0 = cjah.a(bundle0);
            if(bcxv.c != list0) {
                ((ggtj)bcxv.a.h()).x("not the same list, dropping the intent");
            }
            CountDownLatch countDownLatch0 = bcxv.b;
            if(countDownLatch0 != null) {
                countDownLatch0.countDown();
            }
        }
    }
}

