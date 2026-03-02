import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class bvra implements azys {
    public final bvrd a;

    public bvra(bvrd bvrd0) {
        this.a = bvrd0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bvre bvre0 = (bvre)object0;
        bvqy bvqy0 = new bvqy(this.a, ((evqp)object1));
        bvqz bvqz0 = (bvqz)bvre0.H();
        ApiMetadata apiMetadata0 = cclr.b(bvre0.r);
        Parcel parcel0 = bvqz0.jo();
        wbz.h(parcel0, bvqy0);
        wbz.f(parcel0, apiMetadata0);
        bvqz0.jp(4, parcel0);
    }
}

