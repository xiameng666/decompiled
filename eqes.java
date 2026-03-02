import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

final class eqes extends cjtm {
    public final eqff a;
    public final eqiw b;
    private final Handler c;

    public eqes(eqiw eqiw0, eqff eqff0, Handler handler0, azug azug0) {
        super(76, "GetAdvertisingInfoOperation", azug0);
        this.a = eqff0;
        this.b = eqiw0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqer eqer0 = new eqer(this);
        this.c.post(eqer0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        AdvertisingInfo advertisingInfo0 = new AdvertisingInfo(null, "", null, null);
        this.b.d(status0, advertisingInfo0);
    }
}

