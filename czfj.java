import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

public interface czfj extends IInterface {
    void a(OnEndpointFoundParams arg1);

    void b(OnEndpointLostParams arg1);

    void c(OnStoppedDiscoveryParams arg1);
}

