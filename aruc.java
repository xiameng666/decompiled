import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.download.ClientInfo;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadRequest;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;
import com.google.android.gms.backup.extension.download.HostInfo;
import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aruc extends wby implements arud {
    public final AtomicBoolean a;
    public final MmsRestoreChimeraService b;

    public aruc() {
        super("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloaderService");
    }

    public aruc(MmsRestoreChimeraService mmsRestoreChimeraService0) {
        Objects.requireNonNull(mmsRestoreChimeraService0);
        this.b = mmsRestoreChimeraService0;
        super("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloaderService");
        this.a = new AtomicBoolean(false);
    }

    @Override  // arud
    public final void a(arua arua0) {
        this.a.set(true);
    }

    @Override  // arud
    public final void b(arua arua0, HostInfo hostInfo0) {
        ClientInfo clientInfo0 = new ClientInfo(1);
        try {
            arua0.b(clientInfo0);
        }
        catch(RemoteException remoteException0) {
            MmsRestoreChimeraService.a.n("Error while performing custom restore handshake", remoteException0, new Object[0]);
        }
    }

    @Override  // arud
    public final void c(arua arua0, CustomBackupDataDownloadRequest customBackupDataDownloadRequest0) {
        MmsRestoreChimeraService mmsRestoreChimeraService0 = this.b;
        if(!asdc.q(mmsRestoreChimeraService0)) {
            arua0.a(new CustomBackupDataDownloadResult(false, "Mms restore not enabled"));
            return;
        }
        if(mmsRestoreChimeraService0.b == null) {
            mmsRestoreChimeraService0.b = new aqys(mmsRestoreChimeraService0);
        }
        atjl atjl0 = new atjl(this, arua0);
        mmsRestoreChimeraService0.c.execute(atjl0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        arua arua0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloadCallback");
                    arua0 = (iInterface0 instanceof arua) ? ((arua)iInterface0) : new arty(iBinder0);
                }
                HostInfo hostInfo0 = (HostInfo)wbz.a(parcel0, HostInfo.CREATOR);
                aruc.gr(parcel0);
                this.b(arua0, hostInfo0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloadCallback");
                    arua0 = (iInterface1 instanceof arua) ? ((arua)iInterface1) : new arty(iBinder1);
                }
                CustomBackupDataDownloadRequest customBackupDataDownloadRequest0 = (CustomBackupDataDownloadRequest)wbz.a(parcel0, CustomBackupDataDownloadRequest.CREATOR);
                aruc.gr(parcel0);
                this.c(arua0, customBackupDataDownloadRequest0);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloadCallback");
                    arua0 = (iInterface2 instanceof arua) ? ((arua)iInterface2) : new arty(iBinder2);
                }
                aruc.gr(parcel0);
                this.a(arua0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

