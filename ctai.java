import androidx.preference.TwoStatePreference;
import com.google.android.gms.multidevice.featuresettings.callswitching.CallSwitchingLandingFragment;

public final class ctai extends ibsl implements ibtw {
    int a;
    final CallSwitchingLandingFragment b;

    public ctai(CallSwitchingLandingFragment callSwitchingLandingFragment0, ibrl ibrl0) {
        this.b = callSwitchingLandingFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctai)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctai(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            CallSwitchingLandingFragment callSwitchingLandingFragment0 = this.b;
            TwoStatePreference twoStatePreference0 = callSwitchingLandingFragment0.L();
            if(twoStatePreference0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            icnj icnj0 = callSwitchingLandingFragment0.K().g();
            ctah ctah0 = new ctah(twoStatePreference0);
            this.a = 1;
            if(icnj0.oR(ctah0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

