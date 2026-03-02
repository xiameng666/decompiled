import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Map;

public final class arvn extends wby implements arvo {
    final CustomBackupDownloadManagerChimeraService a;

    public arvn() {
        super("com.google.android.gms.backup.extension.internal.ICustomBackupDownloadManagerService");
    }

    public arvn(CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0) {
        Objects.requireNonNull(customBackupDownloadManagerChimeraService0);
        this.a = customBackupDownloadManagerChimeraService0;
        super("com.google.android.gms.backup.extension.internal.ICustomBackupDownloadManagerService");
    }

    @Override  // arvo
    public final void a(String s) {
        CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0 = this.a;
        synchronized(customBackupDownloadManagerChimeraService0.c) {
            CustomBackupDownloadManagerChimeraService.a.d("Cancelling download for package: %s", new Object[]{s});
            if(s.equals(customBackupDownloadManagerChimeraService0.e)) {
                artg artg0 = customBackupDownloadManagerChimeraService0.f;
                synchronized(artg0.f) {
                    if(artg0.f()) {
                        try {
                            try {
                                artg0.j.a(artg0.k);
                                artg0.d.a(artg0.c, artg0.i, artg0.h);
                            }
                            catch(RemoteException remoteException0) {
                                artg.a.g("Remote exception caught during cancel()", remoteException0, new Object[0]);
                            }
                        }
                        catch(Throwable throwable2) {
                            artg0.b(gfqx.a);
                            throw throwable2;
                        }
                        artg0.b(gfqx.a);
                    }
                    else {
                        artg.a.f("Not connected to package: %s", new Object[]{artg0.c});
                    }
                }
                CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService1 = this.a;
                if(((Boolean)customBackupDownloadManagerChimeraService1.i.mr()).booleanValue() && customBackupDownloadManagerChimeraService1.j != null) {
                    try {
                        CustomBackupDownloadManagerChimeraService.a.d("Sending cancel message for SUW portal", new Object[0]);
                        customBackupDownloadManagerChimeraService1.j.a(0x7F13000B, 0, new int[0]);  // plurals:backup_extension_data_restore_cancel_or_failure_notification_for_portal
                    }
                    catch(RemoteException remoteException1) {
                        CustomBackupDownloadManagerChimeraService.a.m("Exception when sending cancel message for SUW portal %s", new Object[]{remoteException1.getMessage()});
                    }
                }
            }
            else {
                new arue(customBackupDownloadManagerChimeraService0).a(s, -1, -1.0f);
            }
        }
    }

    @Override  // arvo
    public final void b(String[] arr_s) {
        CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0 = this.a;
        arue arue0 = new arue(customBackupDownloadManagerChimeraService0);
        gged_interceptors gged0 = gged_interceptors.k(arr_s);
        CustomBackupDownloadManagerChimeraService.a.d("Applying user consent for packages: %s", new Object[]{gged0});
        gged_interceptors gged1 = new arsv(customBackupDownloadManagerChimeraService0).b();
        int v = ((ggna)gged1).c;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged1.get(v1);
            if(gged0.contains(s)) {
                arue0.c(s, 2);
                if(s.equals("com.google.android.gms")) {
                    asdc.a.c(customBackupDownloadManagerChimeraService0, true);
                }
            }
            else {
                arue0.c(s, 3);
                if(s.equals("com.google.android.gms")) {
                    asdc.a.c(customBackupDownloadManagerChimeraService0, false);
                }
            }
        }
        CustomBackupDownloadManagerChimeraService.d(customBackupDownloadManagerChimeraService0);
    }

    @Override  // arvo
    public final byte[] c(arvr arvr0) {
        artp artp1;
        gftb.check(this.a.g);
        artd artd0 = this.a.g;
        artd0.d = arvr0;
        arsv arsv0 = new arsv(artd0.c);
        arue arue0 = new arue(artd0.c);
        aruf aruf0 = new aruf(artd0.c);
        gged_interceptors gged0 = arsv0.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artk.a).v_newBuilder();
        arti arti0 = arti.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arti0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arti arti1 = (arti)hftp1.b_message;
        arti1.b |= 4;
        arti1.e = true;
        arti arti2 = (arti)hftp1.N_build();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            if(s.equals("com.google.android.gms")) {
                long v2 = aruf0.a(arsv0.a());
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)arti0).w(((ProtoLiteMessage)arti2));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                arti arti3 = (arti)hftp2.b_message;
                arti3.b |= 8;
                arti3.f = v2;
                hftp0.cR(s, ((arti)hftp2.N_build()));
            }
            else {
                hftp0.cR(s, arti2);
            }
        }
        gged_interceptors gged1 = arsv0.d();
        int v3 = ((ggna)gged1).c;
        for(int v4 = 0; v4 < v3; ++v4) {
            String s1 = (String)gged1.get(v4);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)arti0).v_newBuilder();
            if(arsv0.h(s1)) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                arti arti4 = (arti)hftp3.b_message;
                arti4.b |= 2;
                arti4.d = true;
            }
            else if(arsv0.g(s1)) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                arti arti5 = (arti)hftp3.b_message;
                arti5.b |= 1;
                arti5.c = true;
            }
            else if(!CustomBackupDownloadManagerChimeraService.b || artd0.b.contains(s1)) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                arti arti6 = (arti)hftp3.b_message;
                arti6.b |= 16;
                arti6.g = true;
            }
            Map map0 = DesugarCollections.unmodifiableMap(arue0.a.b().c);
            if(map0.containsKey(s1) && (((arts)map0.get(s1)).b & 0x40) != 0) {
                artp artp0 = ((arts)map0.get(s1)).i;
                artp1 = artp0 == null ? artp.a : artp0;
            }
            else {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)artp.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp4.b_message;
                ((artp)hftv0).b |= 1;
                ((artp)hftv0).c = -1;
                if(!hftv0.isImmutable()) {
                    hftp4.ensureMutable();
                }
                artp artp2 = (artp)hftp4.b_message;
                artp2.b |= 2;
                artp2.d = -1.0f;
                artp1 = (artp)hftp4.N_build();
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            arti arti7 = (arti)hftp3.b_message;
            artp1.getClass();
            arti7.h = artp1;
            arti7.b |= 0x20;
            hftp0.cR(s1, ((arti)hftp3.N_build()));
        }
        return ((artk)hftp0.N_build()).toBytesArray();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        arvr arvr0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    arvr0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.internal.IManagerServiceClientUiCallback");
                    arvr0 = (iInterface0 instanceof arvr) ? ((arvr)iInterface0) : new arvp(iBinder0);
                }
                arvn.gr(parcel0);
                byte[] arr_b = this.c(arvr0);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                arvn.gr(parcel0);
                this.a(s);
                return true;
            }
            case 3: {
                String[] arr_s = parcel0.createStringArray();
                arvn.gr(parcel0);
                this.b(arr_s);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

