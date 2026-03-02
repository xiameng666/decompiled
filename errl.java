import android.content.Context;
import android.net.wifi.WifiConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

public final class errl extends cjtm {
    private final erqz a;
    private final GetWifiCredentialsRequest b;

    public errl(erqz erqz0, GetWifiCredentialsRequest getWifiCredentialsRequest0, azug azug0) {
        super(0x9F, "GetWifiCredentialsOperation", azug0);
        this.a = erqz0;
        this.b = getWifiCredentialsRequest0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s;
        WifiConfiguration wifiConfiguration0;
        erqn erqn0 = new erqn(context0);
        GetWifiCredentialsRequest getWifiCredentialsRequest0 = this.b;
        int v = getWifiCredentialsRequest0.b;
        if(v == -1) {
            wifiConfiguration0 = erqn0.d(getWifiCredentialsRequest0.a);
        }
        else {
            for(Object object0: erqn0.f()) {
                wifiConfiguration0 = (WifiConfiguration)object0;
                if(wifiConfiguration0.networkId != v) {
                    continue;
                }
                goto label_13;
            }
            wifiConfiguration0 = null;
        }
    label_13:
        if(wifiConfiguration0 == null) {
            Status status0 = new Status(10602);
            GetWifiCredentialsResponse getWifiCredentialsResponse0 = new GetWifiCredentialsResponse(0, null, "Unsupported", false);
            this.a.b(status0, getWifiCredentialsResponse0);
            return;
        }
        if(wifiConfiguration0.allowedKeyManagement.get(1) || wifiConfiguration0.allowedKeyManagement.get(4)) {
            s = "PSK";
        }
        else if(wifiConfiguration0.allowedKeyManagement.get(0) && wifiConfiguration0.allowedAuthAlgorithms.get(1)) {
            s = "WEP";
        }
        else if(wifiConfiguration0.allowedKeyManagement.get(9)) {
            s = "OWE";
        }
        else if(wifiConfiguration0.allowedKeyManagement.get(0)) {
            s = "Open";
        }
        else if(wifiConfiguration0.allowedKeyManagement.get(8)) {
            s = "SAE";
        }
        else {
            s = "Unsupported";
        }
        switch(s) {
            case "OWE": 
            case "Open": {
                GetWifiCredentialsResponse getWifiCredentialsResponse2 = new GetWifiCredentialsResponse(1, null, s, wifiConfiguration0.hiddenSSID);
                this.a.b(Status.b, getWifiCredentialsResponse2);
                return;
            }
            case "PSK": 
            case "SAE": 
            case "WEP": {
                GetWifiCredentialsResponse getWifiCredentialsResponse3 = new GetWifiCredentialsResponse(1, (s.equals("WEP") ? erqe.b(wifiConfiguration0.wepKeys[wifiConfiguration0.wepTxKeyIndex]) : erqe.b(wifiConfiguration0.preSharedKey)), s, wifiConfiguration0.hiddenSSID);
                this.a.b(Status.b, getWifiCredentialsResponse3);
                return;
            }
            default: {
                Status status1 = new Status(10601);
                GetWifiCredentialsResponse getWifiCredentialsResponse1 = new GetWifiCredentialsResponse(0, null, "Unsupported", false);
                this.a.b(status1, getWifiCredentialsResponse1);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        GetWifiCredentialsResponse getWifiCredentialsResponse0 = new GetWifiCredentialsResponse(0, null, "Unsupported", false);
        this.a.b(status0, getWifiCredentialsResponse0);
    }
}

