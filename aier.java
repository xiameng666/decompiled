import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface aier extends IInterface {
    void a(Status arg1);

    void c(Status arg1);

    void d(GoogleSignInAccount arg1, Status arg2);
}

