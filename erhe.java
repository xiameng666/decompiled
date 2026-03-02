import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

public interface erhe extends IInterface {
    void c(erhb arg1, Challenge[] arg2, boolean arg3, boolean arg4);

    void d(erhb arg1, Challenge[] arg2, boolean arg3);

    void e();

    void f(erhb arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void g(erhb arg1, ExchangeSessionCheckpointsForUserCredentialsRequest arg2);

    void h(erhb arg1, Assertion[] arg2);

    void i(erhb arg1);

    void j(erhb arg1);

    void k(erhb arg1, UserBootstrapInfo[] arg2);

    void l(erhb arg1, Account[] arg2);

    void m(erhb arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void n(erhb arg1, ExchangeAssertionsForUserCredentialsRequest arg2);

    void o(erhb arg1, int arg2);

    void p(erhb arg1, boolean arg2);
}

