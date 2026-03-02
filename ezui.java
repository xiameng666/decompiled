import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

public abstract class ezui extends wby implements ezuj {
    public ezui() {
        super("com.google.android.gms.update.ISystemUpdateApiService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezup ezup0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.update.ISystemUpdateStatusCallback");
                    ezup0 = (iInterface0 instanceof ezup) ? ((ezup)iInterface0) : new ezun(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.i(ezup0, apiMetadata0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.update.ISystemUpdateStatusCallback");
                    ezup0 = (iInterface1 instanceof ezup) ? ((ezup)iInterface1) : new ezun(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.n(ezup0, apiMetadata1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                SystemUpdateStatus systemUpdateStatus0 = this.b(apiMetadata2);
                parcel1.writeNoException();
                wbz.g(parcel1, systemUpdateStatus0);
                return true;
            }
            case 5: {
                DownloadOptions downloadOptions0 = (DownloadOptions)wbz.a(parcel0, DownloadOptions.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.c(downloadOptions0, apiMetadata3);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                InstallationOptions installationOptions0 = (InstallationOptions)wbz.a(parcel0, InstallationOptions.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.d(installationOptions0, apiMetadata4);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.h(apiMetadata5);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                DownloadOptions downloadOptions1 = (DownloadOptions)wbz.a(parcel0, DownloadOptions.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.l(downloadOptions1, apiMetadata6);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.j(apiMetadata7);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                ActivityStatus activityStatus0 = (ActivityStatus)wbz.a(parcel0, ActivityStatus.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.m(activityStatus0, apiMetadata8);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.g(apiMetadata9);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                InstallationOptions installationOptions1 = (InstallationOptions)wbz.a(parcel0, InstallationOptions.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.k(installationOptions1, apiMetadata10);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.p();
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                boolean z = this.o(apiMetadata12);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 15: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ezup0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                ConfigUpdateOptions configUpdateOptions0 = (ConfigUpdateOptions)wbz.a(parcel0, ConfigUpdateOptions.CREATOR);
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.f(((azxs)ezup0), configUpdateOptions0, apiMetadata13);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                long v1 = this.a(apiMetadata14);
                parcel1.writeNoException();
                parcel1.writeLong(v1);
                return true;
            }
            case 17: {
                InstallationOptions installationOptions2 = (InstallationOptions)wbz.a(parcel0, InstallationOptions.CREATOR);
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezui.gr(parcel0);
                this.e(installationOptions2, apiMetadata15);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

