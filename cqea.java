import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import dagger.internal.InstanceFactory;

public final class cqea extends wby implements cjug, cqeb {
    private final cjts a;
    private final String b;
    private final cqgj c;
    private final String d;
    private final fiyj e;

    public cqea() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncService");
    }

    public cqea(cjts cjts0, cqgj cqgj0, String s, fiyj fiyj0, String s1) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncService");
        this.b = s1;
        this.a = cjts0;
        this.c = cqgj0;
        this.d = s;
        this.e = fiyj0;
    }

    @Override  // cqeb
    public final void a(cqdy cqdy0, SyncRequest syncRequest0, CallerInfo callerInfo0, ApiMetadata apiMetadata0) {
        this.e.b().ar(7122).Y("Received request for operation \'%d\' from package \'%s\', instance id \'%s\', version \'%d\'...", Integer.valueOf(syncRequest0.a.f), this.d, callerInfo0.a, Long.valueOf(callerInfo0.b));
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cL);
        azuf0.g(bbdq.ah);
        azuf0.d(this.d);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        cqgr cqgr0 = (cqgr)this.c.a.get();
        cqgr0.getClass();
        cmbm cmbm0 = (cmbm)this.c.b.get();
        cmbm0.getClass();
        bblp bblp0 = new bblp(2, 10);
        cqeo cqeo0 = (cqeo)this.c.d.get();
        cqeo0.getClass();
        cqel cqel0 = (cqel)this.c.e.get();
        cqel0.getClass();
        String s = (String)((InstanceFactory)this.c.f).a;
        s.getClass();
        String s1 = (String)((InstanceFactory)this.c.g).a;
        Account account0 = (Account)((InstanceFactory)this.c.h).a;
        account0.getClass();
        fiyj fiyj0 = (fiyj)this.c.i.get();
        fiyj0.getClass();
        cqdy0.getClass();
        syncRequest0.getClass();
        callerInfo0.getClass();
        cqgi cqgi0 = new cqgi(cqgr0, cmbm0, bblp0, cqeo0, cqel0, s, account0, fiyj0, cqdy0, syncRequest0, callerInfo0, azug0);
        this.a.b(cqgi0);
        this.e.b().ar(7123).z("Operation \'%s\' dispatched!", syncRequest0.a.f);
    }

    @Override  // cqeb
    public final void b(cqdy cqdy0, TeleportingSyncRequest teleportingSyncRequest0, CallerInfo callerInfo0, ApiMetadata apiMetadata0) {
        this.a(cqdy0, teleportingSyncRequest0.a, callerInfo0, apiMetadata0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cqdy cqdy0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
                    cqdy0 = (iInterface0 instanceof cqdy) ? ((cqdy)iInterface0) : new cqdw(iBinder0);
                }
                SyncRequest syncRequest0 = (SyncRequest)wbz.a(parcel0, SyncRequest.CREATOR);
                CallerInfo callerInfo0 = (CallerInfo)wbz.a(parcel0, CallerInfo.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cqea.gr(parcel0);
                this.a(cqdy0, syncRequest0, callerInfo0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
                    cqdy0 = (iInterface1 instanceof cqdy) ? ((cqdy)iInterface1) : new cqdw(iBinder1);
                }
                TeleportingSyncRequest teleportingSyncRequest0 = (TeleportingSyncRequest)wbz.a(parcel0, TeleportingSyncRequest.CREATOR);
                CallerInfo callerInfo1 = (CallerInfo)wbz.a(parcel0, CallerInfo.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cqea.gr(parcel0);
                this.b(cqdy0, teleportingSyncRequest0, callerInfo1, apiMetadata1);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

