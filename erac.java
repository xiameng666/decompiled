import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.AccountTransferResult;
import com.google.android.gms.smartdevice.quickstart.QuickStartConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferResult;

public class erac extends wby implements erad {
    public erac() {
        super("com.google.android.gms.smartdevice.quickstart.internal.ITargetQuickStartApiCallbacks");
    }

    @Override  // erad
    public void a(Status status0, AccountTransferResult accountTransferResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erad
    public void b(Status status0, QuickStartConnectionResult quickStartConnectionResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // erad
    public final void c(Status status0, WifiTransferResult wifiTransferResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                QuickStartConnectionResult quickStartConnectionResult0 = (QuickStartConnectionResult)wbz.a(parcel0, QuickStartConnectionResult.CREATOR);
                erac.gr(parcel0);
                this.b(status0, quickStartConnectionResult0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                WifiTransferResult wifiTransferResult0 = (WifiTransferResult)wbz.a(parcel0, WifiTransferResult.CREATOR);
                erac.gr(parcel0);
                this.c(status1, wifiTransferResult0);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                AccountTransferResult accountTransferResult0 = (AccountTransferResult)wbz.a(parcel0, AccountTransferResult.CREATOR);
                erac.gr(parcel0);
                this.a(status2, accountTransferResult0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

