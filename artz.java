import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.download.ClientInfo;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;
import j..util.Objects;

public final class artz extends wby implements arua {
    final artg a;
    private final artf b;
    private final artd c;

    public artz() {
        super("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloadCallback");
    }

    public artz(artg artg0, artd artd0) {
        Objects.requireNonNull(artg0);
        this.a = artg0;
        super("com.google.android.gms.backup.extension.download.ICustomBackupDataDownloadCallback");
        this.b = new artf(artg0, artd0);
        this.c = artd0;
    }

    @Override  // arua
    public final void a(CustomBackupDataDownloadResult customBackupDataDownloadResult0) {
        artg artg0 = this.a;
        if(!artg0.f()) {
            artg.a.f("Not connected to package: %s", new Object[]{artg0.c});
            return;
        }
        artg.a.j("onComplete. Success = %s", new Object[]{Boolean.valueOf(customBackupDataDownloadResult0.a)});
        this.c.a(artg0.c, customBackupDataDownloadResult0.a);
        artg0.e(1.0f, artg0.i);
        artg0.d.b(artg0.c, customBackupDataDownloadResult0.a, artg0.i, 1.0f);
        artg0.b(gfqx.a);
    }

    @Override  // arua
    public final void b(ClientInfo clientInfo0) {
        artg artg0 = this.a;
        if(!artg0.f()) {
            artg.a.f("Not connected to package: %s", new Object[]{artg0.c});
            return;
        }
        artg0.g = true;
        artg0.d(this.c, this.b);
    }

    @Override  // arua
    public final void c(float f, int v) {
        if(v < 0) {
            artg.a.f("Expected totalItems >= 0, got: %s", new Object[]{v});
            return;
        }
        if(f <= 1.0f && f >= 0.0f) {
            artg artg0 = this.a;
            if(!artg0.f()) {
                artg.a.f("Not connected to package: %s", new Object[]{artg0.c});
                return;
            }
            if(artg0.g) {
                artg.a.j("Backup progress fraction: %.2f, total items %d", new Object[]{f, v});
                artg0.e(f, v);
                artd artd0 = this.c;
                String s = artg0.c;
                arvr arvr0 = artd0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artm.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                artm artm0 = (artm)hftp0.b_message;
                s.getClass();
                artm0.b |= 1;
                artm0.c = s;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artl.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((artl)hftv0).b |= 2;
                ((artl)hftv0).d = f;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((artl)hftv1).b |= 1;
                ((artl)hftv1).c = false;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                artl artl0 = (artl)hftp1.b_message;
                artl0.b |= 8;
                artl0.e = v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                artm artm1 = (artm)hftp0.b_message;
                artl artl1 = (artl)hftp1.N_build();
                artl1.getClass();
                artm1.d = artl1;
                artm1.b |= 2;
                artm artm2 = (artm)hftp0.N_build();
                if(arvr0 != null) {
                    try {
                        arvr0.a(artm2.toBytesArray());
                    }
                    catch(RemoteException unused_ex) {
                        artd0.a.m("Remote exception while sending update for ui callback", new Object[0]);
                    }
                }
                try {
                    gaef gaef0 = artd0.g;
                    if(gaef0 != null) {
                        int v1 = (artm2.d == null ? artl.a : artm2.d).e;
                        artd0.f = v1;
                        int v2 = (int)(f * ((float)v1));
                        artd0.e = v2;
                        Parcel parcel0 = gaef0.jo();
                        parcel0.writeInt(v2);
                        parcel0.writeInt(0);
                        parcel0.writeInt(v1);
                        Parcel parcel1 = gaef0.hM(1, parcel0);
                        Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
                        parcel1.recycle();
                    }
                }
                catch(RemoteException unused_ex) {
                    artd0.a.m("Remote exception while sending update for portal callback", new Object[0]);
                }
                return;
            }
            artg.a.f("Progress reported before handshake", new Object[0]);
            return;
        }
        artg.a.f("invalid value for progress fraction: %s", new Object[]{f});
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ClientInfo clientInfo0 = (ClientInfo)wbz.a(parcel0, ClientInfo.CREATOR);
                artz.gr(parcel0);
                this.b(clientInfo0);
                return true;
            }
            case 2: {
                float f = parcel0.readFloat();
                int v1 = parcel0.readInt();
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                artz.gr(parcel0);
                this.c(f, v1);
                return true;
            }
            case 3: {
                CustomBackupDataDownloadResult customBackupDataDownloadResult0 = (CustomBackupDataDownloadResult)wbz.a(parcel0, CustomBackupDataDownloadResult.CREATOR);
                artz.gr(parcel0);
                this.a(customBackupDataDownloadResult0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

