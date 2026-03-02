import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.api.Status;

public final class azdv extends wbx implements IInterface {
    public azdv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
    }

    public final void a(Status status0, SamplerDecisionParcelable samplerDecisionParcelable0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, samplerDecisionParcelable0);
        this.jq(2, parcel0);
    }
}

