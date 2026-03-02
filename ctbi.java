import androidx.preference.TwoStatePreference;
import com.google.android.gms.multidevice.featuresettings.multidevicesync.MultideviceSyncLandingFragment;

public final class ctbi extends ibsl implements ibtw {
    int a;
    final MultideviceSyncLandingFragment b;

    public ctbi(MultideviceSyncLandingFragment multideviceSyncLandingFragment0, ibrl ibrl0) {
        this.b = multideviceSyncLandingFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctbi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctbi(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            TwoStatePreference twoStatePreference0 = this.b.K("app_cast_pref");
            TwoStatePreference twoStatePreference1 = this.b.K("notification_sync_pref");
            TwoStatePreference twoStatePreference2 = this.b.K("quick_access_pref");
            icnj icnj0 = this.b.M().g();
            ctbh ctbh0 = new ctbh(twoStatePreference0, twoStatePreference1, twoStatePreference2);
            this.a = 1;
            if(icnj0.oR(ctbh0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

