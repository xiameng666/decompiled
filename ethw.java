import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest;

public final class ethw extends wbx implements IInterface {
    public ethw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
    }

    public final void a(GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest0, ethy ethy0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, generatePaymentCredentialsRequest0);
        wbz.h(parcel0, ethy0);
        this.jq(3, parcel0);
    }

    public final void b(String s, ethy ethy0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        wbz.h(parcel0, ethy0);
        this.jq(2, parcel0);
    }
}

