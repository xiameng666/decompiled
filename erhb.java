import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

public interface erhb extends IInterface {
    void a(Status arg1, Assertion[] arg2);

    void b(Status arg1);

    void c(Status arg1, UserCredential[] arg2, String arg3, String arg4);

    void d(Status arg1, UserCredential[] arg2);

    void e(Status arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void f(Status arg1, BootstrapAccount[] arg2);

    void g(Status arg1, long arg2);

    void h(Status arg1, Challenge[] arg2);

    void i(Status arg1, UserBootstrapInfo[] arg2);

    void j(Status arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void k(Status arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void l(Status arg1);
}

