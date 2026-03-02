import android.accounts.Account;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class alen {
    public static final int a;
    private static final baun b;

    static {
        alen.b = new baun("ProximityAuth", new String[]{"CryptauthPostSyncProcessor"});
    }

    public static final void a(Context context0, Account account0) {
        batl.j();
        List list0 = alft.b(context0.getApplicationContext(), false, null);
        if(list0 == null) {
            alen.b.m("Failed to fetch new devices.", new Object[0]);
            return;
        }
        if(hpyw.g() && account0 != null) {
            SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(context0.getApplicationContext(), account0.name);
            if(syncedCryptauthDevice0 == null) {
                alen.b.m("Failed to get my synced metadata.", new Object[0]);
                return;
            }
            list0.add(syncedCryptauthDevice0);
            if(hpyz.j()) {
                akwr.a(context0).c(account0, syncedCryptauthDevice0);
            }
            String s = account0.name;
            Intent intent0 = IntentOperation.getStartIntent(context0, BetterTogetherUnifiedSetupIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.UNIFIED_SETUP_REQUESTED");
            intent0.putExtra("EXTRA_ACCOUNT_NAME_FOR_SETUP", s);
            context0.startService(intent0);
        }
        Intent intent1 = new Intent("com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED").setPackage("com.google.android.gms");
        if(account0 != null) {
            intent1.putExtra("account_id", account0.name);
        }
        context0.sendBroadcast(intent1);
        context0.startService(PhoneHubChimeraService.a(context0));
        if(albt.c()) {
            context0.startService(ExoChimeraService.a(context0, "Cryptauth"));
        }
        alhm.a(context0).a();
        algs algs0 = algs.a();
        try {
            gmce gmce0 = new gmce(new algr(algs0));
            algs0.e(gmce0);
            List list1 = (List)gmce0.get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            alen.b.m("Failed to fetch subscriptions.", new Object[0]);
            return;
        }
        if(!list1.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription0 = (SyncedDevicesUpdateSubscription)object0;
                int v = SyncedDevicesUpdateSubscription.c(list0, syncedDevicesUpdateSubscription0.b);
                if(v == syncedDevicesUpdateSubscription0.d) {
                    continue;
                    try {
                    label_40:
                        syncedDevicesUpdateSubscription0.d(context0, null);
                    }
                    catch(PendingIntent.CanceledException unused_ex) {
                        arrayList0.add(algs0.d(syncedDevicesUpdateSubscription0));
                    }
                    arrayList0.add(algs0.b(new SyncedDevicesUpdateSubscription(syncedDevicesUpdateSubscription0.a, syncedDevicesUpdateSubscription0.b, syncedDevicesUpdateSubscription0.c, v)));
                    continue;
                }
                else {
                    goto label_40;
                }
                break;
            }
            try {
                for(Object object1: ((List)((glyq)gmbu.e(arrayList0)).u())) {
                    Status status0 = (Status)object1;
                    if(!status0.equals(Status.b)) {
                        alen.b.m("Failed to update cache subscription. %s", new Object[]{status0});
                    }
                }
                return;
            }
            catch(InterruptedException | ExecutionException exception0) {
                goto label_54;
            }
        }
        return;
    label_54:
        alen.b.n("Failed to update cache subscriptions.", exception0, new Object[0]);
    }
}

