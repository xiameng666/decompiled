import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.internal.SyncStatus;

public final class egmv extends eglh {
    public final eggv a;
    private final Account b;

    public egmv(String s, int v, eggv eggv0, Account account0, azug azug0) {
        super(s, v, account0.name, "PreSync", azug0);
        this.b = account0;
        this.a = eggv0;
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        Account account0 = this.b;
        ContentResolver.getIsSyncable(account0, "com.android.contacts");
        egmw egmw0 = egmw.a(account0, context0);
        hxbk hxbk0 = hxbk.a;
        if(!hxbk0.c().m() && egmw0.b.a(egmw0.a.name)) {
            egig.e("FSA2_PreSyncRunner", "Preliminary sync on dasher account is not supported");
            goto label_9;
        }
        if(!hxbk0.c().n() && egmw0.b.b(egmw0.a.name)) {
            egig.e("FSA2_PreSyncRunner", "Preliminary sync on unicorn account is not supported");
            try {
            label_9:
                SyncStatus syncStatus0 = new SyncStatus(4, "Account/provider not supported.", 0L);
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                this.a.d(egof.d.h, syncStatus0, apiMetadata0);
            }
            catch(RemoteException remoteException0) {
                egig.c("FSA2_PreSyncOp", "Operation failed remotely.", remoteException0);
            }
            return;
        }
        efol efol0 = new efol();
        efol0.a = 80;
        egbh egbh0 = new egbh(context0, efol0.a());
        egbh0.d(new egmt(egbh0, account0, "preliminary_sync", new egmu(this)), false, account0, "preliminary_sync");
        egmw0.b();
        if(hxbk0.c().q()) {
            try {
                SyncStatus syncStatus1 = new SyncStatus(1, "", 0L);
                ApiMetadata apiMetadata1 = cckf.d(bbdp.dW);
                this.a.d(egof.a.h, syncStatus1, apiMetadata1);
            }
            catch(RemoteException remoteException1) {
                egig.c("FSA2_PreSyncOp", "Operation status failed remotely.", remoteException1);
            }
        }
    }
}

