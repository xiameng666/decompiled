import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeResponse;
import java.util.List;

public interface erhw extends IInterface {
    void a(Status arg1, List arg2);

    void b(Status arg1, GetChallengeResponse arg2);

    void c(Status arg1, List arg2);
}

