import androidx.preference.TwoStatePreference;
import com.google.android.gms.multidevice.featuresettings.internetsharing.InternetSharingLandingFragment;

public final class ctav extends ibsl implements ibtw {
    int a;
    final InternetSharingLandingFragment b;

    public ctav(InternetSharingLandingFragment internetSharingLandingFragment0, ibrl ibrl0) {
        this.b = internetSharingLandingFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctav)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctav(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            InternetSharingLandingFragment internetSharingLandingFragment0 = this.b;
            TwoStatePreference twoStatePreference0 = internetSharingLandingFragment0.K("instant_hotspot");
            if(twoStatePreference0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            TwoStatePreference twoStatePreference1 = internetSharingLandingFragment0.K("wifi_sharing");
            if(twoStatePreference1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            icnj icnj0 = internetSharingLandingFragment0.L().g();
            ctau ctau0 = new ctau(twoStatePreference0, twoStatePreference1);
            this.a = 1;
            if(icnj0.oR(ctau0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

