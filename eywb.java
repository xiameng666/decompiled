import com.google.android.gms.trustagent.activeunlock.primary.ui.screenlock.AssociatedDeviceScreenLockSetUpFragment;

public final class eywb extends eyui {
    final AssociatedDeviceScreenLockSetUpFragment a;

    public eywb(AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0, ibnn ibnn0) {
        this.a = associatedDeviceScreenLockSetUpFragment0;
        super(associatedDeviceScreenLockSetUpFragment0, ibnn0);
    }

    @Override  // eyui
    protected final void a() {
        AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0 = this.a;
        ibts ibts0 = associatedDeviceScreenLockSetUpFragment0.b;
        if(ibts0 == null) {
            ibuq.j("getNavController");
            ibts0 = null;
        }
        ((nry)ibts0.a(associatedDeviceScreenLockSetUpFragment0)).i(0x7F0B0AD9);  // id:action_global_setup_complete_fragment
    }

    @Override  // eyui
    protected final void b() {
        eywe eywe0 = new eywe(this.a.B());
        eywf eywf0 = new eywf(this.a.B());
        eyuf.b(this.a, eywe0, eywf0);
    }
}

