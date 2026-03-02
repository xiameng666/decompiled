import android.os.IInterface;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

public interface gyit extends IInterface {
    OperationResponse a(String arg1);

    OperationResponse b(OperationRequest arg1);

    OperationResponse c(OperationRequest arg1);

    boolean d(OperationRequest arg1);

    boolean e(OperationRequest arg1);
}

