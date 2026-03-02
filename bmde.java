import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;

public interface bmde extends IInterface {
    void a(Status arg1, KeyData arg2, ApiMetadata arg3);
}

