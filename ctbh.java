import androidx.preference.TwoStatePreference;
import com.google.android.gms.multidevice.featuresettings.multidevicesync.MultideviceSyncLandingFragment;

final class ctbh implements icih {
    final TwoStatePreference a;
    final TwoStatePreference b;
    final TwoStatePreference c;

    public ctbh(TwoStatePreference twoStatePreference0, TwoStatePreference twoStatePreference1, TwoStatePreference twoStatePreference2) {
        this.a = twoStatePreference0;
        this.b = twoStatePreference1;
        this.c = twoStatePreference2;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(MultideviceSyncLandingFragment.P()) {
            this.a.k(csyn.a(((cteb)((csyf)object0).e.get(new Integer(10)))));
        }
        if(MultideviceSyncLandingFragment.Q()) {
            this.b.k(csyn.a(((cteb)((csyf)object0).e.get(new Integer(8)))));
        }
        if(MultideviceSyncLandingFragment.R()) {
            this.c.k(csyn.a(((cteb)((csyf)object0).e.get(new Integer(9)))));
        }
        return ibom.a;
    }
}

