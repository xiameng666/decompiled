import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajin extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(PlainText arg1, ApiMetadata arg2);
}

