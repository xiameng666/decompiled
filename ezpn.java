import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.UdcCacheResponse;

public interface ezpn extends IInterface {
    void a(Status arg1, UdcCacheResponse arg2);

    void b(Status arg1, DeviceDataUploadOptInFlags arg2);

    void c(Status arg1, DeviceDataUploadOptedInAccountsParcelable arg2);

    void d(Status arg1);

    void e(Status arg1, byte[] arg2);

    void f(Status arg1, PendingIntent arg2);

    void g(Status arg1, SettingDisplayInfo arg2, PendingIntent arg3);

    void h(Status arg1);

    void i(Status arg1);

    void j(Status arg1);

    void k(Status arg1);
}

