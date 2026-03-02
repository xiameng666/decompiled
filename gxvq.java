import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class gxvq extends wbx implements IInterface {
    public gxvq(IBinder iBinder0) {
        super(iBinder0, "com.google.location.nearby.common.fastpair.IGellerFootprintsListenerCallback");
    }

    public final void a(Account account0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        this.jq(1, parcel0);
    }
}

