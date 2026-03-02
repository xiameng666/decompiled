import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;

public final class azdu extends wby implements IInterface, cjug {
    private final Context a;
    private final cjts b;

    public azdu() {
        super("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
    }

    public azdu(Context context0, cjts cjts0) {
        super("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
        this.a = context0;
        this.b = cjts0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azdv azdv0;
        if(v == 2) {
            SamplerConfigParcelable samplerConfigParcelable0 = (SamplerConfigParcelable)wbz.a(parcel0, SamplerConfigParcelable.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                azdv0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
                azdv0 = (iInterface0 instanceof azdv) ? ((azdv)iInterface0) : new azdv(iBinder0);
            }
            azdu.gr(parcel0);
            azdt azdt0 = new azdt(this.a, samplerConfigParcelable0, azdv0);
            this.b.b(azdt0);
            return true;
        }
        return false;
    }
}

