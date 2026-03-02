import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.authzen.legacy.internal.OtpSecret;
import com.google.android.gms.common.api.Status;

public final class aijr extends wbx implements IInterface {
    public aijr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.authzen.legacy.internal.IGetSecretCallback");
    }

    public final void a(Status status0, OtpSecret otpSecret0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, otpSecret0);
        this.jq(1, parcel0);
    }
}

