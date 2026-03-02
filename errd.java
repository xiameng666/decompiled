import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

public final class errd implements azys {
    public final erri a;
    public final GetWifiCredentialsRequest b;

    public errd(erri erri0, GetWifiCredentialsRequest getWifiCredentialsRequest0) {
        this.a = erri0;
        this.b = getWifiCredentialsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        errj errj0 = (errj)object0;
        errg errg0 = new errg(this.a, ((evqp)object1));
        errc errc0 = (errc)errj0.H();
        ApiMetadata apiMetadata0 = cclr.a(errj0.r);
        errc0.b(errg0, this.b, apiMetadata0);
    }
}

