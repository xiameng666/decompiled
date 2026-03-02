package com.google.android.gms.backup.g1.restore.photos;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import aqee;
import aqql;
import arzn;
import asdc;
import azox;
import bbic;
import clht;
import cljp;
import clkn;
import clko;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.photos.restore.api.RestoreCapability;
import fpuh;
import hqje;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class StartPhotosRestoreIntentOperation extends IntentOperation {
    private static final aqql a;
    private static final long b;

    static {
        StartPhotosRestoreIntentOperation.a = new aqql(new String[]{"StartPhotosRestoreIntentOperation"});
        StartPhotosRestoreIntentOperation.b = TimeUnit.SECONDS.toMillis(5L);
    }

    private final void a() {
        Intent intent0 = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        azox azox0 = new azox();
        fpuh fpuh0 = null;
        if(bbic.a().d(this, intent0, azox0, 1)) {
            try {
                IBinder iBinder0 = azox0.b(StartPhotosRestoreIntentOperation.b, TimeUnit.MILLISECONDS);
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                fpuh0 = (iInterface0 instanceof fpuh) ? ((fpuh)iInterface0) : new fpuh(iBinder0);
            }
            catch(InterruptedException | TimeoutException exception0) {
                StartPhotosRestoreIntentOperation.a.l(exception0);
            }
        }
        if(fpuh0 != null) {
            try {
                RestoreCapability restoreCapability0 = fpuh0.a();
            }
            catch(RemoteException remoteException0) {
                StartPhotosRestoreIntentOperation.a.n("getRestoreCapability failed", remoteException0, new Object[0]);
                new clht(Looper.getMainLooper()).post(new arzn(this));
                goto label_47;
            }
            if(restoreCapability0 == null) {
            }
            else if(restoreCapability0.a) {
                Intent intent1 = IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT");
                asdc asdc0 = asdc.a;
                Account account0 = new aqee(this).a();
                if(account0 != null && account0.name != null) {
                    try {
                        if(fpuh0.b(account0.name, PendingIntent.getService(this, 0, intent1, 0xA000000))) {
                            goto label_29;
                        }
                        else {
                            goto label_38;
                        }
                    }
                    catch(RemoteException remoteException1) {
                        StartPhotosRestoreIntentOperation.a.n("requestRestore failed", remoteException1, new Object[0]);
                        new clht(Looper.getMainLooper()).post(new arzn(this));
                    }
                    goto label_47;
                label_29:
                    asdc0.g(this, true);
                    clkn clkn0 = new clkn();
                    clkn0.j = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
                    clkn0.e(hqje.f(), hqje.e());
                    clkn0.t("com.google.android.gms.backup.g1.restore.REVIVE_SERVICE");
                    clkn0.p = true;
                    clko clko0 = clkn0.a();
                    cljp.a(this).f(clko0);
                    goto label_47;
                }
            }
        }
    label_38:
        new clht(Looper.getMainLooper()).post(new arzn(this));
        try {
        label_47:
            bbic.a().b(this, azox0);
        }
        catch(IllegalArgumentException | IllegalStateException exception1) {
            StartPhotosRestoreIntentOperation.a.l(exception1);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hqje.p() && !asdc.n(this) && asdc.k(this) == 1) {
            this.a();
        }
    }
}

