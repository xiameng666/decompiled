import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

public interface czfm extends IInterface {
    void a(OnEndpointDistanceChangedParams arg1);

    void c(OnEndpointFoundParams arg1);

    void d(OnEndpointLostParams arg1);

    void e(OnStoppedDiscoveryParams arg1);
}

