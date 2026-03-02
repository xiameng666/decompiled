import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import java.util.ArrayList;

public final class egoa extends eglh {
    private final efzc a;
    private final ExtendedSyncStatus b;
    private final Account c;

    public egoa(String s, int v, Account account0, efzc efzc0, ExtendedSyncStatus extendedSyncStatus0, azug azug0) {
        super(s, v, account0.name, "UpdateSyncStatus", azug0);
        this.a = efzc0;
        this.b = extendedSyncStatus0;
        this.c = account0;
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        if(this.g.equals("com.google.android.gms") && "com.google".equals(this.c.type)) {
            egnz egnz0 = egnz.a(context0);
            Account account0 = this.c;
            efzc efzc0 = this.a;
            ExtendedSyncStatus extendedSyncStatus0 = this.b;
            Object object0 = egnz0.b;
            synchronized(object0) {
                ArrayList arrayList0 = (ArrayList)egnz0.c.get(account0);
                if(arrayList0 == null) {
                    egnz0.b(extendedSyncStatus0, account0, null);
                    return;
                }
                for(Object object1: arrayList0) {
                    egny egny0 = (egny)object1;
                    try {
                        if(egny0.c == null) {
                            continue;
                        }
                        egig.e("SyncStatusProvider", "Sending status update: " + extendedSyncStatus0);
                        efzc efzc1 = egny0.c;
                        ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                        efzc1.z(Status.b, extendedSyncStatus0, apiMetadata0);
                    }
                    catch(RemoteException remoteException0) {
                        egig.c("SyncStatusProvider", "Operation failed remotely.", remoteException0);
                    }
                }
                egnz0.b(extendedSyncStatus0, account0, arrayList0);
                if(!hxdl.a.b().f() && extendedSyncStatus0.e == 0 && extendedSyncStatus0.f == 0 && extendedSyncStatus0.a == 1) {
                    if(!arrayList0.isEmpty()) {
                        gisf gisf0 = (gisf)((ProtoLiteMessage)gisg.a).v_newBuilder();
                        if(!gisf0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gisf0).ensureMutable();
                        }
                        ((gisg)gisf0.b_message).c = 2;
                        ((gisg)gisf0.b_message).b |= 1;
                        int v1 = arrayList0.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            gisf0.a(ehji.c(((egny)arrayList0.get(v2)).a, null, 2));
                        }
                        gisg gisg0 = (gisg)((ProtoLiteBuilder)gisf0).N_build();
                        egnz0.a.k(gisg0, account0.name);
                    }
                    egnz0.c.remove(account0);
                    egig.e("SyncStatusProvider", "Listener removed");
                }
                if(efzc0 != null) {
                    try {
                        efzc0.B(Status.b, ApiMetadata.b);
                    }
                    catch(RemoteException remoteException1) {
                        egig.c("SyncStatusProvider", "Operation failed remotely.", remoteException1);
                    }
                }
            }
            return;
        }
        efzc efzc2 = this.a;
        if(efzc2 == null) {
            return;
        }
        try {
            efzc2.B(Status.d, ApiMetadata.b);
        }
        catch(RemoteException remoteException2) {
            egig.c("BasePeopleOperation", "Operation failed remotely.", remoteException2);
        }
    }
}

