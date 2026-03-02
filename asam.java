import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class asam extends wby implements asan {
    public asam() {
        super("com.google.android.gms.backup.internal.IG1BackupService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        asah asah0 = null;
        switch(v) {
            case 1: {
                boolean z = wbz.i(parcel0);
                String s = parcel0.readString();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                this.e(z, s, apiMetadata0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                wbz.i(parcel0);
                parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z1 = this.f(apiMetadata2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 4: {
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z2 = this.n();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 5: {
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z3 = this.h(apiMetadata4);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 6: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
                    asah0 = (iInterface0 instanceof asah) ? ((asah)iInterface0) : new asaf(iBinder0);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                this.i(asah0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z4 = this.m();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z4));
                return true;
            }
            case 8: {
                boolean z5 = wbz.i(parcel0);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                this.j(z5);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                boolean z6 = wbz.i(parcel0);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                this.d(z6, apiMetadata8);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z7 = this.l();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z7));
                return true;
            }
            case 11: {
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                boolean z8 = this.g(apiMetadata10);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z8));
                return true;
            }
            case 12: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    asah0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                boolean z9 = wbz.i(parcel0);
                String s1 = parcel0.readString();
                BackupOptInSettings backupOptInSettings0 = (BackupOptInSettings)wbz.a(parcel0, BackupOptInSettings.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                this.c(asah0, z9, s1, backupOptInSettings0, apiMetadata11);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.backup.IBackUpMmsClientCallbacks");
                    if((iInterface2 instanceof aqgh)) {
                        aqgh aqgh0 = (aqgh)iInterface2;
                    }
                }
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                parcel0.readString();
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                int v1 = this.a(apiMetadata14);
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            case 16: {
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asam.gr(parcel0);
                long v2 = this.k();
                parcel1.writeNoException();
                parcel1.writeLong(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

