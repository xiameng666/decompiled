import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import java.util.List;

public interface erhz extends IInterface {
    void a(erhw arg1, List arg2, ApiMetadata arg3);

    void b(erhw arg1, GetChallengeRequest arg2, ApiMetadata arg3);

    void c(erhw arg1, List arg2, ApiMetadata arg3);
}

