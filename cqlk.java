import androidx.activity.result.ActivityResult;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;

public final class cqlk implements acn {
    public final cqlu a;

    public cqlk(cqlu cqlu0) {
        this.a = cqlu0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        evql evql0 = this.a.ai.f(new GetFindMyDeviceSettingsRequest());
        evql0.b(new cqkn(this.a));
        evql0.A(new cqky());
    }
}

