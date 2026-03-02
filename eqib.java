import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;

public interface eqib extends IInterface {
    void a(AccountTransferResult[] arg1);

    void b(int arg1, String arg2);

    void c(PendingIntent arg1);
}

