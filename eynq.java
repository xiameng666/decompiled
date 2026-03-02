import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.ScreenLockSetUpFragment;

public final class eynq implements ibts {
    public final ScreenLockSetUpFragment a;

    public eynq(ScreenLockSetUpFragment screenLockSetUpFragment0) {
        this.a = screenLockSetUpFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ScreenLockSetUpFragment screenLockSetUpFragment0 = this.a;
        ibts ibts0 = screenLockSetUpFragment0.a;
        if(ibts0 == null) {
            ibuq.j("getNavController");
            ibts0 = null;
        }
        Object object1 = ibts0.a(screenLockSetUpFragment0);
        ibuq.c(((Integer)object0));
        ((nry)object1).l(((Integer)object0).intValue(), null, ntm.a(new eynr()));
        return ibom.a;
    }
}

