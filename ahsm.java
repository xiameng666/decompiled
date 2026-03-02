import android.os.IInterface;
import com.google.android.gms.auth.api.identity.FetchVerifiedPhoneNumbersResult;
import com.google.android.gms.common.api.Status;

public interface ahsm extends IInterface {
    void a(Status arg1, FetchVerifiedPhoneNumbersResult arg2);
}

