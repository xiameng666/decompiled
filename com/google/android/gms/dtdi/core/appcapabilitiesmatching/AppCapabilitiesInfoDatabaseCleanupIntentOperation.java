package com.google.android.gms.dtdi.core.appcapabilitiesmatching;

import a;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import bboh;
import bhxf;
import biaw;
import biic;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase;
import ggtj;
import ibuq;
import icbb;

public final class AppCapabilitiesInfoDatabaseCleanupIntentOperation extends IntentOperation {
    public biic a;
    private static final bboh b;

    static {
        AppCapabilitiesInfoDatabaseCleanupIntentOperation.b = bhxf.a("ACIDCleanupIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        biic biic0 = AppCapabilitiesMatchingDatabase.m.a().u();
        ibuq.f(biic0, "<set-?>");
        this.a = biic0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(ibuq.m("android.intent.action.PACKAGE_FULLY_REMOVED", intent0.getAction())) {
            intent0.getAction();
            Uri uri0 = intent0.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(s != null && s.length() != 0) {
                try {
                    if(((Number)icbb.c(new biaw(this, s, null))).intValue() > 0) {
                        goto label_11;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    a.e(AppCapabilitiesInfoDatabaseCleanupIntentOperation.b.j(), "Failed to delete info for package %s", s, sQLiteException0);
                }
                return;
            label_11:
                ((ggtj)AppCapabilitiesInfoDatabaseCleanupIntentOperation.b.h()).B("onHandleIntent: deleted info for package %s", s);
            }
        }
    }
}

