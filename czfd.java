import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsResponderParams;
import com.google.android.gms.nearby.internal.connection.ProviderGetLocalDeviceParams;
import com.google.android.gms.nearby.internal.connection.ProviderGetServiceIdParams;

public interface czfd extends IInterface {
    void a(ProviderAuthenticateAsInitiatorParams arg1);

    void b(ProviderAuthenticateAsResponderParams arg1);

    void c(ProviderGetLocalDeviceParams arg1);

    void d(ProviderGetServiceIdParams arg1);
}

