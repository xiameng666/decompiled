import androidx.activity.result.ActivityResult;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;

public final class cqnc implements acn {
    public final cqne a;

    public cqnc(cqne cqne0) {
        this.a = cqne0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        this.a.V();
        evql evql0 = this.a.ai.f(new GetFindMyDeviceSettingsRequest());
        evql0.b(new cqlz(this.a));
        evql0.A(new cqma(this.a));
    }
}

