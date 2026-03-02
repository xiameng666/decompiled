import android.accounts.Account;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;

public final class eyxz implements ibts {
    public final ExplanationFragment a;

    public eyxz(ExplanationFragment explanationFragment0) {
        this.a = explanationFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ExplanationFragment explanationFragment0 = this.a;
        ggtj ggtj0 = (ggtj)explanationFragment0.B().h();
        Account account0 = ((eyxn)object0).a;
        ggtj0.B("accountViewModel state change with account name:%s", (account0 == null ? null : account0.name));
        if(account0 != null) {
            explanationFragment0.F();
        }
        return ibom.a;
    }
}

