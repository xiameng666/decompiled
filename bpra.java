import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation;

public final class bpra implements glzn {
    public final DismissNotificationIntentOperation a;
    public final Account b;
    public final bnzj c;
    public final Intent d;
    public final boolean e;
    public final int f;

    public bpra(DismissNotificationIntentOperation dismissNotificationIntentOperation0, Account account0, bnzj bnzj0, int v, Intent intent0, boolean z) {
        this.a = dismissNotificationIntentOperation0;
        this.b = account0;
        this.c = bnzj0;
        this.f = v;
        this.d = intent0;
        this.e = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        DismissNotificationIntentOperation dismissNotificationIntentOperation0 = this.a;
        if(hsxo.f()) {
            String s = this.d.getStringExtra("required_input");
            bprh bprh0 = s == null ? null : bprh.b(s);
            if(!this.e) {
                bnzj bnzj0 = this.c;
                if(!bnzj0.equals(bnzj.a) && bprh0 != null) {
                    boolean z = bnzj0.equals(bnzj.f);
                    return dismissNotificationIntentOperation0.d.b(this.b, z, (this.f == 3 ? 8 : 3), bprh0.g, gfqx.a);
                }
            }
            return dismissNotificationIntentOperation0.d.a();
        }
        return hsww.q() ? dismissNotificationIntentOperation0.b.d() : gmbx.a;
    }
}

