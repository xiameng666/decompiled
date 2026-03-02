import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.recovery.KeyRecoveryIntentOperation;
import jeb.synthetic.TWR;

public final class ajxp implements Runnable {
    public final KeyRecoveryIntentOperation a;
    public final Bundle b;
    public final PendingIntent c;

    public ajxp(KeyRecoveryIntentOperation keyRecoveryIntentOperation0, Bundle bundle0, PendingIntent pendingIntent0) {
        this.a = keyRecoveryIntentOperation0;
        this.b = bundle0;
        this.c = pendingIntent0;
    }

    @Override
    public final void run() {
        gmlo gmlo0;
        gmlm gmlm0;
        ajxq ajxq0;
        PendingIntent pendingIntent0;
        KeyRecoveryIntentOperation keyRecoveryIntentOperation0;
        try {
            keyRecoveryIntentOperation0 = this.a;
            pendingIntent0 = this.c;
            ajxq0 = ajxq.a(this.b);
        }
        catch(ajxr ajxr0) {
            KeyRecoveryIntentOperation.a.g("Exception creating recoveryData", ajxr0, new Object[0]);
            keyRecoveryIntentOperation0.a(pendingIntent0, ajxr0.a);
            return;
        }
        ajxo ajxo0 = new ajxo(keyRecoveryIntentOperation0, ajxq0, keyRecoveryIntentOperation0.b);
        try {
            KeyRecoveryIntentOperation.a.h("Sending start recovery request to VaultService", new Object[0]);
            try {
                gmlm0 = ajxo0.a();
                goto label_22;
            }
            catch(ajqz ajqz0) {
            }
            catch(ajxr ajxr1) {
                goto label_18;
            }
            KeyRecoveryIntentOperation.a.g("Network exception while performing recovery", ajqz0, new Object[0]);
            keyRecoveryIntentOperation0.a(pendingIntent0, 10);
        }
        catch(Throwable throwable0) {
            goto label_52;
        }
        ajxo0.close();
        return;
        try {
        label_18:
            KeyRecoveryIntentOperation.a.g("Exception while performing recovery", ajxr1, new Object[0]);
            keyRecoveryIntentOperation0.a(pendingIntent0, ajxr1.a);
        }
        catch(Throwable throwable0) {
            goto label_52;
        }
        ajxo0.close();
        return;
        try {
        label_22:
            gmlo0 = gmlo.b(gmlm0.b) == null ? gmlo.l : gmlo.b(gmlm0.b);
            KeyRecoveryIntentOperation.a.h("OpenVault result %s", new Object[]{gmlo0.toString()});
            if(gmlo0 == gmlo.b) {
                try {
                    ajxo0.b(null);
                    goto label_32;
                }
                catch(ajxr ajxr2) {
                }
                KeyRecoveryIntentOperation.a.g("Recovery Exception", ajxr2, new Object[0]);
                keyRecoveryIntentOperation0.a(pendingIntent0, ajxr2.a);
                goto label_30;
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_52;
        }
    label_30:
        ajxo0.close();
        return;
        try {
        label_32:
            hfst hfst0 = gmlm0.d == null ? hfst.a : gmlm0.d;
            int v = ajxs.b(gmlo0);
            keyRecoveryIntentOperation0.b(pendingIntent0, v, hfst0);
            if(v == 2) {
                baun baun0 = KeyRecoveryIntentOperation.a;
                baun0.d("broadcasting a successful recovery.", new Object[0]);
                Intent intent0 = IntentOperation.getStartIntent(keyRecoveryIntentOperation0, "com.google.android.gms.auth.blockstore.service.FolsomIntentOperation", "com.google.android.gms.auth.folsom.SUCCESSFUL_RECOVERY");
                if(intent0 == null) {
                    baun0.f("Failed to get Blockstore FolsomIntentOperation", new Object[0]);
                }
                else {
                    try {
                        long v1 = ajwp.a(ajxq0.h.toByteArray());
                        Bundle bundle0 = new Bundle();
                        bundle0.putLong("com.google.android.gms.auth.folsom.EXTRA_SOURCE_ANDROID_ID", v1);
                        intent0.putExtras(bundle0);
                        keyRecoveryIntentOperation0.startService(intent0);
                    }
                    catch(akbi akbi0) {
                        KeyRecoveryIntentOperation.a.g("sendSuccessfulRecoveryBroadcast failed with FolsomSyncException", akbi0, new Object[0]);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
        label_52:
            TWR.safeClose$NT(ajxo0, throwable0);
            throw throwable0;
        }
        ajxo0.close();
    }
}

