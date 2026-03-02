import android.os.IInterface;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

public interface ahri extends IInterface {
    void a(Status arg1, BeginSignInResult arg2);
}

