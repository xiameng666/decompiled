import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.backup.ClientInfo;
import com.google.android.gms.backup.extension.backup.CustomBackupRequest;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import com.google.android.gms.backup.extension.backup.HostInfo;
import com.google.android.gms.backup.transport.mms.MmsBackupChimeraService;
import j..util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class arss extends wby implements arst {
    public final AtomicBoolean a;
    public final MmsBackupChimeraService b;

    public arss() {
        super("com.google.android.gms.backup.extension.backup.ICustomBackupService");
    }

    public arss(MmsBackupChimeraService mmsBackupChimeraService0) {
        Objects.requireNonNull(mmsBackupChimeraService0);
        this.b = mmsBackupChimeraService0;
        super("com.google.android.gms.backup.extension.backup.ICustomBackupService");
        this.a = new AtomicBoolean(false);
    }

    @Override  // arst
    public final void a(arsq arsq0) {
        ccmq.a().a(bbdg.mi);
        this.a.set(true);
        MmsBackupChimeraService mmsBackupChimeraService0 = this.b;
        aqys aqys0 = mmsBackupChimeraService0.g;
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidr)hftp1.b_message).c = 10;
        ((gidr)hftp1.b_message).b |= 1;
        gidr gidr0 = (gidr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidr0.getClass();
        ghys0.H = gidr0;
        ghys0.c |= 0x400;
        aqys0.x(hftp0, ghyr.O, aqys0.c);
        mmsBackupChimeraService0.f.shutdownNow();
        try {
            mmsBackupChimeraService0.f.awaitTermination(5L, TimeUnit.MINUTES);
        }
        catch(InterruptedException interruptedException0) {
            MmsBackupChimeraService.a.g("executor.awaitTermination interruptedException", interruptedException0, new Object[0]);
        }
        MmsBackupChimeraService.e = false;
    }

    @Override  // arst
    public final void b(arsq arsq0, HostInfo hostInfo0) {
        ccmq.a().a(bbdg.mi);
        ClientInfo clientInfo0 = new ClientInfo(1);
        try {
            arsq0.b(clientInfo0);
        }
        catch(RemoteException remoteException0) {
            MmsBackupChimeraService.a.n("Error communicating custom backup handshake", remoteException0, new Object[0]);
        }
    }

    @Override  // arst
    public final void c(arsq arsq0, CustomBackupRequest customBackupRequest0) {
        ccmq.a().a(bbdg.mi);
        if(hqje.E()) {
            if(MmsBackupChimeraService.e) {
                this.b.g.j(11);
                try {
                    arsq0.a(new CustomBackupResult(false, "ONGOING_BACKUP"));
                }
                catch(RemoteException remoteException0) {
                    MmsBackupChimeraService.a.n("Error communicating backup progress state", remoteException0, new Object[0]);
                }
                return;
            }
            MmsBackupChimeraService.e = true;
        }
        atjk atjk0 = new atjk(this, arsq0);
        this.b.f.execute(atjk0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        arsq arsq0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.backup.ICustomBackupCallback");
                    arsq0 = (iInterface0 instanceof arsq) ? ((arsq)iInterface0) : new arso(iBinder0);
                }
                HostInfo hostInfo0 = (HostInfo)wbz.a(parcel0, HostInfo.CREATOR);
                arss.gr(parcel0);
                this.b(arsq0, hostInfo0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.extension.backup.ICustomBackupCallback");
                    arsq0 = (iInterface1 instanceof arsq) ? ((arsq)iInterface1) : new arso(iBinder1);
                }
                CustomBackupRequest customBackupRequest0 = (CustomBackupRequest)wbz.a(parcel0, CustomBackupRequest.CREATOR);
                arss.gr(parcel0);
                this.c(arsq0, customBackupRequest0);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.backup.extension.backup.ICustomBackupCallback");
                    arsq0 = (iInterface2 instanceof arsq) ? ((arsq)iInterface2) : new arso(iBinder2);
                }
                arss.gr(parcel0);
                this.a(arsq0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

