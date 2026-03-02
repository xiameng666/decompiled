import android.os.IInterface;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

public interface aiow extends IInterface {
    void a(Status arg1, byte[] arg2);

    void b(Status arg1, RetrieveBytesResponse arg2);
}

