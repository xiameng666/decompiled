import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ResultReceiver;

public final class sow extends wbx implements IInterface {
    public sow(IBinder iBinder0) {
        super(iBinder0, "com.android.vending.setup.IPlaySetupServiceV2");
    }

    public final Bundle a(ResultReceiver resultReceiver0, Bundle bundle0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, resultReceiver0);
        wbz.f(parcel0, bundle0);
        Parcel parcel1 = this.hM(13, parcel0);
        Bundle bundle1 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    public final Bundle b(Bundle bundle0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, bundle0);
        Parcel parcel1 = this.hM(14, parcel0);
        Bundle bundle1 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }
}

