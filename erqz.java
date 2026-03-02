import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

public interface erqz extends IInterface {
    void a(Status arg1, ConnectToWifiNetworkResponse arg2);

    void b(Status arg1, GetWifiCredentialsResponse arg2);
}

