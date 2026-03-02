import android.content.Context;
import com.google.android.gms.personalsafety.service.LockingTrustAgentChimeraService;

public final class eigy implements Runnable {
    public final Context a;
    public final String b;

    public eigy(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override
    public final void run() {
        if(LockingTrustAgentChimeraService.a != null && hrtj.k()) {
            String s = this.b;
            LockingTrustAgentChimeraService.a.b.a.lockUser();
            if(s != null) {
                LockingTrustAgentChimeraService.a.b.a.showKeyguardErrorMessage(s);
            }
            return;
        }
        eibp.a(this.a);
    }
}

