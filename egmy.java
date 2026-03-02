import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.internal.SyncStatus;

public final class egmy extends eglh {
    protected final int a;
    private final eggv b;
    private final Account c;
    private final String d;

    public egmy(String s, int v, eggv eggv0, Account account0, String s1, String s2, int v1, azug azug0) {
        super(s, v, account0.name, s2, azug0);
        this.b = eggv0;
        this.c = account0;
        this.d = s1;
        this.a = v1;
    }

    // Detected as a lambda impl.
    public final void b(int v, String s, long v1) {
        int v3;
        SyncStatus syncStatus0 = new SyncStatus(v, s, v1);
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        int v2 = this.a;
        gioy gioy0 = (gioy)giou0.b_message;
        if(v2 == 0) {
            throw null;
        }
        gioy0.c = v2 - 1;
        gioy0.b |= 1;
        String s1 = this.g;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = ehji.a(s1) - 1;
        ((gioy)giou0.b_message).b |= 4;
        eggv eggv0 = this.b;
        if(eggv0 != null) {
            try {
                try {
                    v3 = v == 4 ? 5 : 2;
                    ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                    eggv0.d(egof.a.h, syncStatus0, apiMetadata0);
                    goto label_36;
                }
                catch(RemoteException remoteException0) {
                }
                egig.c("BasePeopleOperation", "Operation failed remotely.", remoteException0);
            }
            catch(Throwable throwable0) {
                goto label_29;
            }
            efpr efpr0 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 5;
            ((gioy)giou0.b_message).b |= 2;
            efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            return;
        label_29:
            efpr efpr1 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = v3 - 1;
            ((gioy)giou0.b_message).b |= 2;
            efpr1.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            throw throwable0;
        label_36:
            efpr0 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = v3 - 1;
            ((gioy)giou0.b_message).b |= 2;
            efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
        }
    }

    @Override  // eglh
    public final void d(Context context0, azug azug0) {
        egiv.R();
        Account account0 = this.c;
        String s = this.d;
        if(!egoe.a(account0, s)) {
            egig.d("BasePeopleOperation", "Sync not supported with account: %s, authority: %s.", new Object[]{account0.name, s});
            this.b(4, "Account/provider not supported.", 0L);
            return;
        }
        int v = ContentResolver.getIsSyncable(account0, s);
        if(v <= 0) {
            hwzc hwzc0 = hwzc.a;
            boolean z = hwzc0.c().aE();
            Boolean.valueOf(z).getClass();
            if(!z) {
            label_15:
                boolean z1 = hwzc0.c().ba();
                Boolean.valueOf(z1).getClass();
                if(z1 && v == 0) {
                    ContentResolver.setIsSyncable(account0, s, 1);
                    goto label_23;
                }
                egig.d("BasePeopleOperation", "Not syncable with account: %s, authority: %s.", new Object[]{account0.name, s});
                this.b(2, "Not syncable.", 0L);
                return;
            }
            else if(v >= 0) {
                v = 0;
                goto label_15;
            }
        }
    label_23:
        efol efol0 = new efol();
        efol0.a = 80;
        egbh egbh0 = new egbh(context0, efol0.a());
        egbh0.d(new egmt(egbh0, account0, "request_sync_with_status", (/* MISSING LAMBDA PARAMETER */) -> {
            int v3;
            SyncStatus syncStatus0 = new SyncStatus(extendedSyncStatus0.a, extendedSyncStatus0.b, extendedSyncStatus0.c);
            giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            int v2 = this.a;
            gioy gioy0 = (gioy)giou0.b_message;
            if(v2 == 0) {
                throw null;
            }
            gioy0.c = v2 - 1;
            gioy0.b |= 1;
            String s1 = this.g;
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).e = ehji.a(s1) - 1;
            ((gioy)giou0.b_message).b |= 4;
            eggv eggv0 = this.b;
            if(eggv0 != null) {
                try {
                    try {
                        v3 = extendedSyncStatus0.a == 4 ? 5 : 2;
                        ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                        eggv0.d(egof.a.h, syncStatus0, apiMetadata0);
                        goto label_36;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    egig.c("BasePeopleOperation", "Operation failed remotely.", remoteException0);
                }
                catch(Throwable throwable0) {
                    goto label_29;
                }
                efpr efpr0 = efpr.a();
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 5;
                ((gioy)giou0.b_message).b |= 2;
                efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
                return;
            label_29:
                efpr efpr1 = efpr.a();
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = v3 - 1;
                ((gioy)giou0.b_message).b |= 2;
                efpr1.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
                throw throwable0;
            label_36:
                efpr0 = efpr.a();
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = v3 - 1;
                ((gioy)giou0.b_message).b |= 2;
                efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            }
        }), true, account0, "request_sync_with_status");
    }
}

