import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class snw extends wbx implements IInterface {
    public snw(IBinder iBinder0) {
        super(iBinder0, "com.android.vending.billing.IInAppBillingService");
    }

    public final int a(int v, String s, String s1) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        Parcel parcel1 = this.hM(1, parcel0);
        int v1 = parcel1.readInt();
        parcel1.recycle();
        return v1;
    }

    public final int b(int v, String s, String s1, Bundle bundle0) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        wbz.f(parcel0, bundle0);
        Parcel parcel1 = this.hM(10, parcel0);
        int v1 = parcel1.readInt();
        parcel1.recycle();
        return v1;
    }
}

