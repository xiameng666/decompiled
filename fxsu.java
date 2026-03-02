import android.accounts.Account;
import android.os.IInterface;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.List;

public interface fxsu extends IInterface {
    AccountConfig a(Account arg1);

    List b(Account arg1);

    List c(Account arg1, int arg2, boolean arg3, String arg4);

    void d(Account arg1, String arg2, boolean arg3, String arg4);

    void e(Account arg1, String arg2, boolean arg3, String arg4);
}

