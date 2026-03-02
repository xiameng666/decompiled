import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.internal.GetReachablePhoneNumbersParams;

public final class dcdh implements Runnable {
    public final dchp a;
    public final GetReachablePhoneNumbersParams b;

    public dcdh(dchp dchp0, GetReachablePhoneNumbersParams getReachablePhoneNumbersParams0) {
        this.a = dchp0;
        this.b = getReachablePhoneNumbersParams0;
    }

    @Override
    public final void run() {
        try {
            GetReachablePhoneNumbersParams getReachablePhoneNumbersParams0 = this.b;
            gged_interceptors gged0 = this.a.e.A(getReachablePhoneNumbersParams0.b);
            if(gged0 != null) {
                getReachablePhoneNumbersParams0.a.b(gged0);
                return;
            }
            getReachablePhoneNumbersParams0.a.a(0x8ABC);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke getReachablePhoneNumbers callback.", new Object[0]);
        }
    }
}

