import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import java.io.IOException;

public final class acsj implements acsn {
    public final Account a;

    public acsj(Account account0) {
        this.a = account0;
    }

    @Override  // acsn
    public final Object a(IBinder iBinder0) {
        wtv wtv0;
        if(iBinder0 == null) {
            wtv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            wtv0 = (iInterface0 instanceof wtv) ? ((wtv)iInterface0) : new wtt(iBinder0);
        }
        Object object0 = wtv0.e(this.a);
        if(object0 != null) {
            return object0;
        }
        throw new IOException("Service call returned null.");
    }
}

