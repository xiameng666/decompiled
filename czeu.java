import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

public interface czeu extends IInterface {
    void a(OnDisconnectedParams arg1);

    void b(OnPayloadReceivedParams arg1);

    void c(OnPayloadTransferUpdateParams arg1);
}

