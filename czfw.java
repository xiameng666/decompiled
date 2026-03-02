import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

public interface czfw extends IInterface {
    void a(OnPayloadReceivedParams arg1);

    void c(OnPayloadTransferUpdateParams arg1);
}

