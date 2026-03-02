import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.growth.UpgradeInviteEligibilityParams;

public final class bvrb implements azys {
    public final bvrd a;
    public final UpgradeInviteEligibilityParams b;

    public bvrb(bvrd bvrd0, UpgradeInviteEligibilityParams upgradeInviteEligibilityParams0) {
        this.a = bvrd0;
        this.b = upgradeInviteEligibilityParams0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bvre bvre0 = (bvre)object0;
        bvqx bvqx0 = new bvqx(this.a, ((evqp)object1));
        bvqz bvqz0 = (bvqz)bvre0.H();
        ApiMetadata apiMetadata0 = cclr.b(bvre0.r);
        Parcel parcel0 = bvqz0.jo();
        wbz.f(parcel0, this.b);
        wbz.h(parcel0, bvqx0);
        wbz.f(parcel0, apiMetadata0);
        bvqz0.jp(5, parcel0);
    }
}

