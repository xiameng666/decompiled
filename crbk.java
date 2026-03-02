import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j..util.Objects;

final class crbk extends crbj {
    final Bundle a;
    final Activity b;
    final crbr g;

    public crbk(crbr crbr0, Bundle bundle0, Activity activity0) {
        this.a = bundle0;
        this.b = activity0;
        Objects.requireNonNull(crbr0);
        this.g = crbr0;
        super(crbr0.a);
    }

    @Override  // crbj
    public final void a() {
        Bundle bundle1;
        Bundle bundle0 = this.a;
        if(bundle0 == null) {
            bundle1 = null;
        }
        else {
            bundle1 = new Bundle();
            if(bundle0.containsKey("com.google.app_measurement.screen_service")) {
                Object object0 = bundle0.get("com.google.app_measurement.screen_service");
                if((object0 instanceof Bundle)) {
                    bundle1.putBundle("com.google.app_measurement.screen_service", ((Bundle)object0));
                }
            }
        }
        crba crba0 = this.g.a.e;
        batl.s(crba0);
        long v = this.d;
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(this.b);
        Parcel parcel0 = crba0.jo();
        wbz.f(parcel0, scionActivityInfo0);
        wbz.f(parcel0, bundle1);
        parcel0.writeLong(v);
        crba0.jp(53, parcel0);
    }
}

