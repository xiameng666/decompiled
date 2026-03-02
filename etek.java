import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.firstparty.IsDeviceRecentlyUnlockedRequest;

public final class etek implements azys {
    public final etgl a;
    public final IsDeviceRecentlyUnlockedRequest b;

    public etek(etgl etgl0, IsDeviceRecentlyUnlockedRequest isDeviceRecentlyUnlockedRequest0) {
        this.a = etgl0;
        this.b = isDeviceRecentlyUnlockedRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etey etey0 = new etey(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.I(this.b, etey0, apiMetadata0);
    }
}

