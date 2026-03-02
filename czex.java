import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;

public interface czex extends IInterface {
    void a(OnBandwidthChangedParams arg1);

    void c(OnConnectionInitiatedParams arg1);

    void d(OnConnectionResultParams arg1);

    void e(OnDisconnectedParams arg1);

    void f(OnEndpointIdRotatedParams arg1);

    void g(OnEndpointIdRotationParams arg1);

    void h(OnInternetConnectionChangedParams arg1);
}

