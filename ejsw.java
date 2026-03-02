import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;

public final class ejsw extends wbx implements IInterface {
    public ejsw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    public final void a(Status status0, ExecuteResult executeResult0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, executeResult0);
        this.jq(2, parcel0);
    }

    public final void b(Status status0, InitResult initResult0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, initResult0);
        this.jq(1, parcel0);
    }
}

