import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.internal.SyncStatus;

public final class egmu implements egms {
    public final egmv a;

    public egmu(egmv egmv0) {
        this.a = egmv0;
    }

    @Override  // egms
    public final void a(ExtendedSyncStatus extendedSyncStatus0) {
        eggv eggv0 = this.a.a;
        if(eggv0 != null) {
            try {
                SyncStatus syncStatus0 = new SyncStatus(extendedSyncStatus0.a, extendedSyncStatus0.b, extendedSyncStatus0.c);
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                eggv0.d(egof.a.h, syncStatus0, apiMetadata0);
            }
            catch(RemoteException remoteException0) {
                egig.c("FSA2_PreSyncOp", "Operation failed remotely.", remoteException0);
            }
        }
    }
}

