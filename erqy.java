import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

public class erqy extends wby implements erqz {
    public erqy() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
    }

    @Override  // erqz
    public void a(Status status0, ConnectToWifiNetworkResponse connectToWifiNetworkResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erqz
    public void b(Status status0, GetWifiCredentialsResponse getWifiCredentialsResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetWifiCredentialsResponse getWifiCredentialsResponse0 = (GetWifiCredentialsResponse)wbz.a(parcel0, GetWifiCredentialsResponse.CREATOR);
                erqy.gr(parcel0);
                this.b(status0, getWifiCredentialsResponse0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                ConnectToWifiNetworkResponse connectToWifiNetworkResponse0 = (ConnectToWifiNetworkResponse)wbz.a(parcel0, ConnectToWifiNetworkResponse.CREATOR);
                erqy.gr(parcel0);
                this.a(status1, connectToWifiNetworkResponse0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

