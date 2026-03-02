import android.app.Activity;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j..util.Objects;

final class crbp extends crbj {
    final Activity a;
    final crbr b;
    final crbb g;

    public crbp(crbr crbr0, Activity activity0, crbb crbb0) {
        this.a = activity0;
        this.g = crbb0;
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
        wbz.h(parcel0, this.g);
        parcel0.writeLong(this.d);
        crba0.jp(57, parcel0);
    }
}

