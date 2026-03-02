import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class egnz {
    public final efpr a;
    public final Object b;
    final Map c;
    private static egnz d;
    private final efur e;

    private egnz(Context context0) {
        this.b = new Object();
        this.c = new HashMap();
        this.e = efur.i(context0.getApplicationContext());
        this.a = efpr.a();
    }

    public static egnz a(Context context0) {
        synchronized(egnz.class) {
            if(egnz.d == null) {
                egnz.d = new egnz(context0);
            }
        }
        return egnz.d;
    }

    public final void b(ExtendedSyncStatus extendedSyncStatus0, Account account0, ArrayList arrayList0) {
        gisf gisf0 = (gisf)((ProtoLiteMessage)gisg.a).v_newBuilder();
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        ((gisg)gisf0.b_message).c = 3;
        ((gisg)gisf0.b_message).b |= 1;
        int v = extendedSyncStatus0.a;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg0 = (gisg)gisf0.b_message;
        gisg0.b |= 2;
        gisg0.e = v;
        int v1 = extendedSyncStatus0.e;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg1 = (gisg)gisf0.b_message;
        gisg1.b |= 4;
        gisg1.f = v1;
        int v2 = extendedSyncStatus0.f;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg2 = (gisg)gisf0.b_message;
        gisg2.b |= 8;
        gisg2.g = v2;
        int v3 = extendedSyncStatus0.g;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg3 = (gisg)gisf0.b_message;
        gisg3.b |= 16;
        gisg3.h = v3;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            int v4 = arrayList0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                gisf0.a(ehji.c(((egny)arrayList0.get(v5)).a, null, 2));
            }
            gisg gisg4 = (gisg)((ProtoLiteBuilder)gisf0).N_build();
            this.a.k(gisg4, account0.name);
            return;
        }
        gisg gisg5 = (gisg)((ProtoLiteBuilder)gisf0).N_build();
        this.a.k(gisg5, account0.name);
    }

    final void c(boolean z, boolean z1, Account account0, efzc efzc0, String s) {
        if(z) {
            String s1 = account0.name;
            ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(this.e.a.getInt(efur.P("ongoing_sync_status_code_", s1, "com.android.contacts"), 5), this.e.a.getString(efur.P("ongoing_sync_status_message_", s1, "com.android.contacts"), ""), 0L, this.e.a.getInt(efur.P("ongoing_sync_status_item_count_", s1, "com.android.contacts"), 0), this.e.a.getInt(efur.P("ongoing_sync_status_stage_", s1, "com.android.contacts"), 0), this.e.a.getInt(efur.P("ongoing_sync_status_data_type_", s1, "com.android.contacts"), 0), 2, this.e.a.getInt(efur.P("ongoing_sync_status_synced_item_count_", s1, "com.android.contacts"), 0), this.e.a.getInt(efur.P("ongoing_sync_status_total_item_count_", s1, "com.android.contacts"), 0));
            if(extendedSyncStatus0.a == 5) {
                extendedSyncStatus0 = new ExtendedSyncStatus(3, "Sync is active.", 0L, -1, 0, 0, 2, -1, -1);
            }
            try {
                if(efzc0 == null) {
                    egig.k("SyncStatusProvider", "Null listener, stop updating sync status.");
                    return;
                }
                egig.e("SyncStatusProvider", a.ab(extendedSyncStatus0, "Sending ongoing status: "));
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                efzc0.z(Status.b, extendedSyncStatus0, apiMetadata0);
                this.f(extendedSyncStatus0, account0, s);
            }
            catch(RemoteException remoteException0) {
                egig.c("SyncStatusProvider", "Operation failed remotely.", remoteException0);
            }
            return;
        }
        this.d(account0, efzc0, z1, s);
    }

    public final void d(Account account0, efzc efzc0, boolean z, String s) {
        boolean z1;
        int v = this.e.e(account0.name, "com.android.contacts");
        String s1 = this.e.k(account0.name, "com.android.contacts");
        long v1 = this.e.h(account0.name, "com.android.contacts");
        int v2 = 2;
        switch(this.e.M(account0.name)) {
            case 2: 
            case 3: {
                z1 = true;
                break;
            }
            default: {
                z1 = false;
            }
        }
        if(!z || !z1) {
            v2 = 0;
        }
        ExtendedSyncStatus extendedSyncStatus0 = new ExtendedSyncStatus(v, s1, v1, -1, v2, 0, (z ? 3 : 1), -1, -1);
        try {
            if(efzc0 == null) {
                egig.k("SyncStatusProvider", "Null listener, stop updating sync status.");
                return;
            }
            egig.e("SyncStatusProvider", a.ab(extendedSyncStatus0, "Sending previous status: "));
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
            efzc0.z(Status.b, extendedSyncStatus0, apiMetadata0);
            this.f(extendedSyncStatus0, account0, s);
        }
        catch(RemoteException remoteException0) {
            egig.c("SyncStatusProvider", "Operation failed remotely.", remoteException0);
        }
    }

    public final void e(int v, Account account0, String s) {
        gisf gisf0 = (gisf)((ProtoLiteMessage)gisg.a).v_newBuilder();
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        ((gisg)gisf0.b_message).c = v - 1;
        ((gisg)gisf0.b_message).b |= 1;
        gisf0.a(ehji.c(s, null, 2));
        gisg gisg0 = (gisg)((ProtoLiteBuilder)gisf0).N_build();
        this.a.k(gisg0, account0.name);
    }

    private final void f(ExtendedSyncStatus extendedSyncStatus0, Account account0, String s) {
        gisf gisf0 = (gisf)((ProtoLiteMessage)gisg.a).v_newBuilder();
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        ((gisg)gisf0.b_message).c = 3;
        ((gisg)gisf0.b_message).b |= 1;
        int v = extendedSyncStatus0.a;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg0 = (gisg)gisf0.b_message;
        gisg0.b |= 2;
        gisg0.e = v;
        int v1 = extendedSyncStatus0.e;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg1 = (gisg)gisf0.b_message;
        gisg1.b |= 4;
        gisg1.f = v1;
        int v2 = extendedSyncStatus0.f;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg2 = (gisg)gisf0.b_message;
        gisg2.b |= 8;
        gisg2.g = v2;
        int v3 = extendedSyncStatus0.g;
        if(!gisf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gisf0).ensureMutable();
        }
        gisg gisg3 = (gisg)gisf0.b_message;
        gisg3.b |= 16;
        gisg3.h = v3;
        gisf0.a(ehji.c(s, null, 2));
        gisg gisg4 = (gisg)((ProtoLiteBuilder)gisf0).N_build();
        this.a.k(gisg4, account0.name);
    }
}

