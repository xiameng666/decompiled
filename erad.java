import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.AccountTransferResult;
import com.google.android.gms.smartdevice.quickstart.QuickStartConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferResult;

public interface erad extends IInterface {
    void a(Status arg1, AccountTransferResult arg2);

    void b(Status arg1, QuickStartConnectionResult arg2);

    void c(Status arg1, WifiTransferResult arg2);
}

