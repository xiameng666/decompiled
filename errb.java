import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

public final class errb extends wby implements cjug, errc {
    private final cjts a;
    private final String b;
    private final String c;

    public errb() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
    }

    public errb(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // errc
    public final void a(erqz erqz0, ConnectToWifiNetworkRequest connectToWifiNetworkRequest0, ApiMetadata apiMetadata0) {
        errk errk0 = new errk(erqz0, connectToWifiNetworkRequest0, this.c(apiMetadata0));
        this.a.b(errk0);
    }

    @Override  // errc
    public final void b(erqz erqz0, GetWifiCredentialsRequest getWifiCredentialsRequest0, ApiMetadata apiMetadata0) {
        errl errl0 = new errl(erqz0, getWifiCredentialsRequest0, this.c(apiMetadata0));
        this.a.b(errl0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        erqz erqz0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
                    erqz0 = (iInterface0 instanceof erqz) ? ((erqz)iInterface0) : new erqx(iBinder0);
                }
                GetWifiCredentialsRequest getWifiCredentialsRequest0 = (GetWifiCredentialsRequest)wbz.a(parcel0, GetWifiCredentialsRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                errb.gr(parcel0);
                this.b(erqz0, getWifiCredentialsRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
                    erqz0 = (iInterface1 instanceof erqz) ? ((erqz)iInterface1) : new erqx(iBinder1);
                }
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest0 = (ConnectToWifiNetworkRequest)wbz.a(parcel0, ConnectToWifiNetworkRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                errb.gr(parcel0);
                this.a(erqz0, connectToWifiNetworkRequest0, apiMetadata1);
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

