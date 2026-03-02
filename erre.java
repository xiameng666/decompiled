import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;

public final class erre implements azys {
    public final erri a;
    public final ConnectToWifiNetworkRequest b;

    public erre(erri erri0, ConnectToWifiNetworkRequest connectToWifiNetworkRequest0) {
        this.a = erri0;
        this.b = connectToWifiNetworkRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        errj errj0 = (errj)object0;
        errh errh0 = new errh(this.a, ((evqp)object1));
        errc errc0 = (errc)errj0.H();
        ApiMetadata apiMetadata0 = cclr.a(errj0.r);
        errc0.a(errh0, this.b, apiMetadata0);
    }
}

