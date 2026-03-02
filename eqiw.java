import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

public interface eqiw extends IInterface {
    void a(Status arg1);

    void b(Status arg1);

    void c(Status arg1);

    void d(Status arg1, AdvertisingInfo arg2);

    void e(Status arg1, List arg2);

    void f(Status arg1, ManagedAccountSetupInfo arg2);

    void g(Status arg1, String arg2);

    void h(Status arg1);

    void i(Status arg1);
}

