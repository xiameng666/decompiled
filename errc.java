import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

public interface errc extends IInterface {
    void a(erqz arg1, ConnectToWifiNetworkRequest arg2, ApiMetadata arg3);

    void b(erqz arg1, GetWifiCredentialsRequest arg2, ApiMetadata arg3);
}

