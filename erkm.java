import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity;
import j..util.Objects;
import java.util.List;

public final class erkm implements gmbg {
    final Account a;
    final D2DSetupChimeraActivity b;

    public erkm(D2DSetupChimeraActivity d2DSetupChimeraActivity0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(d2DSetupChimeraActivity0);
        this.b = d2DSetupChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        D2DSetupChimeraActivity.h.m("Unsupported account status lookup timed out", new Object[0]);
        erkj erkj0 = new erkj(this, this.a);
        this.b.runOnUiThread(erkj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        for(Object object1: ((List)object0)) {
            if(Boolean.TRUE.equals(((Boolean)object1))) {
                erkk erkk0 = new erkk(this);
                this.b.runOnUiThread(erkk0);
                return;
            }
        }
        erkl erkl0 = new erkl(this, this.a);
        this.b.runOnUiThread(erkl0);
    }
}

