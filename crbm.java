import android.app.Activity;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j..util.Objects;

final class crbm extends crbj {
    final Activity a;
    final crbr b;

    public crbm(crbr crbr0, Activity activity0) {
        this.a = activity0;
        Objects.requireNonNull(crbr0);
        this.b = crbr0;
        super(crbr0.a);
    }

    @Override  // crbj
    public final void a() {
        crba crba0 = this.b.a.e;
        batl.s(crba0);
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(this.a);
        Parcel parcel0 = crba0.jo();
        wbz.f(parcel0, scionActivityInfo0);
        parcel0.writeLong(this.d);
        crba0.jp(56, parcel0);
    }
}

