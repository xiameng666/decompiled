import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import java.util.ArrayList;
import java.util.Map;

public final class egnx extends eglh {
    private final efzc a;
    private final Account b;
    private final String c;
    private final boolean d;
    private final String e;

    public egnx(String s, int v, boolean z, Account account0, String s1, String s2, efzc efzc0, azug azug0) {
        super(s, v, account0.name, "UpdateSyncStatus", azug0);
        this.a = efzc0;
        this.b = account0;
        this.c = s1;
        this.d = z;
        this.e = s2;
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        boolean z2;
        Account account0 = this.b;
        String s = this.c;
        if(!egoe.a(account0, s)) {
            egig.d("BasePeopleOperation", "Sync status not supported with account: %s, authority: %s.", new Object[]{account0.name, s});
            efzc efzc0 = this.a;
            if(efzc0 == null) {
                return;
            }
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(4, "Account/provider not supported.", 0L, -1, 0, 0, 0, -1, -1);
            try {
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                efzc0.z(Status.b, extendedSyncStatus0, apiMetadata0);
            }
            catch(RemoteException remoteException0) {
                egig.c("BasePeopleOperation", "Operation failed remotely.", remoteException0);
            }
            return;
        }
        hxdl hxdl0 = hxdl.a;
        if(hxdl0.b().g() && !egyf.b(context0)) {
            ExtendedSyncStatus extendedSyncStatus1 = new ExtendedSyncStatus(9, "GmsCore has no CONTACTS permission.", 0L, -1, 0, 0, 0, -1, -1);
            efzc efzc1 = this.a;
            if(efzc1 != null) {
                try {
                    ApiMetadata apiMetadata1 = cckf.d(bbdp.dW);
                    efzc1.z(Status.b, extendedSyncStatus1, apiMetadata1);
                    return;
                }
                catch(RemoteException remoteException1) {
                    egig.c("BasePeopleOperation", "Operation failed remotely.", remoteException1);
                }
            }
            return;
        }
        egnz egnz0 = egnz.a(context0);
        efzc efzc2 = this.a;
        boolean z = this.d;
        Account account1 = this.b;
        String s1 = this.g;
        int v = this.h;
        String s2 = this.e;
        boolean z1 = ContentResolver.isSyncActive(account1, "com.android.contacts");
        int v1 = 0;
        if(efzc2 == null || z1) {
            z2 = false;
        }
        else if(!z) {
            if(!hxdl0.b().a()) {
                egnz0.d(account1, efzc2, false, s1);
                return;
            }
            z2 = false;
        }
        else {
            Bundle bundle0 = new Bundle();
            z2 = true;
            bundle0.putBoolean("force", true);
            bundle0.putBoolean("expedited", true);
            ContentResolver.requestSync(account1, "com.android.contacts", bundle0);
        }
        synchronized(egnz0.b) {
            Map map0 = egnz0.c;
            ArrayList arrayList0 = (ArrayList)map0.get(account1);
            if(arrayList0 == null) {
                if(efzc2 == null) {
                    return;
                }
                arrayList0 = new ArrayList();
                map0.put(account1, arrayList0);
            }
            while(v1 < arrayList0.size()) {
                egny egny0 = (egny)arrayList0.get(v1);
                if(!hxdl0.b().c()) {
                    if(s1.equals(egny0.a) && v == egny0.b) {
                    label_64:
                        if(efzc2 == null) {
                            arrayList0.remove(v1);
                            if(arrayList0.isEmpty()) {
                                map0.remove(account1);
                                egig.e("SyncStatusProvider", "Removed listener");
                            }
                            egnz0.e(3, account1, s1);
                        }
                        else {
                            egny0.c = efzc2;
                            egig.e("SyncStatusProvider", "Updated listener");
                            egnz0.c(z1, z2, account1, efzc2, s1);
                        }
                        return;
                    }
                }
                else if(s1.equals(egny0.a) && v == egny0.b && s2.equals(egny0.d)) {
                    goto label_64;
                }
                z2 = z2;
                ++v1;
            }
            egnz0.c(z1, z2, account1, efzc2, s1);
            arrayList0.add(new egny(s1, v, s2, efzc2));
            egig.e("SyncStatusProvider", "Added listener");
            egnz0.e(2, account1, s1);
        }
    }
}

