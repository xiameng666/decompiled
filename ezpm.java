import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;

public class ezpm extends wby implements ezpn {
    public ezpm() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    @Override  // ezpn
    public void a(Status status0, UdcCacheResponse udcCacheResponse0) {
        throw new UnsupportedOperationException("Unsupported onCacheResponseFetched callback");
    }

    @Override  // ezpn
    public void b(Status status0, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags0) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptInStatusFetched callback");
    }

    @Override  // ezpn
    public final void c(Status status0, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable0) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptedInAccountsFetched callback");
    }

    @Override  // ezpn
    public final void d(Status status0) {
        throw new UnsupportedOperationException("Unsupported onLocalSettingsWritten callback");
    }

    @Override  // ezpn
    public final void e(Status status0, byte[] arr_b) {
        throw new UnsupportedOperationException("Unsupported onOverviewConfigFetched callback");
    }

    @Override  // ezpn
    public final void f(Status status0, PendingIntent pendingIntent0) {
        throw new UnsupportedOperationException("Unsupported onPendingIntentFetched callback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.createByteArray();
                ezpm.gr(parcel0);
                this.k(status0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                ezpm.gr(parcel0);
                this.e(status1, arr_b);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.createByteArray();
                ezpm.gr(parcel0);
                this.h(status2);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.createByteArray();
                ezpm.gr(parcel0);
                this.j(status3);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                parcel0.createTypedArrayList(SettingState.CREATOR);
                ezpm.gr(parcel0);
                this.i(status4);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ezpm.gr(parcel0);
                this.f(status5, pendingIntent0);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                SettingDisplayInfo settingDisplayInfo0 = (SettingDisplayInfo)wbz.a(parcel0, SettingDisplayInfo.CREATOR);
                PendingIntent pendingIntent1 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ezpm.gr(parcel0);
                this.g(status6, settingDisplayInfo0, pendingIntent1);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                UdcCacheResponse udcCacheResponse0 = (UdcCacheResponse)wbz.a(parcel0, UdcCacheResponse.CREATOR);
                ezpm.gr(parcel0);
                this.a(status7, udcCacheResponse0);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                ezpm.gr(parcel0);
                this.d(status8);
                return true;
            }
            case 10: {
                Status status9 = (Status)wbz.a(parcel0, Status.CREATOR);
                DeviceDataUploadOptInFlags deviceDataUploadOptInFlags0 = (DeviceDataUploadOptInFlags)wbz.a(parcel0, DeviceDataUploadOptInFlags.CREATOR);
                ezpm.gr(parcel0);
                this.b(status9, deviceDataUploadOptInFlags0);
                return true;
            }
            case 11: {
                Status status10 = (Status)wbz.a(parcel0, Status.CREATOR);
                DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable0 = (DeviceDataUploadOptedInAccountsParcelable)wbz.a(parcel0, DeviceDataUploadOptedInAccountsParcelable.CREATOR);
                ezpm.gr(parcel0);
                this.c(status10, deviceDataUploadOptedInAccountsParcelable0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ezpn
    public final void g(Status status0, SettingDisplayInfo settingDisplayInfo0, PendingIntent pendingIntent0) {
        throw new UnsupportedOperationException("Unsupported onSettingDisplayInfoFetched callback");
    }

    @Override  // ezpn
    public final void h(Status status0) {
        throw new UnsupportedOperationException("Unsupported onConsentConfigFetched callback");
    }

    @Override  // ezpn
    public final void i(Status status0) {
        throw new UnsupportedOperationException("Unsupported onConsentStatusReceived callback");
    }

    @Override  // ezpn
    public final void j(Status status0) {
        throw new UnsupportedOperationException("Unsupported onConsentWritten callback");
    }

    @Override  // ezpn
    public final void k(Status status0) {
        throw new UnsupportedOperationException("Unsupported onSettingsFetched callback");
    }
}

